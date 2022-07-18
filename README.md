# My Most Trusted Reports Client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>util.mymosttrusted</groupId>
    <artifactId>mymosttrusted-reports</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "util.mymosttrusted:mymosttrusted-reports:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

- target/mymosttrusted-reports-1.0.0.jar
- target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import util.mymosttrusted.api.ApiClient;
import util.mymosttrusted.api.ApiException;
import util.mymosttrusted.api.Configuration;
import util.mymosttrusted.api.auth.*;
import util.mymosttrusted.api.models.*;
import util.mymosttrusted.client.ConfigApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mymosttrusted.net/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    ConfigApi apiInstance = new ConfigApi(defaultClient);
    Integer networkId = 1; // Integer | Network ID for the stats
    String userId = "userId_example"; // String | LinkedIn identifier for the user's configurations
    try {
      ConfigResult result = apiInstance.getConfig(networkId, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigApi#getConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```


```

## Documentation for API Endpoints

All URIs are relative to *https://api.mymosttrusted.net/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ConfigApi* | [**getConfig**](docs/ConfigApi.md#getConfig) | **GET** /network/{network_id}/config/{user_id} | Get the current search url and messages configurations for user
*ConfigApi* | [**postConfig**](docs/ConfigApi.md#postConfig) | **POST** /network/{network_id}/config/{user_id} | Configure search url and messages for a user
*ConnectApi* | [**getConnectInvites**](docs/ConnectApi.md#getConnectInvites) | **GET** /network/{network_id}/connects/{user_id} | Get to connect contacts listed by specific user
*ConnectApi* | [**getConnectSummary**](docs/ConnectApi.md#getConnectSummary) | **GET** /network/{network_id}/connects | Get summarised to connect contacts listed in network
*DocsApi* | [**readme**](docs/DocsApi.md#readme) | **GET** / | Access to Documentation
*InvitesApi* | [**getInviteSummary**](docs/InvitesApi.md#getInviteSummary) | **GET** /network/{network_id}/invites | Get summarised invites listed in network
*InvitesApi* | [**getInvites**](docs/InvitesApi.md#getInvites) | **GET** /network/{network_id}/invites/{user_id} | Get contacts listed by specific user
*NetworksApi* | [**getNetwork**](docs/NetworksApi.md#getNetwork) | **GET** /network | Retrieve a list of networks you can access
*StatsApi* | [**getStatByUserId**](docs/StatsApi.md#getStatByUserId) | **GET** /network/{network_id}/stats/{user_id} | Get Summary on Available tracking links and tags summary
*StatsApi* | [**getStats**](docs/StatsApi.md#getStats) | **GET** /network/{network_id}/stats | Get Summary on Available tracking links and tags summary
*StatsApi* | [**getStatsByItem**](docs/StatsApi.md#getStatsByItem) | **GET** /network/{network_id}/stats/invites | Get Summary on invites
*TagsApi* | [**getNetworkTag**](docs/TagsApi.md#getNetworkTag) | **GET** /network/{network_id}/tags | Get detailed tags list logged for the network with id {id}
*TagsApi* | [**getTags**](docs/TagsApi.md#getTags) | **GET** /network/{network_id}/tags/{user_id} | Get detailed tags list logged for the by user with linkedin id li_user_id
*ThumbnailApi* | [**getThumbnail**](docs/ThumbnailApi.md#getThumbnail) | **GET** /network/{network_id}/thumbnail/{thumbnail_id} | Get photo for the user_id specified by thumb_id
*TrackingLinkApi* | [**getNetworkTracking**](docs/TrackingLinkApi.md#getNetworkTracking) | **GET** /network/{network_id}/tracking_links | Get detailed tracking link list logged for the network with id {id}
*TrackingLinkApi* | [**getTracking**](docs/TrackingLinkApi.md#getTracking) | **GET** /network/{network_id}/tracking_links/{user_id} | Get detailed tracking link list logged for the network with id {id} by user with linkedin id li_user_id
*UsersApi* | [**getUsers**](docs/UsersApi.md#getUsers) | **GET** /network/{network_id}/users | Get a list of available users
*WebhookApi* | [**getWebhook**](docs/WebhookApi.md#getWebhook) | **GET** /network/{network_id}/webhook/{user_id} | Get the current webhook configurations for user
*WebhookApi* | [**patchWebhook**](docs/WebhookApi.md#patchWebhook) | **PUT** /network/{network_id}/webhook/{webhook_id} | Update webhook for a user
*WebhookApi* | [**postWebhook**](docs/WebhookApi.md#postWebhook) | **POST** /network/{network_id}/webhook/{user_id} | Configure webhook for a user
*WebhookApi* | [**removeWebhook**](docs/WebhookApi.md#removeWebhook) | **DELETE** /network/{network_id}/webhook/{webhook_id} | Delete webhook for a user


## Documentation for Models

 - [ConfigBody](docs/ConfigBody.md)
 - [ConfigResult](docs/ConfigResult.md)
 - [ConnectUser](docs/ConnectUser.md)
 - [ConnectUserResult](docs/ConnectUserResult.md)
 - [GroupedTagItem](docs/GroupedTagItem.md)
 - [Invite](docs/Invite.md)
 - [InviteStatus](docs/InviteStatus.md)
 - [InvitesResult](docs/InvitesResult.md)
 - [Network](docs/Network.md)
 - [NetworkResult](docs/NetworkResult.md)
 - [OkResult](docs/OkResult.md)
 - [PhoneItem](docs/PhoneItem.md)
 - [StatsByUserInvites](docs/StatsByUserInvites.md)
 - [StatsResult](docs/StatsResult.md)
 - [StatsSummedResult](docs/StatsSummedResult.md)
 - [StatsSummedResultTrackingLinks](docs/StatsSummedResultTrackingLinks.md)
 - [TagDetail](docs/TagDetail.md)
 - [TagItem](docs/TagItem.md)
 - [TagResult](docs/TagResult.md)
 - [TagStats](docs/TagStats.md)
 - [TrackingLinkDetail](docs/TrackingLinkDetail.md)
 - [TrackingLinkDetailResult](docs/TrackingLinkDetailResult.md)
 - [TrackingLinkSummary](docs/TrackingLinkSummary.md)
 - [User](docs/User.md)
 - [UserResult](docs/UserResult.md)
 - [UserStatsResult](docs/UserStatsResult.md)
 - [UserStatsResultInvites](docs/UserStatsResultInvites.md)
 - [WebhookBody](docs/WebhookBody.md)
 - [WebhookItem](docs/WebhookItem.md)
 - [WebhookPatchBody](docs/WebhookPatchBody.md)
 - [WebhookResult](docs/WebhookResult.md)
 - [WebhookResultItem](docs/WebhookResultItem.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### ApiKeyAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



