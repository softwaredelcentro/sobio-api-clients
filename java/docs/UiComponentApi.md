# UiComponentApi

All URIs are relative to *https://sobio*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enroll1**](UiComponentApi.md#enroll1) | **POST** /v1/ui/enroll | Performs a biometric enrollment supplied biometric data which is associated with supplied enrolled subject id
[**enrollWithDuplicateSearch**](UiComponentApi.md#enrollWithDuplicateSearch) | **POST** /v1/ui/enroll-with-duplicate-search | Performs a biometric enrollment supplied biometric data which is associated with supplied enrolled subject id,performing a duplicate search against current enrollments
[**verify1**](UiComponentApi.md#verify1) | **POST** /v1/ui/verify | Performs a biometric verification against an enrolled subject id
[**verifyT2t1**](UiComponentApi.md#verifyT2t1) | **POST** /v1/ui/verify-t2t | Performs a biometric verification between an UI component template vs an extracted template


<a name="enroll1"></a>
# **enroll1**
> UIEnrollOutput enroll1(input)

Performs a biometric enrollment supplied biometric data which is associated with supplied enrolled subject id

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.api.v1.UiComponentApi;


UiComponentApi apiInstance = new UiComponentApi();
UIEnrollInput input = new UIEnrollInput(); // UIEnrollInput | input
try {
    UIEnrollOutput result = apiInstance.enroll1(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UiComponentApi#enroll1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**UIEnrollInput**](UIEnrollInput.md)| input |

### Return type

[**UIEnrollOutput**](UIEnrollOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="enrollWithDuplicateSearch"></a>
# **enrollWithDuplicateSearch**
> UIEnrollOutput enrollWithDuplicateSearch(input)

Performs a biometric enrollment supplied biometric data which is associated with supplied enrolled subject id,performing a duplicate search against current enrollments

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.api.v1.UiComponentApi;


UiComponentApi apiInstance = new UiComponentApi();
UIEnrollInput input = new UIEnrollInput(); // UIEnrollInput | input
try {
    UIEnrollOutput result = apiInstance.enrollWithDuplicateSearch(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UiComponentApi#enrollWithDuplicateSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**UIEnrollInput**](UIEnrollInput.md)| input |

### Return type

[**UIEnrollOutput**](UIEnrollOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="verify1"></a>
# **verify1**
> UIVerifyOutput verify1(input)

Performs a biometric verification against an enrolled subject id

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.api.v1.UiComponentApi;


UiComponentApi apiInstance = new UiComponentApi();
UIVerifyInput input = new UIVerifyInput(); // UIVerifyInput | input
try {
    UIVerifyOutput result = apiInstance.verify1(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UiComponentApi#verify1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**UIVerifyInput**](UIVerifyInput.md)| input |

### Return type

[**UIVerifyOutput**](UIVerifyOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="verifyT2t1"></a>
# **verifyT2t1**
> UIVerifyT2TOutput verifyT2t1(input)

Performs a biometric verification between an UI component template vs an extracted template

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.api.v1.UiComponentApi;


UiComponentApi apiInstance = new UiComponentApi();
UIVerifyT2TInput input = new UIVerifyT2TInput(); // UIVerifyT2TInput | input
try {
    UIVerifyT2TOutput result = apiInstance.verifyT2t1(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UiComponentApi#verifyT2t1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**UIVerifyT2TInput**](UIVerifyT2TInput.md)| input |

### Return type

[**UIVerifyT2TOutput**](UIVerifyT2TOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

