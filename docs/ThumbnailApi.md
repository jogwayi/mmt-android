# ThumbnailApi

All URIs are relative to *https://api.mymosttrusted.net/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getThumbnail**](ThumbnailApi.md#getThumbnail) | **GET** /network/{network_id}/thumbnail/{thumbnail_id} | Get photo for the user_id specified by thumb_id



## getThumbnail

> String getThumbnail(networkId, thumbnailId)

Get photo for the user_id specified by thumb_id

Returns a photo for the user_id specified by thumb_id

### Example

```java
// Import classes:
//import util.mymosttrusted.client.ThumbnailApi;

ThumbnailApi apiInstance = new ThumbnailApi();
Integer networkId = 1; // Integer | Network ID for the stats
String thumbnailId = null; // String | LinkedIn identifier related to the thumbnail
try {
    String result = apiInstance.getThumbnail(networkId, thumbnailId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ThumbnailApi#getThumbnail");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkId** | **Integer**| Network ID for the stats | [default to null]
 **thumbnailId** | **String**| LinkedIn identifier related to the thumbnail | [default to null]

### Return type

**String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: image/png

