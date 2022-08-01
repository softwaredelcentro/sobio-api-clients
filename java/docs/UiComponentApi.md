# UiComponentApi

All URIs are relative to *https://127.0.0.1:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enroll1**](UiComponentApi.md#enroll1) | **POST** /v1/ui/enroll | Performs a biometric enrollment supplied biometric data which is associated with supplied enrolled subject id
[**enrollWithDuplicateSearch**](UiComponentApi.md#enrollWithDuplicateSearch) | **POST** /v1/ui/enroll-with-duplicate-search | Performs a biometric enrollment supplied biometric data which is associated with supplied enrolled subject id,performing a duplicate search against current enrollments
[**extractDniArDocInfo1**](UiComponentApi.md#extractDniArDocInfo1) | **POST** /v1/ui/dni-ar-extraction | Extracts ARGENTINA ID Card document information
[**extractFaceImage1**](UiComponentApi.md#extractFaceImage1) | **POST** /v1/ui/extract-face-image | Extracts face biometric data (template) from a supplied image
[**verify1**](UiComponentApi.md#verify1) | **POST** /v1/ui/verify | Performs a biometric verification against an enrolled subject id
[**verifyT2t1**](UiComponentApi.md#verifyT2t1) | **POST** /v1/ui/verify-t2t | Performs a biometric verification between an UI component template vs an extracted template


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
//import ar.com.sdc.sobio.api.v1.UiComponentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

UiComponentApi apiInstance = new UiComponentApi();
UIEnrollInput input = new UIEnrollInput(); // UIEnrollInput | input
try {
    UIEnrollOutput result = apiInstance.enroll1(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UiComponentApi#enroll1");
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
//import ar.com.sdc.sobio.api.v1.UiComponentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

UiComponentApi apiInstance = new UiComponentApi();
UIEnrollInput input = new UIEnrollInput(); // UIEnrollInput | input
try {
    UIEnrollOutput result = apiInstance.enrollWithDuplicateSearch(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UiComponentApi#enrollWithDuplicateSearch");
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

<a name="extractDniArDocInfo1"></a>
# **extractDniArDocInfo1**
> UIExtractDNIAROutput extractDniArDocInfo1(input)

Extracts ARGENTINA ID Card document information

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiClient;
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.client.v1.Configuration;
//import ar.com.sdc.sobio.client.v1.auth.*;
//import ar.com.sdc.sobio.api.v1.UiComponentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

UiComponentApi apiInstance = new UiComponentApi();
UIExtractDNIARInput input = new UIExtractDNIARInput(); // UIExtractDNIARInput | input
try {
    UIExtractDNIAROutput result = apiInstance.extractDniArDocInfo1(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UiComponentApi#extractDniArDocInfo1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**UIExtractDNIARInput**](UIExtractDNIARInput.md)| input |

### Return type

[**UIExtractDNIAROutput**](UIExtractDNIAROutput.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="extractFaceImage1"></a>
# **extractFaceImage1**
> UIExtractFaceFromImageResult extractFaceImage1(input)

Extracts face biometric data (template) from a supplied image

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiClient;
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.client.v1.Configuration;
//import ar.com.sdc.sobio.client.v1.auth.*;
//import ar.com.sdc.sobio.api.v1.UiComponentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

UiComponentApi apiInstance = new UiComponentApi();
UIExtractFaceFromImageInput input = new UIExtractFaceFromImageInput(); // UIExtractFaceFromImageInput | input
try {
    UIExtractFaceFromImageResult result = apiInstance.extractFaceImage1(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UiComponentApi#extractFaceImage1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**UIExtractFaceFromImageInput**](UIExtractFaceFromImageInput.md)| input |

### Return type

[**UIExtractFaceFromImageResult**](UIExtractFaceFromImageResult.md)

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
//import ar.com.sdc.sobio.api.v1.UiComponentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

UiComponentApi apiInstance = new UiComponentApi();
UIVerifyInput input = new UIVerifyInput(); // UIVerifyInput | input
try {
    UIVerifyOutput result = apiInstance.verify1(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UiComponentApi#verify1");
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
//import ar.com.sdc.sobio.api.v1.UiComponentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

UiComponentApi apiInstance = new UiComponentApi();
UIVerifyT2TInput input = new UIVerifyT2TInput(); // UIVerifyT2TInput | input
try {
    UIVerifyT2TOutput result = apiInstance.verifyT2t1(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UiComponentApi#verifyT2t1");
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

