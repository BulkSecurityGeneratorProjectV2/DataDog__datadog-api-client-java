/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** The browser test failure details. */
@JsonPropertyOrder({
  SyntheticsBrowserTestResultFailure.JSON_PROPERTY_CODE,
  SyntheticsBrowserTestResultFailure.JSON_PROPERTY_MESSAGE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsBrowserTestResultFailure {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CODE = "code";
  private SyntheticsBrowserTestFailureCode code;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public SyntheticsBrowserTestResultFailure code(SyntheticsBrowserTestFailureCode code) {
    this.code = code;
    this.unparsed |= !code.isValid();
    return this;
  }

  /**
   * Error code that can be returned by a Synthetic test.
   *
   * @return code
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsBrowserTestFailureCode getCode() {
    return code;
  }

  public void setCode(SyntheticsBrowserTestFailureCode code) {
    if (!code.isValid()) {
      this.unparsed = true;
    }
    this.code = code;
  }

  public SyntheticsBrowserTestResultFailure message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The browser test error message.
   *
   * @return message
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  /** Return true if this SyntheticsBrowserTestResultFailure object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsBrowserTestResultFailure syntheticsBrowserTestResultFailure =
        (SyntheticsBrowserTestResultFailure) o;
    return Objects.equals(this.code, syntheticsBrowserTestResultFailure.code)
        && Objects.equals(this.message, syntheticsBrowserTestResultFailure.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsBrowserTestResultFailure {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
