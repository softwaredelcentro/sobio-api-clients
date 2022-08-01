
# UIExtractDNIAROutput

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalInfo** | **String** |  |  [optional]
**backImage** | **byte[]** |  |  [optional]
**documentInfo** | [**DocumentInformation**](DocumentInformation.md) |  |  [optional]
**exception** | **Boolean** |  |  [optional]
**frontImage** | **byte[]** |  |  [optional]
**mrz** | [**MrzRecord**](MrzRecord.md) |  |  [optional]
**mrzDetected** | **Boolean** |  |  [optional]
**pdf417** | **List&lt;String&gt;** |  |  [optional]
**pdf417Detected** | **Boolean** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**suggestedAction** | [**SuggestedActionEnum**](#SuggestedActionEnum) |  |  [optional]
**txId** | **String** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
BAD_TEMPLATE | &quot;BAD_TEMPLATE&quot;
EXCEPTION | &quot;EXCEPTION&quot;
FRONT_FACE_BAD_ILLUMINATION | &quot;FRONT_FACE_BAD_ILLUMINATION&quot;
FRONT_FACE_NOT_FOUND | &quot;FRONT_FACE_NOT_FOUND&quot;
NEITHER_MRZ_NOR_PDF417_DETECTED | &quot;NEITHER_MRZ_NOR_PDF417_DETECTED&quot;
NOT_ARGENTINA_ID | &quot;NOT_ARGENTINA_ID&quot;
OK | &quot;OK&quot;
SPOOF | &quot;SPOOF&quot;


<a name="SuggestedActionEnum"></a>
## Enum: SuggestedActionEnum
Name | Value
---- | -----
NONE | &quot;NONE&quot;
RESCAN | &quot;RESCAN&quot;
RETRY | &quot;RETRY&quot;



