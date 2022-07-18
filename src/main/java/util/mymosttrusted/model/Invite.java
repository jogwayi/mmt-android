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
import util.mymosttrusted.model.PhoneItem;
import util.mymosttrusted.model.TagItem;
import util.mymosttrusted.model.WebhookItem;

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
 * Invite
 */

public class Invite {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private String created;

  public static final String SERIALIZED_NAME_LI_LINK = "li_link";
  @SerializedName(SERIALIZED_NAME_LI_LINK)
  private String liLink;

  public static final String SERIALIZED_NAME_LI_USER_ID = "li_user_id";
  @SerializedName(SERIALIZED_NAME_LI_USER_ID)
  private String liUserId;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private List<PhoneItem> phone = null;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private String position;

  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private String company;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_WEBHOOKS = "webhooks";
  @SerializedName(SERIALIZED_NAME_WEBHOOKS)
  private List<WebhookItem> webhooks = null;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<TagItem> tags = null;

  public static final String SERIALIZED_NAME_STATUS_NAME = "status_name";
  @SerializedName(SERIALIZED_NAME_STATUS_NAME)
  private String statusName;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private String updated;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public Invite() { 
  }

  public Invite id(Integer id) {
    
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


  public Invite created(String created) {
    
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


  public Invite liLink(String liLink) {
    
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


  public Invite liUserId(String liUserId) {
    
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


  public Invite firstName(String firstName) {
    
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


  public Invite lastName(String lastName) {
    
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


  public Invite email(String email) {
    
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


  public Invite phone(List<PhoneItem> phone) {
    
    this.phone = phone;
    return this;
  }

  public Invite addPhoneItem(PhoneItem phoneItem) {
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


  public Invite position(String position) {
    
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


  public Invite company(String company) {
    
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCompany() {
    return company;
  }


  public void setCompany(String company) {
    this.company = company;
  }


  public Invite country(String country) {
    
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


  public Invite webhooks(List<WebhookItem> webhooks) {
    
    this.webhooks = webhooks;
    return this;
  }

  public Invite addWebhooksItem(WebhookItem webhooksItem) {
    if (this.webhooks == null) {
      this.webhooks = new ArrayList<>();
    }
    this.webhooks.add(webhooksItem);
    return this;
  }

   /**
   * Get webhooks
   * @return webhooks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<WebhookItem> getWebhooks() {
    return webhooks;
  }


  public void setWebhooks(List<WebhookItem> webhooks) {
    this.webhooks = webhooks;
  }


  public Invite tags(List<TagItem> tags) {
    
    this.tags = tags;
    return this;
  }

  public Invite addTagsItem(TagItem tagsItem) {
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

  public List<TagItem> getTags() {
    return tags;
  }


  public void setTags(List<TagItem> tags) {
    this.tags = tags;
  }


  public Invite statusName(String statusName) {
    
    this.statusName = statusName;
    return this;
  }

   /**
   * Get statusName
   * @return statusName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatusName() {
    return statusName;
  }


  public void setStatusName(String statusName) {
    this.statusName = statusName;
  }


  public Invite updated(String updated) {
    
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


  public Invite userId(String userId) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invite invite = (Invite) o;
    return Objects.equals(this.id, invite.id) &&
        Objects.equals(this.created, invite.created) &&
        Objects.equals(this.liLink, invite.liLink) &&
        Objects.equals(this.liUserId, invite.liUserId) &&
        Objects.equals(this.firstName, invite.firstName) &&
        Objects.equals(this.lastName, invite.lastName) &&
        Objects.equals(this.email, invite.email) &&
        Objects.equals(this.phone, invite.phone) &&
        Objects.equals(this.position, invite.position) &&
        Objects.equals(this.company, invite.company) &&
        Objects.equals(this.country, invite.country) &&
        Objects.equals(this.webhooks, invite.webhooks) &&
        Objects.equals(this.tags, invite.tags) &&
        Objects.equals(this.statusName, invite.statusName) &&
        Objects.equals(this.updated, invite.updated) &&
        Objects.equals(this.userId, invite.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, liLink, liUserId, firstName, lastName, email, phone, position, company, country, webhooks, tags, statusName, updated, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invite {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    liLink: ").append(toIndentedString(liLink)).append("\n");
    sb.append("    liUserId: ").append(toIndentedString(liUserId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    webhooks: ").append(toIndentedString(webhooks)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    statusName: ").append(toIndentedString(statusName)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("created");
    openapiFields.add("li_link");
    openapiFields.add("li_user_id");
    openapiFields.add("first_name");
    openapiFields.add("last_name");
    openapiFields.add("email");
    openapiFields.add("phone");
    openapiFields.add("position");
    openapiFields.add("company");
    openapiFields.add("country");
    openapiFields.add("webhooks");
    openapiFields.add("tags");
    openapiFields.add("status_name");
    openapiFields.add("updated");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Invite
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Invite.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Invite is not found in the empty JSON string", Invite.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Invite.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Invite` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("created") != null && !jsonObj.get("created").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created").toString()));
      }
      if (jsonObj.get("li_link") != null && !jsonObj.get("li_link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `li_link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("li_link").toString()));
      }
      if (jsonObj.get("li_user_id") != null && !jsonObj.get("li_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `li_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("li_user_id").toString()));
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
      if (jsonObj.get("position") != null && !jsonObj.get("position").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `position` to be a primitive type in the JSON string but got `%s`", jsonObj.get("position").toString()));
      }
      if (jsonObj.get("company") != null && !jsonObj.get("company").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company").toString()));
      }
      if (jsonObj.get("country") != null && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      JsonArray jsonArraywebhooks = jsonObj.getAsJsonArray("webhooks");
      if (jsonArraywebhooks != null) {
        // ensure the json data is an array
        if (!jsonObj.get("webhooks").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `webhooks` to be an array in the JSON string but got `%s`", jsonObj.get("webhooks").toString()));
        }

        // validate the optional field `webhooks` (array)
        for (int i = 0; i < jsonArraywebhooks.size(); i++) {
          WebhookItem.validateJsonObject(jsonArraywebhooks.get(i).getAsJsonObject());
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
          TagItem.validateJsonObject(jsonArraytags.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("status_name") != null && !jsonObj.get("status_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status_name").toString()));
      }
      if (jsonObj.get("updated") != null && !jsonObj.get("updated").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Invite.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Invite' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Invite> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Invite.class));

       return (TypeAdapter<T>) new TypeAdapter<Invite>() {
           @Override
           public void write(JsonWriter out, Invite value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Invite read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Invite given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Invite
  * @throws IOException if the JSON string is invalid with respect to Invite
  */
  public static Invite fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Invite.class);
  }

 /**
  * Convert an instance of Invite to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

