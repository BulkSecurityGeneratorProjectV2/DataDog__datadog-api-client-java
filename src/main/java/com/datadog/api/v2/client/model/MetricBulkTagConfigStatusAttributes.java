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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Optional attributes for the status of a bulk tag configuration request. */
@JsonPropertyOrder({
  MetricBulkTagConfigStatusAttributes.JSON_PROPERTY_EMAILS,
  MetricBulkTagConfigStatusAttributes.JSON_PROPERTY_STATUS,
  MetricBulkTagConfigStatusAttributes.JSON_PROPERTY_TAGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MetricBulkTagConfigStatusAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EMAILS = "emails";
  private List<String> emails = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public MetricBulkTagConfigStatusAttributes emails(List<String> emails) {
    this.emails = emails;
    return this;
  }

  public MetricBulkTagConfigStatusAttributes addEmailsItem(String emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<>();
    }
    this.emails.add(emailsItem);
    return this;
  }

  /**
   * A list of account emails to notify when the configuration is applied.
   *
   * @return emails
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getEmails() {
    return emails;
  }

  public void setEmails(List<String> emails) {
    this.emails = emails;
  }

  public MetricBulkTagConfigStatusAttributes status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the request.
   *
   * @return status
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public MetricBulkTagConfigStatusAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public MetricBulkTagConfigStatusAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A list of tag names to apply to the configuration.
   *
   * @return tags
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /** Return true if this MetricBulkTagConfigStatusAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricBulkTagConfigStatusAttributes metricBulkTagConfigStatusAttributes =
        (MetricBulkTagConfigStatusAttributes) o;
    return Objects.equals(this.emails, metricBulkTagConfigStatusAttributes.emails)
        && Objects.equals(this.status, metricBulkTagConfigStatusAttributes.status)
        && Objects.equals(this.tags, metricBulkTagConfigStatusAttributes.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emails, status, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricBulkTagConfigStatusAttributes {\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
