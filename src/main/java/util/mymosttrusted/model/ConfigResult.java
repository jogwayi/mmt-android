/*
  MMT reports API
  MMT reports API documentation.
 
  Do not edit the class manually.
 */


package util.mymosttrusted.model;

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
import java.net.URI;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import util.mymosttrusted.api.JSON;

/**
 * ConfigResult
 */

public class ConfigResult {
  public static final String SERIALIZED_NAME_NETWORK_ID = "network_id";
  @SerializedName(SERIALIZED_NAME_NETWORK_ID)
  private Integer networkId;

  public static final String SERIALIZED_NAME_SEARCH_URL = "search_url";
  @SerializedName(SERIALIZED_NAME_SEARCH_URL)
  private URI searchUrl;

  public static final String SERIALIZED_NAME_INVITATION_MESSAGE = "invitation_message";
  @SerializedName(SERIALIZED_NAME_INVITATION_MESSAGE)
  private String invitationMessage;

  public static final String SERIALIZED_NAME_ACCEPTANCE_MESSAGE = "acceptance_message";
  @SerializedName(SERIALIZED_NAME_ACCEPTANCE_MESSAGE)
  private String acceptanceMessage;

  public static final String SERIALIZED_NAME_CUSTOM_MESSAGE1 = "custom_message1";
  @SerializedName(SERIALIZED_NAME_CUSTOM_MESSAGE1)
  private String customMessage1;

  public static final String SERIALIZED_NAME_CUSTOM_MESSAGE2 = "custom_message2";
  @SerializedName(SERIALIZED_NAME_CUSTOM_MESSAGE2)
  private String customMessage2;

  public ConfigResult() { 
  }

  public ConfigResult networkId(Integer networkId) {
    
    this.networkId = networkId;
    return this;
  }

   /**
   * The ID of the network configuration you&#39;re viewing
   * @return networkId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The ID of the network configuration you're viewing")

  public Integer getNetworkId() {
    return networkId;
  }


  public void setNetworkId(Integer networkId) {
    this.networkId = networkId;
  }


  public ConfigResult searchUrl(URI searchUrl) {
    
    this.searchUrl = searchUrl;
    return this;
  }

   /**
   * The user&#39;s associated search url configuration for the network configuration you&#39;re viewing
   * @return searchUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.linkedin.com/search/results/all/?keywords=(risk%20OR%20compliance%20OR%20safety%20OR%20health)%20AND(manager%20OR%20director%20OR%20head)&origin=HISTORY&sid=eU4", value = "The user's associated search url configuration for the network configuration you're viewing")

  public URI getSearchUrl() {
    return searchUrl;
  }


  public void setSearchUrl(URI searchUrl) {
    this.searchUrl = searchUrl;
  }


  public ConfigResult invitationMessage(String invitationMessage) {
    
    this.invitationMessage = invitationMessage;
    return this;
  }

   /**
   * The invitation message template currently configured
   * @return invitationMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Invitation Message sample", value = "The invitation message template currently configured")

  public String getInvitationMessage() {
    return invitationMessage;
  }


  public void setInvitationMessage(String invitationMessage) {
    this.invitationMessage = invitationMessage;
  }


  public ConfigResult acceptanceMessage(String acceptanceMessage) {
    
    this.acceptanceMessage = acceptanceMessage;
    return this;
  }

   /**
   * The acceptance message template currently configured
   * @return acceptanceMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Acceptance Message sample", value = "The acceptance message template currently configured")

  public String getAcceptanceMessage() {
    return acceptanceMessage;
  }


  public void setAcceptanceMessage(String acceptanceMessage) {
    this.acceptanceMessage = acceptanceMessage;
  }


  public ConfigResult customMessage1(String customMessage1) {
    
    this.customMessage1 = customMessage1;
    return this;
  }

   /**
   * The custom message 1 template currently configured
   * @return customMessage1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Custom Message 1 sample", value = "The custom message 1 template currently configured")

  public String getCustomMessage1() {
    return customMessage1;
  }


  public void setCustomMessage1(String customMessage1) {
    this.customMessage1 = customMessage1;
  }


  public ConfigResult customMessage2(String customMessage2) {
    
    this.customMessage2 = customMessage2;
    return this;
  }

   /**
   * The custom message 2 template currently configured
   * @return customMessage2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Custom Message 2 sample", value = "The custom message 2 template currently configured")

  public String getCustomMessage2() {
    return customMessage2;
  }


  public void setCustomMessage2(String customMessage2) {
    this.customMessage2 = customMessage2;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigResult configResult = (ConfigResult) o;
    return Objects.equals(this.networkId, configResult.networkId) &&
        Objects.equals(this.searchUrl, configResult.searchUrl) &&
        Objects.equals(this.invitationMessage, configResult.invitationMessage) &&
        Objects.equals(this.acceptanceMessage, configResult.acceptanceMessage) &&
        Objects.equals(this.customMessage1, configResult.customMessage1) &&
        Objects.equals(this.customMessage2, configResult.customMessage2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkId, searchUrl, invitationMessage, acceptanceMessage, customMessage1, customMessage2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigResult {\n");
    sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
    sb.append("    searchUrl: ").append(toIndentedString(searchUrl)).append("\n");
    sb.append("    invitationMessage: ").append(toIndentedString(invitationMessage)).append("\n");
    sb.append("    acceptanceMessage: ").append(toIndentedString(acceptanceMessage)).append("\n");
    sb.append("    customMessage1: ").append(toIndentedString(customMessage1)).append("\n");
    sb.append("    customMessage2: ").append(toIndentedString(customMessage2)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("network_id");
    openapiFields.add("search_url");
    openapiFields.add("invitation_message");
    openapiFields.add("acceptance_message");
    openapiFields.add("custom_message1");
    openapiFields.add("custom_message2");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConfigResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ConfigResult.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConfigResult is not found in the empty JSON string", ConfigResult.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConfigResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConfigResult` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("search_url") != null && !jsonObj.get("search_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `search_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("search_url").toString()));
      }
      if (jsonObj.get("invitation_message") != null && !jsonObj.get("invitation_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invitation_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invitation_message").toString()));
      }
      if (jsonObj.get("acceptance_message") != null && !jsonObj.get("acceptance_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `acceptance_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("acceptance_message").toString()));
      }
      if (jsonObj.get("custom_message1") != null && !jsonObj.get("custom_message1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_message1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_message1").toString()));
      }
      if (jsonObj.get("custom_message2") != null && !jsonObj.get("custom_message2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_message2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_message2").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConfigResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConfigResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConfigResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConfigResult.class));

       return (TypeAdapter<T>) new TypeAdapter<ConfigResult>() {
           @Override
           public void write(JsonWriter out, ConfigResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConfigResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConfigResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConfigResult
  * @throws IOException if the JSON string is invalid with respect to ConfigResult
  */
  public static ConfigResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConfigResult.class);
  }

 /**
  * Convert an instance of ConfigResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

