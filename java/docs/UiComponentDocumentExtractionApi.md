# UiComponentDocumentExtractionApi

All URIs are relative to *https://dev.securbase.biomix.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**extractDniArDocInfo1**](UiComponentDocumentExtractionApi.md#extractDniArDocInfo1) | **POST** /v1/ui/dni-ar-extraction | Extracts ARGENTINA ID Card document information


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
//import ar.com.sdc.sobio.api.v1.UiComponentDocumentExtractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

UiComponentDocumentExtractionApi apiInstance = new UiComponentDocumentExtractionApi();
UIExtractDNIARInput input = new UIExtractDNIARInput(); // UIExtractDNIARInput | input
try {
    UIExtractDNIAROutput result = apiInstance.extractDniArDocInfo1(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UiComponentDocumentExtractionApi#extractDniArDocInfo1");
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

