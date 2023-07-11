# UiComponentExtractionApi

All URIs are relative to *https://127.0.0.1:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**extractFaceImage1**](UiComponentExtractionApi.md#extractFaceImage1) | **POST** /v1/ui/extract-face-image | Extracts face biometric data (template) from a supplied image


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
//import ar.com.sdc.sobio.api.v1.UiComponentExtractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

UiComponentExtractionApi apiInstance = new UiComponentExtractionApi();
UIExtractFaceFromImageInput input = new UIExtractFaceFromImageInput(); // UIExtractFaceFromImageInput | input
try {
    UIExtractFaceFromImageResult result = apiInstance.extractFaceImage1(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UiComponentExtractionApi#extractFaceImage1");
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

