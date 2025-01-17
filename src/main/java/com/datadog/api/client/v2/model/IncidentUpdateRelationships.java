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

/** The incident's relationships for an update request. */
@JsonPropertyOrder({
  IncidentUpdateRelationships.JSON_PROPERTY_COMMANDER_USER,
  IncidentUpdateRelationships.JSON_PROPERTY_INTEGRATIONS,
  IncidentUpdateRelationships.JSON_PROPERTY_POSTMORTEM
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentUpdateRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMMANDER_USER = "commander_user";
  private NullableRelationshipToUser commanderUser;

  public static final String JSON_PROPERTY_INTEGRATIONS = "integrations";
  private RelationshipToIncidentIntegrationMetadatas integrations;

  public static final String JSON_PROPERTY_POSTMORTEM = "postmortem";
  private RelationshipToIncidentPostmortem postmortem;

  public IncidentUpdateRelationships commanderUser(NullableRelationshipToUser commanderUser) {
    this.commanderUser = commanderUser;
    this.unparsed |= commanderUser.unparsed;
    return this;
  }

  /**
   * Relationship to user.
   *
   * @return commanderUser
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMANDER_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NullableRelationshipToUser getCommanderUser() {
    return commanderUser;
  }

  public void setCommanderUser(NullableRelationshipToUser commanderUser) {
    this.commanderUser = commanderUser;
  }

  public IncidentUpdateRelationships integrations(
      RelationshipToIncidentIntegrationMetadatas integrations) {
    this.integrations = integrations;
    this.unparsed |= integrations.unparsed;
    return this;
  }

  /**
   * A relationship reference for multiple integration metadata objects.
   *
   * @return integrations
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToIncidentIntegrationMetadatas getIntegrations() {
    return integrations;
  }

  public void setIntegrations(RelationshipToIncidentIntegrationMetadatas integrations) {
    this.integrations = integrations;
  }

  public IncidentUpdateRelationships postmortem(RelationshipToIncidentPostmortem postmortem) {
    this.postmortem = postmortem;
    this.unparsed |= postmortem.unparsed;
    return this;
  }

  /**
   * A relationship reference for postmortems.
   *
   * @return postmortem
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSTMORTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToIncidentPostmortem getPostmortem() {
    return postmortem;
  }

  public void setPostmortem(RelationshipToIncidentPostmortem postmortem) {
    this.postmortem = postmortem;
  }

  /** Return true if this IncidentUpdateRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentUpdateRelationships incidentUpdateRelationships = (IncidentUpdateRelationships) o;
    return Objects.equals(this.commanderUser, incidentUpdateRelationships.commanderUser)
        && Objects.equals(this.integrations, incidentUpdateRelationships.integrations)
        && Objects.equals(this.postmortem, incidentUpdateRelationships.postmortem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commanderUser, integrations, postmortem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentUpdateRelationships {\n");
    sb.append("    commanderUser: ").append(toIndentedString(commanderUser)).append("\n");
    sb.append("    integrations: ").append(toIndentedString(integrations)).append("\n");
    sb.append("    postmortem: ").append(toIndentedString(postmortem)).append("\n");
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
