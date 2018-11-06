# AuditApi

All URIs are relative to *https://127.0.0.1:8081*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadId**](AuditApi.md#downloadId) | **GET** /v1/audit/by-audit-id/{auditId} | Download zipped activity log for supplied audit id
[**downloadId1**](AuditApi.md#downloadId1) | **GET** /v1/audit/by-subject-id/{subjectId} | Download zipped activity log for supplied subject id
[**downloadId2**](AuditApi.md#downloadId2) | **GET** /v1/audit/by-audit-token/{auditToken} | Downloads zipped activity log for supplied audit token


<a name="downloadId"></a>
# **downloadId**
> Resource downloadId(auditId)

Download zipped activity log for supplied audit id

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.api.v1.AuditApi;


AuditApi apiInstance = new AuditApi();
String auditId = "auditId_example"; // String | auditId
try {
    Resource result = apiInstance.downloadId(auditId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#downloadId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auditId** | **String**| auditId |

### Return type

[**Resource**](Resource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="downloadId1"></a>
# **downloadId1**
> Resource downloadId1(subjectId)

Download zipped activity log for supplied subject id

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.api.v1.AuditApi;


AuditApi apiInstance = new AuditApi();
String subjectId = "subjectId_example"; // String | subjectId
try {
    Resource result = apiInstance.downloadId1(subjectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#downloadId1");
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

<a name="downloadId2"></a>
# **downloadId2**
> Resource downloadId2(auditToken)

Downloads zipped activity log for supplied audit token

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.api.v1.AuditApi;


AuditApi apiInstance = new AuditApi();
String auditToken = "auditToken_example"; // String | auditToken
try {
    Resource result = apiInstance.downloadId2(auditToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#downloadId2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auditToken** | **String**| auditToken |

### Return type

[**Resource**](Resource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

