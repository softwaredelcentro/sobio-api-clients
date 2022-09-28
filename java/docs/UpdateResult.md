
# UpdateResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**duplicatedSubjectId** | **String** |  |  [optional]
**exception** | **Boolean** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**txId** | **String** |  |  [optional]


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
DUPLICATE_SEARCH_UNSUPPORTED | &quot;DUPLICATE_SEARCH_UNSUPPORTED&quot;



