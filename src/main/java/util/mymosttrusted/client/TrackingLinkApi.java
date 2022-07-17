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

import util.mymosttrusted.model.TrackingLinkDetailResult;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class TrackingLinkApi {
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
  * Get detailed tracking link list logged for the network with id {id}
  * Returns a list of tracking link logged for the network with id {id}
   * @param networkId Network ID for the stats
   * @param page Page to fetch
   * @param limit Number of records to return per page, maximum allowed number is 50
   * @param trackingLinkName Get tracking links with name matching tracking_link_name
   * @param fromDate Get tracking links created from this date onwards
   * @return TrackingLinkDetailResult
  */
  public TrackingLinkDetailResult getNetworkTracking (Integer networkId, Integer page, Integer limit, String trackingLinkName, String fromDate) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'networkId' is set
    if (networkId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'networkId' when calling getNetworkTracking",
        new ApiException(400, "Missing the required parameter 'networkId' when calling getNetworkTracking"));
    }

    // create path and map variables
    String path = "/network/{network_id}/tracking_links".replaceAll("\\{" + "network_id" + "\\}", apiInvoker.escapeString(networkId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tracking_link_name", trackingLinkName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "from_date", fromDate));
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
         return (TrackingLinkDetailResult) ApiInvoker.deserialize(localVarResponse, "", TrackingLinkDetailResult.class);
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
   * Get detailed tracking link list logged for the network with id {id}
   * Returns a list of tracking link logged for the network with id {id}
   * @param networkId Network ID for the stats   * @param page Page to fetch   * @param limit Number of records to return per page, maximum allowed number is 50   * @param trackingLinkName Get tracking links with name matching tracking_link_name   * @param fromDate Get tracking links created from this date onwards
  */
  public void getNetworkTracking (Integer networkId, Integer page, Integer limit, String trackingLinkName, String fromDate, final Response.Listener<TrackingLinkDetailResult> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'networkId' is set
    if (networkId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'networkId' when calling getNetworkTracking",
        new ApiException(400, "Missing the required parameter 'networkId' when calling getNetworkTracking"));
    }

    // create path and map variables
    String path = "/network/{network_id}/tracking_links".replaceAll("\\{format\\}","json").replaceAll("\\{" + "network_id" + "\\}", apiInvoker.escapeString(networkId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tracking_link_name", trackingLinkName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "from_date", fromDate));


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
              responseListener.onResponse((TrackingLinkDetailResult) ApiInvoker.deserialize(localVarResponse,  "", TrackingLinkDetailResult.class));
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
  /**
  * Get detailed tracking link list logged for the network with id {id} by user with linkedin id li_user_id
  * Returns a list of tracking link logged for the network with id {id} by user with linkedin id li_user_id
   * @param networkId Network ID for the stats
   * @param userId LinkedIn identifier for the user in case of a specific user stats
   * @param page Page to fetch
   * @param limit Number of records to return per page, maximum allowed number is 50
   * @param trackingLinkName Get tracking links with name matching tracking_link_name
   * @param fromDate Get tracking links created from this date onwards
   * @return TrackingLinkDetailResult
  */
  public TrackingLinkDetailResult getTracking (Integer networkId, String userId, Integer page, Integer limit, String trackingLinkName, String fromDate) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'networkId' is set
    if (networkId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'networkId' when calling getTracking",
        new ApiException(400, "Missing the required parameter 'networkId' when calling getTracking"));
    }
    // verify the required parameter 'userId' is set
    if (userId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userId' when calling getTracking",
        new ApiException(400, "Missing the required parameter 'userId' when calling getTracking"));
    }

    // create path and map variables
    String path = "/network/{network_id}/tracking_links/{user_id}".replaceAll("\\{" + "network_id" + "\\}", apiInvoker.escapeString(networkId.toString())).replaceAll("\\{" + "user_id" + "\\}", apiInvoker.escapeString(userId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tracking_link_name", trackingLinkName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "from_date", fromDate));
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
         return (TrackingLinkDetailResult) ApiInvoker.deserialize(localVarResponse, "", TrackingLinkDetailResult.class);
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
   * Get detailed tracking link list logged for the network with id {id} by user with linkedin id li_user_id
   * Returns a list of tracking link logged for the network with id {id} by user with linkedin id li_user_id
   * @param networkId Network ID for the stats   * @param userId LinkedIn identifier for the user in case of a specific user stats   * @param page Page to fetch   * @param limit Number of records to return per page, maximum allowed number is 50   * @param trackingLinkName Get tracking links with name matching tracking_link_name   * @param fromDate Get tracking links created from this date onwards
  */
  public void getTracking (Integer networkId, String userId, Integer page, Integer limit, String trackingLinkName, String fromDate, final Response.Listener<TrackingLinkDetailResult> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'networkId' is set
    if (networkId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'networkId' when calling getTracking",
        new ApiException(400, "Missing the required parameter 'networkId' when calling getTracking"));
    }
    // verify the required parameter 'userId' is set
    if (userId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userId' when calling getTracking",
        new ApiException(400, "Missing the required parameter 'userId' when calling getTracking"));
    }

    // create path and map variables
    String path = "/network/{network_id}/tracking_links/{user_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "network_id" + "\\}", apiInvoker.escapeString(networkId.toString())).replaceAll("\\{" + "user_id" + "\\}", apiInvoker.escapeString(userId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tracking_link_name", trackingLinkName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "from_date", fromDate));


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
              responseListener.onResponse((TrackingLinkDetailResult) ApiInvoker.deserialize(localVarResponse,  "", TrackingLinkDetailResult.class));
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
