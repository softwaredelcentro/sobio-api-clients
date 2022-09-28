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
import ar.com.sdc.sobio.model.v1.AuditData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * AuditByDateOutput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-28T10:34:31.222-03:00")
public class AuditByDateOutput {
  @JsonProperty("auditData")
  private List<AuditData> auditData = null;

  @JsonProperty("exception")
  private Boolean exception = null;

  @JsonProperty("txId")
  private String txId = null;

  public AuditByDateOutput auditData(List<AuditData> auditData) {
    this.auditData = auditData;
    return this;
  }

  public AuditByDateOutput addAuditDataItem(AuditData auditDataItem) {
    if (this.auditData == null) {
      this.auditData = new ArrayList<AuditData>();
    }
    this.auditData.add(auditDataItem);
    return this;
  }

   /**
   * Get auditData
   * @return auditData
  **/
  @ApiModelProperty(value = "")
  public List<AuditData> getAuditData() {
    return auditData;
  }

  public void setAuditData(List<AuditData> auditData) {
    this.auditData = auditData;
  }

  public AuditByDateOutput exception(Boolean exception) {
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

  public AuditByDateOutput txId(String txId) {
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
    AuditByDateOutput auditByDateOutput = (AuditByDateOutput) o;
    return Objects.equals(this.auditData, auditByDateOutput.auditData) &&
        Objects.equals(this.exception, auditByDateOutput.exception) &&
        Objects.equals(this.txId, auditByDateOutput.txId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditData, exception, txId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditByDateOutput {\n");
    
    sb.append("    auditData: ").append(toIndentedString(auditData)).append("\n");
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
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

