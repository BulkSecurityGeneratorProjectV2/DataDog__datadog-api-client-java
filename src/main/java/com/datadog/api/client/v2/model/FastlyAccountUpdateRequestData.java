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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Data object for updating a Fastly account. */
@JsonPropertyOrder({
  FastlyAccountUpdateRequestData.JSON_PROPERTY_API_KEY,
  FastlyAccountUpdateRequestData.JSON_PROPERTY_SERVICES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FastlyAccountUpdateRequestData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_API_KEY = "api_key";
  private String apiKey;

  public static final String JSON_PROPERTY_SERVICES = "services";
  private List<FastlyServiceRequestAttributes> services = null;

  public FastlyAccountUpdateRequestData apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  /**
   * The API key of the Fastly account.
   *
   * @return apiKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_API_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public FastlyAccountUpdateRequestData services(List<FastlyServiceRequestAttributes> services) {
    this.services = services;
    for (FastlyServiceRequestAttributes item : services) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public FastlyAccountUpdateRequestData addServicesItem(
      FastlyServiceRequestAttributes servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<>();
    }
    this.services.add(servicesItem);
    this.unparsed |= servicesItem.unparsed;
    return this;
  }

  /**
   * A list of services belonging to the parent account.
   *
   * @return services
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<FastlyServiceRequestAttributes> getServices() {
    return services;
  }

  public void setServices(List<FastlyServiceRequestAttributes> services) {
    this.services = services;
  }

  /** Return true if this FastlyAccountUpdateRequestData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FastlyAccountUpdateRequestData fastlyAccountUpdateRequestData =
        (FastlyAccountUpdateRequestData) o;
    return Objects.equals(this.apiKey, fastlyAccountUpdateRequestData.apiKey)
        && Objects.equals(this.services, fastlyAccountUpdateRequestData.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, services);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FastlyAccountUpdateRequestData {\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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
