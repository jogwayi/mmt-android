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


import util.mymosttrusted.model.ConfigBody;
import util.mymosttrusted.model.ConfigResult;
import util.mymosttrusted.model.OkResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ConfigApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ConfigApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ConfigApi(ApiClient apiClient) {
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
     * Build call for getConfig
     * @param networkId Network ID for the stats (required)
     * @param userId LinkedIn identifier for the user&#39;s configurations (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The current search url and messages configurations for user </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Your request does not match the specified format </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getConfigCall(Integer networkId, String userId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/network/{network_id}/config/{user_id}"
            .replaceAll("\\{" + "network_id" + "\\}", localVarApiClient.escapeString(networkId.toString()))
            .replaceAll("\\{" + "user_id" + "\\}", localVarApiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
    private okhttp3.Call getConfigValidateBeforeCall(Integer networkId, String userId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'networkId' is set
        if (networkId == null) {
            throw new ApiException("Missing the required parameter 'networkId' when calling getConfig(Async)");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getConfig(Async)");
        }
        

        okhttp3.Call localVarCall = getConfigCall(networkId, userId, _callback);
        return localVarCall;

    }

    /**
     * Get the current search url and messages configurations for user
     * Returns the current search url and messages configurations for user
     * @param networkId Network ID for the stats (required)
     * @param userId LinkedIn identifier for the user&#39;s configurations (required)
     * @return ConfigResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The current search url and messages configurations for user </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Your request does not match the specified format </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public ConfigResult getConfig(Integer networkId, String userId) throws ApiException {
        ApiResponse<ConfigResult> localVarResp = getConfigWithHttpInfo(networkId, userId);
        return localVarResp.getData();
    }

    /**
     * Get the current search url and messages configurations for user
     * Returns the current search url and messages configurations for user
     * @param networkId Network ID for the stats (required)
     * @param userId LinkedIn identifier for the user&#39;s configurations (required)
     * @return ApiResponse&lt;ConfigResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The current search url and messages configurations for user </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Your request does not match the specified format </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ConfigResult> getConfigWithHttpInfo(Integer networkId, String userId) throws ApiException {
        okhttp3.Call localVarCall = getConfigValidateBeforeCall(networkId, userId, null);
        Type localVarReturnType = new TypeToken<ConfigResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the current search url and messages configurations for user (asynchronously)
     * Returns the current search url and messages configurations for user
     * @param networkId Network ID for the stats (required)
     * @param userId LinkedIn identifier for the user&#39;s configurations (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The current search url and messages configurations for user </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Your request does not match the specified format </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getConfigAsync(Integer networkId, String userId, final ApiCallback<ConfigResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = getConfigValidateBeforeCall(networkId, userId, _callback);
        Type localVarReturnType = new TypeToken<ConfigResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for postConfig
     * @param networkId Network ID for the stats (required)
     * @param userId LinkedIn identifier for the user&#39;s configurations (required)
     * @param configBody  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The search url and messages sent for configuration were successfully updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Your request does not match the specified format </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postConfigCall(Integer networkId, String userId, ConfigBody configBody, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = configBody;

        // create path and map variables
        String localVarPath = "/network/{network_id}/config/{user_id}"
            .replaceAll("\\{" + "network_id" + "\\}", localVarApiClient.escapeString(networkId.toString()))
            .replaceAll("\\{" + "user_id" + "\\}", localVarApiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call postConfigValidateBeforeCall(Integer networkId, String userId, ConfigBody configBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'networkId' is set
        if (networkId == null) {
            throw new ApiException("Missing the required parameter 'networkId' when calling postConfig(Async)");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling postConfig(Async)");
        }
        

        okhttp3.Call localVarCall = postConfigCall(networkId, userId, configBody, _callback);
        return localVarCall;

    }

    /**
     * Configure search url and messages for a user
     * Configures search url and messages for a user
     * @param networkId Network ID for the stats (required)
     * @param userId LinkedIn identifier for the user&#39;s configurations (required)
     * @param configBody  (optional)
     * @return OkResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The search url and messages sent for configuration were successfully updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Your request does not match the specified format </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public OkResult postConfig(Integer networkId, String userId, ConfigBody configBody) throws ApiException {
        ApiResponse<OkResult> localVarResp = postConfigWithHttpInfo(networkId, userId, configBody);
        return localVarResp.getData();
    }

    /**
     * Configure search url and messages for a user
     * Configures search url and messages for a user
     * @param networkId Network ID for the stats (required)
     * @param userId LinkedIn identifier for the user&#39;s configurations (required)
     * @param configBody  (optional)
     * @return ApiResponse&lt;OkResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The search url and messages sent for configuration were successfully updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Your request does not match the specified format </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<OkResult> postConfigWithHttpInfo(Integer networkId, String userId, ConfigBody configBody) throws ApiException {
        okhttp3.Call localVarCall = postConfigValidateBeforeCall(networkId, userId, configBody, null);
        Type localVarReturnType = new TypeToken<OkResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Configure search url and messages for a user (asynchronously)
     * Configures search url and messages for a user
     * @param networkId Network ID for the stats (required)
     * @param userId LinkedIn identifier for the user&#39;s configurations (required)
     * @param configBody  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The search url and messages sent for configuration were successfully updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Your request does not match the specified format </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postConfigAsync(Integer networkId, String userId, ConfigBody configBody, final ApiCallback<OkResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = postConfigValidateBeforeCall(networkId, userId, configBody, _callback);
        Type localVarReturnType = new TypeToken<OkResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
