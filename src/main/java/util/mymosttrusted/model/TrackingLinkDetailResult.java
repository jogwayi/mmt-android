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
import util.mymosttrusted.model.TrackingLinkDetail;

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
 * TrackingLinkDetailResult
 */

public class TrackingLinkDetailResult {
  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<List<TrackingLinkDetail>> data = null;

  public TrackingLinkDetailResult() { 
  }

  public TrackingLinkDetailResult total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * Total Number of invites
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Total Number of invites")

  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }


  public TrackingLinkDetailResult page(Integer page) {
    
    this.page = page;
    return this;
  }

   /**
   * Loaded page number
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Loaded page number")

  public Integer getPage() {
    return page;
  }


  public void setPage(Integer page) {
    this.page = page;
  }


  public TrackingLinkDetailResult limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * Items per page
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "50", value = "Items per page")

  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public TrackingLinkDetailResult data(List<List<TrackingLinkDetail>> data) {
    
    this.data = data;
    return this;
  }

  public TrackingLinkDetailResult addDataItem(List<TrackingLinkDetail> dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<List<TrackingLinkDetail>> getData() {
    return data;
  }


  public void setData(List<List<TrackingLinkDetail>> data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackingLinkDetailResult trackingLinkDetailResult = (TrackingLinkDetailResult) o;
    return Objects.equals(this.total, trackingLinkDetailResult.total) &&
        Objects.equals(this.page, trackingLinkDetailResult.page) &&
        Objects.equals(this.limit, trackingLinkDetailResult.limit) &&
        Objects.equals(this.data, trackingLinkDetailResult.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, page, limit, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackingLinkDetailResult {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
    openapiFields.add("total");
    openapiFields.add("page");
    openapiFields.add("limit");
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TrackingLinkDetailResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TrackingLinkDetailResult.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrackingLinkDetailResult is not found in the empty JSON string", TrackingLinkDetailResult.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TrackingLinkDetailResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TrackingLinkDetailResult` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrackingLinkDetailResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrackingLinkDetailResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrackingLinkDetailResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrackingLinkDetailResult.class));

       return (TypeAdapter<T>) new TypeAdapter<TrackingLinkDetailResult>() {
           @Override
           public void write(JsonWriter out, TrackingLinkDetailResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TrackingLinkDetailResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TrackingLinkDetailResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TrackingLinkDetailResult
  * @throws IOException if the JSON string is invalid with respect to TrackingLinkDetailResult
  */
  public static TrackingLinkDetailResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrackingLinkDetailResult.class);
  }

 /**
  * Convert an instance of TrackingLinkDetailResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

