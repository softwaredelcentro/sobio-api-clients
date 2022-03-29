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

/**
 * UIEnrollOutput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-29T11:50:58.997-03:00")
public class UIEnrollOutput {
  @JsonProperty("duplicatedSubjectId")
  private String duplicatedSubjectId = null;

  @JsonProperty("exception")
  private Boolean exception = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    SUCCESS("SUCCESS"),
    
    DUPLICATED_TEMPLATE("DUPLICATED_TEMPLATE"),
    
    DUPLICATED_SUBJECT_ID("DUPLICATED_SUBJECT_ID"),
    
    BAD_TEMPLATE("BAD_TEMPLATE"),
    
    INTRATEMPLATE_FACE_MISMATCH("INTRATEMPLATE_FACE_MISMATCH");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("txId")
  private String txId = null;

  public UIEnrollOutput duplicatedSubjectId(String duplicatedSubjectId) {
    this.duplicatedSubjectId = duplicatedSubjectId;
    return this;
  }

   /**
   * Get duplicatedSubjectId
   * @return duplicatedSubjectId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDuplicatedSubjectId() {
    return duplicatedSubjectId;
  }

  public void setDuplicatedSubjectId(String duplicatedSubjectId) {
    this.duplicatedSubjectId = duplicatedSubjectId;
  }

  public UIEnrollOutput exception(Boolean exception) {
    this.exception = exception;
    return this;
  }

   /**
   * Get exception
   * @return exception
  **/
  @ApiModelProperty(value = "")
  public Boolean isException() {
    return exception;
  }

  public void setException(Boolean exception) {
    this.exception = exception;
  }

  public UIEnrollOutput status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public UIEnrollOutput txId(String txId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UIEnrollOutput uiEnrollOutput = (UIEnrollOutput) o;
    return Objects.equals(this.duplicatedSubjectId, uiEnrollOutput.duplicatedSubjectId) &&
        Objects.equals(this.exception, uiEnrollOutput.exception) &&
        Objects.equals(this.status, uiEnrollOutput.status) &&
        Objects.equals(this.txId, uiEnrollOutput.txId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duplicatedSubjectId, exception, status, txId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UIEnrollOutput {\n");
    
    sb.append("    duplicatedSubjectId: ").append(toIndentedString(duplicatedSubjectId)).append("\n");
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    txId: ").append(toIndentedString(txId)).append("\n");
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

