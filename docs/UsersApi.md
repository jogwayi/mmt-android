# UsersApi

All URIs are relative to *https://api.mymosttrusted.net/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUsers**](UsersApi.md#getUsers) | **GET** /network/{network_id}/users | Get a list of available users



## getUsers

> UserResult getUsers(networkId, page, limit, firstName, lastName, position, email, phoneNumber, country, activationId)

Get a list of available users

Returns a list of users in the network

### Example

```java
// Import classes:
//import util.mymosttrusted.client.UsersApi;

UsersApi apiInstance = new UsersApi();
Integer networkId = 1; // Integer | Network ID for the stats
Integer page = 1; // Integer | Page to fetch
Integer limit = 50; // Integer | Number of records to return per page, maximum allowed number is 50
String firstName = null; // String | Search for users by first name
String lastName = null; // String | Search for users by last name
String position = null; // String | Search for users by position
String email = null; // String | Search for users by email
String phoneNumber = null; // String | Search for users by phone_number
String country = null; // String | Search for users by country
String activationId = null; // String | Search for users by activation reference
try {
    UserResult result = apiInstance.getUsers(networkId, page, limit, firstName, lastName, position, email, phoneNumber, country, activationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUsers");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkId** | **Integer**| Network ID for the stats | [default to null]
 **page** | **Integer**| Page to fetch | [optional] [default to 1]
 **limit** | **Integer**| Number of records to return per page, maximum allowed number is 50 | [optional] [default to 50]
 **firstName** | **String**| Search for users by first name | [optional] [default to null]
 **lastName** | **String**| Search for users by last name | [optional] [default to null]
 **position** | **String**| Search for users by position | [optional] [default to null]
 **email** | **String**| Search for users by email | [optional] [default to null]
 **phoneNumber** | **String**| Search for users by phone_number | [optional] [default to null]
 **country** | **String**| Search for users by country | [optional] [default to null]
 **activationId** | **String**| Search for users by activation reference | [optional] [default to null]

### Return type

[**UserResult**](UserResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

