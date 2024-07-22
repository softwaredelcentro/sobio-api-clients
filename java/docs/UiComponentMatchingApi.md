# UiComponentMatchingApi

All URIs are relative to *https://dev.securbase.biomix.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**identify1**](UiComponentMatchingApi.md#identify1) | **POST** /v1/ui/identify | Performs an identification (1:N) of supplied biometric data against enrolled subjects (that match optionally supplied conditions)
[**verify1**](UiComponentMatchingApi.md#verify1) | **POST** /v1/ui/verify | Performs a biometric verification against an enrolled subject id
[**verifyT2t1**](UiComponentMatchingApi.md#verifyT2t1) | **POST** /v1/ui/verify-t2t | Performs a biometric verification between an UI component template vs an extracted template


<a name="identify1"></a>
# **identify1**
> UIIdentifyOutput identify1(input)

Performs an identification (1:N) of supplied biometric data against enrolled subjects (that match optionally supplied conditions)

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiClient;
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.client.v1.Configuration;
//import ar.com.sdc.sobio.client.v1.auth.*;
//import ar.com.sdc.sobio.api.v1.UiComponentMatchingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

UiComponentMatchingApi apiInstance = new UiComponentMatchingApi();
UIIdentifyInput input = new UIIdentifyInput(); // UIIdentifyInput | input
try {
    UIIdentifyOutput result = apiInstance.identify1(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UiComponentMatchingApi#identify1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**UIIdentifyInput**](UIIdentifyInput.md)| input |

### Return type

[**UIIdentifyOutput**](UIIdentifyOutput.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="verify1"></a>
# **verify1**
> UIVerifyOutput verify1(input)

Performs a biometric verification against an enrolled subject id

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiClient;
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.client.v1.Configuration;
//import ar.com.sdc.sobio.client.v1.auth.*;
//import ar.com.sdc.sobio.api.v1.UiComponentMatchingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

UiComponentMatchingApi apiInstance = new UiComponentMatchingApi();
UIVerifyInput input = new UIVerifyInput(); // UIVerifyInput | input
try {
    UIVerifyOutput result = apiInstance.verify1(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UiComponentMatchingApi#verify1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**UIVerifyInput**](UIVerifyInput.md)| input |

### Return type

[**UIVerifyOutput**](UIVerifyOutput.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="verifyT2t1"></a>
# **verifyT2t1**
> UIVerifyT2TOutput verifyT2t1(input)

Performs a biometric verification between an UI component template vs an extracted template

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiClient;
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.client.v1.Configuration;
//import ar.com.sdc.sobio.client.v1.auth.*;
//import ar.com.sdc.sobio.api.v1.UiComponentMatchingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

UiComponentMatchingApi apiInstance = new UiComponentMatchingApi();
UIVerifyT2TInput input = new UIVerifyT2TInput(); // UIVerifyT2TInput | input
try {
    UIVerifyT2TOutput result = apiInstance.verifyT2t1(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UiComponentMatchingApi#verifyT2t1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**UIVerifyT2TInput**](UIVerifyT2TInput.md)| input |

### Return type

[**UIVerifyT2TOutput**](UIVerifyT2TOutput.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

