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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Use this processor if you want to assign one or more attributes as the official service.
 *
 * <p><strong>Note:</strong> If multiple service remapper processors can be applied to a given log,
 * only the first one (according to the pipeline order) is taken into account.
 */
@JsonPropertyOrder({
  LogsServiceRemapper.JSON_PROPERTY_IS_ENABLED,
  LogsServiceRemapper.JSON_PROPERTY_NAME,
  LogsServiceRemapper.JSON_PROPERTY_SOURCES,
  LogsServiceRemapper.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsServiceRemapper {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled = false;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SOURCES = "sources";
  private List<String> sources = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsServiceRemapperType type = LogsServiceRemapperType.SERVICE_REMAPPER;

  public LogsServiceRemapper() {}

  @JsonCreator
  public LogsServiceRemapper(
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCES) List<String> sources,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) LogsServiceRemapperType type) {
    this.sources = sources;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public LogsServiceRemapper isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Whether or not the processor is enabled.
   *
   * @return isEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public LogsServiceRemapper name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the processor.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LogsServiceRemapper sources(List<String> sources) {
    this.sources = sources;
    return this;
  }

  public LogsServiceRemapper addSourcesItem(String sourcesItem) {
    this.sources.add(sourcesItem);
    return this;
  }

  /**
   * Array of source attributes.
   *
   * @return sources
   */
  @JsonProperty(JSON_PROPERTY_SOURCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getSources() {
    return sources;
  }

  public void setSources(List<String> sources) {
    this.sources = sources;
  }

  public LogsServiceRemapper type(LogsServiceRemapperType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of logs service remapper.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogsServiceRemapperType getType() {
    return type;
  }

  public void setType(LogsServiceRemapperType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this LogsServiceRemapper object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsServiceRemapper logsServiceRemapper = (LogsServiceRemapper) o;
    return Objects.equals(this.isEnabled, logsServiceRemapper.isEnabled)
        && Objects.equals(this.name, logsServiceRemapper.name)
        && Objects.equals(this.sources, logsServiceRemapper.sources)
        && Objects.equals(this.type, logsServiceRemapper.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnabled, name, sources, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsServiceRemapper {\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
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
