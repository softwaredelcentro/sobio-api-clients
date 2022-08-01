
# DocumentInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **String** |  |  [optional]
**addressConfidence** | **Integer** |  |  [optional]
**code1** | **String** |  |  [optional]
**code2** | **String** |  |  [optional]
**cuilNumber** | **String** |  |  [optional]
**dateOfBirth** | [**DocumentDate**](DocumentDate.md) |  |  [optional]
**documentNumber** | **String** |  |  [optional]
**documentType** | [**DocumentTypeEnum**](#DocumentTypeEnum) |  |  [optional]
**documentVersion** | [**DocumentVersionEnum**](#DocumentVersionEnum) |  |  [optional]
**expirationDate** | [**DocumentDate**](DocumentDate.md) |  |  [optional]
**face** | [**Face**](Face.md) |  |  [optional]
**fingerPrint** | [**FingerPrint**](FingerPrint.md) |  |  [optional]
**givenNames** | **String** |  |  [optional]
**issuingCountry** | **String** |  |  [optional]
**issuingDate** | [**DocumentDate**](DocumentDate.md) |  |  [optional]
**nationality** | **String** |  |  [optional]
**order** | **String** |  |  [optional]
**sequence** | **String** |  |  [optional]
**sex** | [**SexEnum**](#SexEnum) |  |  [optional]
**surname** | **String** |  |  [optional]
**validComposite** | **Boolean** |  |  [optional]
**validDateOfBirth** | **Boolean** |  |  [optional]
**validDocumentNumber** | **Boolean** |  |  [optional]
**validExpirationDate** | **Boolean** |  |  [optional]


<a name="DocumentTypeEnum"></a>
## Enum: DocumentTypeEnum
Name | Value
---- | -----
CREWMEMBER | &quot;CREWMEMBER&quot;
MIGRANT | &quot;MIGRANT&quot;
PASSPORT | &quot;PASSPORT&quot;
TYPE_A | &quot;TYPE_A&quot;
TYPE_C | &quot;TYPE_C&quot;
TYPE_I | &quot;TYPE_I&quot;
UNKNOWN | &quot;UNKNOWN&quot;
VISA | &quot;VISA&quot;


<a name="DocumentVersionEnum"></a>
## Enum: DocumentVersionEnum
Name | Value
---- | -----
ARGENTINA_ID_V1 | &quot;ARGENTINA_ID_V1&quot;
ARGENTINA_ID_V2 | &quot;ARGENTINA_ID_V2&quot;
UNKNOWN | &quot;UNKNOWN&quot;


<a name="SexEnum"></a>
## Enum: SexEnum
Name | Value
---- | -----
FEMALE | &quot;FEMALE&quot;
MALE | &quot;MALE&quot;
UNSPECIFIED | &quot;UNSPECIFIED&quot;



