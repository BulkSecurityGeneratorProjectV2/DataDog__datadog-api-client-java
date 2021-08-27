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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** The counts of monitor groups per different criteria. */
@ApiModel(description = "The counts of monitor groups per different criteria.")
@JsonPropertyOrder({
  MonitorGroupSearchResponseCounts.JSON_PROPERTY_STATUS,
  MonitorGroupSearchResponseCounts.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MonitorGroupSearchResponseCounts {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_STATUS = "status";
  private List<Object> status = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private List<Object> type = null;

  public MonitorGroupSearchResponseCounts status(List<Object> status) {
    this.status = status;
    return this;
  }

  public MonitorGroupSearchResponseCounts addStatusItem(Object statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<>();
    }
    this.status.add(statusItem);
    return this;
  }

  /**
   * Search facets.
   *
   * @return status
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Search facets.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Object> getStatus() {
    return status;
  }

  public void setStatus(List<Object> status) {
    this.status = status;
  }

  public MonitorGroupSearchResponseCounts type(List<Object> type) {
    this.type = type;
    return this;
  }

  public MonitorGroupSearchResponseCounts addTypeItem(Object typeItem) {
    if (this.type == null) {
      this.type = new ArrayList<>();
    }
    this.type.add(typeItem);
    return this;
  }

  /**
   * Search facets.
   *
   * @return type
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Search facets.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Object> getType() {
    return type;
  }

  public void setType(List<Object> type) {
    this.type = type;
  }

  /** Return true if this MonitorGroupSearchResponse_counts object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorGroupSearchResponseCounts monitorGroupSearchResponseCounts =
        (MonitorGroupSearchResponseCounts) o;
    return Objects.equals(this.status, monitorGroupSearchResponseCounts.status)
        && Objects.equals(this.type, monitorGroupSearchResponseCounts.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorGroupSearchResponseCounts {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
