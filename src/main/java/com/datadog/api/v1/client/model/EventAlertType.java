/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * If an alert event is enabled, set its type. For example, <code>error</code>, <code>warning</code>
 * , <code>info</code>, <code>success</code>, <code>user_update</code>, <code>recommendation</code>,
 * and <code>snapshot</code>.
 */
@JsonSerialize(using = EventAlertType.EventAlertTypeSerializer.class)
public class EventAlertType {

  public static final EventAlertType ERROR = new EventAlertType("error");
  public static final EventAlertType WARNING = new EventAlertType("warning");
  public static final EventAlertType INFO = new EventAlertType("info");
  public static final EventAlertType SUCCESS = new EventAlertType("success");
  public static final EventAlertType USER_UPDATE = new EventAlertType("user_update");
  public static final EventAlertType RECOMMENDATION = new EventAlertType("recommendation");
  public static final EventAlertType SNAPSHOT = new EventAlertType("snapshot");

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "error", "warning", "info", "success", "user_update", "recommendation", "snapshot"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  EventAlertType(String value) {
    this.value = value;
  }

  public static class EventAlertTypeSerializer extends StdSerializer<EventAlertType> {
    public EventAlertTypeSerializer(Class<EventAlertType> t) {
      super(t);
    }

    public EventAlertTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(EventAlertType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonValue
  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /** Return true if this EventAlertType object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((EventAlertType) o).value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static EventAlertType fromValue(String value) {
    return new EventAlertType(value);
  }
}
