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
import java.util.Objects;

/** Set a timeseries on the widget background. */
@JsonPropertyOrder({
  TimeseriesBackground.JSON_PROPERTY_TYPE,
  TimeseriesBackground.JSON_PROPERTY_YAXIS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TimeseriesBackground {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TYPE = "type";
  private TimeseriesBackgroundType type = TimeseriesBackgroundType.AREA;

  public static final String JSON_PROPERTY_YAXIS = "yaxis";
  private WidgetAxis yaxis;

  public TimeseriesBackground() {}

  @JsonCreator
  public TimeseriesBackground(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) TimeseriesBackgroundType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public TimeseriesBackground type(TimeseriesBackgroundType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Timeseries is made using an area or bars.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TimeseriesBackgroundType getType() {
    return type;
  }

  public void setType(TimeseriesBackgroundType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public TimeseriesBackground yaxis(WidgetAxis yaxis) {
    this.yaxis = yaxis;
    this.unparsed |= yaxis.unparsed;
    return this;
  }

  /**
   * Axis controls for the widget.
   *
   * @return yaxis
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_YAXIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetAxis getYaxis() {
    return yaxis;
  }

  public void setYaxis(WidgetAxis yaxis) {
    this.yaxis = yaxis;
  }

  /** Return true if this TimeseriesBackground object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeseriesBackground timeseriesBackground = (TimeseriesBackground) o;
    return Objects.equals(this.type, timeseriesBackground.type)
        && Objects.equals(this.yaxis, timeseriesBackground.yaxis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, yaxis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesBackground {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    yaxis: ").append(toIndentedString(yaxis)).append("\n");
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
