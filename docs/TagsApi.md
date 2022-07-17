# TagsApi

All URIs are relative to *https://api.mymosttrusted.net/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNetworkTag**](TagsApi.md#getNetworkTag) | **GET** /network/{network_id}/tags | Get detailed tags list logged for the network with id {id}
[**getTags**](TagsApi.md#getTags) | **GET** /network/{network_id}/tags/{user_id} | Get detailed tags list logged for the by user with linkedin id li_user_id



## getNetworkTag

> TagResult getNetworkTag(networkId, page, limit, liUserId, firstName, lastName, tagName, fromDate)

Get detailed tags list logged for the network with id {id}

Returns a list of tags logged for the network with id {id}

### Example

```java
// Import classes:
//import util.mymosttrusted.client.TagsApi;

TagsApi apiInstance = new TagsApi();
Integer networkId = 1; // Integer | Network ID for the stats
Integer page = 1; // Integer | Page to fetch
Integer limit = 50; // Integer | Number of records to return per page, maximum allowed number is 50
String liUserId = null; // String | Get tags specific to an invite li_user_id
String firstName = null; // String | Get tags specific to an invite first name
String lastName = null; // String | Get tags specific to an invite last name
String tagName = null; // String | Get tags specific to this tag name
String fromDate = null; // String | Get to tags created from this date onwards
try {
    TagResult result = apiInstance.getNetworkTag(networkId, page, limit, liUserId, firstName, lastName, tagName, fromDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#getNetworkTag");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkId** | **Integer**| Network ID for the stats | [default to null]
 **page** | **Integer**| Page to fetch | [optional] [default to 1]
 **limit** | **Integer**| Number of records to return per page, maximum allowed number is 50 | [optional] [default to 50]
 **liUserId** | **String**| Get tags specific to an invite li_user_id | [optional] [default to null]
 **firstName** | **String**| Get tags specific to an invite first name | [optional] [default to null]
 **lastName** | **String**| Get tags specific to an invite last name | [optional] [default to null]
 **tagName** | **String**| Get tags specific to this tag name | [optional] [default to null]
 **fromDate** | **String**| Get to tags created from this date onwards | [optional] [default to null]

### Return type

[**TagResult**](TagResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getTags

> TagResult getTags(networkId, userId, page, limit, liUserId, firstName, lastName, tagName, fromDate)

Get detailed tags list logged for the by user with linkedin id li_user_id

Returns a list of tags logged for the by user with linkedin id li_user_id

### Example

```java
// Import classes:
//import util.mymosttrusted.client.TagsApi;

TagsApi apiInstance = new TagsApi();
Integer networkId = 1; // Integer | Network ID for the stats
String userId = null; // String | LinkedIn identifier for the user in case of a specific user stats
Integer page = 1; // Integer | Page to fetch
Integer limit = 50; // Integer | Number of records to return per page, maximum allowed number is 50
String liUserId = null; // String | Get tags specific to an invite li_user_id
String firstName = null; // String | Get tags specific to an invite first name
String lastName = null; // String | Get tags specific to an invite last name
String tagName = null; // String | Get tags specific to an invite name
String fromDate = null; // String | Get to tags created from this date onwards
try {
    TagResult result = apiInstance.getTags(networkId, userId, page, limit, liUserId, firstName, lastName, tagName, fromDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#getTags");
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
 **liUserId** | **String**| Get tags specific to an invite li_user_id | [optional] [default to null]
 **firstName** | **String**| Get tags specific to an invite first name | [optional] [default to null]
 **lastName** | **String**| Get tags specific to an invite last name | [optional] [default to null]
 **tagName** | **String**| Get tags specific to an invite name | [optional] [default to null]
 **fromDate** | **String**| Get to tags created from this date onwards | [optional] [default to null]

### Return type

[**TagResult**](TagResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

