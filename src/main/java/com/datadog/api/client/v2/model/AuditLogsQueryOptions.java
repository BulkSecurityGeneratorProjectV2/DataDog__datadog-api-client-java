/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/**
 * Global query options that are used during the query. Note: Specify either timezone or time
 * offset, not both. Otherwise, the query fails.
 */
@JsonPropertyOrder({
  AuditLogsQueryOptions.JSON_PROPERTY_TIME_OFFSET,
  AuditLogsQueryOptions.JSON_PROPERTY_TIMEZONE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AuditLogsQueryOptions {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TIME_OFFSET = "time_offset";
  private Long timeOffset;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone = "UTC";

  public AuditLogsQueryOptions timeOffset(Long timeOffset) {
    this.timeOffset = timeOffset;
    return this;
  }

  /**
   * Time offset (in seconds) to apply to the query.
   *
   * @return timeOffset
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTimeOffset() {
    return timeOffset;
  }

  public void setTimeOffset(Long timeOffset) {
    this.timeOffset = timeOffset;
  }

  public AuditLogsQueryOptions timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * The timezone can be specified as GMT, UTC, an offset from UTC (like UTC+1), or as a Timezone
   * Database identifier (like America/New_York).
   *
   * @return timezone
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  /** Return true if this AuditLogsQueryOptions object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogsQueryOptions auditLogsQueryOptions = (AuditLogsQueryOptions) o;
    return Objects.equals(this.timeOffset, auditLogsQueryOptions.timeOffset)
        && Objects.equals(this.timezone, auditLogsQueryOptions.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeOffset, timezone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogsQueryOptions {\n");
    sb.append("    timeOffset: ").append(toIndentedString(timeOffset)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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
