# UiComponentDatabaseApi

All URIs are relative to *https://dev.securbase.biomix.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enroll1**](UiComponentDatabaseApi.md#enroll1) | **POST** /v1/ui/enroll | Performs a biometric enrollment supplied biometric data which is associated with supplied enrolled subject id
[**enrollWithDuplicateSearch**](UiComponentDatabaseApi.md#enrollWithDuplicateSearch) | **POST** /v1/ui/enroll-with-duplicate-search | Performs a biometric enrollment supplied biometric data which is associated with supplied enrolled subject id,performing a duplicate search against current enrollments


<a name="enroll1"></a>
# **enroll1**
> UIEnrollOutput enroll1(input)

Performs a biometric enrollment supplied biometric data which is associated with supplied enrolled subject id

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiClient;
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.client.v1.Configuration;
//import ar.com.sdc.sobio.client.v1.auth.*;
//import ar.com.sdc.sobio.api.v1.UiComponentDatabaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

UiComponentDatabaseApi apiInstance = new UiComponentDatabaseApi();
UIEnrollInput input = new UIEnrollInput(); // UIEnrollInput | input
try {
    UIEnrollOutput result = apiInstance.enroll1(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UiComponentDatabaseApi#enroll1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**UIEnrollInput**](UIEnrollInput.md)| input |

### Return type

[**UIEnrollOutput**](UIEnrollOutput.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="enrollWithDuplicateSearch"></a>
# **enrollWithDuplicateSearch**
> UIEnrollOutput enrollWithDuplicateSearch(input)

Performs a biometric enrollment supplied biometric data which is associated with supplied enrolled subject id,performing a duplicate search against current enrollments

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiClient;
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.client.v1.Configuration;
//import ar.com.sdc.sobio.client.v1.auth.*;
//import ar.com.sdc.sobio.api.v1.UiComponentDatabaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

UiComponentDatabaseApi apiInstance = new UiComponentDatabaseApi();
UIEnrollInput input = new UIEnrollInput(); // UIEnrollInput | input
try {
    UIEnrollOutput result = apiInstance.enrollWithDuplicateSearch(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UiComponentDatabaseApi#enrollWithDuplicateSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**UIEnrollInput**](UIEnrollInput.md)| input |

### Return type

[**UIEnrollOutput**](UIEnrollOutput.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

