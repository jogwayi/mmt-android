# InvitesApi

All URIs are relative to *https://api.mymosttrusted.net/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getInviteSummary**](InvitesApi.md#getInviteSummary) | **GET** /network/{network_id}/invites | Get summarised invites listed in network
[**getInvites**](InvitesApi.md#getInvites) | **GET** /network/{network_id}/invites/{user_id} | Get contacts listed by specific user



## getInviteSummary

> InvitesResult getInviteSummary(networkId, page, limit, liUserId, firstName, lastName, tagName, statusName, fromDate, fromDateUpdated)

Get summarised invites listed in network

Returns a list of invites listed in network

### Example

```java
// Import classes:
//import util.mymosttrusted.client.InvitesApi;

InvitesApi apiInstance = new InvitesApi();
Integer networkId = 1; // Integer | Network ID for the stats
Integer page = 1; // Integer | Page to fetch
Integer limit = 50; // Integer | Number of records to return per page, maximum allowed number is 50
String liUserId = null; // String | Get invite specific to li_user_id
String firstName = null; // String | Get tags specific to an invite first name
String lastName = null; // String | Get tags specific to an invite last name
String tagName = null; // String | Get invites with this tag name
String statusName = null; // String | Get invites specific to this status
String fromDate = null; // String | Get invites created from this date onwards
String fromDateUpdated = null; // String | Get invites created from this date onwards
try {
    InvitesResult result = apiInstance.getInviteSummary(networkId, page, limit, liUserId, firstName, lastName, tagName, statusName, fromDate, fromDateUpdated);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvitesApi#getInviteSummary");
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
 **firstName** | **String**| Get tags specific to an invite first name | [optional] [default to null]
 **lastName** | **String**| Get tags specific to an invite last name | [optional] [default to null]
 **tagName** | **String**| Get invites with this tag name | [optional] [default to null]
 **statusName** | **String**| Get invites specific to this status | [optional] [default to null]
 **fromDate** | **String**| Get invites created from this date onwards | [optional] [default to null]
 **fromDateUpdated** | **String**| Get invites created from this date onwards | [optional] [default to null]

### Return type

[**InvitesResult**](InvitesResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getInvites

> InvitesResult getInvites(networkId, userId, page, limit, liUserId, firstName, lastName, tagName, status, fromDate, fromDateUpdated)

Get contacts listed by specific user

Returns a list of contacts listed by the user with LinkedIn id li_user_id

### Example

```java
// Import classes:
//import util.mymosttrusted.client.InvitesApi;

InvitesApi apiInstance = new InvitesApi();
Integer networkId = 1; // Integer | Network ID for the stats
String userId = null; // String | LinkedIn identifier for the user in case of a specific user stats
Integer page = 1; // Integer | Page to fetch
Integer limit = 50; // Integer | Number of records to return per page, maximum allowed number is 50
String liUserId = null; // String | Get invites specific to an invite li_user_id
String firstName = null; // String | Get tags specific to an invite first name
String lastName = null; // String | Get tags specific to an invite last name
String tagName = null; // String | Get invites specific to this tag name
String status = null; // String | Get invites specific to this status
String fromDate = null; // String | Get invites created from this date onwards
String fromDateUpdated = null; // String | Get invites created from this date onwards
try {
    InvitesResult result = apiInstance.getInvites(networkId, userId, page, limit, liUserId, firstName, lastName, tagName, status, fromDate, fromDateUpdated);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvitesApi#getInvites");
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
 **liUserId** | **String**| Get invites specific to an invite li_user_id | [optional] [default to null]
 **firstName** | **String**| Get tags specific to an invite first name | [optional] [default to null]
 **lastName** | **String**| Get tags specific to an invite last name | [optional] [default to null]
 **tagName** | **String**| Get invites specific to this tag name | [optional] [default to null]
 **status** | **String**| Get invites specific to this status | [optional] [default to null]
 **fromDate** | **String**| Get invites created from this date onwards | [optional] [default to null]
 **fromDateUpdated** | **String**| Get invites created from this date onwards | [optional] [default to null]

### Return type

[**InvitesResult**](InvitesResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

