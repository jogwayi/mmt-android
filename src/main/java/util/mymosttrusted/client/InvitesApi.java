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


import util.mymosttrusted.model.InvitesResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class InvitesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public InvitesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public InvitesApi(ApiClient apiClient) {
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
     * Build call for getInviteSummary
     * @param networkId Network ID for the stats (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param liUserId Get invite specific to li_user_id (optional)
     * @param firstName Get tags specific to an invite first name (optional)
     * @param lastName Get tags specific to an invite last name (optional)
     * @param tagName Get invites with this tag name (optional)
     * @param statusName Get invites specific to this status (optional)
     * @param fromDate Get invites created from this date onwards (optional)
     * @param fromDateUpdated Get invites created from this date onwards (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A List of invites by user with id li_user_id in this network </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getInviteSummaryCall(Integer networkId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String tagName, String statusName, String fromDate, String fromDateUpdated, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/network/{network_id}/invites"
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

        if (liUserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("li_user_id", liUserId));
        }

        if (firstName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("first_name", firstName));
        }

        if (lastName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("last_name", lastName));
        }

        if (tagName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tag_name", tagName));
        }

        if (statusName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("status_name", statusName));
        }

        if (fromDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("from_date", fromDate));
        }

        if (fromDateUpdated != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("from_date_updated", fromDateUpdated));
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
    private okhttp3.Call getInviteSummaryValidateBeforeCall(Integer networkId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String tagName, String statusName, String fromDate, String fromDateUpdated, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'networkId' is set
        if (networkId == null) {
            throw new ApiException("Missing the required parameter 'networkId' when calling getInviteSummary(Async)");
        }
        

        okhttp3.Call localVarCall = getInviteSummaryCall(networkId, page, limit, liUserId, firstName, lastName, tagName, statusName, fromDate, fromDateUpdated, _callback);
        return localVarCall;

    }

    /**
     * Get summarised invites listed in network
     * Returns a list of invites listed in network
     * @param networkId Network ID for the stats (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param liUserId Get invite specific to li_user_id (optional)
     * @param firstName Get tags specific to an invite first name (optional)
     * @param lastName Get tags specific to an invite last name (optional)
     * @param tagName Get invites with this tag name (optional)
     * @param statusName Get invites specific to this status (optional)
     * @param fromDate Get invites created from this date onwards (optional)
     * @param fromDateUpdated Get invites created from this date onwards (optional)
     * @return InvitesResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A List of invites by user with id li_user_id in this network </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public InvitesResult getInviteSummary(Integer networkId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String tagName, String statusName, String fromDate, String fromDateUpdated) throws ApiException {
        ApiResponse<InvitesResult> localVarResp = getInviteSummaryWithHttpInfo(networkId, page, limit, liUserId, firstName, lastName, tagName, statusName, fromDate, fromDateUpdated);
        return localVarResp.getData();
    }

    /**
     * Get summarised invites listed in network
     * Returns a list of invites listed in network
     * @param networkId Network ID for the stats (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param liUserId Get invite specific to li_user_id (optional)
     * @param firstName Get tags specific to an invite first name (optional)
     * @param lastName Get tags specific to an invite last name (optional)
     * @param tagName Get invites with this tag name (optional)
     * @param statusName Get invites specific to this status (optional)
     * @param fromDate Get invites created from this date onwards (optional)
     * @param fromDateUpdated Get invites created from this date onwards (optional)
     * @return ApiResponse&lt;InvitesResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A List of invites by user with id li_user_id in this network </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InvitesResult> getInviteSummaryWithHttpInfo(Integer networkId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String tagName, String statusName, String fromDate, String fromDateUpdated) throws ApiException {
        okhttp3.Call localVarCall = getInviteSummaryValidateBeforeCall(networkId, page, limit, liUserId, firstName, lastName, tagName, statusName, fromDate, fromDateUpdated, null);
        Type localVarReturnType = new TypeToken<InvitesResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get summarised invites listed in network (asynchronously)
     * Returns a list of invites listed in network
     * @param networkId Network ID for the stats (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param liUserId Get invite specific to li_user_id (optional)
     * @param firstName Get tags specific to an invite first name (optional)
     * @param lastName Get tags specific to an invite last name (optional)
     * @param tagName Get invites with this tag name (optional)
     * @param statusName Get invites specific to this status (optional)
     * @param fromDate Get invites created from this date onwards (optional)
     * @param fromDateUpdated Get invites created from this date onwards (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A List of invites by user with id li_user_id in this network </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getInviteSummaryAsync(Integer networkId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String tagName, String statusName, String fromDate, String fromDateUpdated, final ApiCallback<InvitesResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = getInviteSummaryValidateBeforeCall(networkId, page, limit, liUserId, firstName, lastName, tagName, statusName, fromDate, fromDateUpdated, _callback);
        Type localVarReturnType = new TypeToken<InvitesResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getInvites
     * @param networkId Network ID for the stats (required)
     * @param userId LinkedIn identifier for the user in case of a specific user stats (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param liUserId Get invites specific to an invite li_user_id (optional)
     * @param firstName Get tags specific to an invite first name (optional)
     * @param lastName Get tags specific to an invite last name (optional)
     * @param tagName Get invites specific to this tag name (optional)
     * @param status Get invites specific to this status (optional)
     * @param fromDate Get invites created from this date onwards (optional)
     * @param fromDateUpdated Get invites created from this date onwards (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A List of invites by user with id li_user_id in this network </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getInvitesCall(Integer networkId, String userId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String tagName, String status, String fromDate, String fromDateUpdated, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/network/{network_id}/invites/{user_id}"
            .replaceAll("\\{" + "network_id" + "\\}", localVarApiClient.escapeString(networkId.toString()))
            .replaceAll("\\{" + "user_id" + "\\}", localVarApiClient.escapeString(userId.toString()));

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

        if (liUserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("li_user_id", liUserId));
        }

        if (firstName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("first_name", firstName));
        }

        if (lastName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("last_name", lastName));
        }

        if (tagName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tag_name", tagName));
        }

        if (status != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("status", status));
        }

        if (fromDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("from_date", fromDate));
        }

        if (fromDateUpdated != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("from_date_updated", fromDateUpdated));
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
    private okhttp3.Call getInvitesValidateBeforeCall(Integer networkId, String userId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String tagName, String status, String fromDate, String fromDateUpdated, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'networkId' is set
        if (networkId == null) {
            throw new ApiException("Missing the required parameter 'networkId' when calling getInvites(Async)");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getInvites(Async)");
        }
        

        okhttp3.Call localVarCall = getInvitesCall(networkId, userId, page, limit, liUserId, firstName, lastName, tagName, status, fromDate, fromDateUpdated, _callback);
        return localVarCall;

    }

    /**
     * Get contacts listed by specific user
     * Returns a list of contacts listed by the user with LinkedIn id li_user_id
     * @param networkId Network ID for the stats (required)
     * @param userId LinkedIn identifier for the user in case of a specific user stats (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param liUserId Get invites specific to an invite li_user_id (optional)
     * @param firstName Get tags specific to an invite first name (optional)
     * @param lastName Get tags specific to an invite last name (optional)
     * @param tagName Get invites specific to this tag name (optional)
     * @param status Get invites specific to this status (optional)
     * @param fromDate Get invites created from this date onwards (optional)
     * @param fromDateUpdated Get invites created from this date onwards (optional)
     * @return InvitesResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A List of invites by user with id li_user_id in this network </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public InvitesResult getInvites(Integer networkId, String userId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String tagName, String status, String fromDate, String fromDateUpdated) throws ApiException {
        ApiResponse<InvitesResult> localVarResp = getInvitesWithHttpInfo(networkId, userId, page, limit, liUserId, firstName, lastName, tagName, status, fromDate, fromDateUpdated);
        return localVarResp.getData();
    }

    /**
     * Get contacts listed by specific user
     * Returns a list of contacts listed by the user with LinkedIn id li_user_id
     * @param networkId Network ID for the stats (required)
     * @param userId LinkedIn identifier for the user in case of a specific user stats (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param liUserId Get invites specific to an invite li_user_id (optional)
     * @param firstName Get tags specific to an invite first name (optional)
     * @param lastName Get tags specific to an invite last name (optional)
     * @param tagName Get invites specific to this tag name (optional)
     * @param status Get invites specific to this status (optional)
     * @param fromDate Get invites created from this date onwards (optional)
     * @param fromDateUpdated Get invites created from this date onwards (optional)
     * @return ApiResponse&lt;InvitesResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A List of invites by user with id li_user_id in this network </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InvitesResult> getInvitesWithHttpInfo(Integer networkId, String userId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String tagName, String status, String fromDate, String fromDateUpdated) throws ApiException {
        okhttp3.Call localVarCall = getInvitesValidateBeforeCall(networkId, userId, page, limit, liUserId, firstName, lastName, tagName, status, fromDate, fromDateUpdated, null);
        Type localVarReturnType = new TypeToken<InvitesResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get contacts listed by specific user (asynchronously)
     * Returns a list of contacts listed by the user with LinkedIn id li_user_id
     * @param networkId Network ID for the stats (required)
     * @param userId LinkedIn identifier for the user in case of a specific user stats (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param liUserId Get invites specific to an invite li_user_id (optional)
     * @param firstName Get tags specific to an invite first name (optional)
     * @param lastName Get tags specific to an invite last name (optional)
     * @param tagName Get invites specific to this tag name (optional)
     * @param status Get invites specific to this status (optional)
     * @param fromDate Get invites created from this date onwards (optional)
     * @param fromDateUpdated Get invites created from this date onwards (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A List of invites by user with id li_user_id in this network </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getInvitesAsync(Integer networkId, String userId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String tagName, String status, String fromDate, String fromDateUpdated, final ApiCallback<InvitesResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = getInvitesValidateBeforeCall(networkId, userId, page, limit, liUserId, firstName, lastName, tagName, status, fromDate, fromDateUpdated, _callback);
        Type localVarReturnType = new TypeToken<InvitesResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
