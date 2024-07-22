
# ExtractFaceFromVideoResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**detectedActions** | [**List&lt;DetectedAction&gt;**](DetectedAction.md) |  |  [optional]
**durationTime** | **Long** |  |  [optional]
**exception** | **Boolean** |  |  [optional]
**face** | [**Face**](Face.md) |  |  [optional]
**livenessLevel** | **Integer** |  |  [optional]
**properties** | [**FaceProperties**](FaceProperties.md) |  |  [optional]
**startTime** | **Long** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**txId** | **String** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
OK | &quot;OK&quot;
UNKNOWN_VIDEO_FORMAT | &quot;UNKNOWN_VIDEO_FORMAT&quot;
MORE_THAN_ONE_FACE | &quot;MORE_THAN_ONE_FACE&quot;
BAD_ILLUMINATION | &quot;BAD_ILLUMINATION&quot;
FACE_NOT_DETECTED | &quot;FACE_NOT_DETECTED&quot;
LIVENESS_CHECK_FAILED | &quot;LIVENESS_CHECK_FAILED&quot;
LIVENESS_CHECK_LEVEL | &quot;LIVENESS_CHECK_LEVEL&quot;



