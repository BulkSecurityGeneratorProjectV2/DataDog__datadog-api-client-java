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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The bulk partial delete service level objective object endpoint response.
 *
 * <p>This endpoint operates on multiple service level objective objects, so it may be partially
 * successful. In such cases, the "data" and "error" fields in this response indicate which
 * deletions succeeded and failed.
 */
@JsonPropertyOrder({
  SLOBulkDeleteResponse.JSON_PROPERTY_DATA,
  SLOBulkDeleteResponse.JSON_PROPERTY_ERRORS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOBulkDeleteResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private SLOBulkDeleteResponseData data;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<SLOBulkDeleteError> errors = null;

  public SLOBulkDeleteResponse data(SLOBulkDeleteResponseData data) {
    this.data = data;
    this.unparsed |= data.unparsed;
    return this;
  }

  /**
   * An array of service level objective objects.
   *
   * @return data
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SLOBulkDeleteResponseData getData() {
    return data;
  }

  public void setData(SLOBulkDeleteResponseData data) {
    this.data = data;
  }

  public SLOBulkDeleteResponse errors(List<SLOBulkDeleteError> errors) {
    this.errors = errors;
    for (SLOBulkDeleteError item : errors) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SLOBulkDeleteResponse addErrorsItem(SLOBulkDeleteError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    this.unparsed |= errorsItem.unparsed;
    return this;
  }

  /**
   * Array of errors object returned.
   *
   * @return errors
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SLOBulkDeleteError> getErrors() {
    return errors;
  }

  public void setErrors(List<SLOBulkDeleteError> errors) {
    this.errors = errors;
  }

  /** Return true if this SLOBulkDeleteResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOBulkDeleteResponse sloBulkDeleteResponse = (SLOBulkDeleteResponse) o;
    return Objects.equals(this.data, sloBulkDeleteResponse.data)
        && Objects.equals(this.errors, sloBulkDeleteResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOBulkDeleteResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
