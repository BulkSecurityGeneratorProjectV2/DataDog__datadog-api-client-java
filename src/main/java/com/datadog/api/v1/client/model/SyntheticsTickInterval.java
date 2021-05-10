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


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** The frequency at which to run the Synthetic test (in seconds). */
public enum SyntheticsTickInterval {
  THIRTY_SECONDS(30l),

  MINUTE(60l),

  FIVE_MINUTES(300l),

  FIFTEEN_MINUTES(900l),

  THIRTY_MINUTES(1800l),

  HOUR(3600l),

  SIX_HOURS(21600l),

  TWELVE_HOURS(43200l),

  DAY(86400l),

  WEEK(604800l);

  private Long value;

  SyntheticsTickInterval(Long value) {
    this.value = value;
  }

  @JsonValue
  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SyntheticsTickInterval fromValue(Long value) {
    for (SyntheticsTickInterval b : SyntheticsTickInterval.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
