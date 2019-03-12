
# ExtractTextIndependentVoiceFromAudioResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exception** | **Boolean** |  |  [optional]
**properties** | [**VoiceProperties**](VoiceProperties.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**txId** | **String** |  |  [optional]
**voice** | [**TextIndependentVoice**](TextIndependentVoice.md) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
OK | &quot;OK&quot;
LOW_QUALITY | &quot;LOW_QUALITY&quot;
VOICE_NOT_DETECTED | &quot;VOICE_NOT_DETECTED&quot;
NOISY | &quot;NOISY&quot;
LOW_LEVEL | &quot;LOW_LEVEL&quot;
EXCEPTION | &quot;EXCEPTION&quot;
TOO_SHORT | &quot;TOO_SHORT&quot;



