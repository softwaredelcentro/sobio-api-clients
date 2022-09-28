
# UIExtractFaceFromImageResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exception** | **Boolean** |  |  [optional]
**face** | [**Face**](Face.md) |  |  [optional]
**faceImage** | **byte[]** |  |  [optional]
**properties** | [**FaceProperties**](FaceProperties.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**txId** | **String** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
OK | &quot;OK&quot;
BAD_ILLUMINATION | &quot;BAD_ILLUMINATION&quot;
FACE_NOT_DETECTED | &quot;FACE_NOT_DETECTED&quot;
BAD_TEMPLATE | &quot;BAD_TEMPLATE&quot;
TEMPLATE_MULTIPLE_FACES | &quot;TEMPLATE_MULTIPLE_FACES&quot;



