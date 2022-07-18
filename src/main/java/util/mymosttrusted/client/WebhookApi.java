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


import util.mymosttrusted.model.OkResult;
import java.net.URI;
import util.mymosttrusted.model.WebhookBody;
import util.mymosttrusted.model.WebhookPatchBody;
import util.mymosttrusted.model.WebhookResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class WebhookApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public WebhookApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WebhookApi(ApiClient apiClient) {
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
     * Build call for getWebhook
     * @param networkId Network ID for the webhook (required)
     * @param userId LinkedIn identifier for the user&#39;s configurations (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param webhookUrl The user&#39;s associated search url configuration for the network configuration you&#39;re viewing (optional)
     * @param fromDate Get webhooks created from this date onwards (optional)
     * @param fromDateUpdated Get webhooks updated from this date onwards (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The current webhook configurations for user </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Your request does not match the specified format </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getWebhookCall(Integer networkId, String userId, Integer page, Integer limit, URI webhookUrl, String fromDate, String fromDateUpdated, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/network/{network_id}/webhook/{user_id}"
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

        if (webhookUrl != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("webhook_url", webhookUrl));
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
    private okhttp3.Call getWebhookValidateBeforeCall(Integer networkId, String userId, Integer page, Integer limit, URI webhookUrl, String fromDate, String fromDateUpdated, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'networkId' is set
        if (networkId == null) {
            throw new ApiException("Missing the required parameter 'networkId' when calling getWebhook(Async)");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getWebhook(Async)");
        }
        

        okhttp3.Call localVarCall = getWebhookCall(networkId, userId, page, limit, webhookUrl, fromDate, fromDateUpdated, _callback);
        return localVarCall;

    }

    /**
     * Get the current webhook configurations for user
     * Returns the current webhook configurations for user
     * @param networkId Network ID for the webhook (required)
     * @param userId LinkedIn identifier for the user&#39;s configurations (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param webhookUrl The user&#39;s associated search url configuration for the network configuration you&#39;re viewing (optional)
     * @param fromDate Get webhooks created from this date onwards (optional)
     * @param fromDateUpdated Get webhooks updated from this date onwards (optional)
     * @return WebhookResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The current webhook configurations for user </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Your request does not match the specified format </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public WebhookResult getWebhook(Integer networkId, String userId, Integer page, Integer limit, URI webhookUrl, String fromDate, String fromDateUpdated) throws ApiException {
        ApiResponse<WebhookResult> localVarResp = getWebhookWithHttpInfo(networkId, userId, page, limit, webhookUrl, fromDate, fromDateUpdated);
        return localVarResp.getData();
    }

    /**
     * Get the current webhook configurations for user
     * Returns the current webhook configurations for user
     * @param networkId Network ID for the webhook (required)
     * @param userId LinkedIn identifier for the user&#39;s configurations (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param webhookUrl The user&#39;s associated search url configuration for the network configuration you&#39;re viewing (optional)
     * @param fromDate Get webhooks created from this date onwards (optional)
     * @param fromDateUpdated Get webhooks updated from this date onwards (optional)
     * @return ApiResponse&lt;WebhookResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The current webhook configurations for user </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Your request does not match the specified format </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WebhookResult> getWebhookWithHttpInfo(Integer networkId, String userId, Integer page, Integer limit, URI webhookUrl, String fromDate, String fromDateUpdated) throws ApiException {
        okhttp3.Call localVarCall = getWebhookValidateBeforeCall(networkId, userId, page, limit, webhookUrl, fromDate, fromDateUpdated, null);
        Type localVarReturnType = new TypeToken<WebhookResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the current webhook configurations for user (asynchronously)
     * Returns the current webhook configurations for user
     * @param networkId Network ID for the webhook (required)
     * @param userId LinkedIn identifier for the user&#39;s configurations (required)
     * @param page Page to fetch (optional, default to 1)
     * @param limit Number of records to return per page, maximum allowed number is 50 (optional, default to 50)
     * @param webhookUrl The user&#39;s associated search url configuration for the network configuration you&#39;re viewing (optional)
     * @param fromDate Get webhooks created from this date onwards (optional)
     * @param fromDateUpdated Get webhooks updated from this date onwards (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The current webhook configurations for user </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Your request does not match the specified format </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getWebhookAsync(Integer networkId, String userId, Integer page, Integer limit, URI webhookUrl, String fromDate, String fromDateUpdated, final ApiCallback<WebhookResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = getWebhookValidateBeforeCall(networkId, userId, page, limit, webhookUrl, fromDate, fromDateUpdated, _callback);
        Type localVarReturnType = new TypeToken<WebhookResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for patchWebhook
     * @param networkId Network ID for the webhook (required)
     * @param webhookId ID of the webhook to update (required)
     * @param webhookPatchBody  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The webhook sent for configuration was successfully updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Your request does not match the specified format </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call patchWebhookCall(Integer networkId, Integer webhookId, WebhookPatchBody webhookPatchBody, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = webhookPatchBody;

        // create path and map variables
        String localVarPath = "/network/{network_id}/webhook/{webhook_id}"
            .replaceAll("\\{" + "network_id" + "\\}", localVarApiClient.escapeString(networkId.toString()))
            .replaceAll("\\{" + "webhook_id" + "\\}", localVarApiClient.escapeString(webhookId.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call patchWebhookValidateBeforeCall(Integer networkId, Integer webhookId, WebhookPatchBody webhookPatchBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'networkId' is set
        if (networkId == null) {
            throw new ApiException("Missing the required parameter 'networkId' when calling patchWebhook(Async)");
        }
        
        // verify the required parameter 'webhookId' is set
        if (webhookId == null) {
            throw new ApiException("Missing the required parameter 'webhookId' when calling patchWebhook(Async)");
        }
        

        okhttp3.Call localVarCall = patchWebhookCall(networkId, webhookId, webhookPatchBody, _callback);
        return localVarCall;

    }

    /**
     * Update webhook for a user
     * Updates webhook for a user
     * @param networkId Network ID for the webhook (required)
     * @param webhookId ID of the webhook to update (required)
     * @param webhookPatchBody  (optional)
     * @return OkResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The webhook sent for configuration was successfully updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Your request does not match the specified format </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public OkResult patchWebhook(Integer networkId, Integer webhookId, WebhookPatchBody webhookPatchBody) throws ApiException {
        ApiResponse<OkResult> localVarResp = patchWebhookWithHttpInfo(networkId, webhookId, webhookPatchBody);
        return localVarResp.getData();
    }

    /**
     * Update webhook for a user
     * Updates webhook for a user
     * @param networkId Network ID for the webhook (required)
     * @param webhookId ID of the webhook to update (required)
     * @param webhookPatchBody  (optional)
     * @return ApiResponse&lt;OkResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The webhook sent for configuration was successfully updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Your request does not match the specified format </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<OkResult> patchWebhookWithHttpInfo(Integer networkId, Integer webhookId, WebhookPatchBody webhookPatchBody) throws ApiException {
        okhttp3.Call localVarCall = patchWebhookValidateBeforeCall(networkId, webhookId, webhookPatchBody, null);
        Type localVarReturnType = new TypeToken<OkResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update webhook for a user (asynchronously)
     * Updates webhook for a user
     * @param networkId Network ID for the webhook (required)
     * @param webhookId ID of the webhook to update (required)
     * @param webhookPatchBody  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The webhook sent for configuration was successfully updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Your request does not match the specified format </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call patchWebhookAsync(Integer networkId, Integer webhookId, WebhookPatchBody webhookPatchBody, final ApiCallback<OkResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchWebhookValidateBeforeCall(networkId, webhookId, webhookPatchBody, _callback);
        Type localVarReturnType = new TypeToken<OkResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for postWebhook
     * @param networkId Network ID for the webhook (required)
     * @param userId LinkedIn identifier for the user&#39;s configurations (required)
     * @param webhookBody  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The webhook sent for configuration was successfully updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Your request does not match the specified format </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Your request was made with valid data but there is a duplicate record. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postWebhookCall(Integer networkId, String userId, WebhookBody webhookBody, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = webhookBody;

        // create path and map variables
        String localVarPath = "/network/{network_id}/webhook/{user_id}"
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
    private okhttp3.Call postWebhookValidateBeforeCall(Integer networkId, String userId, WebhookBody webhookBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'networkId' is set
        if (networkId == null) {
            throw new ApiException("Missing the required parameter 'networkId' when calling postWebhook(Async)");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling postWebhook(Async)");
        }
        

        okhttp3.Call localVarCall = postWebhookCall(networkId, userId, webhookBody, _callback);
        return localVarCall;

    }

    /**
     * Configure webhook for a user
     * Configures webhook for a user
     * @param networkId Network ID for the webhook (required)
     * @param userId LinkedIn identifier for the user&#39;s configurations (required)
     * @param webhookBody  (optional)
     * @return OkResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The webhook sent for configuration was successfully updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Your request does not match the specified format </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Your request was made with valid data but there is a duplicate record. </td><td>  -  </td></tr>
     </table>
     */
    public OkResult postWebhook(Integer networkId, String userId, WebhookBody webhookBody) throws ApiException {
        ApiResponse<OkResult> localVarResp = postWebhookWithHttpInfo(networkId, userId, webhookBody);
        return localVarResp.getData();
    }

    /**
     * Configure webhook for a user
     * Configures webhook for a user
     * @param networkId Network ID for the webhook (required)
     * @param userId LinkedIn identifier for the user&#39;s configurations (required)
     * @param webhookBody  (optional)
     * @return ApiResponse&lt;OkResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The webhook sent for configuration was successfully updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Your request does not match the specified format </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Your request was made with valid data but there is a duplicate record. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<OkResult> postWebhookWithHttpInfo(Integer networkId, String userId, WebhookBody webhookBody) throws ApiException {
        okhttp3.Call localVarCall = postWebhookValidateBeforeCall(networkId, userId, webhookBody, null);
        Type localVarReturnType = new TypeToken<OkResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Configure webhook for a user (asynchronously)
     * Configures webhook for a user
     * @param networkId Network ID for the webhook (required)
     * @param userId LinkedIn identifier for the user&#39;s configurations (required)
     * @param webhookBody  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The webhook sent for configuration was successfully updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Your request does not match the specified format </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Your request was made with valid data but there is a duplicate record. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postWebhookAsync(Integer networkId, String userId, WebhookBody webhookBody, final ApiCallback<OkResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = postWebhookValidateBeforeCall(networkId, userId, webhookBody, _callback);
        Type localVarReturnType = new TypeToken<OkResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for removeWebhook
     * @param networkId Network ID for the webhook (required)
     * @param webhookId ID of the webhook to delete (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The webhook sent for configuration was successfully deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Your request does not match the specified format </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call removeWebhookCall(Integer networkId, Integer webhookId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/network/{network_id}/webhook/{webhook_id}"
            .replaceAll("\\{" + "network_id" + "\\}", localVarApiClient.escapeString(networkId.toString()))
            .replaceAll("\\{" + "webhook_id" + "\\}", localVarApiClient.escapeString(webhookId.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call removeWebhookValidateBeforeCall(Integer networkId, Integer webhookId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'networkId' is set
        if (networkId == null) {
            throw new ApiException("Missing the required parameter 'networkId' when calling removeWebhook(Async)");
        }
        
        // verify the required parameter 'webhookId' is set
        if (webhookId == null) {
            throw new ApiException("Missing the required parameter 'webhookId' when calling removeWebhook(Async)");
        }
        

        okhttp3.Call localVarCall = removeWebhookCall(networkId, webhookId, _callback);
        return localVarCall;

    }

    /**
     * Delete webhook for a user
     * Deletes webhook for a user
     * @param networkId Network ID for the webhook (required)
     * @param webhookId ID of the webhook to delete (required)
     * @return OkResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The webhook sent for configuration was successfully deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Your request does not match the specified format </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public OkResult removeWebhook(Integer networkId, Integer webhookId) throws ApiException {
        ApiResponse<OkResult> localVarResp = removeWebhookWithHttpInfo(networkId, webhookId);
        return localVarResp.getData();
    }

    /**
     * Delete webhook for a user
     * Deletes webhook for a user
     * @param networkId Network ID for the webhook (required)
     * @param webhookId ID of the webhook to delete (required)
     * @return ApiResponse&lt;OkResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The webhook sent for configuration was successfully deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Your request does not match the specified format </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<OkResult> removeWebhookWithHttpInfo(Integer networkId, Integer webhookId) throws ApiException {
        okhttp3.Call localVarCall = removeWebhookValidateBeforeCall(networkId, webhookId, null);
        Type localVarReturnType = new TypeToken<OkResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete webhook for a user (asynchronously)
     * Deletes webhook for a user
     * @param networkId Network ID for the webhook (required)
     * @param webhookId ID of the webhook to delete (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The webhook sent for configuration was successfully deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Your request does not match the specified format </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Your request was made with invalid credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You&#39;re not supposed to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call removeWebhookAsync(Integer networkId, Integer webhookId, final ApiCallback<OkResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = removeWebhookValidateBeforeCall(networkId, webhookId, _callback);
        Type localVarReturnType = new TypeToken<OkResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
