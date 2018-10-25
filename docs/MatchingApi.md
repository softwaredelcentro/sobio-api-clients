# MatchingApi

All URIs are relative to *https://127.0.0.1:8081*

Method | HTTP request | Description
------------- | ------------- | -------------
[**identify**](MatchingApi.md#identify) | **POST** /v1/bio/identify | Performs an identification (1:N) of supplied biometric data against enrolled subjects (that match optionally supplied conditions)
[**verify**](MatchingApi.md#verify) | **POST** /v1/bio/verify | Performs a verification (1:1) of supplied biometric data against a supplied enrolled subject id
[**verifyT2t**](MatchingApi.md#verifyT2t) | **POST** /v1/bio/verify-t2t | Performs a verification (1:1) of two supplied biometric subjects


<a name="identify"></a>
# **identify**
> IdentifyResult identify(input)

Performs an identification (1:N) of supplied biometric data against enrolled subjects (that match optionally supplied conditions)

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.api.v1.MatchingApi;


MatchingApi apiInstance = new MatchingApi();
IdentifyInput input = new IdentifyInput(); // IdentifyInput | input
try {
    IdentifyResult result = apiInstance.identify(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchingApi#identify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**IdentifyInput**](IdentifyInput.md)| input |

### Return type

[**IdentifyResult**](IdentifyResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="verify"></a>
# **verify**
> VerifyResult verify(input)

Performs a verification (1:1) of supplied biometric data against a supplied enrolled subject id

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.api.v1.MatchingApi;


MatchingApi apiInstance = new MatchingApi();
VerifyInput input = new VerifyInput(); // VerifyInput | input
try {
    VerifyResult result = apiInstance.verify(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchingApi#verify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**VerifyInput**](VerifyInput.md)| input |

### Return type

[**VerifyResult**](VerifyResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="verifyT2t"></a>
# **verifyT2t**
> VerifyResult verifyT2t(input)

Performs a verification (1:1) of two supplied biometric subjects

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.api.v1.MatchingApi;


MatchingApi apiInstance = new MatchingApi();
VerifyT2TInput input = new VerifyT2TInput(); // VerifyT2TInput | input
try {
    VerifyResult result = apiInstance.verifyT2t(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchingApi#verifyT2t");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**VerifyT2TInput**](VerifyT2TInput.md)| input |

### Return type

[**VerifyResult**](VerifyResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

