# TrackingLinkApi

All URIs are relative to *https://api.mymosttrusted.net/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNetworkTracking**](TrackingLinkApi.md#getNetworkTracking) | **GET** /network/{network_id}/tracking_links | Get detailed tracking link list logged for the network with id {id}
[**getTracking**](TrackingLinkApi.md#getTracking) | **GET** /network/{network_id}/tracking_links/{user_id} | Get detailed tracking link list logged for the network with id {id} by user with linkedin id li_user_id



## getNetworkTracking

> TrackingLinkDetailResult getNetworkTracking(networkId, page, limit, trackingLinkName, fromDate)

Get detailed tracking link list logged for the network with id {id}

Returns a list of tracking link logged for the network with id {id}

### Example

```java
// Import classes:
//import util.mymosttrusted.client.TrackingLinkApi;

TrackingLinkApi apiInstance = new TrackingLinkApi();
Integer networkId = 1; // Integer | Network ID for the stats
Integer page = 1; // Integer | Page to fetch
Integer limit = 50; // Integer | Number of records to return per page, maximum allowed number is 50
String trackingLinkName = null; // String | Get tracking links with name matching tracking_link_name
String fromDate = null; // String | Get tracking links created from this date onwards
try {
    TrackingLinkDetailResult result = apiInstance.getNetworkTracking(networkId, page, limit, trackingLinkName, fromDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackingLinkApi#getNetworkTracking");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkId** | **Integer**| Network ID for the stats | [default to null]
 **page** | **Integer**| Page to fetch | [optional] [default to 1]
 **limit** | **Integer**| Number of records to return per page, maximum allowed number is 50 | [optional] [default to 50]
 **trackingLinkName** | **String**| Get tracking links with name matching tracking_link_name | [optional] [default to null]
 **fromDate** | **String**| Get tracking links created from this date onwards | [optional] [default to null]

### Return type

[**TrackingLinkDetailResult**](TrackingLinkDetailResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getTracking

> TrackingLinkDetailResult getTracking(networkId, userId, page, limit, trackingLinkName, fromDate)

Get detailed tracking link list logged for the network with id {id} by user with linkedin id li_user_id

Returns a list of tracking link logged for the network with id {id} by user with linkedin id li_user_id

### Example

```java
// Import classes:
//import util.mymosttrusted.client.TrackingLinkApi;

TrackingLinkApi apiInstance = new TrackingLinkApi();
Integer networkId = 1; // Integer | Network ID for the stats
String userId = null; // String | LinkedIn identifier for the user in case of a specific user stats
Integer page = 1; // Integer | Page to fetch
Integer limit = 50; // Integer | Number of records to return per page, maximum allowed number is 50
String trackingLinkName = null; // String | Get tracking links with name matching tracking_link_name
String fromDate = null; // String | Get tracking links created from this date onwards
try {
    TrackingLinkDetailResult result = apiInstance.getTracking(networkId, userId, page, limit, trackingLinkName, fromDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackingLinkApi#getTracking");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkId** | **Integer**| Network ID for the stats | [default to null]
 **userId** | **String**| LinkedIn identifier for the user in case of a specific user stats | [default to null]
 **page** | **Integer**| Page to fetch | [optional] [default to 1]
 **limit** | **Integer**| Number of records to return per page, maximum allowed number is 50 | [optional] [default to 50]
 **trackingLinkName** | **String**| Get tracking links with name matching tracking_link_name | [optional] [default to null]
 **fromDate** | **String**| Get tracking links created from this date onwards | [optional] [default to null]

### Return type

[**TrackingLinkDetailResult**](TrackingLinkDetailResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

