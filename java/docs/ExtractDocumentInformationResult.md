
# ExtractDocumentInformationResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalInfo** | **String** |  |  [optional]
**documentInfo** | [**DocumentInformation**](DocumentInformation.md) |  |  [optional]
**exception** | **Boolean** |  |  [optional]
**mrzDetected** | **Boolean** |  |  [optional]
**pdf417Detected** | **Boolean** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**suggestedAction** | [**SuggestedActionEnum**](#SuggestedActionEnum) |  |  [optional]
**txId** | **String** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
OK | &quot;OK&quot;
EXCEPTION | &quot;EXCEPTION&quot;
SPOOF | &quot;SPOOF&quot;
FRONT_FACE_NOT_FOUND | &quot;FRONT_FACE_NOT_FOUND&quot;
FRONT_FACE_BAD_ILLUMINATION | &quot;FRONT_FACE_BAD_ILLUMINATION&quot;
NEITHER_MRZ_NOR_PDF417_DETECTED | &quot;NEITHER_MRZ_NOR_PDF417_DETECTED&quot;
NOT_ARGENTINA_ID | &quot;NOT_ARGENTINA_ID&quot;


<a name="SuggestedActionEnum"></a>
## Enum: SuggestedActionEnum
Name | Value
---- | -----
RESCAN_BOTH_SIDES | &quot;RESCAN_BOTH_SIDES&quot;
RESCAN_FRONT | &quot;RESCAN_FRONT&quot;
RESCAN_BACK | &quot;RESCAN_BACK&quot;
NONE | &quot;NONE&quot;
RETRY | &quot;RETRY&quot;



