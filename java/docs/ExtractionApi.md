# ExtractionApi

All URIs are relative to *https://sobio-b76a.sdc.com.ar*

Method | HTTP request | Description
------------- | ------------- | -------------
[**concatAudioStream**](ExtractionApi.md#concatAudioStream) | **POST** /v1/bio/concat-audio-stream | Concats multiple audio-streams
[**convertFingerprintImagePngToWsq**](ExtractionApi.md#convertFingerprintImagePngToWsq) | **POST** /v1/bio/convert-fingerprint-image-png-to-wsq | Convert Fingerprint in PNG to WSQ format
[**convertFingerprintImageWsqToPng**](ExtractionApi.md#convertFingerprintImageWsqToPng) | **POST** /v1/bio/convert-fingerprint-image-wsq-to-png | Convert Fingerprint in WSQ to PNG format
[**extractFaceImage**](ExtractionApi.md#extractFaceImage) | **POST** /v1/bio/extract-face-image | Extracts face biometric data (template) from a supplied image
[**extractFaceVideo**](ExtractionApi.md#extractFaceVideo) | **POST** /v1/bio/extract-face-video | Extracts face biometric data (template) from a supplied video
[**extractFingerprintImage**](ExtractionApi.md#extractFingerprintImage) | **POST** /v1/bio/extract-fingerprint-image | Extracts finger biometric data (template) from a supplied image
[**extractTextDependentVoice**](ExtractionApi.md#extractTextDependentVoice) | **POST** /v1/bio/extract-text-dependent-voice | Extracts text-dependent voice biometric data (template) from a supplied audio
[**extractTextIndependentVoice**](ExtractionApi.md#extractTextIndependentVoice) | **POST** /v1/bio/extract-text-independent-voice | Extracts text-independent voice biometric data (template) from a supplied audio


<a name="concatAudioStream"></a>
# **concatAudioStream**
> ConcatAudioStreamsResult concatAudioStream(param0)

Concats multiple audio-streams

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.api.v1.ExtractionApi;


ExtractionApi apiInstance = new ExtractionApi();
ConcatAudioStreamsInput param0 = new ConcatAudioStreamsInput(); // ConcatAudioStreamsInput | param0
try {
    ConcatAudioStreamsResult result = apiInstance.concatAudioStream(param0);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtractionApi#concatAudioStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **param0** | [**ConcatAudioStreamsInput**](ConcatAudioStreamsInput.md)| param0 |

### Return type

[**ConcatAudioStreamsResult**](ConcatAudioStreamsResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="convertFingerprintImagePngToWsq"></a>
# **convertFingerprintImagePngToWsq**
> ConvertFingerprintImageOutput convertFingerprintImagePngToWsq(param0)

Convert Fingerprint in PNG to WSQ format

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.api.v1.ExtractionApi;


ExtractionApi apiInstance = new ExtractionApi();
ConvertFingerprintImageInput param0 = new ConvertFingerprintImageInput(); // ConvertFingerprintImageInput | param0
try {
    ConvertFingerprintImageOutput result = apiInstance.convertFingerprintImagePngToWsq(param0);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtractionApi#convertFingerprintImagePngToWsq");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **param0** | [**ConvertFingerprintImageInput**](ConvertFingerprintImageInput.md)| param0 |

### Return type

[**ConvertFingerprintImageOutput**](ConvertFingerprintImageOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="convertFingerprintImageWsqToPng"></a>
# **convertFingerprintImageWsqToPng**
> ConvertFingerprintImageOutput convertFingerprintImageWsqToPng(param0)

Convert Fingerprint in WSQ to PNG format

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.api.v1.ExtractionApi;


ExtractionApi apiInstance = new ExtractionApi();
ConvertFingerprintImageInput param0 = new ConvertFingerprintImageInput(); // ConvertFingerprintImageInput | param0
try {
    ConvertFingerprintImageOutput result = apiInstance.convertFingerprintImageWsqToPng(param0);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtractionApi#convertFingerprintImageWsqToPng");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **param0** | [**ConvertFingerprintImageInput**](ConvertFingerprintImageInput.md)| param0 |

### Return type

[**ConvertFingerprintImageOutput**](ConvertFingerprintImageOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="extractFaceImage"></a>
# **extractFaceImage**
> ExtractFaceFromImageResult extractFaceImage(param0)

Extracts face biometric data (template) from a supplied image

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.api.v1.ExtractionApi;


ExtractionApi apiInstance = new ExtractionApi();
ExtractFaceFromImageInput param0 = new ExtractFaceFromImageInput(); // ExtractFaceFromImageInput | param0
try {
    ExtractFaceFromImageResult result = apiInstance.extractFaceImage(param0);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtractionApi#extractFaceImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **param0** | [**ExtractFaceFromImageInput**](ExtractFaceFromImageInput.md)| param0 |

### Return type

[**ExtractFaceFromImageResult**](ExtractFaceFromImageResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="extractFaceVideo"></a>
# **extractFaceVideo**
> ExtractFaceFromVideoResult extractFaceVideo(param0)

Extracts face biometric data (template) from a supplied video

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.api.v1.ExtractionApi;


ExtractionApi apiInstance = new ExtractionApi();
ExtractFaceFromVideoInput param0 = new ExtractFaceFromVideoInput(); // ExtractFaceFromVideoInput | param0
try {
    ExtractFaceFromVideoResult result = apiInstance.extractFaceVideo(param0);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtractionApi#extractFaceVideo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **param0** | [**ExtractFaceFromVideoInput**](ExtractFaceFromVideoInput.md)| param0 |

### Return type

[**ExtractFaceFromVideoResult**](ExtractFaceFromVideoResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="extractFingerprintImage"></a>
# **extractFingerprintImage**
> ExtractFingerPrintFromImageResult extractFingerprintImage(param0)

Extracts finger biometric data (template) from a supplied image

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.api.v1.ExtractionApi;


ExtractionApi apiInstance = new ExtractionApi();
ExtractFingerPrintFromImageInput param0 = new ExtractFingerPrintFromImageInput(); // ExtractFingerPrintFromImageInput | param0
try {
    ExtractFingerPrintFromImageResult result = apiInstance.extractFingerprintImage(param0);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtractionApi#extractFingerprintImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **param0** | [**ExtractFingerPrintFromImageInput**](ExtractFingerPrintFromImageInput.md)| param0 |

### Return type

[**ExtractFingerPrintFromImageResult**](ExtractFingerPrintFromImageResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="extractTextDependentVoice"></a>
# **extractTextDependentVoice**
> ExtractTextDependentVoiceFromAudioResult extractTextDependentVoice(param0)

Extracts text-dependent voice biometric data (template) from a supplied audio

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.api.v1.ExtractionApi;


ExtractionApi apiInstance = new ExtractionApi();
ExtractTextDependentVoiceFromAudioInput param0 = new ExtractTextDependentVoiceFromAudioInput(); // ExtractTextDependentVoiceFromAudioInput | param0
try {
    ExtractTextDependentVoiceFromAudioResult result = apiInstance.extractTextDependentVoice(param0);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtractionApi#extractTextDependentVoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **param0** | [**ExtractTextDependentVoiceFromAudioInput**](ExtractTextDependentVoiceFromAudioInput.md)| param0 |

### Return type

[**ExtractTextDependentVoiceFromAudioResult**](ExtractTextDependentVoiceFromAudioResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="extractTextIndependentVoice"></a>
# **extractTextIndependentVoice**
> ExtractTextIndependentVoiceFromAudioResult extractTextIndependentVoice(param0)

Extracts text-independent voice biometric data (template) from a supplied audio

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.api.v1.ExtractionApi;


ExtractionApi apiInstance = new ExtractionApi();
ExtractTextIndependentVoiceFromAudioInput param0 = new ExtractTextIndependentVoiceFromAudioInput(); // ExtractTextIndependentVoiceFromAudioInput | param0
try {
    ExtractTextIndependentVoiceFromAudioResult result = apiInstance.extractTextIndependentVoice(param0);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtractionApi#extractTextIndependentVoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **param0** | [**ExtractTextIndependentVoiceFromAudioInput**](ExtractTextIndependentVoiceFromAudioInput.md)| param0 |

### Return type

[**ExtractTextIndependentVoiceFromAudioResult**](ExtractTextIndependentVoiceFromAudioResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

