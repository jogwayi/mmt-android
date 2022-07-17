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

import util.mymosttrusted.model.UserResult;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class UsersApi {
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
  * Get a list of available users
  * Returns a list of users in the network
   * @param networkId Network ID for the stats
   * @param page Page to fetch
   * @param limit Number of records to return per page, maximum allowed number is 50
   * @param firstName Search for users by first name
   * @param lastName Search for users by last name
   * @param position Search for users by position
   * @param email Search for users by email
   * @param phoneNumber Search for users by phone_number
   * @param country Search for users by country
   * @param activationId Search for users by activation reference
   * @return UserResult
  */
  public UserResult getUsers (Integer networkId, Integer page, Integer limit, String firstName, String lastName, String position, String email, String phoneNumber, String country, String activationId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'networkId' is set
    if (networkId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'networkId' when calling getUsers",
        new ApiException(400, "Missing the required parameter 'networkId' when calling getUsers"));
    }

    // create path and map variables
    String path = "/network/{network_id}/users".replaceAll("\\{" + "network_id" + "\\}", apiInvoker.escapeString(networkId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "first_name", firstName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "last_name", lastName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "position", position));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "email", email));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "phone_number", phoneNumber));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "country", country));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "activation_id", activationId));
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
         return (UserResult) ApiInvoker.deserialize(localVarResponse, "", UserResult.class);
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
   * Get a list of available users
   * Returns a list of users in the network
   * @param networkId Network ID for the stats   * @param page Page to fetch   * @param limit Number of records to return per page, maximum allowed number is 50   * @param firstName Search for users by first name   * @param lastName Search for users by last name   * @param position Search for users by position   * @param email Search for users by email   * @param phoneNumber Search for users by phone_number   * @param country Search for users by country   * @param activationId Search for users by activation reference
  */
  public void getUsers (Integer networkId, Integer page, Integer limit, String firstName, String lastName, String position, String email, String phoneNumber, String country, String activationId, final Response.Listener<UserResult> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'networkId' is set
    if (networkId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'networkId' when calling getUsers",
        new ApiException(400, "Missing the required parameter 'networkId' when calling getUsers"));
    }

    // create path and map variables
    String path = "/network/{network_id}/users".replaceAll("\\{format\\}","json").replaceAll("\\{" + "network_id" + "\\}", apiInvoker.escapeString(networkId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "first_name", firstName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "last_name", lastName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "position", position));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "email", email));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "phone_number", phoneNumber));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "country", country));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "activation_id", activationId));


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
              responseListener.onResponse((UserResult) ApiInvoker.deserialize(localVarResponse,  "", UserResult.class));
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
