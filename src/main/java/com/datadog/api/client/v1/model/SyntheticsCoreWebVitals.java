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

/** Core Web Vitals attached to a browser test step. */
@JsonPropertyOrder({
  SyntheticsCoreWebVitals.JSON_PROPERTY_CLS,
  SyntheticsCoreWebVitals.JSON_PROPERTY_LCP,
  SyntheticsCoreWebVitals.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsCoreWebVitals {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CLS = "cls";
  private Double cls;

  public static final String JSON_PROPERTY_LCP = "lcp";
  private Double lcp;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public SyntheticsCoreWebVitals cls(Double cls) {
    this.cls = cls;
    return this;
  }

  /**
   * Cumulative Layout Shift.
   *
   * @return cls
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCls() {
    return cls;
  }

  public void setCls(Double cls) {
    this.cls = cls;
  }

  public SyntheticsCoreWebVitals lcp(Double lcp) {
    this.lcp = lcp;
    return this;
  }

  /**
   * Largest Contentful Paint in milliseconds.
   *
   * @return lcp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LCP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLcp() {
    return lcp;
  }

  public void setLcp(Double lcp) {
    this.lcp = lcp;
  }

  public SyntheticsCoreWebVitals url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL attached to the metrics.
   *
   * @return url
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  /** Return true if this SyntheticsCoreWebVitals object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsCoreWebVitals syntheticsCoreWebVitals = (SyntheticsCoreWebVitals) o;
    return Objects.equals(this.cls, syntheticsCoreWebVitals.cls)
        && Objects.equals(this.lcp, syntheticsCoreWebVitals.lcp)
        && Objects.equals(this.url, syntheticsCoreWebVitals.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cls, lcp, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsCoreWebVitals {\n");
    sb.append("    cls: ").append(toIndentedString(cls)).append("\n");
    sb.append("    lcp: ").append(toIndentedString(lcp)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
