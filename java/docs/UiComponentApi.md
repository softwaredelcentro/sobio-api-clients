# UiComponentApi

All URIs are relative to *https://127.0.0.1:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkLiveness**](UiComponentApi.md#checkLiveness) | **POST** /v1/ui/check-liveness | Performs a face livcess verification from an UI component template


<a name="checkLiveness"></a>
# **checkLiveness**
> UILivenessCheckOutput checkLiveness(input)

Performs a face livcess verification from an UI component template

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiClient;
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.client.v1.Configuration;
//import ar.com.sdc.sobio.client.v1.auth.*;
//import ar.com.sdc.sobio.api.v1.UiComponentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

UiComponentApi apiInstance = new UiComponentApi();
UILivenessCheckInput input = new UILivenessCheckInput(); // UILivenessCheckInput | input
try {
    UILivenessCheckOutput result = apiInstance.checkLiveness(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UiComponentApi#checkLiveness");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**UILivenessCheckInput**](UILivenessCheckInput.md)| input |

### Return type

[**UILivenessCheckOutput**](UILivenessCheckOutput.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

