# ConfigApi

All URIs are relative to *https://api.mymosttrusted.net/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getConfig**](ConfigApi.md#getConfig) | **GET** /network/{network_id}/config/{user_id} | Get the current search url and messages configurations for user
[**postConfig**](ConfigApi.md#postConfig) | **POST** /network/{network_id}/config/{user_id} | Configure search url and messages for a user



## getConfig

> ConfigResult getConfig(networkId, userId)

Get the current search url and messages configurations for user

Returns the current search url and messages configurations for user

### Example

```java
// Import classes:
//import util.mymosttrusted.client.ConfigApi;

ConfigApi apiInstance = new ConfigApi();
Integer networkId = 1; // Integer | Network ID for the stats
String userId = null; // String | LinkedIn identifier for the user's configurations
try {
    ConfigResult result = apiInstance.getConfig(networkId, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigApi#getConfig");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkId** | **Integer**| Network ID for the stats | [default to null]
 **userId** | **String**| LinkedIn identifier for the user&#39;s configurations | [default to null]

### Return type

[**ConfigResult**](ConfigResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postConfig

> OkResult postConfig(networkId, userId, configBody)

Configure search url and messages for a user

Configures search url and messages for a user

### Example

```java
// Import classes:
//import util.mymosttrusted.client.ConfigApi;

ConfigApi apiInstance = new ConfigApi();
Integer networkId = 1; // Integer | Network ID for the stats
String userId = null; // String | LinkedIn identifier for the user's configurations
ConfigBody configBody = new ConfigBody(); // ConfigBody | 
try {
    OkResult result = apiInstance.postConfig(networkId, userId, configBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigApi#postConfig");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkId** | **Integer**| Network ID for the stats | [default to null]
 **userId** | **String**| LinkedIn identifier for the user&#39;s configurations | [default to null]
 **configBody** | [**ConfigBody**](ConfigBody.md)|  | [optional]

### Return type

[**OkResult**](OkResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

