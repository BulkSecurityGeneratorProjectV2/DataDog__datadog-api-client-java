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

/** Response from the delete monitor call. */
@JsonPropertyOrder({DeletedMonitor.JSON_PROPERTY_DELETED_MONITOR_ID})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DeletedMonitor {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DELETED_MONITOR_ID = "deleted_monitor_id";
  private Long deletedMonitorId;

  public DeletedMonitor deletedMonitorId(Long deletedMonitorId) {
    this.deletedMonitorId = deletedMonitorId;
    return this;
  }

  /**
   * ID of the deleted monitor.
   *
   * @return deletedMonitorId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETED_MONITOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDeletedMonitorId() {
    return deletedMonitorId;
  }

  public void setDeletedMonitorId(Long deletedMonitorId) {
    this.deletedMonitorId = deletedMonitorId;
  }

  /** Return true if this DeletedMonitor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeletedMonitor deletedMonitor = (DeletedMonitor) o;
    return Objects.equals(this.deletedMonitorId, deletedMonitor.deletedMonitorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedMonitorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletedMonitor {\n");
    sb.append("    deletedMonitorId: ").append(toIndentedString(deletedMonitorId)).append("\n");
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
