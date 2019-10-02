# DocumentExtractionApi

All URIs are relative to *https://sobio-b76a.sdc.com.ar*

Method | HTTP request | Description
------------- | ------------- | -------------
[**extractDniArDocInfo**](DocumentExtractionApi.md#extractDniArDocInfo) | **POST** /v1/document-extraction/dni-ar | Extracts ARGENTINA ID Card document information


<a name="extractDniArDocInfo"></a>
# **extractDniArDocInfo**
> ExtractDNIARResult extractDniArDocInfo(param0)

Extracts ARGENTINA ID Card document information

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.api.v1.DocumentExtractionApi;


DocumentExtractionApi apiInstance = new DocumentExtractionApi();
ExtractDNIARInput param0 = new ExtractDNIARInput(); // ExtractDNIARInput | param0
try {
    ExtractDNIARResult result = apiInstance.extractDniArDocInfo(param0);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentExtractionApi#extractDniArDocInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **param0** | [**ExtractDNIARInput**](ExtractDNIARInput.md)| param0 |

### Return type

[**ExtractDNIARResult**](ExtractDNIARResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

