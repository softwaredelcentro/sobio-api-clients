
# ExtractFaceFromVideoResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auditId** | **Long** |  |  [optional]
**detectedActions** | [**List&lt;DetectedAction&gt;**](DetectedAction.md) |  |  [optional]
**exception** | **Boolean** |  |  [optional]
**face** | [**Face**](Face.md) |  |  [optional]
**properties** | [**FaceProperties**](FaceProperties.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
OK | &quot;OK&quot;
UNKNOWN_VIDEO_FORMAT | &quot;UNKNOWN_VIDEO_FORMAT&quot;
MORE_THAN_ONE_FACE | &quot;MORE_THAN_ONE_FACE&quot;
BAD_ILLUMINATION | &quot;BAD_ILLUMINATION&quot;
FACE_NOT_DETECTED | &quot;FACE_NOT_DETECTED&quot;



