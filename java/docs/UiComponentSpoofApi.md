# UiComponentSpoofApi

All URIs are relative to *https://dev.securbase.biomix.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**verifySpoofFace**](UiComponentSpoofApi.md#verifySpoofFace) | **POST** /v2/ui/verify-spoof-face | Performs a face anti-spoof between an UI on a template and a photo (optional)


<a name="verifySpoofFace"></a>
# **verifySpoofFace**
> UIVerifyFASOutput verifySpoofFace(input)

Performs a face anti-spoof between an UI on a template and a photo (optional)

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiClient;
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.client.v1.Configuration;
//import ar.com.sdc.sobio.client.v1.auth.*;
//import ar.com.sdc.sobio.api.v1.UiComponentSpoofApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

UiComponentSpoofApi apiInstance = new UiComponentSpoofApi();
UIVerifyFASInput input = new UIVerifyFASInput(); // UIVerifyFASInput | input
try {
    UIVerifyFASOutput result = apiInstance.verifySpoofFace(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UiComponentSpoofApi#verifySpoofFace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**UIVerifyFASInput**](UIVerifyFASInput.md)| input |

### Return type

[**UIVerifyFASOutput**](UIVerifyFASOutput.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

