/**
  * @author Josephat Ogwayi <jogwayi@gmail.com>* MMT reports API
 * MMT reports API documentation.
 *
 * Do not edit the class manually.
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


import util.mymosttrusted.model.TrackingLinkDetailResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TrackingLinkApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TrackingLinkApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TrackingLinkApi(ApiClient apiClient) {
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
     * Build call for getNetworkTracking
     * @param networkId Network ID for the stats (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param trackingLinkName Get tracking links with name matching tracking_link_name (optional)
     * @param fromDate Get tracking links created from this date onwards (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A List of tracking links </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getNetworkTrackingCall(Integer networkId, Integer page, Integer limit, String trackingLinkName, String fromDate, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/network/{network_id}/tracking_links"
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

        if (trackingLinkName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tracking_link_name", trackingLinkName));
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
    private okhttp3.Call getNetworkTrackingValidateBeforeCall(Integer networkId, Integer page, Integer limit, String trackingLinkName, String fromDate, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'networkId' is set
        if (networkId == null) {
            throw new ApiException("Missing the required parameter 'networkId' when calling getNetworkTracking(Async)");
        }
        

        okhttp3.Call localVarCall = getNetworkTrackingCall(networkId, page, limit, trackingLinkName, fromDate, _callback);
        return localVarCall;

    }

    /**
     * Get detailed tracking link list logged for the network with id {id}
     * Returns a list of tracking link logged for the network with id {id}
     * @param networkId Network ID for the stats (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param trackingLinkName Get tracking links with name matching tracking_link_name (optional)
     * @param fromDate Get tracking links created from this date onwards (optional)
     * @return TrackingLinkDetailResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A List of tracking links </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public TrackingLinkDetailResult getNetworkTracking(Integer networkId, Integer page, Integer limit, String trackingLinkName, String fromDate) throws ApiException {
        ApiResponse<TrackingLinkDetailResult> localVarResp = getNetworkTrackingWithHttpInfo(networkId, page, limit, trackingLinkName, fromDate);
        return localVarResp.getData();
    }

    /**
     * Get detailed tracking link list logged for the network with id {id}
     * Returns a list of tracking link logged for the network with id {id}
     * @param networkId Network ID for the stats (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param trackingLinkName Get tracking links with name matching tracking_link_name (optional)
     * @param fromDate Get tracking links created from this date onwards (optional)
     * @return ApiResponse&lt;TrackingLinkDetailResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A List of tracking links </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TrackingLinkDetailResult> getNetworkTrackingWithHttpInfo(Integer networkId, Integer page, Integer limit, String trackingLinkName, String fromDate) throws ApiException {
        okhttp3.Call localVarCall = getNetworkTrackingValidateBeforeCall(networkId, page, limit, trackingLinkName, fromDate, null);
        Type localVarReturnType = new TypeToken<TrackingLinkDetailResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get detailed tracking link list logged for the network with id {id} (asynchronously)
     * Returns a list of tracking link logged for the network with id {id}
     * @param networkId Network ID for the stats (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param trackingLinkName Get tracking links with name matching tracking_link_name (optional)
     * @param fromDate Get tracking links created from this date onwards (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A List of tracking links </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getNetworkTrackingAsync(Integer networkId, Integer page, Integer limit, String trackingLinkName, String fromDate, final ApiCallback<TrackingLinkDetailResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = getNetworkTrackingValidateBeforeCall(networkId, page, limit, trackingLinkName, fromDate, _callback);
        Type localVarReturnType = new TypeToken<TrackingLinkDetailResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getTracking
     * @param networkId Network ID for the stats (required)
     * @param userId LinkedIn identifier for the user in case of a specific user stats (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param trackingLinkName Get tracking links with name matching tracking_link_name (optional)
     * @param fromDate Get tracking links created from this date onwards (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A List of tracking links </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTrackingCall(Integer networkId, String userId, Integer page, Integer limit, String trackingLinkName, String fromDate, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/network/{network_id}/tracking_links/{user_id}"
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

        if (trackingLinkName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tracking_link_name", trackingLinkName));
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
    private okhttp3.Call getTrackingValidateBeforeCall(Integer networkId, String userId, Integer page, Integer limit, String trackingLinkName, String fromDate, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'networkId' is set
        if (networkId == null) {
            throw new ApiException("Missing the required parameter 'networkId' when calling getTracking(Async)");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getTracking(Async)");
        }
        

        okhttp3.Call localVarCall = getTrackingCall(networkId, userId, page, limit, trackingLinkName, fromDate, _callback);
        return localVarCall;

    }

    /**
     * Get detailed tracking link list logged for the network with id {id} by user with linkedin id li_user_id
     * Returns a list of tracking link logged for the network with id {id} by user with linkedin id li_user_id
     * @param networkId Network ID for the stats (required)
     * @param userId LinkedIn identifier for the user in case of a specific user stats (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param trackingLinkName Get tracking links with name matching tracking_link_name (optional)
     * @param fromDate Get tracking links created from this date onwards (optional)
     * @return TrackingLinkDetailResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A List of tracking links </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public TrackingLinkDetailResult getTracking(Integer networkId, String userId, Integer page, Integer limit, String trackingLinkName, String fromDate) throws ApiException {
        ApiResponse<TrackingLinkDetailResult> localVarResp = getTrackingWithHttpInfo(networkId, userId, page, limit, trackingLinkName, fromDate);
        return localVarResp.getData();
    }

    /**
     * Get detailed tracking link list logged for the network with id {id} by user with linkedin id li_user_id
     * Returns a list of tracking link logged for the network with id {id} by user with linkedin id li_user_id
     * @param networkId Network ID for the stats (required)
     * @param userId LinkedIn identifier for the user in case of a specific user stats (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param trackingLinkName Get tracking links with name matching tracking_link_name (optional)
     * @param fromDate Get tracking links created from this date onwards (optional)
     * @return ApiResponse&lt;TrackingLinkDetailResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A List of tracking links </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TrackingLinkDetailResult> getTrackingWithHttpInfo(Integer networkId, String userId, Integer page, Integer limit, String trackingLinkName, String fromDate) throws ApiException {
        okhttp3.Call localVarCall = getTrackingValidateBeforeCall(networkId, userId, page, limit, trackingLinkName, fromDate, null);
        Type localVarReturnType = new TypeToken<TrackingLinkDetailResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get detailed tracking link list logged for the network with id {id} by user with linkedin id li_user_id (asynchronously)
     * Returns a list of tracking link logged for the network with id {id} by user with linkedin id li_user_id
     * @param networkId Network ID for the stats (required)
     * @param userId LinkedIn identifier for the user in case of a specific user stats (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param trackingLinkName Get tracking links with name matching tracking_link_name (optional)
     * @param fromDate Get tracking links created from this date onwards (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A List of tracking links </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTrackingAsync(Integer networkId, String userId, Integer page, Integer limit, String trackingLinkName, String fromDate, final ApiCallback<TrackingLinkDetailResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTrackingValidateBeforeCall(networkId, userId, page, limit, trackingLinkName, fromDate, _callback);
        Type localVarReturnType = new TypeToken<TrackingLinkDetailResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
