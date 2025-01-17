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

/** Object with all Index configurations for a given organization. */
@JsonPropertyOrder({LogsIndexListResponse.JSON_PROPERTY_INDEXES})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsIndexListResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INDEXES = "indexes";
  private List<LogsIndex> indexes = null;

  public LogsIndexListResponse indexes(List<LogsIndex> indexes) {
    this.indexes = indexes;
    for (LogsIndex item : indexes) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LogsIndexListResponse addIndexesItem(LogsIndex indexesItem) {
    if (this.indexes == null) {
      this.indexes = new ArrayList<>();
    }
    this.indexes.add(indexesItem);
    this.unparsed |= indexesItem.unparsed;
    return this;
  }

  /**
   * Array of Log index configurations.
   *
   * @return indexes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LogsIndex> getIndexes() {
    return indexes;
  }

  public void setIndexes(List<LogsIndex> indexes) {
    this.indexes = indexes;
  }

  /** Return true if this LogsIndexListResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsIndexListResponse logsIndexListResponse = (LogsIndexListResponse) o;
    return Objects.equals(this.indexes, logsIndexListResponse.indexes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indexes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsIndexListResponse {\n");
    sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
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
