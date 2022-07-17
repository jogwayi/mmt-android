# NetworksApi

All URIs are relative to *https://api.mymosttrusted.net/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNetwork**](NetworksApi.md#getNetwork) | **GET** /network | Retrieve a list of networks you can access



## getNetwork

> NetworkResult getNetwork(page, limit, fromDate)

Retrieve a list of networks you can access

### Example

```java
// Import classes:
//import util.mymosttrusted.client.NetworksApi;

NetworksApi apiInstance = new NetworksApi();
Integer page = 1; // Integer | Page to fetch
Integer limit = 50; // Integer | Number of records to return per page, maximum allowed number is 50
String fromDate = null; // String | Get a list accessible networks created from this date onwards
try {
    NetworkResult result = apiInstance.getNetwork(page, limit, fromDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworksApi#getNetwork");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page to fetch | [optional] [default to 1]
 **limit** | **Integer**| Number of records to return per page, maximum allowed number is 50 | [optional] [default to 50]
 **fromDate** | **String**| Get a list accessible networks created from this date onwards | [optional] [default to null]

### Return type

[**NetworkResult**](NetworkResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

