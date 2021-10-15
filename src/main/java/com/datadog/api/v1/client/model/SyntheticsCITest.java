/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Test configuration for Synthetics CI */
@ApiModel(description = "Test configuration for Synthetics CI")
@JsonPropertyOrder({
  SyntheticsCITest.JSON_PROPERTY_ALLOW_INSECURE_CERTIFICATES,
  SyntheticsCITest.JSON_PROPERTY_BASIC_AUTH,
  SyntheticsCITest.JSON_PROPERTY_BODY,
  SyntheticsCITest.JSON_PROPERTY_BODY_TYPE,
  SyntheticsCITest.JSON_PROPERTY_COOKIES,
  SyntheticsCITest.JSON_PROPERTY_DEVICE_IDS,
  SyntheticsCITest.JSON_PROPERTY_FOLLOW_REDIRECTS,
  SyntheticsCITest.JSON_PROPERTY_HEADERS,
  SyntheticsCITest.JSON_PROPERTY_LOCATIONS,
  SyntheticsCITest.JSON_PROPERTY_METADATA,
  SyntheticsCITest.JSON_PROPERTY_PUBLIC_ID,
  SyntheticsCITest.JSON_PROPERTY_RETRY,
  SyntheticsCITest.JSON_PROPERTY_START_URL,
  SyntheticsCITest.JSON_PROPERTY_VARIABLES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SyntheticsCITest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOW_INSECURE_CERTIFICATES =
      "allowInsecureCertificates";
  private Boolean allowInsecureCertificates;

  public static final String JSON_PROPERTY_BASIC_AUTH = "basicAuth";
  private SyntheticsBasicAuth basicAuth;

  public static final String JSON_PROPERTY_BODY = "body";
  private String body;

  public static final String JSON_PROPERTY_BODY_TYPE = "bodyType";
  private String bodyType;

  public static final String JSON_PROPERTY_COOKIES = "cookies";
  private String cookies;

  public static final String JSON_PROPERTY_DEVICE_IDS = "deviceIds";
  private List<SyntheticsDeviceID> deviceIds = null;

  public static final String JSON_PROPERTY_FOLLOW_REDIRECTS = "followRedirects";
  private Boolean followRedirects;

  public static final String JSON_PROPERTY_HEADERS = "headers";
  private Map<String, String> headers = null;

  public static final String JSON_PROPERTY_LOCATIONS = "locations";
  private List<String> locations = null;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private SyntheticsCIBatchMetadata metadata;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_RETRY = "retry";
  private SyntheticsTestOptionsRetry retry;

  public static final String JSON_PROPERTY_START_URL = "startUrl";
  private String startUrl;

  public static final String JSON_PROPERTY_VARIABLES = "variables";
  private Map<String, String> variables = null;

  public SyntheticsCITest() {}

  @JsonCreator
  public SyntheticsCITest(
      @JsonProperty(required = true, value = JSON_PROPERTY_PUBLIC_ID) String publicId) {
    this.publicId = publicId;
  }

  public SyntheticsCITest allowInsecureCertificates(Boolean allowInsecureCertificates) {
    this.allowInsecureCertificates = allowInsecureCertificates;
    return this;
  }

  /**
   * Disable certificate checks in API tests.
   *
   * @return allowInsecureCertificates
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Disable certificate checks in API tests.")
  @JsonProperty(JSON_PROPERTY_ALLOW_INSECURE_CERTIFICATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAllowInsecureCertificates() {
    return allowInsecureCertificates;
  }

  public void setAllowInsecureCertificates(Boolean allowInsecureCertificates) {
    this.allowInsecureCertificates = allowInsecureCertificates;
  }

  public SyntheticsCITest basicAuth(SyntheticsBasicAuth basicAuth) {
    this.basicAuth = basicAuth;
    this.unparsed |= basicAuth.unparsed;
    return this;
  }

  /**
   * Get basicAuth
   *
   * @return basicAuth
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BASIC_AUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsBasicAuth getBasicAuth() {
    return basicAuth;
  }

  public void setBasicAuth(SyntheticsBasicAuth basicAuth) {
    this.basicAuth = basicAuth;
  }

  public SyntheticsCITest body(String body) {
    this.body = body;
    return this;
  }

  /**
   * Body to include in the test.
   *
   * @return body
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Body to include in the test.")
  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public SyntheticsCITest bodyType(String bodyType) {
    this.bodyType = bodyType;
    return this;
  }

  /**
   * Type of the data sent in a synthetics API test.
   *
   * @return bodyType
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of the data sent in a synthetics API test.")
  @JsonProperty(JSON_PROPERTY_BODY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBodyType() {
    return bodyType;
  }

  public void setBodyType(String bodyType) {
    this.bodyType = bodyType;
  }

  public SyntheticsCITest cookies(String cookies) {
    this.cookies = cookies;
    return this;
  }

  /**
   * Cookies for the request.
   *
   * @return cookies
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cookies for the request.")
  @JsonProperty(JSON_PROPERTY_COOKIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCookies() {
    return cookies;
  }

  public void setCookies(String cookies) {
    this.cookies = cookies;
  }

  public SyntheticsCITest deviceIds(List<SyntheticsDeviceID> deviceIds) {
    this.deviceIds = deviceIds;
    return this;
  }

  public SyntheticsCITest addDeviceIdsItem(SyntheticsDeviceID deviceIdsItem) {
    if (this.deviceIds == null) {
      this.deviceIds = new ArrayList<>();
    }
    this.deviceIds.add(deviceIdsItem);
    this.unparsed |= !deviceIdsItem.isValid();
    return this;
  }

  /**
   * For browser test, array with the different device IDs used to run the test.
   *
   * @return deviceIds
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "For browser test, array with the different device IDs used to run the test.")
  @JsonProperty(JSON_PROPERTY_DEVICE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsDeviceID> getDeviceIds() {
    return deviceIds;
  }

  public void setDeviceIds(List<SyntheticsDeviceID> deviceIds) {
    this.deviceIds = deviceIds;
  }

  public SyntheticsCITest followRedirects(Boolean followRedirects) {
    this.followRedirects = followRedirects;
    return this;
  }

  /**
   * For API HTTP test, whether or not the test should follow redirects.
   *
   * @return followRedirects
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For API HTTP test, whether or not the test should follow redirects.")
  @JsonProperty(JSON_PROPERTY_FOLLOW_REDIRECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getFollowRedirects() {
    return followRedirects;
  }

  public void setFollowRedirects(Boolean followRedirects) {
    this.followRedirects = followRedirects;
  }

  public SyntheticsCITest headers(Map<String, String> headers) {
    this.headers = headers;
    return this;
  }

  public SyntheticsCITest putHeadersItem(String key, String headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

  /**
   * Headers to include when performing the test.
   *
   * @return headers
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Headers to include when performing the test.")
  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getHeaders() {
    return headers;
  }

  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }

  public SyntheticsCITest locations(List<String> locations) {
    this.locations = locations;
    return this;
  }

  public SyntheticsCITest addLocationsItem(String locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<>();
    }
    this.locations.add(locationsItem);
    return this;
  }

  /**
   * Array of locations used to run the test.
   *
   * @return locations
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of locations used to run the test.")
  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getLocations() {
    return locations;
  }

  public void setLocations(List<String> locations) {
    this.locations = locations;
  }

  public SyntheticsCITest metadata(SyntheticsCIBatchMetadata metadata) {
    this.metadata = metadata;
    this.unparsed |= metadata.unparsed;
    return this;
  }

  /**
   * Get metadata
   *
   * @return metadata
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsCIBatchMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(SyntheticsCIBatchMetadata metadata) {
    this.metadata = metadata;
  }

  public SyntheticsCITest publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * The public ID of the Synthetics test to trigger.
   *
   * @return publicId
   */
  @ApiModelProperty(
      example = "aaa-aaa-aaa",
      required = true,
      value = "The public ID of the Synthetics test to trigger.")
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPublicId() {
    return publicId;
  }

  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }

  public SyntheticsCITest retry(SyntheticsTestOptionsRetry retry) {
    this.retry = retry;
    this.unparsed |= retry.unparsed;
    return this;
  }

  /**
   * Get retry
   *
   * @return retry
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RETRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestOptionsRetry getRetry() {
    return retry;
  }

  public void setRetry(SyntheticsTestOptionsRetry retry) {
    this.retry = retry;
  }

  public SyntheticsCITest startUrl(String startUrl) {
    this.startUrl = startUrl;
    return this;
  }

  /**
   * Starting URL for the browser test.
   *
   * @return startUrl
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Starting URL for the browser test.")
  @JsonProperty(JSON_PROPERTY_START_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStartUrl() {
    return startUrl;
  }

  public void setStartUrl(String startUrl) {
    this.startUrl = startUrl;
  }

  public SyntheticsCITest variables(Map<String, String> variables) {
    this.variables = variables;
    return this;
  }

  public SyntheticsCITest putVariablesItem(String key, String variablesItem) {
    if (this.variables == null) {
      this.variables = new HashMap<>();
    }
    this.variables.put(key, variablesItem);
    return this;
  }

  /**
   * Variables to replace in the test.
   *
   * @return variables
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Variables to replace in the test.")
  @JsonProperty(JSON_PROPERTY_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getVariables() {
    return variables;
  }

  public void setVariables(Map<String, String> variables) {
    this.variables = variables;
  }

  /** Return true if this SyntheticsCITest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsCITest syntheticsCITest = (SyntheticsCITest) o;
    return Objects.equals(
            this.allowInsecureCertificates, syntheticsCITest.allowInsecureCertificates)
        && Objects.equals(this.basicAuth, syntheticsCITest.basicAuth)
        && Objects.equals(this.body, syntheticsCITest.body)
        && Objects.equals(this.bodyType, syntheticsCITest.bodyType)
        && Objects.equals(this.cookies, syntheticsCITest.cookies)
        && Objects.equals(this.deviceIds, syntheticsCITest.deviceIds)
        && Objects.equals(this.followRedirects, syntheticsCITest.followRedirects)
        && Objects.equals(this.headers, syntheticsCITest.headers)
        && Objects.equals(this.locations, syntheticsCITest.locations)
        && Objects.equals(this.metadata, syntheticsCITest.metadata)
        && Objects.equals(this.publicId, syntheticsCITest.publicId)
        && Objects.equals(this.retry, syntheticsCITest.retry)
        && Objects.equals(this.startUrl, syntheticsCITest.startUrl)
        && Objects.equals(this.variables, syntheticsCITest.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowInsecureCertificates,
        basicAuth,
        body,
        bodyType,
        cookies,
        deviceIds,
        followRedirects,
        headers,
        locations,
        metadata,
        publicId,
        retry,
        startUrl,
        variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsCITest {\n");
    sb.append("    allowInsecureCertificates: ")
        .append(toIndentedString(allowInsecureCertificates))
        .append("\n");
    sb.append("    basicAuth: ").append(toIndentedString(basicAuth)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    bodyType: ").append(toIndentedString(bodyType)).append("\n");
    sb.append("    cookies: ").append(toIndentedString(cookies)).append("\n");
    sb.append("    deviceIds: ").append(toIndentedString(deviceIds)).append("\n");
    sb.append("    followRedirects: ").append(toIndentedString(followRedirects)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    retry: ").append(toIndentedString(retry)).append("\n");
    sb.append("    startUrl: ").append(toIndentedString(startUrl)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
