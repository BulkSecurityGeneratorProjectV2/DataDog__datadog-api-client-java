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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UserUpdatePayload
 */

public class UserUpdatePayload {
  /**
   * Gets or Sets accessRole
   */
  @JsonAdapter(AccessRoleEnum.Adapter.class)
  public enum AccessRoleEnum {
    ST("st"),
    
    ADM("adm"),
    
    RO("ro");

    private String value;

    AccessRoleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccessRoleEnum fromValue(String value) {
      for (AccessRoleEnum b : AccessRoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AccessRoleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccessRoleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccessRoleEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AccessRoleEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACCESS_ROLE = "access_role";
  @SerializedName(SERIALIZED_NAME_ACCESS_ROLE)
  private AccessRoleEnum accessRole;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public UserUpdatePayload accessRole(AccessRoleEnum accessRole) {
    this.accessRole = accessRole;
    return this;
  }

   /**
   * Get accessRole
   * @return accessRole
  **/
  @ApiModelProperty(value = "")
  public AccessRoleEnum getAccessRole() {
    return accessRole;
  }

  public void setAccessRole(AccessRoleEnum accessRole) {
    this.accessRole = accessRole;
  }

  public UserUpdatePayload disabled(Boolean disabled) {
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

  public UserUpdatePayload email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "test@datadoghq.com", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserUpdatePayload name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "test user", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserUpdatePayload userUpdatePayload = (UserUpdatePayload) o;
    return Objects.equals(this.accessRole, userUpdatePayload.accessRole) &&
        Objects.equals(this.disabled, userUpdatePayload.disabled) &&
        Objects.equals(this.email, userUpdatePayload.email) &&
        Objects.equals(this.name, userUpdatePayload.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessRole, disabled, email, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUpdatePayload {\n");
    sb.append("    accessRole: ").append(toIndentedString(accessRole)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
