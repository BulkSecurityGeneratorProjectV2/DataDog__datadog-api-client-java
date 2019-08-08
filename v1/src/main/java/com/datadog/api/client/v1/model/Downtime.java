/*
 * (C) Datadog, Inc. 2019
 * All rights reserved
 * Licensed under a 3-clause BSD style license (see LICENSE)
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.client.v1.model;

import java.util.Objects;
import java.util.Arrays;
import com.datadog.api.client.v1.model.DowntimeRecurrence;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Downtime
 */

public class Downtime {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_CANCELED = "canceled";
  @SerializedName(SERIALIZED_NAME_CANCELED)
  private Long canceled;

  public static final String SERIALIZED_NAME_CREATOR_ID = "creator_id";
  @SerializedName(SERIALIZED_NAME_CREATOR_ID)
  private Integer creatorId;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled;

  public static final String SERIALIZED_NAME_DOWNTIME_TYPE = "downtime_type";
  @SerializedName(SERIALIZED_NAME_DOWNTIME_TYPE)
  private Integer downtimeType;

  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  private Long end;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_MONITOR_ID = "monitor_id";
  @SerializedName(SERIALIZED_NAME_MONITOR_ID)
  private Integer monitorId;

  public static final String SERIALIZED_NAME_MONITOR_TAGS = "monitor_tags";
  @SerializedName(SERIALIZED_NAME_MONITOR_TAGS)
  private List<String> monitorTags = new ArrayList<String>();

  public static final String SERIALIZED_NAME_PARENT_ID = "parent_id";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private Integer parentId;

  public static final String SERIALIZED_NAME_RECURRENCE = "recurrence";
  @SerializedName(SERIALIZED_NAME_RECURRENCE)
  private DowntimeRecurrence recurrence = null;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private List<String> scope = new ArrayList<String>();

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private Long start;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_UPDATER_ID = "updater_id";
  @SerializedName(SERIALIZED_NAME_UPDATER_ID)
  private Integer updaterId;

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean getActive() {
    return active;
  }

   /**
   * Get canceled
   * @return canceled
  **/
  @ApiModelProperty(example = "1412799983", value = "")
  public Long getCanceled() {
    return canceled;
  }

   /**
   * Get creatorId
   * @return creatorId
  **/
  @ApiModelProperty(example = "123456", value = "")
  public Integer getCreatorId() {
    return creatorId;
  }

  public Downtime disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

   /**
   * Get downtimeType
   * @return downtimeType
  **/
  @ApiModelProperty(example = "2", value = "")
  public Integer getDowntimeType() {
    return downtimeType;
  }

  public Downtime end(Long end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @ApiModelProperty(example = "1412793983", value = "")
  public Long getEnd() {
    return end;
  }

  public void setEnd(Long end) {
    this.end = end;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1625", value = "")
  public Long getId() {
    return id;
  }

  public Downtime message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(example = "Message on the downtime", value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Downtime monitorId(Integer monitorId) {
    this.monitorId = monitorId;
    return this;
  }

   /**
   * Get monitorId
   * @return monitorId
  **/
  @ApiModelProperty(example = "123456", value = "")
  public Integer getMonitorId() {
    return monitorId;
  }

  public void setMonitorId(Integer monitorId) {
    this.monitorId = monitorId;
  }

  public Downtime monitorTags(List<String> monitorTags) {
    this.monitorTags = monitorTags;
    return this;
  }

  public Downtime addMonitorTagsItem(String monitorTagsItem) {
    if (this.monitorTags == null) {
      this.monitorTags = new ArrayList<String>();
    }
    this.monitorTags.add(monitorTagsItem);
    return this;
  }

   /**
   * Get monitorTags
   * @return monitorTags
  **/
  @ApiModelProperty(example = "[\"*\"]", value = "")
  public List<String> getMonitorTags() {
    return monitorTags;
  }

  public void setMonitorTags(List<String> monitorTags) {
    this.monitorTags = monitorTags;
  }

  public Downtime parentId(Integer parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @ApiModelProperty(example = "123", value = "")
  public Integer getParentId() {
    return parentId;
  }

  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }

  public Downtime recurrence(DowntimeRecurrence recurrence) {
    this.recurrence = recurrence;
    return this;
  }

   /**
   * Get recurrence
   * @return recurrence
  **/
  @ApiModelProperty(value = "")
  public DowntimeRecurrence getRecurrence() {
    return recurrence;
  }

  public void setRecurrence(DowntimeRecurrence recurrence) {
    this.recurrence = recurrence;
  }

  public Downtime scope(List<String> scope) {
    this.scope = scope;
    return this;
  }

  public Downtime addScopeItem(String scopeItem) {
    if (this.scope == null) {
      this.scope = new ArrayList<String>();
    }
    this.scope.add(scopeItem);
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @ApiModelProperty(example = "[\"env:staging\"]", value = "")
  public List<String> getScope() {
    return scope;
  }

  public void setScope(List<String> scope) {
    this.scope = scope;
  }

  public Downtime start(Long start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @ApiModelProperty(example = "1412792983", value = "")
  public Long getStart() {
    return start;
  }

  public void setStart(Long start) {
    this.start = start;
  }

  public Downtime timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @ApiModelProperty(example = "America/New_York", value = "")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

   /**
   * Get updaterId
   * @return updaterId
  **/
  @ApiModelProperty(example = "123456", value = "")
  public Integer getUpdaterId() {
    return updaterId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Downtime downtime = (Downtime) o;
    return Objects.equals(this.active, downtime.active) &&
        Objects.equals(this.canceled, downtime.canceled) &&
        Objects.equals(this.creatorId, downtime.creatorId) &&
        Objects.equals(this.disabled, downtime.disabled) &&
        Objects.equals(this.downtimeType, downtime.downtimeType) &&
        Objects.equals(this.end, downtime.end) &&
        Objects.equals(this.id, downtime.id) &&
        Objects.equals(this.message, downtime.message) &&
        Objects.equals(this.monitorId, downtime.monitorId) &&
        Objects.equals(this.monitorTags, downtime.monitorTags) &&
        Objects.equals(this.parentId, downtime.parentId) &&
        Objects.equals(this.recurrence, downtime.recurrence) &&
        Objects.equals(this.scope, downtime.scope) &&
        Objects.equals(this.start, downtime.start) &&
        Objects.equals(this.timezone, downtime.timezone) &&
        Objects.equals(this.updaterId, downtime.updaterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, canceled, creatorId, disabled, downtimeType, end, id, message, monitorId, monitorTags, parentId, recurrence, scope, start, timezone, updaterId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Downtime {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    canceled: ").append(toIndentedString(canceled)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    downtimeType: ").append(toIndentedString(downtimeType)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    monitorId: ").append(toIndentedString(monitorId)).append("\n");
    sb.append("    monitorTags: ").append(toIndentedString(monitorTags)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    recurrence: ").append(toIndentedString(recurrence)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    updaterId: ").append(toIndentedString(updaterId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
