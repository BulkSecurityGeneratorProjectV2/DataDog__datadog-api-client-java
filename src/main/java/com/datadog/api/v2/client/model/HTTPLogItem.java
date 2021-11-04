/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v2.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** Logs that are sent over HTTP. */
@ApiModel(description = "Logs that are sent over HTTP.")
@JsonPropertyOrder({
  HTTPLogItem.JSON_PROPERTY_DDSOURCE,
  HTTPLogItem.JSON_PROPERTY_DDTAGS,
  HTTPLogItem.JSON_PROPERTY_HOSTNAME,
  HTTPLogItem.JSON_PROPERTY_MESSAGE,
  HTTPLogItem.JSON_PROPERTY_SERVICE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class HTTPLogItem {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DDSOURCE = "ddsource";
  private String ddsource;

  public static final String JSON_PROPERTY_DDTAGS = "ddtags";
  private String ddtags;

  public static final String JSON_PROPERTY_HOSTNAME = "hostname";
  private String hostname;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public HTTPLogItem ddsource(String ddsource) {
    this.ddsource = ddsource;
    return this;
  }

  /**
   * The integration name associated with your log: the technology from which the log originated.
   * When it matches an integration name, Datadog automatically installs the corresponding parsers
   * and facets. See [reserved
   * attributes](https://docs.datadoghq.com/logs/log_collection/#reserved-attributes).
   *
   * @return ddsource
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example = "nginx",
      value =
          "The integration name associated with your log: the technology from which the log"
              + " originated. When it matches an integration name, Datadog automatically installs"
              + " the corresponding parsers and facets. See [reserved"
              + " attributes](https://docs.datadoghq.com/logs/log_collection/#reserved-attributes).")
  @JsonProperty(JSON_PROPERTY_DDSOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDdsource() {
    return ddsource;
  }

  public void setDdsource(String ddsource) {
    this.ddsource = ddsource;
  }

  public HTTPLogItem ddtags(String ddtags) {
    this.ddtags = ddtags;
    return this;
  }

  /**
   * Tags associated with your logs.
   *
   * @return ddtags
   */
  @javax.annotation.Nullable
  @ApiModelProperty(example = "env:staging,version:5.1", value = "Tags associated with your logs.")
  @JsonProperty(JSON_PROPERTY_DDTAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDdtags() {
    return ddtags;
  }

  public void setDdtags(String ddtags) {
    this.ddtags = ddtags;
  }

  public HTTPLogItem hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * The name of the originating host of the log.
   *
   * @return hostname
   */
  @javax.annotation.Nullable
  @ApiModelProperty(example = "i-012345678", value = "The name of the originating host of the log.")
  @JsonProperty(JSON_PROPERTY_HOSTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public HTTPLogItem message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The message [reserved
   * attribute](https://docs.datadoghq.com/logs/log_collection/#reserved-attributes) of your log. By
   * default, Datadog ingests the value of the message attribute as the body of the log entry. That
   * value is then highlighted and displayed in the Logstream, where it is indexed for full text
   * search.
   *
   * @return message
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example = "2019-11-19T14:37:58,995 INFO [process.name][20081] Hello World",
      value =
          "The message [reserved"
              + " attribute](https://docs.datadoghq.com/logs/log_collection/#reserved-attributes)"
              + " of your log. By default, Datadog ingests the value of the message attribute as"
              + " the body of the log entry. That value is then highlighted and displayed in the"
              + " Logstream, where it is indexed for full text search.")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public HTTPLogItem service(String service) {
    this.service = service;
    return this;
  }

  /**
   * The name of the application or service generating the log events. It is used to switch from
   * Logs to APM, so make sure you define the same value when you use both products. See [reserved
   * attributes](https://docs.datadoghq.com/logs/log_collection/#reserved-attributes).
   *
   * @return service
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example = "payment",
      value =
          "The name of the application or service generating the log events. It is used to switch"
              + " from Logs to APM, so make sure you define the same value when you use both"
              + " products. See [reserved"
              + " attributes](https://docs.datadoghq.com/logs/log_collection/#reserved-attributes).")
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  /** Return true if this HTTPLogItem object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPLogItem htTPLogItem = (HTTPLogItem) o;
    return Objects.equals(this.ddsource, htTPLogItem.ddsource)
        && Objects.equals(this.ddtags, htTPLogItem.ddtags)
        && Objects.equals(this.hostname, htTPLogItem.hostname)
        && Objects.equals(this.message, htTPLogItem.message)
        && Objects.equals(this.service, htTPLogItem.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ddsource, ddtags, hostname, message, service);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HTTPLogItem {\n");
    sb.append("    ddsource: ").append(toIndentedString(ddsource)).append("\n");
    sb.append("    ddtags: ").append(toIndentedString(ddtags)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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
