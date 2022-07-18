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
 * WebhookResultItem
 */

public class WebhookResultItem {
  public static final String SERIALIZED_NAME_WEBHOOK_ID = "webhook_id";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_ID)
  private Integer webhookId;

  public static final String SERIALIZED_NAME_NETWORK_ID = "network_id";
  @SerializedName(SERIALIZED_NAME_NETWORK_ID)
  private Integer networkId;

  public static final String SERIALIZED_NAME_WEBHOOK_URL = "webhook_url";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_URL)
  private URI webhookUrl;

  public static final String SERIALIZED_NAME_TAG_NAME = "tag_name";
  @SerializedName(SERIALIZED_NAME_TAG_NAME)
  private String tagName;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private String created;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private String updated;

  public WebhookResultItem() { 
  }

  public WebhookResultItem webhookId(Integer webhookId) {
    
    this.webhookId = webhookId;
    return this;
  }

   /**
   * Get webhookId
   * @return webhookId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "")

  public Integer getWebhookId() {
    return webhookId;
  }


  public void setWebhookId(Integer webhookId) {
    this.webhookId = webhookId;
  }


  public WebhookResultItem networkId(Integer networkId) {
    
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


  public WebhookResultItem webhookUrl(URI webhookUrl) {
    
    this.webhookUrl = webhookUrl;
    return this;
  }

   /**
   * The user&#39;s associated search url configuration for the network configuration you&#39;re viewing
   * @return webhookUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://webhook.mymosttrusted.net?fid=1323", value = "The user's associated search url configuration for the network configuration you're viewing")

  public URI getWebhookUrl() {
    return webhookUrl;
  }


  public void setWebhookUrl(URI webhookUrl) {
    this.webhookUrl = webhookUrl;
  }


  public WebhookResultItem tagName(String tagName) {
    
    this.tagName = tagName;
    return this;
  }

   /**
   * The tag/event currently configured for this webhook
   * @return tagName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Push to CRM", value = "The tag/event currently configured for this webhook")

  public String getTagName() {
    return tagName;
  }


  public void setTagName(String tagName) {
    this.tagName = tagName;
  }


  public WebhookResultItem created(String created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-01-01T00:30:36Z", value = "")

  public String getCreated() {
    return created;
  }


  public void setCreated(String created) {
    this.created = created;
  }


  public WebhookResultItem updated(String updated) {
    
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-01-01T17:30:36Z", value = "")

  public String getUpdated() {
    return updated;
  }


  public void setUpdated(String updated) {
    this.updated = updated;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookResultItem webhookResultItem = (WebhookResultItem) o;
    return Objects.equals(this.webhookId, webhookResultItem.webhookId) &&
        Objects.equals(this.networkId, webhookResultItem.networkId) &&
        Objects.equals(this.webhookUrl, webhookResultItem.webhookUrl) &&
        Objects.equals(this.tagName, webhookResultItem.tagName) &&
        Objects.equals(this.created, webhookResultItem.created) &&
        Objects.equals(this.updated, webhookResultItem.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookId, networkId, webhookUrl, tagName, created, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookResultItem {\n");
    sb.append("    webhookId: ").append(toIndentedString(webhookId)).append("\n");
    sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
    sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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
    openapiFields.add("webhook_id");
    openapiFields.add("network_id");
    openapiFields.add("webhook_url");
    openapiFields.add("tag_name");
    openapiFields.add("created");
    openapiFields.add("updated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookResultItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WebhookResultItem.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookResultItem is not found in the empty JSON string", WebhookResultItem.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhookResultItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookResultItem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("webhook_url") != null && !jsonObj.get("webhook_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webhook_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webhook_url").toString()));
      }
      if (jsonObj.get("tag_name") != null && !jsonObj.get("tag_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag_name").toString()));
      }
      if (jsonObj.get("created") != null && !jsonObj.get("created").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created").toString()));
      }
      if (jsonObj.get("updated") != null && !jsonObj.get("updated").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookResultItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookResultItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookResultItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookResultItem.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookResultItem>() {
           @Override
           public void write(JsonWriter out, WebhookResultItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookResultItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookResultItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookResultItem
  * @throws IOException if the JSON string is invalid with respect to WebhookResultItem
  */
  public static WebhookResultItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookResultItem.class);
  }

 /**
  * Convert an instance of WebhookResultItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

