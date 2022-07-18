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
import java.util.ArrayList;
import java.util.List;
import util.mymosttrusted.model.GroupedTagItem;
import util.mymosttrusted.model.TrackingLinkSummary;
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
 * UserStatsResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-18T09:33:18.403887+03:00[Africa/Nairobi]")
public class UserStatsResult {
  public static final String SERIALIZED_NAME_INVITES = "invites";
  @SerializedName(SERIALIZED_NAME_INVITES)
  private UserStatsResultInvites invites;

  public static final String SERIALIZED_NAME_TRACKING_LINKS = "tracking_links";
  @SerializedName(SERIALIZED_NAME_TRACKING_LINKS)
  private List<TrackingLinkSummary> trackingLinks = null;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<GroupedTagItem> tags = null;

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private Integer users;

  public UserStatsResult() { 
  }

  public UserStatsResult invites(UserStatsResultInvites invites) {
    
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


  public UserStatsResult trackingLinks(List<TrackingLinkSummary> trackingLinks) {
    
    this.trackingLinks = trackingLinks;
    return this;
  }

  public UserStatsResult addTrackingLinksItem(TrackingLinkSummary trackingLinksItem) {
    if (this.trackingLinks == null) {
      this.trackingLinks = new ArrayList<>();
    }
    this.trackingLinks.add(trackingLinksItem);
    return this;
  }

   /**
   * Get trackingLinks
   * @return trackingLinks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TrackingLinkSummary> getTrackingLinks() {
    return trackingLinks;
  }


  public void setTrackingLinks(List<TrackingLinkSummary> trackingLinks) {
    this.trackingLinks = trackingLinks;
  }


  public UserStatsResult tags(List<GroupedTagItem> tags) {
    
    this.tags = tags;
    return this;
  }

  public UserStatsResult addTagsItem(GroupedTagItem tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GroupedTagItem> getTags() {
    return tags;
  }


  public void setTags(List<GroupedTagItem> tags) {
    this.tags = tags;
  }


  public UserStatsResult users(Integer users) {
    
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
    UserStatsResult userStatsResult = (UserStatsResult) o;
    return Objects.equals(this.invites, userStatsResult.invites) &&
        Objects.equals(this.trackingLinks, userStatsResult.trackingLinks) &&
        Objects.equals(this.tags, userStatsResult.tags) &&
        Objects.equals(this.users, userStatsResult.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invites, trackingLinks, tags, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserStatsResult {\n");
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
  * @throws IOException if the JSON Object is invalid with respect to UserStatsResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UserStatsResult.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserStatsResult is not found in the empty JSON string", UserStatsResult.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UserStatsResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserStatsResult` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `invites`
      if (jsonObj.getAsJsonObject("invites") != null) {
        UserStatsResultInvites.validateJsonObject(jsonObj.getAsJsonObject("invites"));
      }
      JsonArray jsonArraytrackingLinks = jsonObj.getAsJsonArray("tracking_links");
      if (jsonArraytrackingLinks != null) {
        // ensure the json data is an array
        if (!jsonObj.get("tracking_links").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `tracking_links` to be an array in the JSON string but got `%s`", jsonObj.get("tracking_links").toString()));
        }

        // validate the optional field `tracking_links` (array)
        for (int i = 0; i < jsonArraytrackingLinks.size(); i++) {
          TrackingLinkSummary.validateJsonObject(jsonArraytrackingLinks.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraytags = jsonObj.getAsJsonArray("tags");
      if (jsonArraytags != null) {
        // ensure the json data is an array
        if (!jsonObj.get("tags").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
        }

        // validate the optional field `tags` (array)
        for (int i = 0; i < jsonArraytags.size(); i++) {
          GroupedTagItem.validateJsonObject(jsonArraytags.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserStatsResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserStatsResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserStatsResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserStatsResult.class));

       return (TypeAdapter<T>) new TypeAdapter<UserStatsResult>() {
           @Override
           public void write(JsonWriter out, UserStatsResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserStatsResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserStatsResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserStatsResult
  * @throws IOException if the JSON string is invalid with respect to UserStatsResult
  */
  public static UserStatsResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserStatsResult.class);
  }

 /**
  * Convert an instance of UserStatsResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

