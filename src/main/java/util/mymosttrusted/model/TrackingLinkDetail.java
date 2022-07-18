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
 * TrackingLinkDetail
 */

public class TrackingLinkDetail {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link;

  public static final String SERIALIZED_NAME_TRACKING_LINK_NAME = "tracking_link_name";
  @SerializedName(SERIALIZED_NAME_TRACKING_LINK_NAME)
  private String trackingLinkName;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private String created;

  public static final String SERIALIZED_NAME_CLICKED = "clicked";
  @SerializedName(SERIALIZED_NAME_CLICKED)
  private String clicked;

  public static final String SERIALIZED_NAME_TRACKING_LINK = "tracking_link";
  @SerializedName(SERIALIZED_NAME_TRACKING_LINK)
  private String trackingLink;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_LI_USER_ID = "li_user_id";
  @SerializedName(SERIALIZED_NAME_LI_USER_ID)
  private String liUserId;

  public TrackingLinkDetail() { 
  }

  public TrackingLinkDetail id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public TrackingLinkDetail link(String link) {
    
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLink() {
    return link;
  }


  public void setLink(String link) {
    this.link = link;
  }


  public TrackingLinkDetail trackingLinkName(String trackingLinkName) {
    
    this.trackingLinkName = trackingLinkName;
    return this;
  }

   /**
   * Get trackingLinkName
   * @return trackingLinkName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTrackingLinkName() {
    return trackingLinkName;
  }


  public void setTrackingLinkName(String trackingLinkName) {
    this.trackingLinkName = trackingLinkName;
  }


  public TrackingLinkDetail created(String created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreated() {
    return created;
  }


  public void setCreated(String created) {
    this.created = created;
  }


  public TrackingLinkDetail clicked(String clicked) {
    
    this.clicked = clicked;
    return this;
  }

   /**
   * Get clicked
   * @return clicked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClicked() {
    return clicked;
  }


  public void setClicked(String clicked) {
    this.clicked = clicked;
  }


  public TrackingLinkDetail trackingLink(String trackingLink) {
    
    this.trackingLink = trackingLink;
    return this;
  }

   /**
   * Get trackingLink
   * @return trackingLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTrackingLink() {
    return trackingLink;
  }


  public void setTrackingLink(String trackingLink) {
    this.trackingLink = trackingLink;
  }


  public TrackingLinkDetail firstName(String firstName) {
    
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


  public TrackingLinkDetail lastName(String lastName) {
    
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


  public TrackingLinkDetail liUserId(String liUserId) {
    
    this.liUserId = liUserId;
    return this;
  }

   /**
   * Get liUserId
   * @return liUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLiUserId() {
    return liUserId;
  }


  public void setLiUserId(String liUserId) {
    this.liUserId = liUserId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackingLinkDetail trackingLinkDetail = (TrackingLinkDetail) o;
    return Objects.equals(this.id, trackingLinkDetail.id) &&
        Objects.equals(this.link, trackingLinkDetail.link) &&
        Objects.equals(this.trackingLinkName, trackingLinkDetail.trackingLinkName) &&
        Objects.equals(this.created, trackingLinkDetail.created) &&
        Objects.equals(this.clicked, trackingLinkDetail.clicked) &&
        Objects.equals(this.trackingLink, trackingLinkDetail.trackingLink) &&
        Objects.equals(this.firstName, trackingLinkDetail.firstName) &&
        Objects.equals(this.lastName, trackingLinkDetail.lastName) &&
        Objects.equals(this.liUserId, trackingLinkDetail.liUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, link, trackingLinkName, created, clicked, trackingLink, firstName, lastName, liUserId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackingLinkDetail {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    trackingLinkName: ").append(toIndentedString(trackingLinkName)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    clicked: ").append(toIndentedString(clicked)).append("\n");
    sb.append("    trackingLink: ").append(toIndentedString(trackingLink)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    liUserId: ").append(toIndentedString(liUserId)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("link");
    openapiFields.add("tracking_link_name");
    openapiFields.add("created");
    openapiFields.add("clicked");
    openapiFields.add("tracking_link");
    openapiFields.add("first_name");
    openapiFields.add("last_name");
    openapiFields.add("li_user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TrackingLinkDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TrackingLinkDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrackingLinkDetail is not found in the empty JSON string", TrackingLinkDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TrackingLinkDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TrackingLinkDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("link") != null && !jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
      if (jsonObj.get("tracking_link_name") != null && !jsonObj.get("tracking_link_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tracking_link_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tracking_link_name").toString()));
      }
      if (jsonObj.get("created") != null && !jsonObj.get("created").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created").toString()));
      }
      if (jsonObj.get("clicked") != null && !jsonObj.get("clicked").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clicked` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clicked").toString()));
      }
      if (jsonObj.get("tracking_link") != null && !jsonObj.get("tracking_link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tracking_link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tracking_link").toString()));
      }
      if (jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if (jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      if (jsonObj.get("li_user_id") != null && !jsonObj.get("li_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `li_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("li_user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrackingLinkDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrackingLinkDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrackingLinkDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrackingLinkDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<TrackingLinkDetail>() {
           @Override
           public void write(JsonWriter out, TrackingLinkDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TrackingLinkDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TrackingLinkDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TrackingLinkDetail
  * @throws IOException if the JSON string is invalid with respect to TrackingLinkDetail
  */
  public static TrackingLinkDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrackingLinkDetail.class);
  }

 /**
  * Convert an instance of TrackingLinkDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

