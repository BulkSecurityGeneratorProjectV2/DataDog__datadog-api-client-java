/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */


package com.datadog.api.v2.client.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import com.datadog.api.RecordingMode;
import com.datadog.api.TestUtils;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.model.SecurityMonitoringListRulesResponse;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleCase;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleCreatePayload;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleEvaluationWindow;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleKeepAlive;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleMaxSignalDuration;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleOptions;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleQuery;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleResponse;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleSeverity;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleUpdatePayload;
import com.datadog.api.v2.client.model.SignalListRequest;
import com.datadog.api.v2.client.model.SignalListRequestFilter;
import com.datadog.api.v2.client.model.SignalListRequestPage;
import com.datadog.api.v2.client.model.SignalsListResponse;
import com.datadog.api.v2.client.model.SignalsSort;
import java.net.URLEncoder;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.ws.rs.core.GenericType;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * API tests for SecurityMonitoringApi
 */
public class SecurityMonitoringApiTest extends V2APITest {

    private SecurityMonitoringApi api;
    private List<SecurityMonitoringRuleResponse> ruleCreateResponses;

    @Override
    public String getTracingEndpoint() {
        return "security-monitoring";
    }

    @BeforeClass
    public static void enableUnstableOperations() {
        generalApiClient.setUnstableOperationEnabled("listSignals", true);
        generalApiClient.setUnstableOperationEnabled("listSignalsGet", true);
    }

    @AfterClass
    public static void disableUnstableOperations() {
        generalApiClient.setUnstableOperationEnabled("listSignals", false);
        generalApiClient.setUnstableOperationEnabled("listSignalsGet", false);
    }

    @Before
    public void setUp() throws Exception {
        api = new SecurityMonitoringApi(generalApiClient);
        ruleCreateResponses = new ArrayList<>();
    }

    @After
    public void tearDown() throws Exception {
        for (SecurityMonitoringRuleResponse rule : ruleCreateResponses) {
            try {
                api.deleteSecurityMonitoringRule(rule.getId()).execute();
            } catch (ApiException e) {
                // ignore
            }
        }
    }

    @Test
    public void rulesCrudTest() throws ApiException {
        String baseName = getUniqueEntityName();

        // create rules
        for (int i = 0; i < 5; i++) {
            String ruleName = String.format("%s-%d", baseName, i);
            SecurityMonitoringRuleResponse response = createRule(ruleName);
            ruleCreateResponses.add(response);

            assertEquals(ruleName, response.getName());
        }

        // get single rule
        SecurityMonitoringRuleResponse createdRule = ruleCreateResponses.get(0);
        SecurityMonitoringRuleResponse fetchedRule = api.getSecurityMonitoringRule(createdRule.getId()).execute();
        assertEquals(createdRule, fetchedRule);

        //// get all rules
        // get total count
        SecurityMonitoringListRulesResponse getCountResponse = api.listSecurityMonitoringRules().pageSize(1L).pageNumber(0L).execute();
        long ruleCount = getCountResponse.getMeta().getPage().getTotalCount();
        assertTrue(ruleCount > 5);
        assertEquals(ruleCount, ((long) getCountResponse.getMeta().getPage().getTotalFilteredCount())); // everything is matched

        // created rules are in all rules
        SecurityMonitoringListRulesResponse getAllRules = api.listSecurityMonitoringRules().pageSize(ruleCount).execute();
        // this could be flaky if another test is run at the same time
        // assertEquals(ruleCount, getAllRules.getData().size());
        Set<String> ids = ruleCreateResponses.stream().map(SecurityMonitoringRuleResponse::getId).collect(Collectors.toSet());
        List<SecurityMonitoringRuleResponse> knownRules = getAllRules.getData()
                .stream()
                .filter(rule -> ids.contains(rule.getId()))
                .collect(Collectors.toList());
        assertEquals(ruleCreateResponses.size(), knownRules.size());

        // paging
        SecurityMonitoringListRulesResponse firstPage = api.listSecurityMonitoringRules().pageSize(2L).pageNumber(0L).execute();
        assertEquals(2, firstPage.getData().size());
        SecurityMonitoringListRulesResponse secondPage = api.listSecurityMonitoringRules().pageSize(2L).pageNumber(1L).execute();
        assertEquals(2, secondPage.getData().size());

        Set<String> firstPageIds = firstPage.getData().stream()
                .map(SecurityMonitoringRuleResponse::getId).collect(Collectors.toSet());
        Set<String> secondPageIds = secondPage.getData().stream()
                .map(SecurityMonitoringRuleResponse::getId).collect(Collectors.toSet());

        Set<String> idsIntersection = new HashSet<>(firstPageIds);
        idsIntersection.retainAll(secondPageIds);
        assertEquals(0, idsIntersection.size());

        //// update rule
        SecurityMonitoringRuleResponse updatedRule = api.updateSecurityMonitoringRule(createdRule.getId())
                .body(new SecurityMonitoringRuleUpdatePayload()
                        .name(createdRule.getName())
                        .enabled(false)
                        .queries(createdRule.getQueries())
                        .options(createdRule.getOptions())
                        .cases(createdRule.getCases())
                        .message(createdRule.getMessage())
                        .tags(createdRule.getTags()))
                .execute();
        assertEquals(createdRule.getName(), updatedRule.getName());
        assertEquals(false, updatedRule.getIsEnabled());

        SecurityMonitoringRuleResponse getUpdatedRule = api.getSecurityMonitoringRule(createdRule.getId()).execute();
        assertEquals(false, getUpdatedRule.getIsEnabled());

        //// delete rule
        api.deleteSecurityMonitoringRule(createdRule.getId()).execute();
        try {
            api.getSecurityMonitoringRule(createdRule.getId()).execute();
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
        }
    }

