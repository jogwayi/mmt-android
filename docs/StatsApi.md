# StatsApi

All URIs are relative to *https://api.mymosttrusted.net/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStatByUserId**](StatsApi.md#getStatByUserId) | **GET** /network/{network_id}/stats/{user_id} | Get Summary on Available tracking links and tags summary
[**getStats**](StatsApi.md#getStats) | **GET** /network/{network_id}/stats | Get Summary on Available tracking links and tags summary
[**getStatsByItem**](StatsApi.md#getStatsByItem) | **GET** /network/{network_id}/stats/invites | Get Summary on invites



## getStatByUserId

> UserStatsResult getStatByUserId(networkId, userId, fromDate)

Get Summary on Available tracking links and tags summary

Returns clicks statistics for tracking links and tag summary

### Example

```java
// Import classes:
//import util.mymosttrusted.client.StatsApi;

StatsApi apiInstance = new StatsApi();
Integer networkId = 1; // Integer | Network ID for the stats
String userId = null; // String | LinkedIn identifier for the user in case of a specific user stats
String fromDate = null; // String | Get invites created from this date onwards
try {
    UserStatsResult result = apiInstance.getStatByUserId(networkId, userId, fromDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatsApi#getStatByUserId");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkId** | **Integer**| Network ID for the stats | [default to null]
 **userId** | **String**| LinkedIn identifier for the user in case of a specific user stats | [default to null]
 **fromDate** | **String**| Get invites created from this date onwards | [optional] [default to null]

### Return type

[**UserStatsResult**](UserStatsResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getStats

> StatsSummedResult getStats(networkId, fromDate)

Get Summary on Available tracking links and tags summary

Returns clicks statistics for tracking links and tag summary

### Example

```java
// Import classes:
//import util.mymosttrusted.client.StatsApi;

StatsApi apiInstance = new StatsApi();
Integer networkId = 1; // Integer | Network ID for the stats
String fromDate = null; // String | Get stats of tracking links and tags created from this date onwards
try {
    StatsSummedResult result = apiInstance.getStats(networkId, fromDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatsApi#getStats");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkId** | **Integer**| Network ID for the stats | [default to null]
 **fromDate** | **String**| Get stats of tracking links and tags created from this date onwards | [optional] [default to null]

### Return type

[**StatsSummedResult**](StatsSummedResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getStatsByItem

> StatsResult getStatsByItem(networkId, page, limit, firstName, lastName, userId, fromDate)

Get Summary on invites

Returns invites summary by users

### Example

```java
// Import classes:
//import util.mymosttrusted.client.StatsApi;

StatsApi apiInstance = new StatsApi();
Integer networkId = 1; // Integer | Network ID for the stats
Integer page = 1; // Integer | Page to fetch
Integer limit = 50; // Integer | Number of records to return per page, maximum allowed number is 50
String firstName = null; // String | Search for invite stats by first name
String lastName = null; // String | Search for invite stats by last name
String userId = null; // String | Search for invite stats by user_id
String fromDate = null; // String | Get invites created from this date onwards
try {
    StatsResult result = apiInstance.getStatsByItem(networkId, page, limit, firstName, lastName, userId, fromDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatsApi#getStatsByItem");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkId** | **Integer**| Network ID for the stats | [default to null]
 **page** | **Integer**| Page to fetch | [optional] [default to 1]
 **limit** | **Integer**| Number of records to return per page, maximum allowed number is 50 | [optional] [default to 50]
 **firstName** | **String**| Search for invite stats by first name | [optional] [default to null]
 **lastName** | **String**| Search for invite stats by last name | [optional] [default to null]
 **userId** | **String**| Search for invite stats by user_id | [optional] [default to null]
 **fromDate** | **String**| Get invites created from this date onwards | [optional] [default to null]

### Return type

[**StatsResult**](StatsResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

