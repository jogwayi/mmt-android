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
import java.util.ArrayList;
import java.util.List;
import util.mymosttrusted.model.StatsSummedResultTrackingLinks;
import util.mymosttrusted.model.TagStats;

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
 * StatsByUserInvites
 */

public class StatsByUserInvites {
  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public static final String SERIALIZED_NAME_TRACKING_LINKS = "tracking_links";
  @SerializedName(SERIALIZED_NAME_TRACKING_LINKS)
  private StatsSummedResultTrackingLinks trackingLinks;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<TagStats> tags = null;

  public StatsByUserInvites() { 
  }

  public StatsByUserInvites userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public StatsByUserInvites firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public StatsByUserInvites lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public StatsByUserInvites total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }


  public StatsByUserInvites trackingLinks(StatsSummedResultTrackingLinks trackingLinks) {
    
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


  public StatsByUserInvites tags(List<TagStats> tags) {
    
    this.tags = tags;
    return this;
  }

  public StatsByUserInvites addTagsItem(TagStats tagsItem) {
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

  public List<TagStats> getTags() {
    return tags;
  }


  public void setTags(List<TagStats> tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatsByUserInvites statsByUserInvites = (StatsByUserInvites) o;
    return Objects.equals(this.userId, statsByUserInvites.userId) &&
        Objects.equals(this.firstName, statsByUserInvites.firstName) &&
        Objects.equals(this.lastName, statsByUserInvites.lastName) &&
        Objects.equals(this.total, statsByUserInvites.total) &&
        Objects.equals(this.trackingLinks, statsByUserInvites.trackingLinks) &&
        Objects.equals(this.tags, statsByUserInvites.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, firstName, lastName, total, trackingLinks, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsByUserInvites {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    trackingLinks: ").append(toIndentedString(trackingLinks)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("user_id");
    openapiFields.add("first_name");
    openapiFields.add("last_name");
    openapiFields.add("total");
    openapiFields.add("tracking_links");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StatsByUserInvites
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (StatsByUserInvites.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in StatsByUserInvites is not found in the empty JSON string", StatsByUserInvites.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StatsByUserInvites.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StatsByUserInvites` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
      if (jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if (jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      // validate the optional field `tracking_links`
      if (jsonObj.getAsJsonObject("tracking_links") != null) {
        StatsSummedResultTrackingLinks.validateJsonObject(jsonObj.getAsJsonObject("tracking_links"));
      }
      JsonArray jsonArraytags = jsonObj.getAsJsonArray("tags");
      if (jsonArraytags != null) {
        // ensure the json data is an array
        if (!jsonObj.get("tags").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
        }

        // validate the optional field `tags` (array)
        for (int i = 0; i < jsonArraytags.size(); i++) {
          TagStats.validateJsonObject(jsonArraytags.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StatsByUserInvites.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StatsByUserInvites' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StatsByUserInvites> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StatsByUserInvites.class));

       return (TypeAdapter<T>) new TypeAdapter<StatsByUserInvites>() {
           @Override
           public void write(JsonWriter out, StatsByUserInvites value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StatsByUserInvites read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StatsByUserInvites given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StatsByUserInvites
  * @throws IOException if the JSON string is invalid with respect to StatsByUserInvites
  */
  public static StatsByUserInvites fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StatsByUserInvites.class);
  }

 /**
  * Convert an instance of StatsByUserInvites to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

