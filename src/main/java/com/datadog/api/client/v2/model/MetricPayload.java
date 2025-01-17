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

/** The metrics' payload. */
@JsonPropertyOrder({MetricPayload.JSON_PROPERTY_SERIES})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MetricPayload {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SERIES = "series";
  private List<MetricSeries> series = new ArrayList<>();

  public MetricPayload() {}

  @JsonCreator
  public MetricPayload(
      @JsonProperty(required = true, value = JSON_PROPERTY_SERIES) List<MetricSeries> series) {
    this.series = series;
  }

  public MetricPayload series(List<MetricSeries> series) {
    this.series = series;
    for (MetricSeries item : series) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public MetricPayload addSeriesItem(MetricSeries seriesItem) {
    this.series.add(seriesItem);
    this.unparsed |= seriesItem.unparsed;
    return this;
  }

  /**
   * A list of time series to submit to Datadog.
   *
   * @return series
   */
  @JsonProperty(JSON_PROPERTY_SERIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<MetricSeries> getSeries() {
    return series;
  }

  public void setSeries(List<MetricSeries> series) {
    this.series = series;
  }

  /** Return true if this MetricPayload object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricPayload metricPayload = (MetricPayload) o;
    return Objects.equals(this.series, metricPayload.series);
  }

  @Override
  public int hashCode() {
    return Objects.hash(series);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricPayload {\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
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
