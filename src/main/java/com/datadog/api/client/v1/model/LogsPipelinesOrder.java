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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Object containing the ordered list of pipeline IDs. */
@JsonPropertyOrder({LogsPipelinesOrder.JSON_PROPERTY_PIPELINE_IDS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsPipelinesOrder {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PIPELINE_IDS = "pipeline_ids";
  private List<String> pipelineIds = new ArrayList<>();

  public LogsPipelinesOrder() {}

  @JsonCreator
  public LogsPipelinesOrder(
      @JsonProperty(required = true, value = JSON_PROPERTY_PIPELINE_IDS) List<String> pipelineIds) {
    this.pipelineIds = pipelineIds;
  }

  public LogsPipelinesOrder pipelineIds(List<String> pipelineIds) {
    this.pipelineIds = pipelineIds;
    return this;
  }

  public LogsPipelinesOrder addPipelineIdsItem(String pipelineIdsItem) {
    this.pipelineIds.add(pipelineIdsItem);
    return this;
  }

  /**
   * Ordered Array of <code>&lt;PIPELINE_ID&gt;</code> strings, the order of pipeline IDs in the
   * array define the overall Pipelines order for Datadog.
   *
   * @return pipelineIds
   */
  @JsonProperty(JSON_PROPERTY_PIPELINE_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getPipelineIds() {
    return pipelineIds;
  }

  public void setPipelineIds(List<String> pipelineIds) {
    this.pipelineIds = pipelineIds;
  }

  /** Return true if this LogsPipelinesOrder object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsPipelinesOrder logsPipelinesOrder = (LogsPipelinesOrder) o;
    return Objects.equals(this.pipelineIds, logsPipelinesOrder.pipelineIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pipelineIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsPipelinesOrder {\n");
    sb.append("    pipelineIds: ").append(toIndentedString(pipelineIds)).append("\n");
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
