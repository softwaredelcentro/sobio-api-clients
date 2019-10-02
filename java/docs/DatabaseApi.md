# DatabaseApi

All URIs are relative to *https://sobio-b76a.sdc.com.ar*

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
> DeleteResult delete(param0)

Deletes an enrolled subject from biometric engine

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.api.v1.DatabaseApi;


DatabaseApi apiInstance = new DatabaseApi();
DeleteInput param0 = new DeleteInput(); // DeleteInput | param0
try {
    DeleteResult result = apiInstance.delete(param0);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **param0** | [**DeleteInput**](DeleteInput.md)| param0 |

### Return type

[**DeleteResult**](DeleteResult.md)

### Authorization

No authorization required

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
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.api.v1.DatabaseApi;


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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="enroll"></a>
# **enroll**
> EnrollResult enroll(param0)

Performs a biometric enrollment supplied biometric data which is associated with supplied enrolled subject id

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.api.v1.DatabaseApi;


DatabaseApi apiInstance = new DatabaseApi();
EnrollInput param0 = new EnrollInput(); // EnrollInput | param0
try {
    EnrollResult result = apiInstance.enroll(param0);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseApi#enroll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **param0** | [**EnrollInput**](EnrollInput.md)| param0 |

### Return type

[**EnrollResult**](EnrollResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="list"></a>
# **list**
> ListOutput list(param0)

List enrolled Subject ID&#39;s

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.api.v1.DatabaseApi;


DatabaseApi apiInstance = new DatabaseApi();
ListInput param0 = new ListInput(); // ListInput | param0
try {
    ListOutput result = apiInstance.list(param0);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **param0** | [**ListInput**](ListInput.md)| param0 |

### Return type

[**ListOutput**](ListOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="subjectData"></a>
# **subjectData**
> SubjectBiometricDataResult subjectData(param0)

Obtain biometric enrolled data from supplied subject id

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.api.v1.DatabaseApi;


DatabaseApi apiInstance = new DatabaseApi();
ObtainSubjectBiometricData param0 = new ObtainSubjectBiometricData(); // ObtainSubjectBiometricData | param0
try {
    SubjectBiometricDataResult result = apiInstance.subjectData(param0);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseApi#subjectData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **param0** | [**ObtainSubjectBiometricData**](ObtainSubjectBiometricData.md)| param0 |

### Return type

[**SubjectBiometricDataResult**](SubjectBiometricDataResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="subjectInfo"></a>
# **subjectInfo**
> SubjectInformationResult subjectInfo(param0)

Obtain information of supplied subject id

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.api.v1.DatabaseApi;


DatabaseApi apiInstance = new DatabaseApi();
ObtainSubjectInfo param0 = new ObtainSubjectInfo(); // ObtainSubjectInfo | param0
try {
    SubjectInformationResult result = apiInstance.subjectInfo(param0);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseApi#subjectInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **param0** | [**ObtainSubjectInfo**](ObtainSubjectInfo.md)| param0 |

### Return type

[**SubjectInformationResult**](SubjectInformationResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="update"></a>
# **update**
> UpdateResult update(param0)

Updates biometric data of an already enrolled subject

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.api.v1.DatabaseApi;


DatabaseApi apiInstance = new DatabaseApi();
UpdateInput param0 = new UpdateInput(); // UpdateInput | param0
try {
    UpdateResult result = apiInstance.update(param0);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **param0** | [**UpdateInput**](UpdateInput.md)| param0 |

### Return type

[**UpdateResult**](UpdateResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

