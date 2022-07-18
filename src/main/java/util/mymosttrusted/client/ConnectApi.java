/**
  * @author Josephat Ogwayi <jogwayi@gmail.com>* MMT reports API
 * MMT reports API documentation.
 *
 * Do not edit the class manually.
 */


package util.mymosttrusted.client;

import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import util.mymosttrusted.api.ApiCallback;
import util.mymosttrusted.api.ApiClient;
import util.mymosttrusted.api.ApiException;
import util.mymosttrusted.api.ApiResponse;
import util.mymosttrusted.api.Configuration;
import util.mymosttrusted.api.Pair;
import util.mymosttrusted.model.ConnectUserResult;

public class ConnectApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ConnectApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ConnectApi(ApiClient apiClient) {
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
     * Build call for getConnectInvites
     * @param networkId Network ID for the stats (required)
     * @param userId LinkedIn identifier for the user in case of a specific user stats (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param liUserId Get to connect contacts specific to an invite li_user_id (optional)
     * @param firstName Find to connect contacts with first names alike to this first name (optional)
     * @param lastName Find to connect contacts with last names alike to this last name (optional)
     * @param location Find to connect contacts in location alike to this location (optional)
     * @param fromDate Get to connect contacts created from this date onwards (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A List of to connect contacts by user with id li_user_id in this network </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getConnectInvitesCall(Integer networkId, String userId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String location, String fromDate, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/network/{network_id}/connects/{user_id}"
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

        if (location != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("location", location));
        }

        if (fromDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("from_date", fromDate));
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
    private okhttp3.Call getConnectInvitesValidateBeforeCall(Integer networkId, String userId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String location, String fromDate, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'networkId' is set
        if (networkId == null) {
            throw new ApiException("Missing the required parameter 'networkId' when calling getConnectInvites(Async)");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getConnectInvites(Async)");
        }
        

        okhttp3.Call localVarCall = getConnectInvitesCall(networkId, userId, page, limit, liUserId, firstName, lastName, location, fromDate, _callback);
        return localVarCall;

    }

    /**
     * Get to connect contacts listed by specific user
     * Returns a list of to connect contacts listed by the user with LinkedIn id li_user_id
     * @param networkId Network ID for the stats (required)
     * @param userId LinkedIn identifier for the user in case of a specific user stats (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param liUserId Get to connect contacts specific to an invite li_user_id (optional)
     * @param firstName Find to connect contacts with first names alike to this first name (optional)
     * @param lastName Find to connect contacts with last names alike to this last name (optional)
     * @param location Find to connect contacts in location alike to this location (optional)
     * @param fromDate Get to connect contacts created from this date onwards (optional)
     * @return ConnectUserResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A List of to connect contacts by user with id li_user_id in this network </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public ConnectUserResult getConnectInvites(Integer networkId, String userId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String location, String fromDate) throws ApiException {
        ApiResponse<ConnectUserResult> localVarResp = getConnectInvitesWithHttpInfo(networkId, userId, page, limit, liUserId, firstName, lastName, location, fromDate);
        return localVarResp.getData();
    }

    /**
     * Get to connect contacts listed by specific user
     * Returns a list of to connect contacts listed by the user with LinkedIn id li_user_id
     * @param networkId Network ID for the stats (required)
     * @param userId LinkedIn identifier for the user in case of a specific user stats (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param liUserId Get to connect contacts specific to an invite li_user_id (optional)
     * @param firstName Find to connect contacts with first names alike to this first name (optional)
     * @param lastName Find to connect contacts with last names alike to this last name (optional)
     * @param location Find to connect contacts in location alike to this location (optional)
     * @param fromDate Get to connect contacts created from this date onwards (optional)
     * @return ApiResponse&lt;ConnectUserResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A List of to connect contacts by user with id li_user_id in this network </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ConnectUserResult> getConnectInvitesWithHttpInfo(Integer networkId, String userId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String location, String fromDate) throws ApiException {
        okhttp3.Call localVarCall = getConnectInvitesValidateBeforeCall(networkId, userId, page, limit, liUserId, firstName, lastName, location, fromDate, null);
        Type localVarReturnType = new TypeToken<ConnectUserResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get to connect contacts listed by specific user (asynchronously)
     * Returns a list of to connect contacts listed by the user with LinkedIn id li_user_id
     * @param networkId Network ID for the stats (required)
     * @param userId LinkedIn identifier for the user in case of a specific user stats (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param liUserId Get to connect contacts specific to an invite li_user_id (optional)
     * @param firstName Find to connect contacts with first names alike to this first name (optional)
     * @param lastName Find to connect contacts with last names alike to this last name (optional)
     * @param location Find to connect contacts in location alike to this location (optional)
     * @param fromDate Get to connect contacts created from this date onwards (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A List of to connect contacts by user with id li_user_id in this network </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getConnectInvitesAsync(Integer networkId, String userId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String location, String fromDate, final ApiCallback<ConnectUserResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = getConnectInvitesValidateBeforeCall(networkId, userId, page, limit, liUserId, firstName, lastName, location, fromDate, _callback);
        Type localVarReturnType = new TypeToken<ConnectUserResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getConnectSummary
     * @param networkId Network ID for the stats (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param liUserId Get invite specific to li_user_id (optional)
     * @param firstName Find to connect contacts with first names alike to this first name (optional)
     * @param lastName Find to connect contacts with last names alike to this last name (optional)
     * @param location Find to connect contacts in location alike to this location (optional)
     * @param fromDate Get to connect contacts created from this date onwards (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A List of to connect contacts in this network </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getConnectSummaryCall(Integer networkId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String location, String fromDate, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/network/{network_id}/connects"
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

        if (location != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("location", location));
        }

        if (fromDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("from_date", fromDate));
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
    private okhttp3.Call getConnectSummaryValidateBeforeCall(Integer networkId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String location, String fromDate, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'networkId' is set
        if (networkId == null) {
            throw new ApiException("Missing the required parameter 'networkId' when calling getConnectSummary(Async)");
        }
        

        okhttp3.Call localVarCall = getConnectSummaryCall(networkId, page, limit, liUserId, firstName, lastName, location, fromDate, _callback);
        return localVarCall;

    }

    /**
     * Get summarised to connect contacts listed in network
     * Returns a list of to connect contacts listed in network
     * @param networkId Network ID for the stats (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param liUserId Get invite specific to li_user_id (optional)
     * @param firstName Find to connect contacts with first names alike to this first name (optional)
     * @param lastName Find to connect contacts with last names alike to this last name (optional)
     * @param location Find to connect contacts in location alike to this location (optional)
     * @param fromDate Get to connect contacts created from this date onwards (optional)
     * @return ConnectUserResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A List of to connect contacts in this network </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public ConnectUserResult getConnectSummary(Integer networkId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String location, String fromDate) throws ApiException {
        ApiResponse<ConnectUserResult> localVarResp = getConnectSummaryWithHttpInfo(networkId, page, limit, liUserId, firstName, lastName, location, fromDate);
        return localVarResp.getData();
    }

    /**
     * Get summarised to connect contacts listed in network
     * Returns a list of to connect contacts listed in network
     * @param networkId Network ID for the stats (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param liUserId Get invite specific to li_user_id (optional)
     * @param firstName Find to connect contacts with first names alike to this first name (optional)
     * @param lastName Find to connect contacts with last names alike to this last name (optional)
     * @param location Find to connect contacts in location alike to this location (optional)
     * @param fromDate Get to connect contacts created from this date onwards (optional)
     * @return ApiResponse&lt;ConnectUserResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A List of to connect contacts in this network </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ConnectUserResult> getConnectSummaryWithHttpInfo(Integer networkId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String location, String fromDate) throws ApiException {
        okhttp3.Call localVarCall = getConnectSummaryValidateBeforeCall(networkId, page, limit, liUserId, firstName, lastName, location, fromDate, null);
        Type localVarReturnType = new TypeToken<ConnectUserResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get summarised to connect contacts listed in network (asynchronously)
     * Returns a list of to connect contacts listed in network
     * @param networkId Network ID for the stats (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param liUserId Get invite specific to li_user_id (optional)
     * @param firstName Find to connect contacts with first names alike to this first name (optional)
     * @param lastName Find to connect contacts with last names alike to this last name (optional)
     * @param location Find to connect contacts in location alike to this location (optional)
     * @param fromDate Get to connect contacts created from this date onwards (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A List of to connect contacts in this network </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getConnectSummaryAsync(Integer networkId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String location, String fromDate, final ApiCallback<ConnectUserResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = getConnectSummaryValidateBeforeCall(networkId, page, limit, liUserId, firstName, lastName, location, fromDate, _callback);
        Type localVarReturnType = new TypeToken<ConnectUserResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