    @Test
    public void listSignalsTest() throws Exception {
        String uniqueName = getUniqueEntityName();
        SecurityMonitoringRuleResponse rule = createRule(uniqueName);

        sendLogs(uniqueName);

        SignalListRequestFilter allSignalsFilter = new SignalListRequestFilter()
                .query(uniqueName)
                .from(now.minus(Duration.ofHours(1)))
                .to(now.plus(Duration.ofHours(1)));

        // Make sure both logs are indexed
        SignalListRequest bothSignalsRequest = new SignalListRequest()
                .filter(allSignalsFilter);
        TestUtils.retry(10, 10, () -> {
            try {
                SignalsListResponse response = api.listSignals().body(bothSignalsRequest).execute();
                return response.getData() != null && response.getData().size() == 2;
            } catch (ApiException ignored) {
                return false;
            }
        });

        // Sort works correctly
        SignalsListResponse responseAscending = api.listSignals()
                .body(new SignalListRequest()
                        .filter(allSignalsFilter)
                        .sort(SignalsSort.TIMESTAMP_ASCENDING))
                .execute();

        assertEquals(2, responseAscending.getData().size());
        OffsetDateTime firstTimestamp = responseAscending.getData().get(0).getAttributes().getTimestamp();
        OffsetDateTime secondTimestamp = responseAscending.getData().get(1).getAttributes().getTimestamp();
        assertTrue(firstTimestamp.isBefore(secondTimestamp));

        SignalsListResponse responseDescending = api.listSignals()
                .body(new SignalListRequest()
                        .filter(allSignalsFilter)
                        .sort(SignalsSort.TIMESTAMP_DESCENDING))
                .execute();

        assertEquals(2, responseDescending.getData().size());
        firstTimestamp = responseDescending.getData().get(0).getAttributes().getTimestamp();
        secondTimestamp = responseDescending.getData().get(1).getAttributes().getTimestamp();
        assertTrue(firstTimestamp.isAfter(secondTimestamp));

        // Paging
        SignalsListResponse pageOneResponse = api.listSignals()
                .body(new SignalListRequest()
                        .filter(allSignalsFilter)
                        .page(new SignalListRequestPage().limit(1)))
                .execute();
        assertEquals(1, pageOneResponse.getData().size());

        String cursor = pageOneResponse.getMeta().getPage().getAfter();
        assertTrue(pageOneResponse.getLinks().getNext().contains(URLEncoder.encode(cursor)));

        SignalsListResponse pageTwoResponse = api.listSignals()
                .body(new SignalListRequest()
                        .filter(allSignalsFilter)
                        .page(new SignalListRequestPage()
                                .cursor(cursor)
                                .limit(1)))
                .execute();
        assertEquals(1, pageTwoResponse.getData().size());

        assertNotEquals(pageOneResponse.getData().get(0).getId(), pageTwoResponse.getData().get(0).getId());
    }

