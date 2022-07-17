/**
 * MMT reports API
 * MMT reports API documentation.
 *
 * Do not edit the class manually.
 */

package util.mymosttrusted.client;

import util.mymosttrusted.api.ApiInvoker;
import util.mymosttrusted.api.ApiException;
import util.mymosttrusted.api.Pair;

import util.mymosttrusted.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ThumbnailApi {
  String basePath = "https://api.mymosttrusted.net/v1";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Get photo for the user_id specified by thumb_id
  * Returns a photo for the user_id specified by thumb_id
   * @param networkId Network ID for the stats
   * @param thumbnailId LinkedIn identifier related to the thumbnail
   * @return String
  */
  public String getThumbnail (Integer networkId, String thumbnailId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'networkId' is set
    if (networkId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'networkId' when calling getThumbnail",
        new ApiException(400, "Missing the required parameter 'networkId' when calling getThumbnail"));
    }
    // verify the required parameter 'thumbnailId' is set
    if (thumbnailId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'thumbnailId' when calling getThumbnail",
        new ApiException(400, "Missing the required parameter 'thumbnailId' when calling getThumbnail"));
    }

    // create path and map variables
    String path = "/network/{network_id}/thumbnail/{thumbnail_id}".replaceAll("\\{" + "network_id" + "\\}", apiInvoker.escapeString(networkId.toString())).replaceAll("\\{" + "thumbnail_id" + "\\}", apiInvoker.escapeString(thumbnailId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "ApiKeyAuth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (String) ApiInvoker.deserialize(localVarResponse, "", String.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Get photo for the user_id specified by thumb_id
   * Returns a photo for the user_id specified by thumb_id
   * @param networkId Network ID for the stats   * @param thumbnailId LinkedIn identifier related to the thumbnail
  */
  public void getThumbnail (Integer networkId, String thumbnailId, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'networkId' is set
    if (networkId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'networkId' when calling getThumbnail",
        new ApiException(400, "Missing the required parameter 'networkId' when calling getThumbnail"));
    }
    // verify the required parameter 'thumbnailId' is set
    if (thumbnailId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'thumbnailId' when calling getThumbnail",
        new ApiException(400, "Missing the required parameter 'thumbnailId' when calling getThumbnail"));
    }

    // create path and map variables
    String path = "/network/{network_id}/thumbnail/{thumbnail_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "network_id" + "\\}", apiInvoker.escapeString(networkId.toString())).replaceAll("\\{" + "thumbnail_id" + "\\}", apiInvoker.escapeString(thumbnailId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "ApiKeyAuth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((String) ApiInvoker.deserialize(localVarResponse,  "", String.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
