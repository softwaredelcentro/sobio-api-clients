/*
 * SOBIO
 * SOBIO Biometric Services
 *
 * OpenAPI spec version: 1
 * Contact: info@softwaredelcentro.com.ar
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ar.com.sdc.sobio.model.v1;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * AuditDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-08-11T10:24:49.696-03:00")
public class AuditDetail {
  @JsonProperty("date")
  private DateTime date = null;

  @JsonProperty("detail")
  private String detail = null;

  @JsonProperty("duration")
  private Long duration = null;

  @JsonProperty("info1")
  private byte[] info1 = null;

  @JsonProperty("info2")
  private byte[] info2 = null;

  @JsonProperty("parameters")
  private String parameters = null;

  @JsonProperty("result")
  private String result = null;

  @JsonProperty("subjectId")
  private String subjectId = null;

  @JsonProperty("token")
  private String token = null;

  @JsonProperty("txId")
  private String txId = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    ENROLAMIENTO("ENROLAMIENTO"),
    
    VERIFICACION("VERIFICACION"),
    
    IDENTIFICACION("IDENTIFICACION"),
    
    BUSQUEDA_DUPLICADOS("BUSQUEDA_DUPLICADOS"),
    
    BORRADO("BORRADO"),
    
    ACTUALIZACION("ACTUALIZACION"),
    
    EXTRACCION_ROSTRO("EXTRACCION_ROSTRO"),
    
    EXTRACCION_TEMPLATE("EXTRACCION_TEMPLATE"),
    
    OBTENER_TEMPLATE("OBTENER_TEMPLATE"),
    
    ENROLAMIENTO_BATCH("ENROLAMIENTO_BATCH"),
    
    EXTRACCION_HUELLA("EXTRACCION_HUELLA"),
    
    EXTRACCION_VOZ("EXTRACCION_VOZ"),
    
    VERIFICAR_T2T("VERIFICAR_T2T"),
    
    OBTENER_INFORMACION_SUJETO("OBTENER_INFORMACION_SUJETO"),
    
    EXTRACT_DOCUMENT_INFO("EXTRACT_DOCUMENT_INFO"),
    
    LOGGING_API_REQUEST_RESPONSE("LOGGING_API_REQUEST_RESPONSE"),
    
    UI_COMPONENT_ENROLL("UI_COMPONENT_ENROLL"),
    
    UI_COMPONENT_VERIFY("UI_COMPONENT_VERIFY"),
    
    UI_COMPONENT_IDENTIFY("UI_COMPONENT_IDENTIFY"),
    
    UI_EXTRACT_DOCUMENT_INFO("UI_EXTRACT_DOCUMENT_INFO"),
    
    UI_COMPONENT_EXTRACT_DOCUMENT_INFO("UI_COMPONENT_EXTRACT_DOCUMENT_INFO"),
    
    UI_LIVENESS_CHECK("UI_LIVENESS_CHECK");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  public AuditDetail date(DateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")
  public DateTime getDate() {
    return date;
  }

  public void setDate(DateTime date) {
    this.date = date;
  }

  public AuditDetail detail(String detail) {
    this.detail = detail;
    return this;
  }

   /**
   * Get detail
   * @return detail
  **/
  @ApiModelProperty(value = "")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public AuditDetail duration(Long duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @ApiModelProperty(value = "")
  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public AuditDetail info1(byte[] info1) {
    this.info1 = info1;
    return this;
  }

   /**
   * Get info1
   * @return info1
  **/
  @ApiModelProperty(value = "")
  public byte[] getInfo1() {
    return info1;
  }

  public void setInfo1(byte[] info1) {
    this.info1 = info1;
  }

  public AuditDetail info2(byte[] info2) {
    this.info2 = info2;
    return this;
  }

   /**
   * Get info2
   * @return info2
  **/
  @ApiModelProperty(value = "")
  public byte[] getInfo2() {
    return info2;
  }

  public void setInfo2(byte[] info2) {
    this.info2 = info2;
  }

  public AuditDetail parameters(String parameters) {
    this.parameters = parameters;
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @ApiModelProperty(value = "")
  public String getParameters() {
    return parameters;
  }

  public void setParameters(String parameters) {
    this.parameters = parameters;
  }

  public AuditDetail result(String result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public AuditDetail subjectId(String subjectId) {
    this.subjectId = subjectId;
    return this;
  }

   /**
   * Get subjectId
   * @return subjectId
  **/
  @ApiModelProperty(value = "")
  public String getSubjectId() {
    return subjectId;
  }

  public void setSubjectId(String subjectId) {
    this.subjectId = subjectId;
  }

  public AuditDetail token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(value = "")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public AuditDetail txId(String txId) {
    this.txId = txId;
    return this;
  }

   /**
   * Get txId
   * @return txId
  **/
  @ApiModelProperty(value = "")
  public String getTxId() {
    return txId;
  }

  public void setTxId(String txId) {
    this.txId = txId;
  }

  public AuditDetail type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditDetail auditDetail = (AuditDetail) o;
    return Objects.equals(this.date, auditDetail.date) &&
        Objects.equals(this.detail, auditDetail.detail) &&
        Objects.equals(this.duration, auditDetail.duration) &&
        Objects.equals(this.info1, auditDetail.info1) &&
        Objects.equals(this.info2, auditDetail.info2) &&
        Objects.equals(this.parameters, auditDetail.parameters) &&
        Objects.equals(this.result, auditDetail.result) &&
        Objects.equals(this.subjectId, auditDetail.subjectId) &&
        Objects.equals(this.token, auditDetail.token) &&
        Objects.equals(this.txId, auditDetail.txId) &&
        Objects.equals(this.type, auditDetail.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, detail, duration, info1, info2, parameters, result, subjectId, token, txId, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditDetail {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    info1: ").append(toIndentedString(info1)).append("\n");
    sb.append("    info2: ").append(toIndentedString(info2)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    subjectId: ").append(toIndentedString(subjectId)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    txId: ").append(toIndentedString(txId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

