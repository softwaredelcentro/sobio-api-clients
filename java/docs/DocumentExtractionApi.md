# DocumentExtractionApi

All URIs are relative to *https://dev.securbase.biomix.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**extractDniArDocInfo**](DocumentExtractionApi.md#extractDniArDocInfo) | **POST** /v1/document-extraction/dni-ar | Extracts ARGENTINA ID Card document information


<a name="extractDniArDocInfo"></a>
# **extractDniArDocInfo**
> ExtractDNIARResult extractDniArDocInfo(input)

Extracts ARGENTINA ID Card document information

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiClient;
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.client.v1.Configuration;
//import ar.com.sdc.sobio.client.v1.auth.*;
//import ar.com.sdc.sobio.api.v1.DocumentExtractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

DocumentExtractionApi apiInstance = new DocumentExtractionApi();
ExtractDNIARInput input = new ExtractDNIARInput(); // ExtractDNIARInput | input
try {
    ExtractDNIARResult result = apiInstance.extractDniArDocInfo(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentExtractionApi#extractDniArDocInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**ExtractDNIARInput**](ExtractDNIARInput.md)| input |

### Return type

[**ExtractDNIARResult**](ExtractDNIARResult.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

