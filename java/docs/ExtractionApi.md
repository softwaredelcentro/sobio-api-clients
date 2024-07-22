# ExtractionApi

All URIs are relative to *https://dev.securbase.biomix.cloud*

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
> ConcatAudioStreamsResult concatAudioStream(input)

Concats multiple audio-streams

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiClient;
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.client.v1.Configuration;
//import ar.com.sdc.sobio.client.v1.auth.*;
//import ar.com.sdc.sobio.api.v1.ExtractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

ExtractionApi apiInstance = new ExtractionApi();
ConcatAudioStreamsInput input = new ConcatAudioStreamsInput(); // ConcatAudioStreamsInput | input
try {
    ConcatAudioStreamsResult result = apiInstance.concatAudioStream(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtractionApi#concatAudioStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**ConcatAudioStreamsInput**](ConcatAudioStreamsInput.md)| input |

### Return type

[**ConcatAudioStreamsResult**](ConcatAudioStreamsResult.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="convertFingerprintImagePngToWsq"></a>
# **convertFingerprintImagePngToWsq**
> ConvertFingerprintImageOutput convertFingerprintImagePngToWsq(input)

Convert Fingerprint in PNG to WSQ format

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiClient;
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.client.v1.Configuration;
//import ar.com.sdc.sobio.client.v1.auth.*;
//import ar.com.sdc.sobio.api.v1.ExtractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

ExtractionApi apiInstance = new ExtractionApi();
ConvertFingerprintImageInput input = new ConvertFingerprintImageInput(); // ConvertFingerprintImageInput | input
try {
    ConvertFingerprintImageOutput result = apiInstance.convertFingerprintImagePngToWsq(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtractionApi#convertFingerprintImagePngToWsq");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**ConvertFingerprintImageInput**](ConvertFingerprintImageInput.md)| input |

### Return type

[**ConvertFingerprintImageOutput**](ConvertFingerprintImageOutput.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="convertFingerprintImageWsqToPng"></a>
# **convertFingerprintImageWsqToPng**
> ConvertFingerprintImageOutput convertFingerprintImageWsqToPng(input)

Convert Fingerprint in WSQ to PNG format

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiClient;
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.client.v1.Configuration;
//import ar.com.sdc.sobio.client.v1.auth.*;
//import ar.com.sdc.sobio.api.v1.ExtractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

ExtractionApi apiInstance = new ExtractionApi();
ConvertFingerprintImageInput input = new ConvertFingerprintImageInput(); // ConvertFingerprintImageInput | input
try {
    ConvertFingerprintImageOutput result = apiInstance.convertFingerprintImageWsqToPng(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtractionApi#convertFingerprintImageWsqToPng");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**ConvertFingerprintImageInput**](ConvertFingerprintImageInput.md)| input |

### Return type

[**ConvertFingerprintImageOutput**](ConvertFingerprintImageOutput.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="extractFaceImage"></a>
# **extractFaceImage**
> ExtractFaceFromImageResult extractFaceImage(input)

Extracts face biometric data (template) from a supplied image

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiClient;
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.client.v1.Configuration;
//import ar.com.sdc.sobio.client.v1.auth.*;
//import ar.com.sdc.sobio.api.v1.ExtractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

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

[Token](../README.md#Token)

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
//import ar.com.sdc.sobio.client.v1.ApiClient;
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.client.v1.Configuration;
//import ar.com.sdc.sobio.client.v1.auth.*;
//import ar.com.sdc.sobio.api.v1.ExtractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

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

[Token](../README.md#Token)

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
//import ar.com.sdc.sobio.client.v1.ApiClient;
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.client.v1.Configuration;
//import ar.com.sdc.sobio.client.v1.auth.*;
//import ar.com.sdc.sobio.api.v1.ExtractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

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

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="extractTextDependentVoice"></a>
# **extractTextDependentVoice**
> ExtractTextDependentVoiceFromAudioResult extractTextDependentVoice(input)

Extracts text-dependent voice biometric data (template) from a supplied audio

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiClient;
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.client.v1.Configuration;
//import ar.com.sdc.sobio.client.v1.auth.*;
//import ar.com.sdc.sobio.api.v1.ExtractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

ExtractionApi apiInstance = new ExtractionApi();
ExtractTextDependentVoiceFromAudioInput input = new ExtractTextDependentVoiceFromAudioInput(); // ExtractTextDependentVoiceFromAudioInput | input
try {
    ExtractTextDependentVoiceFromAudioResult result = apiInstance.extractTextDependentVoice(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtractionApi#extractTextDependentVoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**ExtractTextDependentVoiceFromAudioInput**](ExtractTextDependentVoiceFromAudioInput.md)| input |

### Return type

[**ExtractTextDependentVoiceFromAudioResult**](ExtractTextDependentVoiceFromAudioResult.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="extractTextIndependentVoice"></a>
# **extractTextIndependentVoice**
> ExtractTextIndependentVoiceFromAudioResult extractTextIndependentVoice(input)

Extracts text-independent voice biometric data (template) from a supplied audio

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiClient;
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.client.v1.Configuration;
//import ar.com.sdc.sobio.client.v1.auth.*;
//import ar.com.sdc.sobio.api.v1.ExtractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

ExtractionApi apiInstance = new ExtractionApi();
ExtractTextIndependentVoiceFromAudioInput input = new ExtractTextIndependentVoiceFromAudioInput(); // ExtractTextIndependentVoiceFromAudioInput | input
try {
    ExtractTextIndependentVoiceFromAudioResult result = apiInstance.extractTextIndependentVoice(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtractionApi#extractTextIndependentVoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**ExtractTextIndependentVoiceFromAudioInput**](ExtractTextIndependentVoiceFromAudioInput.md)| input |

### Return type

[**ExtractTextIndependentVoiceFromAudioResult**](ExtractTextIndependentVoiceFromAudioResult.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

