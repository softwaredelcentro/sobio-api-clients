
# DocumentInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **String** |  |  [optional]
**addressConfidence** | **Integer** |  |  [optional]
**code1** | **String** |  |  [optional]
**code2** | **String** |  |  [optional]
**dateOfBirth** | [**DocumentDate**](DocumentDate.md) |  |  [optional]
**documentNumber** | **String** |  |  [optional]
**documentType** | [**DocumentTypeEnum**](#DocumentTypeEnum) |  |  [optional]
**documentVersion** | [**DocumentVersionEnum**](#DocumentVersionEnum) |  |  [optional]
**expirationDate** | [**DocumentDate**](DocumentDate.md) |  |  [optional]
**face** | [**Face**](Face.md) |  |  [optional]
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
PASSPORT | &quot;PASSPORT&quot;
TYPE_I | &quot;TYPE_I&quot;
TYPE_A | &quot;TYPE_A&quot;
CREWMEMBER | &quot;CREWMEMBER&quot;
TYPE_C | &quot;TYPE_C&quot;
VISA | &quot;VISA&quot;
MIGRANT | &quot;MIGRANT&quot;
UNKNOWN | &quot;UNKNOWN&quot;


<a name="DocumentVersionEnum"></a>
## Enum: DocumentVersionEnum
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
ARGENTINA_ID_V1 | &quot;ARGENTINA_ID_V1&quot;
ARGENTINA_ID_V2 | &quot;ARGENTINA_ID_V2&quot;


<a name="SexEnum"></a>
## Enum: SexEnum
Name | Value
---- | -----
MALE | &quot;MALE&quot;
FEMALE | &quot;FEMALE&quot;
UNSPECIFIED | &quot;UNSPECIFIED&quot;