    @Test
    public void listSignalsGet() throws Exception {
        String uniqueName = getUniqueEntityName();
        SecurityMonitoringRuleResponse rule = createRule(uniqueName);

        sendLogs(uniqueName);

        TestUtils.retry(5, 10, () -> {
            try {
                SignalsListResponse response = api.listSignalsGet()
                        .filterQuery(uniqueName)
                        .filterFrom(now.minus(Duration.ofHours(1)))
                        .filterTo(now.plus(Duration.ofHours(1)))
                        .execute();
                return response.getData() != null && response.getData().size() == 2;
            } catch (ApiException ignored) {
                return false;
            }
        });

        // Sort works correctly
        SignalsListResponse responseAscending = api.listSignalsGet()
                .filterQuery(uniqueName)
                .filterFrom(now.minus(Duration.ofHours(1)))
                .filterTo(now.plus(Duration.ofHours(1)))
                .sort(SignalsSort.TIMESTAMP_ASCENDING)
                .execute();

        assertEquals(2, responseAscending.getData().size());
        OffsetDateTime firstTimestamp = responseAscending.getData().get(0).getAttributes().getTimestamp();
        OffsetDateTime secondTimestamp = responseAscending.getData().get(1).getAttributes().getTimestamp();
        assertTrue(firstTimestamp.isBefore(secondTimestamp));

        SignalsListResponse responseDescending = api.listSignalsGet()
                .filterQuery(uniqueName)
                .filterFrom(now.minus(Duration.ofHours(1)))
                .filterTo(now.plus(Duration.ofHours(1)))
                .sort(SignalsSort.TIMESTAMP_DESCENDING)
                .execute();

        assertEquals(2, responseDescending.getData().size());
        firstTimestamp = responseAscending.getData().get(0).getAttributes().getTimestamp();
        secondTimestamp = responseAscending.getData().get(1).getAttributes().getTimestamp();
        assertTrue(firstTimestamp.isAfter(secondTimestamp));

        // Paging
        SignalsListResponse pageOneResponse = api.listSignalsGet()
                .filterQuery(uniqueName)
                .filterFrom(now.minus(Duration.ofHours(1)))
                .filterTo(now.plus(Duration.ofHours(1)))
                .pageLimit(1)
                .execute();

        assertEquals(1, pageOneResponse.getData().size());

        String cursor = pageOneResponse.getMeta().getPage().getAfter();
        assertTrue(pageOneResponse.getLinks().getNext().contains(URLEncoder.encode(cursor)));

        SignalsListResponse pageTwoResponse = api.listSignalsGet()
                .filterQuery(uniqueName)
                .filterFrom(now.minus(Duration.ofHours(1)))
                .filterTo(now.plus(Duration.ofHours(1)))
                .pageLimit(1)
                .pageCursor(cursor)
                .execute();

        assertEquals(1, pageTwoResponse.getData().size());

        assertNotEquals(pageOneResponse.getData().get(0).getId(), pageTwoResponse.getData().get(0).getId());

        api.deleteSecurityMonitoringRule(rule.getId());
    }

    private void sendLogs(String message) throws Exception {
        String intakeURL;
        if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_REPLAYING)) {
            // when running from cassettes, we need to make sure that the default base URL
            // is used for mock server certificates to work properly
            intakeURL = "/v1/input";
        } else {
            intakeURL = String.format("https://http-intake.logs.%s/v1/input", testDomain());
        }
        sendRequest(
                "POST",
                intakeURL,
                String.format(
                        "{\"ddtags\":\"java,test,list\",\"message\":\"{\\\"timestamp\\\": %d, \\\"message\\\": \\\"%s\\\"}\"}",
                        (now.toEpochSecond() - 1000) * 1000, message
                ),
                new GenericType<String>(String.class)
        );
        sendRequest(
                "POST",
                intakeURL,
                String.format(
                        "{\"ddtags\":\"java,test,list\",\"message\":\"{\\\"timestamp\\\": %d, \\\"message\\\": \\\"%s\\\"}\"}",
                        now.toEpochSecond() * 1000, message
                ),
                new GenericType<String>(String.class)
        );
    }

    private SecurityMonitoringRuleResponse createRule(String ruleName) throws ApiException {
        SecurityMonitoringRuleCreatePayload createRulePayload = new SecurityMonitoringRuleCreatePayload();
        createRulePayload
                .name(ruleName)
                .enabled(true)
                .addQueriesItem(new SecurityMonitoringRuleQuery()
                        .name("rule")
                        .query(ruleName)
                        .groupByFields(Collections.emptyList()))
                .options(new SecurityMonitoringRuleOptions()
                        // Generate a signal every log
                        .evaluationWindow(SecurityMonitoringRuleEvaluationWindow.ZERO_MINUTES)
                        .keepAlive(SecurityMonitoringRuleKeepAlive.ZERO_MINUTES)
                        .maxSignalDuration(SecurityMonitoringRuleMaxSignalDuration.ZERO_MINUTES))
                .addCasesItem(new SecurityMonitoringRuleCase()
                        .name("rule-case")
                        .condition("rule > 0")
                        .status(SecurityMonitoringRuleSeverity.INFO))
                .message("Rule message")
                .tags(Collections.singletonList("datadog-api-client-test-java"));

        return api.createSecurityMonitoringRule()
                .body(createRulePayload)
                .execute();
    }

}
