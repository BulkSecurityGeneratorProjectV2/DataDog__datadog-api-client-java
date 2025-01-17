/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** A relationship reference for multiple integration metadata objects. */
@JsonPropertyOrder({RelationshipToIncidentIntegrationMetadatas.JSON_PROPERTY_DATA})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RelationshipToIncidentIntegrationMetadatas {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<RelationshipToIncidentIntegrationMetadataData> data = new ArrayList<>();

  public RelationshipToIncidentIntegrationMetadatas() {}

  @JsonCreator
  public RelationshipToIncidentIntegrationMetadatas(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA)
          List<RelationshipToIncidentIntegrationMetadataData> data) {
    this.data = data;
  }

  public RelationshipToIncidentIntegrationMetadatas data(
      List<RelationshipToIncidentIntegrationMetadataData> data) {
    this.data = data;
    for (RelationshipToIncidentIntegrationMetadataData item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public RelationshipToIncidentIntegrationMetadatas addDataItem(
      RelationshipToIncidentIntegrationMetadataData dataItem) {
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * The integration metadata relationship array
   *
   * @return data
   */
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<RelationshipToIncidentIntegrationMetadataData> getData() {
    return data;
  }

  public void setData(List<RelationshipToIncidentIntegrationMetadataData> data) {
    this.data = data;
  }

  /** Return true if this RelationshipToIncidentIntegrationMetadatas object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationshipToIncidentIntegrationMetadatas relationshipToIncidentIntegrationMetadatas =
        (RelationshipToIncidentIntegrationMetadatas) o;
    return Objects.equals(this.data, relationshipToIncidentIntegrationMetadatas.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationshipToIncidentIntegrationMetadatas {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
