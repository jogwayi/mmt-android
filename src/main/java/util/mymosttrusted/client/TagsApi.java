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


import util.mymosttrusted.model.TagResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class TagsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TagsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TagsApi(ApiClient apiClient) {
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
     * Build call for getNetworkTag
     * @param networkId Network ID for the stats (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param liUserId Get tags specific to an invite li_user_id (optional)
     * @param firstName Get tags specific to an invite first name (optional)
     * @param lastName Get tags specific to an invite last name (optional)
     * @param tagName Get tags specific to this tag name (optional)
     * @param fromDate Get to tags created from this date onwards (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A List of tags </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getNetworkTagCall(Integer networkId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String tagName, String fromDate, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/network/{network_id}/tags"
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
    private okhttp3.Call getNetworkTagValidateBeforeCall(Integer networkId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String tagName, String fromDate, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'networkId' is set
        if (networkId == null) {
            throw new ApiException("Missing the required parameter 'networkId' when calling getNetworkTag(Async)");
        }
        

        okhttp3.Call localVarCall = getNetworkTagCall(networkId, page, limit, liUserId, firstName, lastName, tagName, fromDate, _callback);
        return localVarCall;

    }

    /**
     * Get detailed tags list logged for the network with id {id}
     * Returns a list of tags logged for the network with id {id}
     * @param networkId Network ID for the stats (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param liUserId Get tags specific to an invite li_user_id (optional)
     * @param firstName Get tags specific to an invite first name (optional)
     * @param lastName Get tags specific to an invite last name (optional)
     * @param tagName Get tags specific to this tag name (optional)
     * @param fromDate Get to tags created from this date onwards (optional)
     * @return TagResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A List of tags </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public TagResult getNetworkTag(Integer networkId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String tagName, String fromDate) throws ApiException {
        ApiResponse<TagResult> localVarResp = getNetworkTagWithHttpInfo(networkId, page, limit, liUserId, firstName, lastName, tagName, fromDate);
        return localVarResp.getData();
    }

    /**
     * Get detailed tags list logged for the network with id {id}
     * Returns a list of tags logged for the network with id {id}
     * @param networkId Network ID for the stats (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param liUserId Get tags specific to an invite li_user_id (optional)
     * @param firstName Get tags specific to an invite first name (optional)
     * @param lastName Get tags specific to an invite last name (optional)
     * @param tagName Get tags specific to this tag name (optional)
     * @param fromDate Get to tags created from this date onwards (optional)
     * @return ApiResponse&lt;TagResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A List of tags </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TagResult> getNetworkTagWithHttpInfo(Integer networkId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String tagName, String fromDate) throws ApiException {
        okhttp3.Call localVarCall = getNetworkTagValidateBeforeCall(networkId, page, limit, liUserId, firstName, lastName, tagName, fromDate, null);
        Type localVarReturnType = new TypeToken<TagResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get detailed tags list logged for the network with id {id} (asynchronously)
     * Returns a list of tags logged for the network with id {id}
     * @param networkId Network ID for the stats (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param liUserId Get tags specific to an invite li_user_id (optional)
     * @param firstName Get tags specific to an invite first name (optional)
     * @param lastName Get tags specific to an invite last name (optional)
     * @param tagName Get tags specific to this tag name (optional)
     * @param fromDate Get to tags created from this date onwards (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A List of tags </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getNetworkTagAsync(Integer networkId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String tagName, String fromDate, final ApiCallback<TagResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = getNetworkTagValidateBeforeCall(networkId, page, limit, liUserId, firstName, lastName, tagName, fromDate, _callback);
        Type localVarReturnType = new TypeToken<TagResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getTags
     * @param networkId Network ID for the stats (required)
     * @param userId LinkedIn identifier for the user in case of a specific user stats (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param liUserId Get tags specific to an invite li_user_id (optional)
     * @param firstName Get tags specific to an invite first name (optional)
     * @param lastName Get tags specific to an invite last name (optional)
     * @param tagName Get tags specific to an invite name (optional)
     * @param fromDate Get to tags created from this date onwards (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A List of tags </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTagsCall(Integer networkId, String userId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String tagName, String fromDate, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/network/{network_id}/tags/{user_id}"
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
    private okhttp3.Call getTagsValidateBeforeCall(Integer networkId, String userId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String tagName, String fromDate, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'networkId' is set
        if (networkId == null) {
            throw new ApiException("Missing the required parameter 'networkId' when calling getTags(Async)");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getTags(Async)");
        }
        

        okhttp3.Call localVarCall = getTagsCall(networkId, userId, page, limit, liUserId, firstName, lastName, tagName, fromDate, _callback);
        return localVarCall;

    }

    /**
     * Get detailed tags list logged for the by user with linkedin id li_user_id
     * Returns a list of tags logged for the by user with linkedin id li_user_id
     * @param networkId Network ID for the stats (required)
     * @param userId LinkedIn identifier for the user in case of a specific user stats (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param liUserId Get tags specific to an invite li_user_id (optional)
     * @param firstName Get tags specific to an invite first name (optional)
     * @param lastName Get tags specific to an invite last name (optional)
     * @param tagName Get tags specific to an invite name (optional)
     * @param fromDate Get to tags created from this date onwards (optional)
     * @return TagResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A List of tags </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public TagResult getTags(Integer networkId, String userId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String tagName, String fromDate) throws ApiException {
        ApiResponse<TagResult> localVarResp = getTagsWithHttpInfo(networkId, userId, page, limit, liUserId, firstName, lastName, tagName, fromDate);
        return localVarResp.getData();
    }

    /**
     * Get detailed tags list logged for the by user with linkedin id li_user_id
     * Returns a list of tags logged for the by user with linkedin id li_user_id
     * @param networkId Network ID for the stats (required)
     * @param userId LinkedIn identifier for the user in case of a specific user stats (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param liUserId Get tags specific to an invite li_user_id (optional)
     * @param firstName Get tags specific to an invite first name (optional)
     * @param lastName Get tags specific to an invite last name (optional)
     * @param tagName Get tags specific to an invite name (optional)
     * @param fromDate Get to tags created from this date onwards (optional)
     * @return ApiResponse&lt;TagResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A List of tags </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TagResult> getTagsWithHttpInfo(Integer networkId, String userId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String tagName, String fromDate) throws ApiException {
        okhttp3.Call localVarCall = getTagsValidateBeforeCall(networkId, userId, page, limit, liUserId, firstName, lastName, tagName, fromDate, null);
        Type localVarReturnType = new TypeToken<TagResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get detailed tags list logged for the by user with linkedin id li_user_id (asynchronously)
     * Returns a list of tags logged for the by user with linkedin id li_user_id
     * @param networkId Network ID for the stats (required)
     * @param userId LinkedIn identifier for the user in case of a specific user stats (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param liUserId Get tags specific to an invite li_user_id (optional)
     * @param firstName Get tags specific to an invite first name (optional)
     * @param lastName Get tags specific to an invite last name (optional)
     * @param tagName Get tags specific to an invite name (optional)
     * @param fromDate Get to tags created from this date onwards (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A List of tags </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTagsAsync(Integer networkId, String userId, Integer page, Integer limit, String liUserId, String firstName, String lastName, String tagName, String fromDate, final ApiCallback<TagResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTagsValidateBeforeCall(networkId, userId, page, limit, liUserId, firstName, lastName, tagName, fromDate, _callback);
        Type localVarReturnType = new TypeToken<TagResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
