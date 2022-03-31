# AuditApi

All URIs are relative to *https://sobio*

Method | HTTP request | Description
------------- | ------------- | -------------
[**byDate**](AuditApi.md#byDate) | **POST** /v1/audit/by-date | Lists audit-data filtered by dates, and number of rows
[**detailsList**](AuditApi.md#detailsList) | **POST** /v1/audit/details-by-txid | Lists filtered audit-details
[**detailsList1**](AuditApi.md#detailsList1) | **POST** /v1/audit/details-list | Lists filtered audit-details
[**downloadId**](AuditApi.md#downloadId) | **GET** /v1/audit/by-audit-id/{auditId} | Download zipped activity log for supplied audit id
[**downloadId1**](AuditApi.md#downloadId1) | **GET** /v1/audit/by-subject-id/{subjectId} | Download zipped activity log for supplied subject id
[**downloadId2**](AuditApi.md#downloadId2) | **GET** /v1/audit/by-audit-token/{auditToken} | Downloads zipped activity log for supplied audit token


<a name="byDate"></a>
# **byDate**
> AuditByDateOutput byDate(input)

Lists audit-data filtered by dates, and number of rows

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.api.v1.AuditApi;


AuditApi apiInstance = new AuditApi();
AuditByDateInput input = new AuditByDateInput(); // AuditByDateInput | input
try {
    AuditByDateOutput result = apiInstance.byDate(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#byDate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**AuditByDateInput**](AuditByDateInput.md)| input |

### Return type

[**AuditByDateOutput**](AuditByDateOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="detailsList"></a>
# **detailsList**
> AuditDetailOutput detailsList(input)

Lists filtered audit-details

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.api.v1.AuditApi;


AuditApi apiInstance = new AuditApi();
AuditDetailInput input = new AuditDetailInput(); // AuditDetailInput | input
try {
    AuditDetailOutput result = apiInstance.detailsList(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#detailsList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**AuditDetailInput**](AuditDetailInput.md)| input |

### Return type

[**AuditDetailOutput**](AuditDetailOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="detailsList1"></a>
# **detailsList1**
> AuditDetailListOutput detailsList1(input)

Lists filtered audit-details

### Example
```java
// Import classes:
//import ar.com.sdc.sobio.client.v1.ApiException;
//import ar.com.sdc.sobio.api.v1.AuditApi;


AuditApi apiInstance = new AuditApi();
AuditDetailListInput input = new AuditDetailListInput(); // AuditDetailListInput | input
try {
    AuditDetailListOutput result = apiInstance.detailsList1(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#detailsList1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**AuditDetailListInput**](AuditDetailListInput.md)| input |

### Return type

[**AuditDetailListOutput**](AuditDetailListOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

