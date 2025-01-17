/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Set of rules for the grok parser. */
@JsonPropertyOrder({
  LogsGrokParserRules.JSON_PROPERTY_MATCH_RULES,
  LogsGrokParserRules.JSON_PROPERTY_SUPPORT_RULES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsGrokParserRules {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MATCH_RULES = "match_rules";
  private String matchRules;

  public static final String JSON_PROPERTY_SUPPORT_RULES = "support_rules";
  private String supportRules = "";

  public LogsGrokParserRules() {}

  @JsonCreator
  public LogsGrokParserRules(
      @JsonProperty(required = true, value = JSON_PROPERTY_MATCH_RULES) String matchRules) {
    this.matchRules = matchRules;
  }

  public LogsGrokParserRules matchRules(String matchRules) {
    this.matchRules = matchRules;
    return this;
  }

  /**
   * List of match rules for the grok parser, separated by a new line.
   *
   * @return matchRules
   */
  @JsonProperty(JSON_PROPERTY_MATCH_RULES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMatchRules() {
    return matchRules;
  }

  public void setMatchRules(String matchRules) {
    this.matchRules = matchRules;
  }

  public LogsGrokParserRules supportRules(String supportRules) {
    this.supportRules = supportRules;
    return this;
  }

  /**
   * List of support rules for the grok parser, separated by a new line.
   *
   * @return supportRules
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUPPORT_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSupportRules() {
    return supportRules;
  }

  public void setSupportRules(String supportRules) {
    this.supportRules = supportRules;
  }

  /** Return true if this LogsGrokParserRules object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsGrokParserRules logsGrokParserRules = (LogsGrokParserRules) o;
    return Objects.equals(this.matchRules, logsGrokParserRules.matchRules)
        && Objects.equals(this.supportRules, logsGrokParserRules.supportRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchRules, supportRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsGrokParserRules {\n");
    sb.append("    matchRules: ").append(toIndentedString(matchRules)).append("\n");
    sb.append("    supportRules: ").append(toIndentedString(supportRules)).append("\n");
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
