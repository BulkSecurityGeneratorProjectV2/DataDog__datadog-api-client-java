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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Available prefix information for the Synthetics endpoints. */
@JsonPropertyOrder({
  IPPrefixesSynthetics.JSON_PROPERTY_PREFIXES_IPV4,
  IPPrefixesSynthetics.JSON_PROPERTY_PREFIXES_IPV4_BY_LOCATION,
  IPPrefixesSynthetics.JSON_PROPERTY_PREFIXES_IPV6,
  IPPrefixesSynthetics.JSON_PROPERTY_PREFIXES_IPV6_BY_LOCATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IPPrefixesSynthetics {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PREFIXES_IPV4 = "prefixes_ipv4";
  private List<String> prefixesIpv4 = null;

  public static final String JSON_PROPERTY_PREFIXES_IPV4_BY_LOCATION = "prefixes_ipv4_by_location";
  private Map<String, List<String>> prefixesIpv4ByLocation = null;

  public static final String JSON_PROPERTY_PREFIXES_IPV6 = "prefixes_ipv6";
  private List<String> prefixesIpv6 = null;

  public static final String JSON_PROPERTY_PREFIXES_IPV6_BY_LOCATION = "prefixes_ipv6_by_location";
  private Map<String, List<String>> prefixesIpv6ByLocation = null;

  public IPPrefixesSynthetics prefixesIpv4(List<String> prefixesIpv4) {
    this.prefixesIpv4 = prefixesIpv4;
    return this;
  }

  public IPPrefixesSynthetics addPrefixesIpv4Item(String prefixesIpv4Item) {
    if (this.prefixesIpv4 == null) {
      this.prefixesIpv4 = new ArrayList<>();
    }
    this.prefixesIpv4.add(prefixesIpv4Item);
    return this;
  }

  /**
   * List of IPv4 prefixes.
   *
   * @return prefixesIpv4
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFIXES_IPV4)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getPrefixesIpv4() {
    return prefixesIpv4;
  }

  public void setPrefixesIpv4(List<String> prefixesIpv4) {
    this.prefixesIpv4 = prefixesIpv4;
  }

  public IPPrefixesSynthetics prefixesIpv4ByLocation(
      Map<String, List<String>> prefixesIpv4ByLocation) {
    this.prefixesIpv4ByLocation = prefixesIpv4ByLocation;
    return this;
  }

  public IPPrefixesSynthetics putPrefixesIpv4ByLocationItem(
      String key, List<String> prefixesIpv4ByLocationItem) {
    if (this.prefixesIpv4ByLocation == null) {
      this.prefixesIpv4ByLocation = new HashMap<>();
    }
    this.prefixesIpv4ByLocation.put(key, prefixesIpv4ByLocationItem);
    return this;
  }

  /**
   * List of IPv4 prefixes by location.
   *
   * @return prefixesIpv4ByLocation
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFIXES_IPV4_BY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, List<String>> getPrefixesIpv4ByLocation() {
    return prefixesIpv4ByLocation;
  }

  public void setPrefixesIpv4ByLocation(Map<String, List<String>> prefixesIpv4ByLocation) {
    this.prefixesIpv4ByLocation = prefixesIpv4ByLocation;
  }

  public IPPrefixesSynthetics prefixesIpv6(List<String> prefixesIpv6) {
    this.prefixesIpv6 = prefixesIpv6;
    return this;
  }

  public IPPrefixesSynthetics addPrefixesIpv6Item(String prefixesIpv6Item) {
    if (this.prefixesIpv6 == null) {
      this.prefixesIpv6 = new ArrayList<>();
    }
    this.prefixesIpv6.add(prefixesIpv6Item);
    return this;
  }

  /**
   * List of IPv6 prefixes.
   *
   * @return prefixesIpv6
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFIXES_IPV6)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getPrefixesIpv6() {
    return prefixesIpv6;
  }

  public void setPrefixesIpv6(List<String> prefixesIpv6) {
    this.prefixesIpv6 = prefixesIpv6;
  }

  public IPPrefixesSynthetics prefixesIpv6ByLocation(
      Map<String, List<String>> prefixesIpv6ByLocation) {
    this.prefixesIpv6ByLocation = prefixesIpv6ByLocation;
    return this;
  }

  public IPPrefixesSynthetics putPrefixesIpv6ByLocationItem(
      String key, List<String> prefixesIpv6ByLocationItem) {
    if (this.prefixesIpv6ByLocation == null) {
      this.prefixesIpv6ByLocation = new HashMap<>();
    }
    this.prefixesIpv6ByLocation.put(key, prefixesIpv6ByLocationItem);
    return this;
  }

  /**
   * List of IPv6 prefixes by location.
   *
   * @return prefixesIpv6ByLocation
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFIXES_IPV6_BY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, List<String>> getPrefixesIpv6ByLocation() {
    return prefixesIpv6ByLocation;
  }

  public void setPrefixesIpv6ByLocation(Map<String, List<String>> prefixesIpv6ByLocation) {
    this.prefixesIpv6ByLocation = prefixesIpv6ByLocation;
  }

  /** Return true if this IPPrefixesSynthetics object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPPrefixesSynthetics ipPrefixesSynthetics = (IPPrefixesSynthetics) o;
    return Objects.equals(this.prefixesIpv4, ipPrefixesSynthetics.prefixesIpv4)
        && Objects.equals(this.prefixesIpv4ByLocation, ipPrefixesSynthetics.prefixesIpv4ByLocation)
        && Objects.equals(this.prefixesIpv6, ipPrefixesSynthetics.prefixesIpv6)
        && Objects.equals(this.prefixesIpv6ByLocation, ipPrefixesSynthetics.prefixesIpv6ByLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prefixesIpv4, prefixesIpv4ByLocation, prefixesIpv6, prefixesIpv6ByLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPPrefixesSynthetics {\n");
    sb.append("    prefixesIpv4: ").append(toIndentedString(prefixesIpv4)).append("\n");
    sb.append("    prefixesIpv4ByLocation: ")
        .append(toIndentedString(prefixesIpv4ByLocation))
        .append("\n");
    sb.append("    prefixesIpv6: ").append(toIndentedString(prefixesIpv6)).append("\n");
    sb.append("    prefixesIpv6ByLocation: ")
        .append(toIndentedString(prefixesIpv6ByLocation))
        .append("\n");
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
