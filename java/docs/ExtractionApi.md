# ExtractionApi

All URIs are relative to *https://127.0.0.1:8081*

Method | HTTP request | Description
------------- | ------------- | -------------
[**extractFaceImage**](ExtractionApi.md#extractFaceImage) | **POST** /v1/bio/extract-face-image | Extracts face biometric data (template) from a supplied image
[**extractFaceVideo**](ExtractionApi.md#extractFaceVideo) | **POST** /v1/bio/extract-face-video | Extracts face biometric data (template) from a supplied video
[**extractFingerprintImage**](ExtractionApi.md#extractFingerprintImage) | **POST** /v1/bio/extract-fingerprint-image | Extracts finger biometric data (template) from a supplied image


<a name="extractFaceImage"></a>
# **extractFaceImage**
> ExtractFaceFromImageResult extractFaceImage(input)

Extracts face biometric data (template) from a supplied image

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.api.v1.ExtractionApi;


ExtractionApi apiInstance = new ExtractionApi();
ExtractFaceFromImageInput input = new ExtractFaceFromImageInput(); // ExtractFaceFromImageInput | input
try {
    ExtractFaceFromImageResult result = apiInstance.extractFaceImage(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtractionApi#extractFaceImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**ExtractFaceFromImageInput**](ExtractFaceFromImageInput.md)| input |

### Return type

[**ExtractFaceFromImageResult**](ExtractFaceFromImageResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="extractFaceVideo"></a>
# **extractFaceVideo**
> ExtractFaceFromVideoResult extractFaceVideo(input)

Extracts face biometric data (template) from a supplied video

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.api.v1.ExtractionApi;


ExtractionApi apiInstance = new ExtractionApi();
ExtractFaceFromVideoInput input = new ExtractFaceFromVideoInput(); // ExtractFaceFromVideoInput | input
try {
    ExtractFaceFromVideoResult result = apiInstance.extractFaceVideo(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtractionApi#extractFaceVideo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**ExtractFaceFromVideoInput**](ExtractFaceFromVideoInput.md)| input |

### Return type

[**ExtractFaceFromVideoResult**](ExtractFaceFromVideoResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="extractFingerprintImage"></a>
# **extractFingerprintImage**
> ExtractFingerPrintFromImageResult extractFingerprintImage(input)

Extracts finger biometric data (template) from a supplied image

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.api.v1.ExtractionApi;


ExtractionApi apiInstance = new ExtractionApi();
ExtractFingerPrintFromImageInput input = new ExtractFingerPrintFromImageInput(); // ExtractFingerPrintFromImageInput | input
try {
    ExtractFingerPrintFromImageResult result = apiInstance.extractFingerprintImage(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtractionApi#extractFingerprintImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**ExtractFingerPrintFromImageInput**](ExtractFingerPrintFromImageInput.md)| input |

### Return type

[**ExtractFingerPrintFromImageResult**](ExtractFingerPrintFromImageResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

