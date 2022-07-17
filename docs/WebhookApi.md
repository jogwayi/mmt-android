# WebhookApi

All URIs are relative to *https://api.mymosttrusted.net/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getWebhook**](WebhookApi.md#getWebhook) | **GET** /network/{network_id}/webhook/{user_id} | Get the current webhook configurations for user
[**patchWebhook**](WebhookApi.md#patchWebhook) | **PUT** /network/{network_id}/webhook/{webhook_id} | Update webhook for a user
[**postWebhook**](WebhookApi.md#postWebhook) | **POST** /network/{network_id}/webhook/{user_id} | Configure webhook for a user
[**removeWebhook**](WebhookApi.md#removeWebhook) | **DELETE** /network/{network_id}/webhook/{webhook_id} | Delete webhook for a user



## getWebhook

> WebhookResult getWebhook(networkId, userId, page, limit, webhookUrl, fromDate, fromDateUpdated)

Get the current webhook configurations for user

Returns the current webhook configurations for user

### Example

```java
// Import classes:
//import util.mymosttrusted.client.WebhookApi;

WebhookApi apiInstance = new WebhookApi();
Integer networkId = 1; // Integer | Network ID for the webhook
String userId = null; // String | LinkedIn identifier for the user's configurations
Integer page = 1; // Integer | Page to fetch
Integer limit = 50; // Integer | Number of records to return per page, maximum allowed number is 50
URI webhookUrl = null; // URI | The user's associated search url configuration for the network configuration you're viewing
String fromDate = null; // String | Get webhooks created from this date onwards
String fromDateUpdated = null; // String | Get webhooks updated from this date onwards
try {
    WebhookResult result = apiInstance.getWebhook(networkId, userId, page, limit, webhookUrl, fromDate, fromDateUpdated);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#getWebhook");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkId** | **Integer**| Network ID for the webhook | [default to null]
 **userId** | **String**| LinkedIn identifier for the user&#39;s configurations | [default to null]
 **page** | **Integer**| Page to fetch | [optional] [default to 1]
 **limit** | **Integer**| Number of records to return per page, maximum allowed number is 50 | [optional] [default to 50]
 **webhookUrl** | **URI**| The user&#39;s associated search url configuration for the network configuration you&#39;re viewing | [optional] [default to null]
 **fromDate** | **String**| Get webhooks created from this date onwards | [optional] [default to null]
 **fromDateUpdated** | **String**| Get webhooks updated from this date onwards | [optional] [default to null]

### Return type

[**WebhookResult**](WebhookResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## patchWebhook

> OkResult patchWebhook(networkId, webhookId, webhookPatchBody)

Update webhook for a user

Updates webhook for a user

### Example

```java
// Import classes:
//import util.mymosttrusted.client.WebhookApi;

WebhookApi apiInstance = new WebhookApi();
Integer networkId = 1; // Integer | Network ID for the webhook
Integer webhookId = null; // Integer | ID of the webhook to update
WebhookPatchBody webhookPatchBody = new WebhookPatchBody(); // WebhookPatchBody | 
try {
    OkResult result = apiInstance.patchWebhook(networkId, webhookId, webhookPatchBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#patchWebhook");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkId** | **Integer**| Network ID for the webhook | [default to null]
 **webhookId** | **Integer**| ID of the webhook to update | [default to null]
 **webhookPatchBody** | [**WebhookPatchBody**](WebhookPatchBody.md)|  | [optional]

### Return type

[**OkResult**](OkResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postWebhook

> OkResult postWebhook(networkId, userId, webhookBody)

Configure webhook for a user

Configures webhook for a user

### Example

```java
// Import classes:
//import util.mymosttrusted.client.WebhookApi;

WebhookApi apiInstance = new WebhookApi();
Integer networkId = 1; // Integer | Network ID for the webhook
String userId = null; // String | LinkedIn identifier for the user's configurations
WebhookBody webhookBody = new WebhookBody(); // WebhookBody | 
try {
    OkResult result = apiInstance.postWebhook(networkId, userId, webhookBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#postWebhook");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkId** | **Integer**| Network ID for the webhook | [default to null]
 **userId** | **String**| LinkedIn identifier for the user&#39;s configurations | [default to null]
 **webhookBody** | [**WebhookBody**](WebhookBody.md)|  | [optional]

### Return type

[**OkResult**](OkResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## removeWebhook

> OkResult removeWebhook(networkId, webhookId)

Delete webhook for a user

Deletes webhook for a user

### Example

```java
// Import classes:
//import util.mymosttrusted.client.WebhookApi;

WebhookApi apiInstance = new WebhookApi();
Integer networkId = 1; // Integer | Network ID for the webhook
Integer webhookId = null; // Integer | ID of the webhook to delete
try {
    OkResult result = apiInstance.removeWebhook(networkId, webhookId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#removeWebhook");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkId** | **Integer**| Network ID for the webhook | [default to null]
 **webhookId** | **Integer**| ID of the webhook to delete | [default to null]

### Return type

[**OkResult**](OkResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

