
# UIVerifyFASOutput

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**confidence** | **Double** |  | 
**exception** | **Boolean** |  |  [optional]
**face** | [**Face**](Face.md) |  |  [optional]
**faceImage** | **byte[]** |  |  [optional]
**properties** | [**FaceProperties**](FaceProperties.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**txId** | **String** |  |  [optional]
**uiTemplateMetadata** | [**UITemplateMetada**](UITemplateMetada.md) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
IS_SPOOF_CHECK_CONFIDENCE | &quot;IS_SPOOF_CHECK_CONFIDENCE&quot;
NO_SPOOF_CHECK_CONFIDENCE | &quot;NO_SPOOF_CHECK_CONFIDENCE&quot;
BAD_TEMPLATE | &quot;BAD_TEMPLATE&quot;
INTRATEMPLATE_FACE_MISMATCH | &quot;INTRATEMPLATE_FACE_MISMATCH&quot;
TEMPLATE_MULTIPLE_FACES | &quot;TEMPLATE_MULTIPLE_FACES&quot;
WITHOUT_TEMPLATE | &quot;WITHOUT_TEMPLATE&quot;
WITHOUT_IMAGES | &quot;WITHOUT_IMAGES&quot;
IMAGE_WITHOUT_FACE | &quot;IMAGE_WITHOUT_FACE&quot;
UNSUPPORTED | &quot;UNSUPPORTED&quot;



