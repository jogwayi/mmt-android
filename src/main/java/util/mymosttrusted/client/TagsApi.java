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

import util.mymosttrusted.model.TagResult;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class TagsApi {
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
  * Get detailed tags list logged for the network with id {id}
  * Returns a list of tags logged for the network with id {id}
   * @param networkId Network ID for the stats
   * @param page Page to fetch
   * @param limit Number of records to return per page, maximum allowed number is 50
   * @param liUserId Get tags specific to an invite li_user_id
   * @param firstName Get tags specific to an invite first name
   * @param lastName Get tags specific to an invite last name
   * @param tagName Get tags specific to this tag name
   * @param fromDate Get to tags created from this date onwards
   * @return TagResult
  */
  public TagResult getNetworkTag (Integer networkId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String tagName, String fromDate) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'networkId' is set
    if (networkId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'networkId' when calling getNetworkTag",
        new ApiException(400, "Missing the required parameter 'networkId' when calling getNetworkTag"));
    }

    // create path and map variables
    String path = "/network/{network_id}/tags".replaceAll("\\{" + "network_id" + "\\}", apiInvoker.escapeString(networkId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "li_user_id", liUserId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "first_name", firstName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "last_name", lastName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tag_name", tagName));
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
         return (TagResult) ApiInvoker.deserialize(localVarResponse, "", TagResult.class);
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
   * Get detailed tags list logged for the network with id {id}
   * Returns a list of tags logged for the network with id {id}
   * @param networkId Network ID for the stats   * @param page Page to fetch   * @param limit Number of records to return per page, maximum allowed number is 50   * @param liUserId Get tags specific to an invite li_user_id   * @param firstName Get tags specific to an invite first name   * @param lastName Get tags specific to an invite last name   * @param tagName Get tags specific to this tag name   * @param fromDate Get to tags created from this date onwards
  */
  public void getNetworkTag (Integer networkId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String tagName, String fromDate, final Response.Listener<TagResult> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'networkId' is set
    if (networkId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'networkId' when calling getNetworkTag",
        new ApiException(400, "Missing the required parameter 'networkId' when calling getNetworkTag"));
    }

    // create path and map variables
    String path = "/network/{network_id}/tags".replaceAll("\\{format\\}","json").replaceAll("\\{" + "network_id" + "\\}", apiInvoker.escapeString(networkId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "li_user_id", liUserId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "first_name", firstName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "last_name", lastName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tag_name", tagName));
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
              responseListener.onResponse((TagResult) ApiInvoker.deserialize(localVarResponse,  "", TagResult.class));
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
  * Get detailed tags list logged for the by user with linkedin id li_user_id
  * Returns a list of tags logged for the by user with linkedin id li_user_id
   * @param networkId Network ID for the stats
   * @param userId LinkedIn identifier for the user in case of a specific user stats
   * @param page Page to fetch
   * @param limit Number of records to return per page, maximum allowed number is 50
   * @param liUserId Get tags specific to an invite li_user_id
   * @param firstName Get tags specific to an invite first name
   * @param lastName Get tags specific to an invite last name
   * @param tagName Get tags specific to an invite name
   * @param fromDate Get to tags created from this date onwards
   * @return TagResult
  */
  public TagResult getTags (Integer networkId, String userId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String tagName, String fromDate) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'networkId' is set
    if (networkId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'networkId' when calling getTags",
        new ApiException(400, "Missing the required parameter 'networkId' when calling getTags"));
    }
    // verify the required parameter 'userId' is set
    if (userId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userId' when calling getTags",
        new ApiException(400, "Missing the required parameter 'userId' when calling getTags"));
    }

    // create path and map variables
    String path = "/network/{network_id}/tags/{user_id}".replaceAll("\\{" + "network_id" + "\\}", apiInvoker.escapeString(networkId.toString())).replaceAll("\\{" + "user_id" + "\\}", apiInvoker.escapeString(userId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "li_user_id", liUserId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "first_name", firstName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "last_name", lastName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tag_name", tagName));
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
         return (TagResult) ApiInvoker.deserialize(localVarResponse, "", TagResult.class);
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
   * Get detailed tags list logged for the by user with linkedin id li_user_id
   * Returns a list of tags logged for the by user with linkedin id li_user_id
   * @param networkId Network ID for the stats   * @param userId LinkedIn identifier for the user in case of a specific user stats   * @param page Page to fetch   * @param limit Number of records to return per page, maximum allowed number is 50   * @param liUserId Get tags specific to an invite li_user_id   * @param firstName Get tags specific to an invite first name   * @param lastName Get tags specific to an invite last name   * @param tagName Get tags specific to an invite name   * @param fromDate Get to tags created from this date onwards
  */
  public void getTags (Integer networkId, String userId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String tagName, String fromDate, final Response.Listener<TagResult> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'networkId' is set
    if (networkId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'networkId' when calling getTags",
        new ApiException(400, "Missing the required parameter 'networkId' when calling getTags"));
    }
    // verify the required parameter 'userId' is set
    if (userId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userId' when calling getTags",
        new ApiException(400, "Missing the required parameter 'userId' when calling getTags"));
    }

    // create path and map variables
    String path = "/network/{network_id}/tags/{user_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "network_id" + "\\}", apiInvoker.escapeString(networkId.toString())).replaceAll("\\{" + "user_id" + "\\}", apiInvoker.escapeString(userId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "li_user_id", liUserId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "first_name", firstName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "last_name", lastName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tag_name", tagName));
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
              responseListener.onResponse((TagResult) ApiInvoker.deserialize(localVarResponse,  "", TagResult.class));
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
