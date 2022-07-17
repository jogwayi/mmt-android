# ConnectApi

All URIs are relative to *https://api.mymosttrusted.net/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getConnectInvites**](ConnectApi.md#getConnectInvites) | **GET** /network/{network_id}/connects/{user_id} | Get to connect contacts listed by specific user
[**getConnectSummary**](ConnectApi.md#getConnectSummary) | **GET** /network/{network_id}/connects | Get summarised to connect contacts listed in network



## getConnectInvites

> ConnectUserResult getConnectInvites(networkId, userId, page, limit, liUserId, firstName, lastName, location, fromDate)

Get to connect contacts listed by specific user

Returns a list of to connect contacts listed by the user with LinkedIn id li_user_id

### Example

```java
// Import classes:
//import util.mymosttrusted.client.ConnectApi;

ConnectApi apiInstance = new ConnectApi();
Integer networkId = 1; // Integer | Network ID for the stats
String userId = null; // String | LinkedIn identifier for the user in case of a specific user stats
Integer page = 1; // Integer | Page to fetch
Integer limit = 50; // Integer | Number of records to return per page, maximum allowed number is 50
String liUserId = null; // String | Get to connect contacts specific to an invite li_user_id
String firstName = null; // String | Find to connect contacts with first names alike to this first name
String lastName = null; // String | Find to connect contacts with last names alike to this last name
String location = null; // String | Find to connect contacts in location alike to this location
String fromDate = null; // String | Get to connect contacts created from this date onwards
try {
    ConnectUserResult result = apiInstance.getConnectInvites(networkId, userId, page, limit, liUserId, firstName, lastName, location, fromDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectApi#getConnectInvites");
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
 **liUserId** | **String**| Get to connect contacts specific to an invite li_user_id | [optional] [default to null]
 **firstName** | **String**| Find to connect contacts with first names alike to this first name | [optional] [default to null]
 **lastName** | **String**| Find to connect contacts with last names alike to this last name | [optional] [default to null]
 **location** | **String**| Find to connect contacts in location alike to this location | [optional] [default to null]
 **fromDate** | **String**| Get to connect contacts created from this date onwards | [optional] [default to null]

### Return type

[**ConnectUserResult**](ConnectUserResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getConnectSummary

> ConnectUserResult getConnectSummary(networkId, page, limit, liUserId, firstName, lastName, location, fromDate)

Get summarised to connect contacts listed in network

Returns a list of to connect contacts listed in network

### Example

```java
// Import classes:
//import util.mymosttrusted.client.ConnectApi;

ConnectApi apiInstance = new ConnectApi();
Integer networkId = 1; // Integer | Network ID for the stats
Integer page = 1; // Integer | Page to fetch
Integer limit = 50; // Integer | Number of records to return per page, maximum allowed number is 50
String liUserId = null; // String | Get invite specific to li_user_id
String firstName = null; // String | Find to connect contacts with first names alike to this first name
String lastName = null; // String | Find to connect contacts with last names alike to this last name
String location = null; // String | Find to connect contacts in location alike to this location
String fromDate = null; // String | Get to connect contacts created from this date onwards
try {
    ConnectUserResult result = apiInstance.getConnectSummary(networkId, page, limit, liUserId, firstName, lastName, location, fromDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectApi#getConnectSummary");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkId** | **Integer**| Network ID for the stats | [default to null]
 **page** | **Integer**| Page to fetch | [optional] [default to 1]
 **limit** | **Integer**| Number of records to return per page, maximum allowed number is 50 | [optional] [default to 50]
 **liUserId** | **String**| Get invite specific to li_user_id | [optional] [default to null]
 **firstName** | **String**| Find to connect contacts with first names alike to this first name | [optional] [default to null]
 **lastName** | **String**| Find to connect contacts with last names alike to this last name | [optional] [default to null]
 **location** | **String**| Find to connect contacts in location alike to this location | [optional] [default to null]
 **fromDate** | **String**| Get to connect contacts created from this date onwards | [optional] [default to null]

### Return type

[**ConnectUserResult**](ConnectUserResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

