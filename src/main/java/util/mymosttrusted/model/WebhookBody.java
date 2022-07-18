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
 * WebhookBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-18T09:33:18.403887+03:00[Africa/Nairobi]")
public class WebhookBody {
  public static final String SERIALIZED_NAME_TAG_NAME = "tag_name";
  @SerializedName(SERIALIZED_NAME_TAG_NAME)
  private String tagName;

  public static final String SERIALIZED_NAME_WEBHOOK_URL = "webhook_url";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_URL)
  private URI webhookUrl;

  public WebhookBody() { 
  }

  public WebhookBody tagName(String tagName) {
    
    this.tagName = tagName;
    return this;
  }

   /**
   * The tag associated with the webhook event being configured for the user you&#39;re setting up
   * @return tagName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Push to CRM", value = "The tag associated with the webhook event being configured for the user you're setting up")

  public String getTagName() {
    return tagName;
  }


  public void setTagName(String tagName) {
    this.tagName = tagName;
  }


  public WebhookBody webhookUrl(URI webhookUrl) {
    
    this.webhookUrl = webhookUrl;
    return this;
  }

   /**
   * The URL to receive the webhook events
   * @return webhookUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://webhook.mymosttrusted.net?fid=1323", value = "The URL to receive the webhook events")

  public URI getWebhookUrl() {
    return webhookUrl;
  }


  public void setWebhookUrl(URI webhookUrl) {
    this.webhookUrl = webhookUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookBody webhookBody = (WebhookBody) o;
    return Objects.equals(this.tagName, webhookBody.tagName) &&
        Objects.equals(this.webhookUrl, webhookBody.webhookUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagName, webhookUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookBody {\n");
    sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
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
    openapiFields.add("tag_name");
    openapiFields.add("webhook_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookBody
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WebhookBody.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookBody is not found in the empty JSON string", WebhookBody.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhookBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookBody` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("tag_name") != null && !jsonObj.get("tag_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag_name").toString()));
      }
      if (jsonObj.get("webhook_url") != null && !jsonObj.get("webhook_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webhook_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webhook_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookBody.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookBody>() {
           @Override
           public void write(JsonWriter out, WebhookBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookBody read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookBody
  * @throws IOException if the JSON string is invalid with respect to WebhookBody
  */
  public static WebhookBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookBody.class);
  }

 /**
  * Convert an instance of WebhookBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

