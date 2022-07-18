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
 * TrackingLinkSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-18T09:33:18.403887+03:00[Africa/Nairobi]")
public class TrackingLinkSummary {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link;

  public static final String SERIALIZED_NAME_TRACKING_LINK_NAME = "tracking_link_name";
  @SerializedName(SERIALIZED_NAME_TRACKING_LINK_NAME)
  private List<String> trackingLinkName = null;

  public static final String SERIALIZED_NAME_CLICKED = "clicked";
  @SerializedName(SERIALIZED_NAME_CLICKED)
  private Integer clicked;

  public static final String SERIALIZED_NAME_UNCLICKED = "unclicked";
  @SerializedName(SERIALIZED_NAME_UNCLICKED)
  private Integer unclicked;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public TrackingLinkSummary() { 
  }

  public TrackingLinkSummary id(Integer id) {
    
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


  public TrackingLinkSummary link(String link) {
    
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


  public TrackingLinkSummary trackingLinkName(List<String> trackingLinkName) {
    
    this.trackingLinkName = trackingLinkName;
    return this;
  }

  public TrackingLinkSummary addTrackingLinkNameItem(String trackingLinkNameItem) {
    if (this.trackingLinkName == null) {
      this.trackingLinkName = new ArrayList<>();
    }
    this.trackingLinkName.add(trackingLinkNameItem);
    return this;
  }

   /**
   * Get trackingLinkName
   * @return trackingLinkName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTrackingLinkName() {
    return trackingLinkName;
  }


  public void setTrackingLinkName(List<String> trackingLinkName) {
    this.trackingLinkName = trackingLinkName;
  }


  public TrackingLinkSummary clicked(Integer clicked) {
    
    this.clicked = clicked;
    return this;
  }

   /**
   * Get clicked
   * @return clicked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getClicked() {
    return clicked;
  }


  public void setClicked(Integer clicked) {
    this.clicked = clicked;
  }


  public TrackingLinkSummary unclicked(Integer unclicked) {
    
    this.unclicked = unclicked;
    return this;
  }

   /**
   * Get unclicked
   * @return unclicked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getUnclicked() {
    return unclicked;
  }


  public void setUnclicked(Integer unclicked) {
    this.unclicked = unclicked;
  }


  public TrackingLinkSummary total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackingLinkSummary trackingLinkSummary = (TrackingLinkSummary) o;
    return Objects.equals(this.id, trackingLinkSummary.id) &&
        Objects.equals(this.link, trackingLinkSummary.link) &&
        Objects.equals(this.trackingLinkName, trackingLinkSummary.trackingLinkName) &&
        Objects.equals(this.clicked, trackingLinkSummary.clicked) &&
        Objects.equals(this.unclicked, trackingLinkSummary.unclicked) &&
        Objects.equals(this.total, trackingLinkSummary.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, link, trackingLinkName, clicked, unclicked, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackingLinkSummary {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    trackingLinkName: ").append(toIndentedString(trackingLinkName)).append("\n");
    sb.append("    clicked: ").append(toIndentedString(clicked)).append("\n");
    sb.append("    unclicked: ").append(toIndentedString(unclicked)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
    openapiFields.add("clicked");
    openapiFields.add("unclicked");
    openapiFields.add("total");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TrackingLinkSummary
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TrackingLinkSummary.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrackingLinkSummary is not found in the empty JSON string", TrackingLinkSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TrackingLinkSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TrackingLinkSummary` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("link") != null && !jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("tracking_link_name") != null && !jsonObj.get("tracking_link_name").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tracking_link_name` to be an array in the JSON string but got `%s`", jsonObj.get("tracking_link_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrackingLinkSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrackingLinkSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrackingLinkSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrackingLinkSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<TrackingLinkSummary>() {
           @Override
           public void write(JsonWriter out, TrackingLinkSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TrackingLinkSummary read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TrackingLinkSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TrackingLinkSummary
  * @throws IOException if the JSON string is invalid with respect to TrackingLinkSummary
  */
  public static TrackingLinkSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrackingLinkSummary.class);
  }

 /**
  * Convert an instance of TrackingLinkSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

