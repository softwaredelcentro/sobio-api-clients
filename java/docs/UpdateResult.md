
# UpdateResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auditId** | **Long** |  |  [optional]
**duplicatedSubjectId** | **String** |  |  [optional]
**exception** | **Boolean** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
UPDATE_OK | &quot;UPDATE_OK&quot;
DUPLICATED_FINGERPRINTS | &quot;DUPLICATED_FINGERPRINTS&quot;
DUPLICATED_SUBJECT | &quot;DUPLICATED_SUBJECT&quot;
INEXISTENT | &quot;INEXISTENT&quot;
WITHOUT_TEMPLATE | &quot;WITHOUT_TEMPLATE&quot;
MATCHING_NODE_UNAVAILABLE | &quot;MATCHING_NODE_UNAVAILABLE&quot;



