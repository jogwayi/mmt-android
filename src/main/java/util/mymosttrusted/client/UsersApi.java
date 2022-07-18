/*
  MMT reports API
  MMT reports API documentation.
 
  Do not edit the class manually.
 */


package util.mymosttrusted.client;

import util.mymosttrusted.api.ApiCallback;
import util.mymosttrusted.api.ApiClient;
import util.mymosttrusted.api.ApiException;
import util.mymosttrusted.api.ApiResponse;
import util.mymosttrusted.api.Configuration;
import util.mymosttrusted.api.Pair;
import util.mymosttrusted.api.ProgressRequestBody;
import util.mymosttrusted.api.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import util.mymosttrusted.model.UserResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class UsersApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public UsersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UsersApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getUsers
     * @param networkId Network ID for the stats (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param firstName Search for users by first name (optional)
     * @param lastName Search for users by last name (optional)
     * @param position Search for users by position (optional)
     * @param email Search for users by email (optional)
     * @param phoneNumber Search for users by phone_number (optional)
     * @param country Search for users by country (optional)
     * @param activationId Search for users by activation reference (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A List of network users </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getUsersCall(Integer networkId, Integer page, Integer limit, String firstName, String lastName, String position, String email, String phoneNumber, String country, String activationId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/network/{network_id}/users"
            .replaceAll("\\{" + "network_id" + "\\}", localVarApiClient.escapeString(networkId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (firstName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("first_name", firstName));
        }

        if (lastName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("last_name", lastName));
        }

        if (position != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("position", position));
        }

        if (email != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("email", email));
        }

        if (phoneNumber != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("phone_number", phoneNumber));
        }

        if (country != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("country", country));
        }

        if (activationId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("activation_id", activationId));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getUsersValidateBeforeCall(Integer networkId, Integer page, Integer limit, String firstName, String lastName, String position, String email, String phoneNumber, String country, String activationId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'networkId' is set
        if (networkId == null) {
            throw new ApiException("Missing the required parameter 'networkId' when calling getUsers(Async)");
        }
        

        okhttp3.Call localVarCall = getUsersCall(networkId, page, limit, firstName, lastName, position, email, phoneNumber, country, activationId, _callback);
        return localVarCall;

    }

    /**
     * Get a list of available users
     * Returns a list of users in the network
     * @param networkId Network ID for the stats (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param firstName Search for users by first name (optional)
     * @param lastName Search for users by last name (optional)
     * @param position Search for users by position (optional)
     * @param email Search for users by email (optional)
     * @param phoneNumber Search for users by phone_number (optional)
     * @param country Search for users by country (optional)
     * @param activationId Search for users by activation reference (optional)
     * @return UserResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A List of network users </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public UserResult getUsers(Integer networkId, Integer page, Integer limit, String firstName, String lastName, String position, String email, String phoneNumber, String country, String activationId) throws ApiException {
        ApiResponse<UserResult> localVarResp = getUsersWithHttpInfo(networkId, page, limit, firstName, lastName, position, email, phoneNumber, country, activationId);
        return localVarResp.getData();
    }

    /**
     * Get a list of available users
     * Returns a list of users in the network
     * @param networkId Network ID for the stats (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param firstName Search for users by first name (optional)
     * @param lastName Search for users by last name (optional)
     * @param position Search for users by position (optional)
     * @param email Search for users by email (optional)
     * @param phoneNumber Search for users by phone_number (optional)
     * @param country Search for users by country (optional)
     * @param activationId Search for users by activation reference (optional)
     * @return ApiResponse&lt;UserResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A List of network users </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UserResult> getUsersWithHttpInfo(Integer networkId, Integer page, Integer limit, String firstName, String lastName, String position, String email, String phoneNumber, String country, String activationId) throws ApiException {
        okhttp3.Call localVarCall = getUsersValidateBeforeCall(networkId, page, limit, firstName, lastName, position, email, phoneNumber, country, activationId, null);
        Type localVarReturnType = new TypeToken<UserResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a list of available users (asynchronously)
     * Returns a list of users in the network
     * @param networkId Network ID for the stats (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param firstName Search for users by first name (optional)
     * @param lastName Search for users by last name (optional)
     * @param position Search for users by position (optional)
     * @param email Search for users by email (optional)
     * @param phoneNumber Search for users by phone_number (optional)
     * @param country Search for users by country (optional)
     * @param activationId Search for users by activation reference (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A List of network users </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getUsersAsync(Integer networkId, Integer page, Integer limit, String firstName, String lastName, String position, String email, String phoneNumber, String country, String activationId, final ApiCallback<UserResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = getUsersValidateBeforeCall(networkId, page, limit, firstName, lastName, position, email, phoneNumber, country, activationId, _callback);
        Type localVarReturnType = new TypeToken<UserResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
