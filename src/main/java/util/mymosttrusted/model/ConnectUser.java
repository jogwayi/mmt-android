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
import util.mymosttrusted.model.PhoneItem;

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
 * ConnectUser
 */

public class ConnectUser {
  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_THUMBNAIL = "thumbnail";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL)
  private String thumbnail;

  public static final String SERIALIZED_NAME_THUMBNAIL_ID = "thumbnail_id";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL_ID)
  private String thumbnailId;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private List<PhoneItem> phone = null;

  public static final String SERIALIZED_NAME_LI_LINK = "li_link";
  @SerializedName(SERIALIZED_NAME_LI_LINK)
  private String liLink;

  public static final String SERIALIZED_NAME_LI_USER_ID = "li_user_id";
  @SerializedName(SERIALIZED_NAME_LI_USER_ID)
  private String liUserId;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private String position;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_WEBSITE = "website";
  @SerializedName(SERIALIZED_NAME_WEBSITE)
  private String website;

  public static final String SERIALIZED_NAME_SEARCH_URL = "search_url";
  @SerializedName(SERIALIZED_NAME_SEARCH_URL)
  private String searchUrl;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private String created;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private String updated;

  public ConnectUser() { 
  }

  public ConnectUser userId(String userId) {
    
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


  public ConnectUser firstName(String firstName) {
    
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


  public ConnectUser lastName(String lastName) {
    
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


  public ConnectUser email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public ConnectUser thumbnail(String thumbnail) {
    
    this.thumbnail = thumbnail;
    return this;
  }

   /**
   * Get thumbnail
   * @return thumbnail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getThumbnail() {
    return thumbnail;
  }


  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }


  public ConnectUser thumbnailId(String thumbnailId) {
    
    this.thumbnailId = thumbnailId;
    return this;
  }

   /**
   * Get thumbnailId
   * @return thumbnailId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getThumbnailId() {
    return thumbnailId;
  }


  public void setThumbnailId(String thumbnailId) {
    this.thumbnailId = thumbnailId;
  }


  public ConnectUser phone(List<PhoneItem> phone) {
    
    this.phone = phone;
    return this;
  }

  public ConnectUser addPhoneItem(PhoneItem phoneItem) {
    if (this.phone == null) {
      this.phone = new ArrayList<>();
    }
    this.phone.add(phoneItem);
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PhoneItem> getPhone() {
    return phone;
  }


  public void setPhone(List<PhoneItem> phone) {
    this.phone = phone;
  }


  public ConnectUser liLink(String liLink) {
    
    this.liLink = liLink;
    return this;
  }

   /**
   * Get liLink
   * @return liLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLiLink() {
    return liLink;
  }


  public void setLiLink(String liLink) {
    this.liLink = liLink;
  }


  public ConnectUser liUserId(String liUserId) {
    
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


  public ConnectUser position(String position) {
    
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPosition() {
    return position;
  }


  public void setPosition(String position) {
    this.position = position;
  }


  public ConnectUser location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public ConnectUser country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public ConnectUser website(String website) {
    
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWebsite() {
    return website;
  }


  public void setWebsite(String website) {
    this.website = website;
  }


  public ConnectUser searchUrl(String searchUrl) {
    
    this.searchUrl = searchUrl;
    return this;
  }

   /**
   * Get searchUrl
   * @return searchUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSearchUrl() {
    return searchUrl;
  }


  public void setSearchUrl(String searchUrl) {
    this.searchUrl = searchUrl;
  }


  public ConnectUser created(String created) {
    
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


  public ConnectUser updated(String updated) {
    
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    ConnectUser connectUser = (ConnectUser) o;
    return Objects.equals(this.userId, connectUser.userId) &&
        Objects.equals(this.firstName, connectUser.firstName) &&
        Objects.equals(this.lastName, connectUser.lastName) &&
        Objects.equals(this.email, connectUser.email) &&
        Objects.equals(this.thumbnail, connectUser.thumbnail) &&
        Objects.equals(this.thumbnailId, connectUser.thumbnailId) &&
        Objects.equals(this.phone, connectUser.phone) &&
        Objects.equals(this.liLink, connectUser.liLink) &&
        Objects.equals(this.liUserId, connectUser.liUserId) &&
        Objects.equals(this.position, connectUser.position) &&
        Objects.equals(this.location, connectUser.location) &&
        Objects.equals(this.country, connectUser.country) &&
        Objects.equals(this.website, connectUser.website) &&
        Objects.equals(this.searchUrl, connectUser.searchUrl) &&
        Objects.equals(this.created, connectUser.created) &&
        Objects.equals(this.updated, connectUser.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, firstName, lastName, email, thumbnail, thumbnailId, phone, liLink, liUserId, position, location, country, website, searchUrl, created, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectUser {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    thumbnailId: ").append(toIndentedString(thumbnailId)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    liLink: ").append(toIndentedString(liLink)).append("\n");
    sb.append("    liUserId: ").append(toIndentedString(liUserId)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    searchUrl: ").append(toIndentedString(searchUrl)).append("\n");
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
    openapiFields.add("user_id");
    openapiFields.add("first_name");
    openapiFields.add("last_name");
    openapiFields.add("email");
    openapiFields.add("thumbnail");
    openapiFields.add("thumbnail_id");
    openapiFields.add("phone");
    openapiFields.add("li_link");
    openapiFields.add("li_user_id");
    openapiFields.add("position");
    openapiFields.add("location");
    openapiFields.add("country");
    openapiFields.add("website");
    openapiFields.add("search_url");
    openapiFields.add("created");
    openapiFields.add("updated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConnectUser
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ConnectUser.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConnectUser is not found in the empty JSON string", ConnectUser.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConnectUser.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConnectUser` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (jsonObj.get("thumbnail") != null && !jsonObj.get("thumbnail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `thumbnail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thumbnail").toString()));
      }
      if (jsonObj.get("thumbnail_id") != null && !jsonObj.get("thumbnail_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `thumbnail_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thumbnail_id").toString()));
      }
      JsonArray jsonArrayphone = jsonObj.getAsJsonArray("phone");
      if (jsonArrayphone != null) {
        // ensure the json data is an array
        if (!jsonObj.get("phone").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `phone` to be an array in the JSON string but got `%s`", jsonObj.get("phone").toString()));
        }

        // validate the optional field `phone` (array)
        for (int i = 0; i < jsonArrayphone.size(); i++) {
          PhoneItem.validateJsonObject(jsonArrayphone.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("li_link") != null && !jsonObj.get("li_link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `li_link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("li_link").toString()));
      }
      if (jsonObj.get("li_user_id") != null && !jsonObj.get("li_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `li_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("li_user_id").toString()));
      }
      if (jsonObj.get("position") != null && !jsonObj.get("position").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `position` to be a primitive type in the JSON string but got `%s`", jsonObj.get("position").toString()));
      }
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      if (jsonObj.get("country") != null && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if (jsonObj.get("website") != null && !jsonObj.get("website").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `website` to be a primitive type in the JSON string but got `%s`", jsonObj.get("website").toString()));
      }
      if (jsonObj.get("search_url") != null && !jsonObj.get("search_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `search_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("search_url").toString()));
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
       if (!ConnectUser.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConnectUser' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConnectUser> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConnectUser.class));

       return (TypeAdapter<T>) new TypeAdapter<ConnectUser>() {
           @Override
           public void write(JsonWriter out, ConnectUser value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConnectUser read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConnectUser given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConnectUser
  * @throws IOException if the JSON string is invalid with respect to ConnectUser
  */
  public static ConnectUser fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConnectUser.class);
  }

 /**
  * Convert an instance of ConnectUser to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

