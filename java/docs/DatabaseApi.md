# DatabaseApi

All URIs are relative to *https://dev.securbase.biomix.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete**](DatabaseApi.md#delete) | **POST** /v1/bio/delete | Deletes an enrolled subject from biometric engine
[**downloadZippedBiodata**](DatabaseApi.md#downloadZippedBiodata) | **GET** /v1/bio/download-zipped-biodata/{subjectId} | Download zipped subject biometric data for supplied subject id
[**enroll**](DatabaseApi.md#enroll) | **POST** /v1/bio/enroll | Performs a biometric enrollment supplied biometric data which is associated with supplied enrolled subject id
[**list**](DatabaseApi.md#list) | **POST** /v1/bio/list | List enrolled Subject ID&#39;s
[**subjectData**](DatabaseApi.md#subjectData) | **POST** /v1/bio/subject-data | Obtain biometric enrolled data from supplied subject id
[**subjectInfo**](DatabaseApi.md#subjectInfo) | **POST** /v1/bio/subject-info | Obtain information of supplied subject id
[**update**](DatabaseApi.md#update) | **POST** /v1/bio/update | Updates biometric data of an already enrolled subject


<a name="delete"></a>
# **delete**
> DeleteResult delete(input)

Deletes an enrolled subject from biometric engine

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiClient;
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.client.v1.Configuration;
//import ar.com.sdc.sobio.client.v1.auth.*;
//import ar.com.sdc.sobio.api.v1.DatabaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

DatabaseApi apiInstance = new DatabaseApi();
DeleteInput input = new DeleteInput(); // DeleteInput | input
try {
    DeleteResult result = apiInstance.delete(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**DeleteInput**](DeleteInput.md)| input |

### Return type

[**DeleteResult**](DeleteResult.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="downloadZippedBiodata"></a>
# **downloadZippedBiodata**
> Resource downloadZippedBiodata(subjectId)

Download zipped subject biometric data for supplied subject id

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiClient;
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.client.v1.Configuration;
//import ar.com.sdc.sobio.client.v1.auth.*;
//import ar.com.sdc.sobio.api.v1.DatabaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

DatabaseApi apiInstance = new DatabaseApi();
String subjectId = "subjectId_example"; // String | subjectId
try {
    Resource result = apiInstance.downloadZippedBiodata(subjectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseApi#downloadZippedBiodata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subjectId** | **String**| subjectId |

### Return type

[**Resource**](Resource.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="enroll"></a>
# **enroll**
> EnrollResult enroll(input)

Performs a biometric enrollment supplied biometric data which is associated with supplied enrolled subject id

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiClient;
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.client.v1.Configuration;
//import ar.com.sdc.sobio.client.v1.auth.*;
//import ar.com.sdc.sobio.api.v1.DatabaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

DatabaseApi apiInstance = new DatabaseApi();
EnrollInput input = new EnrollInput(); // EnrollInput | input
try {
    EnrollResult result = apiInstance.enroll(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseApi#enroll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**EnrollInput**](EnrollInput.md)| input |

### Return type

[**EnrollResult**](EnrollResult.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="list"></a>
# **list**
> ListOutput list(input)

List enrolled Subject ID&#39;s

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiClient;
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.client.v1.Configuration;
//import ar.com.sdc.sobio.client.v1.auth.*;
//import ar.com.sdc.sobio.api.v1.DatabaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

DatabaseApi apiInstance = new DatabaseApi();
ListInput input = new ListInput(); // ListInput | input
try {
    ListOutput result = apiInstance.list(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**ListInput**](ListInput.md)| input |

### Return type

[**ListOutput**](ListOutput.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="subjectData"></a>
# **subjectData**
> SubjectBiometricDataResult subjectData(input)

Obtain biometric enrolled data from supplied subject id

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiClient;
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.client.v1.Configuration;
//import ar.com.sdc.sobio.client.v1.auth.*;
//import ar.com.sdc.sobio.api.v1.DatabaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

DatabaseApi apiInstance = new DatabaseApi();
ObtainSubjectBiometricData input = new ObtainSubjectBiometricData(); // ObtainSubjectBiometricData | input
try {
    SubjectBiometricDataResult result = apiInstance.subjectData(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseApi#subjectData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**ObtainSubjectBiometricData**](ObtainSubjectBiometricData.md)| input |

### Return type

[**SubjectBiometricDataResult**](SubjectBiometricDataResult.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="subjectInfo"></a>
# **subjectInfo**
> SubjectInformationResult subjectInfo(input)

Obtain information of supplied subject id

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiClient;
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.client.v1.Configuration;
//import ar.com.sdc.sobio.client.v1.auth.*;
//import ar.com.sdc.sobio.api.v1.DatabaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

DatabaseApi apiInstance = new DatabaseApi();
ObtainSubjectInfo input = new ObtainSubjectInfo(); // ObtainSubjectInfo | input
try {
    SubjectInformationResult result = apiInstance.subjectInfo(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseApi#subjectInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**ObtainSubjectInfo**](ObtainSubjectInfo.md)| input |

### Return type

[**SubjectInformationResult**](SubjectInformationResult.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="update"></a>
# **update**
> UpdateResult update(input)

Updates biometric data of an already enrolled subject

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiClient;
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.client.v1.Configuration;
//import ar.com.sdc.sobio.client.v1.auth.*;
//import ar.com.sdc.sobio.api.v1.DatabaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

DatabaseApi apiInstance = new DatabaseApi();
UpdateInput input = new UpdateInput(); // UpdateInput | input
try {
    UpdateResult result = apiInstance.update(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**UpdateInput**](UpdateInput.md)| input |

### Return type

[**UpdateResult**](UpdateResult.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

