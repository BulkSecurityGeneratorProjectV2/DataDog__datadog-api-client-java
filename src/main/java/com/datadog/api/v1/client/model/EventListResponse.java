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

/** An event list response. */
@ApiModel(description = "An event list response.")
@JsonPropertyOrder({EventListResponse.JSON_PROPERTY_EVENTS, EventListResponse.JSON_PROPERTY_STATUS})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EventListResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EVENTS = "events";
  private List<Event> events = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public EventListResponse events(List<Event> events) {
    this.events = events;
    for (Event item : events) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public EventListResponse addEventsItem(Event eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    this.unparsed |= eventsItem.unparsed;
    return this;
  }

  /**
   * An array of events.
   *
   * @return events
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of events.")
  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Event> getEvents() {
    return events;
  }

  public void setEvents(List<Event> events) {
    this.events = events;
  }

  public EventListResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * A status.
   *
   * @return status
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A status.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /** Return true if this EventListResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventListResponse eventListResponse = (EventListResponse) o;
    return Objects.equals(this.events, eventListResponse.events)
        && Objects.equals(this.status, eventListResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(events, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventListResponse {\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
