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

import util.mymosttrusted.model.OkResult;
import java.net.URI;
import util.mymosttrusted.model.WebhookBody;
import util.mymosttrusted.model.WebhookPatchBody;
import util.mymosttrusted.model.WebhookResult;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class WebhookApi {
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
  * Get the current webhook configurations for user
  * Returns the current webhook configurations for user
   * @param networkId Network ID for the webhook
   * @param userId LinkedIn identifier for the user&#39;s configurations
   * @param page Page to fetch
   * @param limit Number of records to return per page, maximum allowed number is 50
   * @param webhookUrl The user&#39;s associated search url configuration for the network configuration you&#39;re viewing
   * @param fromDate Get webhooks created from this date onwards
   * @param fromDateUpdated Get webhooks updated from this date onwards
   * @return WebhookResult
  */
  public WebhookResult getWebhook (Integer networkId, String userId, Integer page, Integer limit, URI webhookUrl, String fromDate, String fromDateUpdated) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'networkId' is set
    if (networkId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'networkId' when calling getWebhook",
        new ApiException(400, "Missing the required parameter 'networkId' when calling getWebhook"));
    }
    // verify the required parameter 'userId' is set
    if (userId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userId' when calling getWebhook",
        new ApiException(400, "Missing the required parameter 'userId' when calling getWebhook"));
    }

    // create path and map variables
    String path = "/network/{network_id}/webhook/{user_id}".replaceAll("\\{" + "network_id" + "\\}", apiInvoker.escapeString(networkId.toString())).replaceAll("\\{" + "user_id" + "\\}", apiInvoker.escapeString(userId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "webhook_url", webhookUrl));
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
         return (WebhookResult) ApiInvoker.deserialize(localVarResponse, "", WebhookResult.class);
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
   * Get the current webhook configurations for user
   * Returns the current webhook configurations for user
   * @param networkId Network ID for the webhook   * @param userId LinkedIn identifier for the user&#39;s configurations   * @param page Page to fetch   * @param limit Number of records to return per page, maximum allowed number is 50   * @param webhookUrl The user&#39;s associated search url configuration for the network configuration you&#39;re viewing   * @param fromDate Get webhooks created from this date onwards   * @param fromDateUpdated Get webhooks updated from this date onwards
  */
  public void getWebhook (Integer networkId, String userId, Integer page, Integer limit, URI webhookUrl, String fromDate, String fromDateUpdated, final Response.Listener<WebhookResult> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'networkId' is set
    if (networkId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'networkId' when calling getWebhook",
        new ApiException(400, "Missing the required parameter 'networkId' when calling getWebhook"));
    }
    // verify the required parameter 'userId' is set
    if (userId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userId' when calling getWebhook",
        new ApiException(400, "Missing the required parameter 'userId' when calling getWebhook"));
    }

    // create path and map variables
    String path = "/network/{network_id}/webhook/{user_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "network_id" + "\\}", apiInvoker.escapeString(networkId.toString())).replaceAll("\\{" + "user_id" + "\\}", apiInvoker.escapeString(userId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "webhook_url", webhookUrl));
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
              responseListener.onResponse((WebhookResult) ApiInvoker.deserialize(localVarResponse,  "", WebhookResult.class));
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
  * Update webhook for a user
  * Updates webhook for a user
   * @param networkId Network ID for the webhook
   * @param webhookId ID of the webhook to update
   * @param webhookPatchBody 
   * @return OkResult
  */
  public OkResult patchWebhook (Integer networkId, Integer webhookId, WebhookPatchBody webhookPatchBody) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = webhookPatchBody;
    // verify the required parameter 'networkId' is set
    if (networkId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'networkId' when calling patchWebhook",
        new ApiException(400, "Missing the required parameter 'networkId' when calling patchWebhook"));
    }
    // verify the required parameter 'webhookId' is set
    if (webhookId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'webhookId' when calling patchWebhook",
        new ApiException(400, "Missing the required parameter 'webhookId' when calling patchWebhook"));
    }

    // create path and map variables
    String path = "/network/{network_id}/webhook/{webhook_id}".replaceAll("\\{" + "network_id" + "\\}", apiInvoker.escapeString(networkId.toString())).replaceAll("\\{" + "webhook_id" + "\\}", apiInvoker.escapeString(webhookId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json"
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
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (OkResult) ApiInvoker.deserialize(localVarResponse, "", OkResult.class);
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
   * Update webhook for a user
   * Updates webhook for a user
   * @param networkId Network ID for the webhook   * @param webhookId ID of the webhook to update   * @param webhookPatchBody 
  */
  public void patchWebhook (Integer networkId, Integer webhookId, WebhookPatchBody webhookPatchBody, final Response.Listener<OkResult> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = webhookPatchBody;

    // verify the required parameter 'networkId' is set
    if (networkId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'networkId' when calling patchWebhook",
        new ApiException(400, "Missing the required parameter 'networkId' when calling patchWebhook"));
    }
    // verify the required parameter 'webhookId' is set
    if (webhookId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'webhookId' when calling patchWebhook",
        new ApiException(400, "Missing the required parameter 'webhookId' when calling patchWebhook"));
    }

    // create path and map variables
    String path = "/network/{network_id}/webhook/{webhook_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "network_id" + "\\}", apiInvoker.escapeString(networkId.toString())).replaceAll("\\{" + "webhook_id" + "\\}", apiInvoker.escapeString(webhookId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
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
      apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((OkResult) ApiInvoker.deserialize(localVarResponse,  "", OkResult.class));
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
  * Configure webhook for a user
  * Configures webhook for a user
   * @param networkId Network ID for the webhook
   * @param userId LinkedIn identifier for the user&#39;s configurations
   * @param webhookBody 
   * @return OkResult
  */
  public OkResult postWebhook (Integer networkId, String userId, WebhookBody webhookBody) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = webhookBody;
    // verify the required parameter 'networkId' is set
    if (networkId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'networkId' when calling postWebhook",
        new ApiException(400, "Missing the required parameter 'networkId' when calling postWebhook"));
    }
    // verify the required parameter 'userId' is set
    if (userId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userId' when calling postWebhook",
        new ApiException(400, "Missing the required parameter 'userId' when calling postWebhook"));
    }

    // create path and map variables
    String path = "/network/{network_id}/webhook/{user_id}".replaceAll("\\{" + "network_id" + "\\}", apiInvoker.escapeString(networkId.toString())).replaceAll("\\{" + "user_id" + "\\}", apiInvoker.escapeString(userId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json"
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
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (OkResult) ApiInvoker.deserialize(localVarResponse, "", OkResult.class);
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
   * Configure webhook for a user
   * Configures webhook for a user
   * @param networkId Network ID for the webhook   * @param userId LinkedIn identifier for the user&#39;s configurations   * @param webhookBody 
  */
  public void postWebhook (Integer networkId, String userId, WebhookBody webhookBody, final Response.Listener<OkResult> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = webhookBody;

    // verify the required parameter 'networkId' is set
    if (networkId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'networkId' when calling postWebhook",
        new ApiException(400, "Missing the required parameter 'networkId' when calling postWebhook"));
    }
    // verify the required parameter 'userId' is set
    if (userId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userId' when calling postWebhook",
        new ApiException(400, "Missing the required parameter 'userId' when calling postWebhook"));
    }

    // create path and map variables
    String path = "/network/{network_id}/webhook/{user_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "network_id" + "\\}", apiInvoker.escapeString(networkId.toString())).replaceAll("\\{" + "user_id" + "\\}", apiInvoker.escapeString(userId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
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
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((OkResult) ApiInvoker.deserialize(localVarResponse,  "", OkResult.class));
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
  * Delete webhook for a user
  * Deletes webhook for a user
   * @param networkId Network ID for the webhook
   * @param webhookId ID of the webhook to delete
   * @return OkResult
  */
  public OkResult removeWebhook (Integer networkId, Integer webhookId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'networkId' is set
    if (networkId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'networkId' when calling removeWebhook",
        new ApiException(400, "Missing the required parameter 'networkId' when calling removeWebhook"));
    }
    // verify the required parameter 'webhookId' is set
    if (webhookId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'webhookId' when calling removeWebhook",
        new ApiException(400, "Missing the required parameter 'webhookId' when calling removeWebhook"));
    }

    // create path and map variables
    String path = "/network/{network_id}/webhook/{webhook_id}".replaceAll("\\{" + "network_id" + "\\}", apiInvoker.escapeString(networkId.toString())).replaceAll("\\{" + "webhook_id" + "\\}", apiInvoker.escapeString(webhookId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
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
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (OkResult) ApiInvoker.deserialize(localVarResponse, "", OkResult.class);
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
   * Delete webhook for a user
   * Deletes webhook for a user
   * @param networkId Network ID for the webhook   * @param webhookId ID of the webhook to delete
  */
  public void removeWebhook (Integer networkId, Integer webhookId, final Response.Listener<OkResult> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'networkId' is set
    if (networkId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'networkId' when calling removeWebhook",
        new ApiException(400, "Missing the required parameter 'networkId' when calling removeWebhook"));
    }
    // verify the required parameter 'webhookId' is set
    if (webhookId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'webhookId' when calling removeWebhook",
        new ApiException(400, "Missing the required parameter 'webhookId' when calling removeWebhook"));
    }

    // create path and map variables
    String path = "/network/{network_id}/webhook/{webhook_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "network_id" + "\\}", apiInvoker.escapeString(networkId.toString())).replaceAll("\\{" + "webhook_id" + "\\}", apiInvoker.escapeString(webhookId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



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
      apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((OkResult) ApiInvoker.deserialize(localVarResponse,  "", OkResult.class));
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
