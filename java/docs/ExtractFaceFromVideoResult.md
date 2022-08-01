
# ExtractFaceFromVideoResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**detectedActions** | [**List&lt;DetectedAction&gt;**](DetectedAction.md) |  |  [optional]
**exception** | **Boolean** |  |  [optional]
**face** | [**Face**](Face.md) |  |  [optional]
**properties** | [**FaceProperties**](FaceProperties.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**txId** | **String** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
BAD_ILLUMINATION | &quot;BAD_ILLUMINATION&quot;
FACE_NOT_DETECTED | &quot;FACE_NOT_DETECTED&quot;
MORE_THAN_ONE_FACE | &quot;MORE_THAN_ONE_FACE&quot;
OK | &quot;OK&quot;
UNKNOWN_VIDEO_FORMAT | &quot;UNKNOWN_VIDEO_FORMAT&quot;



