/**
  * @author Josephat Ogwayi <jogwayi@gmail.com>* MMT reports API
 * MMT reports API documentation.
 *
 * Do not edit the class manually.
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
import util.mymosttrusted.model.StatsSummedResultTrackingLinks;
import util.mymosttrusted.model.UserStatsResultInvites;

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
 * StatsSummedResult
 */

public class StatsSummedResult {
  public static final String SERIALIZED_NAME_INVITES = "invites";
  @SerializedName(SERIALIZED_NAME_INVITES)
  private UserStatsResultInvites invites;

  public static final String SERIALIZED_NAME_TRACKING_LINKS = "tracking_links";
  @SerializedName(SERIALIZED_NAME_TRACKING_LINKS)
  private StatsSummedResultTrackingLinks trackingLinks;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Integer tags;

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private Integer users;

  public StatsSummedResult() { 
  }

  public StatsSummedResult invites(UserStatsResultInvites invites) {
    
    this.invites = invites;
    return this;
  }

   /**
   * Get invites
   * @return invites
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserStatsResultInvites getInvites() {
    return invites;
  }


  public void setInvites(UserStatsResultInvites invites) {
    this.invites = invites;
  }


  public StatsSummedResult trackingLinks(StatsSummedResultTrackingLinks trackingLinks) {
    
    this.trackingLinks = trackingLinks;
    return this;
  }

   /**
   * Get trackingLinks
   * @return trackingLinks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StatsSummedResultTrackingLinks getTrackingLinks() {
    return trackingLinks;
  }


  public void setTrackingLinks(StatsSummedResultTrackingLinks trackingLinks) {
    this.trackingLinks = trackingLinks;
  }


  public StatsSummedResult tags(Integer tags) {
    
    this.tags = tags;
    return this;
  }

   /**
   * Total number of tags sent
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Total number of tags sent")

  public Integer getTags() {
    return tags;
  }


  public void setTags(Integer tags) {
    this.tags = tags;
  }


  public StatsSummedResult users(Integer users) {
    
    this.users = users;
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getUsers() {
    return users;
  }


  public void setUsers(Integer users) {
    this.users = users;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatsSummedResult statsSummedResult = (StatsSummedResult) o;
    return Objects.equals(this.invites, statsSummedResult.invites) &&
        Objects.equals(this.trackingLinks, statsSummedResult.trackingLinks) &&
        Objects.equals(this.tags, statsSummedResult.tags) &&
        Objects.equals(this.users, statsSummedResult.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invites, trackingLinks, tags, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsSummedResult {\n");
    sb.append("    invites: ").append(toIndentedString(invites)).append("\n");
    sb.append("    trackingLinks: ").append(toIndentedString(trackingLinks)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
    openapiFields.add("invites");
    openapiFields.add("tracking_links");
    openapiFields.add("tags");
    openapiFields.add("users");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StatsSummedResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (StatsSummedResult.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in StatsSummedResult is not found in the empty JSON string", StatsSummedResult.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StatsSummedResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StatsSummedResult` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `invites`
      if (jsonObj.getAsJsonObject("invites") != null) {
        UserStatsResultInvites.validateJsonObject(jsonObj.getAsJsonObject("invites"));
      }
      // validate the optional field `tracking_links`
      if (jsonObj.getAsJsonObject("tracking_links") != null) {
        StatsSummedResultTrackingLinks.validateJsonObject(jsonObj.getAsJsonObject("tracking_links"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StatsSummedResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StatsSummedResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StatsSummedResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StatsSummedResult.class));

       return (TypeAdapter<T>) new TypeAdapter<StatsSummedResult>() {
           @Override
           public void write(JsonWriter out, StatsSummedResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StatsSummedResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StatsSummedResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StatsSummedResult
  * @throws IOException if the JSON string is invalid with respect to StatsSummedResult
  */
  public static StatsSummedResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StatsSummedResult.class);
  }

 /**
  * Convert an instance of StatsSummedResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

