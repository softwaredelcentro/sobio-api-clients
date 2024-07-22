
# AuditDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**DateTime**](DateTime.md) |  |  [optional]
**detail** | **String** |  |  [optional]
**duration** | **Long** |  |  [optional]
**info1** | **byte[]** |  |  [optional]
**info2** | **byte[]** |  |  [optional]
**parameters** | **String** |  |  [optional]
**result** | **String** |  |  [optional]
**subjectId** | **String** |  |  [optional]
**token** | **String** |  |  [optional]
**txId** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ENROLAMIENTO | &quot;ENROLAMIENTO&quot;
VERIFICACION | &quot;VERIFICACION&quot;
IDENTIFICACION | &quot;IDENTIFICACION&quot;
BUSQUEDA_DUPLICADOS | &quot;BUSQUEDA_DUPLICADOS&quot;
BORRADO | &quot;BORRADO&quot;
ACTUALIZACION | &quot;ACTUALIZACION&quot;
EXTRACCION_ROSTRO | &quot;EXTRACCION_ROSTRO&quot;
EXTRACCION_TEMPLATE | &quot;EXTRACCION_TEMPLATE&quot;
OBTENER_TEMPLATE | &quot;OBTENER_TEMPLATE&quot;
ENROLAMIENTO_BATCH | &quot;ENROLAMIENTO_BATCH&quot;
EXTRACCION_HUELLA | &quot;EXTRACCION_HUELLA&quot;
EXTRACCION_VOZ | &quot;EXTRACCION_VOZ&quot;
VERIFICAR_T2T | &quot;VERIFICAR_T2T&quot;
OBTENER_INFORMACION_SUJETO | &quot;OBTENER_INFORMACION_SUJETO&quot;
EXTRACT_DOCUMENT_INFO | &quot;EXTRACT_DOCUMENT_INFO&quot;
LOGGING_API_REQUEST_RESPONSE | &quot;LOGGING_API_REQUEST_RESPONSE&quot;
UI_COMPONENT_ENROLL | &quot;UI_COMPONENT_ENROLL&quot;
UI_COMPONENT_VERIFY | &quot;UI_COMPONENT_VERIFY&quot;
UI_COMPONENT_IDENTIFY | &quot;UI_COMPONENT_IDENTIFY&quot;
UI_EXTRACT_DOCUMENT_INFO | &quot;UI_EXTRACT_DOCUMENT_INFO&quot;
UI_COMPONENT_EXTRACT_DOCUMENT_INFO | &quot;UI_COMPONENT_EXTRACT_DOCUMENT_INFO&quot;
UI_COMPONENT_EXTRACCION_ROSTRO | &quot;UI_COMPONENT_EXTRACCION_ROSTRO&quot;
UI_LIVENESS_CHECK | &quot;UI_LIVENESS_CHECK&quot;



