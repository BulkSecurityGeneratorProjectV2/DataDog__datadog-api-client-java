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

/**
 * Used to perform a histogram computation (only for measure facets). At most, 100 buckets are
 * allowed, the number of buckets is <code>(max - min)/interval</code>.
 */
@JsonPropertyOrder({
  CIAppGroupByHistogram.JSON_PROPERTY_INTERVAL,
  CIAppGroupByHistogram.JSON_PROPERTY_MAX,
  CIAppGroupByHistogram.JSON_PROPERTY_MIN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CIAppGroupByHistogram {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private Double interval;

  public static final String JSON_PROPERTY_MAX = "max";
  private Double max;

  public static final String JSON_PROPERTY_MIN = "min";
  private Double min;

  public CIAppGroupByHistogram() {}

  @JsonCreator
  public CIAppGroupByHistogram(
      @JsonProperty(required = true, value = JSON_PROPERTY_INTERVAL) Double interval,
      @JsonProperty(required = true, value = JSON_PROPERTY_MAX) Double max,
      @JsonProperty(required = true, value = JSON_PROPERTY_MIN) Double min) {
    this.interval = interval;
    this.max = max;
    this.min = min;
  }

  public CIAppGroupByHistogram interval(Double interval) {
    this.interval = interval;
    return this;
  }

  /**
   * The bin size of the histogram buckets.
   *
   * @return interval
   */
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getInterval() {
    return interval;
  }

  public void setInterval(Double interval) {
    this.interval = interval;
  }

  public CIAppGroupByHistogram max(Double max) {
    this.max = max;
    return this;
  }

  /**
   * The maximum value for the measure used in the histogram (values greater than this one are
   * filtered out).
   *
   * @return max
   */
  @JsonProperty(JSON_PROPERTY_MAX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getMax() {
    return max;
  }

  public void setMax(Double max) {
    this.max = max;
  }

  public CIAppGroupByHistogram min(Double min) {
    this.min = min;
    return this;
  }

  /**
   * The minimum value for the measure used in the histogram (values smaller than this one are
   * filtered out).
   *
   * @return min
   */
  @JsonProperty(JSON_PROPERTY_MIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getMin() {
    return min;
  }

  public void setMin(Double min) {
    this.min = min;
  }

  /** Return true if this CIAppGroupByHistogram object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CIAppGroupByHistogram ciAppGroupByHistogram = (CIAppGroupByHistogram) o;
    return Objects.equals(this.interval, ciAppGroupByHistogram.interval)
        && Objects.equals(this.max, ciAppGroupByHistogram.max)
        && Objects.equals(this.min, ciAppGroupByHistogram.min);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, max, min);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CIAppGroupByHistogram {\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
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
