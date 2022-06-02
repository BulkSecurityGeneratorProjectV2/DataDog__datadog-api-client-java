/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Define an expression alias. */
@JsonPropertyOrder({
  TimeseriesWidgetExpressionAlias.JSON_PROPERTY_ALIAS_NAME,
  TimeseriesWidgetExpressionAlias.JSON_PROPERTY_EXPRESSION
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TimeseriesWidgetExpressionAlias {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALIAS_NAME = "alias_name";
  private String aliasName;

  public static final String JSON_PROPERTY_EXPRESSION = "expression";
  private String expression;

  public TimeseriesWidgetExpressionAlias() {}

  @JsonCreator
  public TimeseriesWidgetExpressionAlias(
      @JsonProperty(required = true, value = JSON_PROPERTY_EXPRESSION) String expression) {
    this.expression = expression;
  }

  public TimeseriesWidgetExpressionAlias aliasName(String aliasName) {
    this.aliasName = aliasName;
    return this;
  }

  /**
   * Expression alias.
   *
   * @return aliasName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALIAS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAliasName() {
    return aliasName;
  }

  public void setAliasName(String aliasName) {
    this.aliasName = aliasName;
  }

  public TimeseriesWidgetExpressionAlias expression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * Expression name.
   *
   * @return expression
   */
  @JsonProperty(JSON_PROPERTY_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  /** Return true if this TimeseriesWidgetExpressionAlias object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeseriesWidgetExpressionAlias timeseriesWidgetExpressionAlias =
        (TimeseriesWidgetExpressionAlias) o;
    return Objects.equals(this.aliasName, timeseriesWidgetExpressionAlias.aliasName)
        && Objects.equals(this.expression, timeseriesWidgetExpressionAlias.expression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliasName, expression);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesWidgetExpressionAlias {\n");
    sb.append("    aliasName: ").append(toIndentedString(aliasName)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
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
