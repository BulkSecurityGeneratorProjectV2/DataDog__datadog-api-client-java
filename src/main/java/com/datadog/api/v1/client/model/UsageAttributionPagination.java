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
import java.util.Objects;

/** The metadata for the current pagination. */
@ApiModel(description = "The metadata for the current pagination.")
@JsonPropertyOrder({
  UsageAttributionPagination.JSON_PROPERTY_LIMIT,
  UsageAttributionPagination.JSON_PROPERTY_NEXT_RECORD_ID,
  UsageAttributionPagination.JSON_PROPERTY_TOTAL_NUMBER_OF_RECORDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsageAttributionPagination {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit;

  public static final String JSON_PROPERTY_NEXT_RECORD_ID = "next_record_id";
  private String nextRecordId;

  public static final String JSON_PROPERTY_TOTAL_NUMBER_OF_RECORDS = "total_number_of_records";
  private Long totalNumberOfRecords;

  public UsageAttributionPagination limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Maximum amount of records to be returned.
   *
   * @return limit
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum amount of records to be returned.")
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }

  public UsageAttributionPagination nextRecordId(String nextRecordId) {
    this.nextRecordId = nextRecordId;
    return this;
  }

  /**
   * The cursor to use to get the next results, if any. To make the next request, use the same
   * parameters with the addition of this next_record_id.
   *
   * @return nextRecordId
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The cursor to use to get the next results, if any. To make the next request, use the"
              + " same parameters with the addition of this next_record_id.")
  @JsonProperty(JSON_PROPERTY_NEXT_RECORD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNextRecordId() {
    return nextRecordId;
  }

  public void setNextRecordId(String nextRecordId) {
    this.nextRecordId = nextRecordId;
  }

  public UsageAttributionPagination totalNumberOfRecords(Long totalNumberOfRecords) {
    this.totalNumberOfRecords = totalNumberOfRecords;
    return this;
  }

  /**
   * Total number of records. (deprecated after May 1st, 2021)
   *
   * @return totalNumberOfRecords
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total number of records. (deprecated after May 1st, 2021)")
  @JsonProperty(JSON_PROPERTY_TOTAL_NUMBER_OF_RECORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalNumberOfRecords() {
    return totalNumberOfRecords;
  }

  public void setTotalNumberOfRecords(Long totalNumberOfRecords) {
    this.totalNumberOfRecords = totalNumberOfRecords;
  }

  /** Return true if this UsageAttributionPagination object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageAttributionPagination usageAttributionPagination = (UsageAttributionPagination) o;
    return Objects.equals(this.limit, usageAttributionPagination.limit)
        && Objects.equals(this.nextRecordId, usageAttributionPagination.nextRecordId)
        && Objects.equals(
            this.totalNumberOfRecords, usageAttributionPagination.totalNumberOfRecords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, nextRecordId, totalNumberOfRecords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageAttributionPagination {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    nextRecordId: ").append(toIndentedString(nextRecordId)).append("\n");
    sb.append("    totalNumberOfRecords: ")
        .append(toIndentedString(totalNumberOfRecords))
        .append("\n");
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
