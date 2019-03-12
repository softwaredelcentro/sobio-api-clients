# DocumentExtractionApi

All URIs are relative to *https://127.0.0.1:8081*

Method | HTTP request | Description
------------- | ------------- | -------------
[**extractDniArDocInfo**](DocumentExtractionApi.md#extractDniArDocInfo) | **POST** /v1/document-extraction/dni-ar | Extracts ARGENTINA ID Card document information


<a name="extractDniArDocInfo"></a>
# **extractDniArDocInfo**
> ExtractDocumentInformationResult extractDniArDocInfo(input)

Extracts ARGENTINA ID Card document information

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.api.v1.DocumentExtractionApi;


DocumentExtractionApi apiInstance = new DocumentExtractionApi();
ExtractDocumentInformationInput input = new ExtractDocumentInformationInput(); // ExtractDocumentInformationInput | input
try {
    ExtractDocumentInformationResult result = apiInstance.extractDniArDocInfo(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentExtractionApi#extractDniArDocInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**ExtractDocumentInformationInput**](ExtractDocumentInformationInput.md)| input |

### Return type

[**ExtractDocumentInformationResult**](ExtractDocumentInformationResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

