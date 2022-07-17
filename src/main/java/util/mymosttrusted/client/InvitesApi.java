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

import util.mymosttrusted.model.InvitesResult;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class InvitesApi {
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
  * Get summarised invites listed in network
  * Returns a list of invites listed in network
   * @param networkId Network ID for the stats
   * @param page Page to fetch
   * @param limit Number of records to return per page, maximum allowed number is 50
   * @param liUserId Get invite specific to li_user_id
   * @param firstName Get tags specific to an invite first name
   * @param lastName Get tags specific to an invite last name
   * @param tagName Get invites with this tag name
   * @param statusName Get invites specific to this status
   * @param fromDate Get invites created from this date onwards
   * @param fromDateUpdated Get invites created from this date onwards
   * @return InvitesResult
  */
  public InvitesResult getInviteSummary (Integer networkId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String tagName, String statusName, String fromDate, String fromDateUpdated) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'networkId' is set
    if (networkId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'networkId' when calling getInviteSummary",
        new ApiException(400, "Missing the required parameter 'networkId' when calling getInviteSummary"));
    }

    // create path and map variables
    String path = "/network/{network_id}/invites".replaceAll("\\{" + "network_id" + "\\}", apiInvoker.escapeString(networkId.toString()));

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
    queryParams.addAll(ApiInvoker.parameterToPairs("", "status_name", statusName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "from_date", fromDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "from_date_updated", fromDateUpdated));
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
         return (InvitesResult) ApiInvoker.deserialize(localVarResponse, "", InvitesResult.class);
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
   * Get summarised invites listed in network
   * Returns a list of invites listed in network
   * @param networkId Network ID for the stats   * @param page Page to fetch   * @param limit Number of records to return per page, maximum allowed number is 50   * @param liUserId Get invite specific to li_user_id   * @param firstName Get tags specific to an invite first name   * @param lastName Get tags specific to an invite last name   * @param tagName Get invites with this tag name   * @param statusName Get invites specific to this status   * @param fromDate Get invites created from this date onwards   * @param fromDateUpdated Get invites created from this date onwards
  */
  public void getInviteSummary (Integer networkId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String tagName, String statusName, String fromDate, String fromDateUpdated, final Response.Listener<InvitesResult> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'networkId' is set
    if (networkId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'networkId' when calling getInviteSummary",
        new ApiException(400, "Missing the required parameter 'networkId' when calling getInviteSummary"));
    }

    // create path and map variables
    String path = "/network/{network_id}/invites".replaceAll("\\{format\\}","json").replaceAll("\\{" + "network_id" + "\\}", apiInvoker.escapeString(networkId.toString()));

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
    queryParams.addAll(ApiInvoker.parameterToPairs("", "status_name", statusName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "from_date", fromDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "from_date_updated", fromDateUpdated));


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
              responseListener.onResponse((InvitesResult) ApiInvoker.deserialize(localVarResponse,  "", InvitesResult.class));
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
  * Get contacts listed by specific user
  * Returns a list of contacts listed by the user with LinkedIn id li_user_id
   * @param networkId Network ID for the stats
   * @param userId LinkedIn identifier for the user in case of a specific user stats
   * @param page Page to fetch
   * @param limit Number of records to return per page, maximum allowed number is 50
   * @param liUserId Get invites specific to an invite li_user_id
   * @param firstName Get tags specific to an invite first name
   * @param lastName Get tags specific to an invite last name
   * @param tagName Get invites specific to this tag name
   * @param status Get invites specific to this status
   * @param fromDate Get invites created from this date onwards
   * @param fromDateUpdated Get invites created from this date onwards
   * @return InvitesResult
  */
  public InvitesResult getInvites (Integer networkId, String userId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String tagName, String status, String fromDate, String fromDateUpdated) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'networkId' is set
    if (networkId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'networkId' when calling getInvites",
        new ApiException(400, "Missing the required parameter 'networkId' when calling getInvites"));
    }
    // verify the required parameter 'userId' is set
    if (userId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userId' when calling getInvites",
        new ApiException(400, "Missing the required parameter 'userId' when calling getInvites"));
    }

    // create path and map variables
    String path = "/network/{network_id}/invites/{user_id}".replaceAll("\\{" + "network_id" + "\\}", apiInvoker.escapeString(networkId.toString())).replaceAll("\\{" + "user_id" + "\\}", apiInvoker.escapeString(userId.toString()));

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
    queryParams.addAll(ApiInvoker.parameterToPairs("", "status", status));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "from_date", fromDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "from_date_updated", fromDateUpdated));
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
         return (InvitesResult) ApiInvoker.deserialize(localVarResponse, "", InvitesResult.class);
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
   * Get contacts listed by specific user
   * Returns a list of contacts listed by the user with LinkedIn id li_user_id
   * @param networkId Network ID for the stats   * @param userId LinkedIn identifier for the user in case of a specific user stats   * @param page Page to fetch   * @param limit Number of records to return per page, maximum allowed number is 50   * @param liUserId Get invites specific to an invite li_user_id   * @param firstName Get tags specific to an invite first name   * @param lastName Get tags specific to an invite last name   * @param tagName Get invites specific to this tag name   * @param status Get invites specific to this status   * @param fromDate Get invites created from this date onwards   * @param fromDateUpdated Get invites created from this date onwards
  */
  public void getInvites (Integer networkId, String userId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String tagName, String status, String fromDate, String fromDateUpdated, final Response.Listener<InvitesResult> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'networkId' is set
    if (networkId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'networkId' when calling getInvites",
        new ApiException(400, "Missing the required parameter 'networkId' when calling getInvites"));
    }
    // verify the required parameter 'userId' is set
    if (userId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userId' when calling getInvites",
        new ApiException(400, "Missing the required parameter 'userId' when calling getInvites"));
    }

    // create path and map variables
    String path = "/network/{network_id}/invites/{user_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "network_id" + "\\}", apiInvoker.escapeString(networkId.toString())).replaceAll("\\{" + "user_id" + "\\}", apiInvoker.escapeString(userId.toString()));

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
    queryParams.addAll(ApiInvoker.parameterToPairs("", "status", status));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "from_date", fromDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "from_date_updated", fromDateUpdated));


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
              responseListener.onResponse((InvitesResult) ApiInvoker.deserialize(localVarResponse,  "", InvitesResult.class));
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
