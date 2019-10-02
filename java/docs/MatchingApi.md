# MatchingApi

All URIs are relative to *https://sobio-b76a.sdc.com.ar*

Method | HTTP request | Description
------------- | ------------- | -------------
[**identify**](MatchingApi.md#identify) | **POST** /v1/bio/identify | Performs an identification (1:N) of supplied biometric data against enrolled subjects (that match optionally supplied conditions)
[**verify**](MatchingApi.md#verify) | **POST** /v1/bio/verify | Performs a verification (1:1) of supplied biometric data against a supplied enrolled subject id
[**verifyT2t**](MatchingApi.md#verifyT2t) | **POST** /v1/bio/verify-t2t | Performs a verification (1:1) of two supplied biometric subjects


<a name="identify"></a>
# **identify**
> IdentifyResult identify(param0)

Performs an identification (1:N) of supplied biometric data against enrolled subjects (that match optionally supplied conditions)

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.api.v1.MatchingApi;


MatchingApi apiInstance = new MatchingApi();
IdentifyInput param0 = new IdentifyInput(); // IdentifyInput | param0
try {
    IdentifyResult result = apiInstance.identify(param0);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchingApi#identify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **param0** | [**IdentifyInput**](IdentifyInput.md)| param0 |

### Return type

[**IdentifyResult**](IdentifyResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="verify"></a>
# **verify**
> VerifyResult verify(param0)

Performs a verification (1:1) of supplied biometric data against a supplied enrolled subject id

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.api.v1.MatchingApi;


MatchingApi apiInstance = new MatchingApi();
VerifyInput param0 = new VerifyInput(); // VerifyInput | param0
try {
    VerifyResult result = apiInstance.verify(param0);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchingApi#verify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **param0** | [**VerifyInput**](VerifyInput.md)| param0 |

### Return type

[**VerifyResult**](VerifyResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="verifyT2t"></a>
# **verifyT2t**
> VerifyResult verifyT2t(param0)

Performs a verification (1:1) of two supplied biometric subjects

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.api.v1.MatchingApi;


MatchingApi apiInstance = new MatchingApi();
VerifyT2TInput param0 = new VerifyT2TInput(); // VerifyT2TInput | param0
try {
    VerifyResult result = apiInstance.verifyT2t(param0);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchingApi#verifyT2t");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **param0** | [**VerifyT2TInput**](VerifyT2TInput.md)| param0 |

### Return type

[**VerifyResult**](VerifyResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

