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
import java.util.Objects;

/** Incident Service payload for create requests. */
@JsonPropertyOrder({
  IncidentServiceCreateData.JSON_PROPERTY_ATTRIBUTES,
  IncidentServiceCreateData.JSON_PROPERTY_RELATIONSHIPS,
  IncidentServiceCreateData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentServiceCreateData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private IncidentServiceCreateAttributes attributes;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private IncidentServiceRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private IncidentServiceType type = IncidentServiceType.SERVICES;

  public IncidentServiceCreateData() {}

  @JsonCreator
  public IncidentServiceCreateData(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) IncidentServiceType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public IncidentServiceCreateData attributes(IncidentServiceCreateAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * The incident service's attributes for a create request.
   *
   * @return attributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncidentServiceCreateAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(IncidentServiceCreateAttributes attributes) {
    this.attributes = attributes;
  }

  /**
   * The incident service's relationships.
   *
   * @return relationships
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncidentServiceRelationships getRelationships() {
    return relationships;
  }

  public IncidentServiceCreateData type(IncidentServiceType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Incident service resource type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentServiceType getType() {
    return type;
  }

  public void setType(IncidentServiceType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this IncidentServiceCreateData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentServiceCreateData incidentServiceCreateData = (IncidentServiceCreateData) o;
    return Objects.equals(this.attributes, incidentServiceCreateData.attributes)
        && Objects.equals(this.relationships, incidentServiceCreateData.relationships)
        && Objects.equals(this.type, incidentServiceCreateData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, relationships, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentServiceCreateData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
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
