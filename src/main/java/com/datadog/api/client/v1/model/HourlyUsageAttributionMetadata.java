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

/** The object containing document metadata. */
@JsonPropertyOrder({HourlyUsageAttributionMetadata.JSON_PROPERTY_PAGINATION})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HourlyUsageAttributionMetadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PAGINATION = "pagination";
  private HourlyUsageAttributionPagination pagination;

  public HourlyUsageAttributionMetadata pagination(HourlyUsageAttributionPagination pagination) {
    this.pagination = pagination;
    this.unparsed |= pagination.unparsed;
    return this;
  }

  /**
   * The metadata for the current pagination.
   *
   * @return pagination
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HourlyUsageAttributionPagination getPagination() {
    return pagination;
  }

  public void setPagination(HourlyUsageAttributionPagination pagination) {
    this.pagination = pagination;
  }

  /** Return true if this HourlyUsageAttributionMetadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HourlyUsageAttributionMetadata hourlyUsageAttributionMetadata =
        (HourlyUsageAttributionMetadata) o;
    return Objects.equals(this.pagination, hourlyUsageAttributionMetadata.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HourlyUsageAttributionMetadata {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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
