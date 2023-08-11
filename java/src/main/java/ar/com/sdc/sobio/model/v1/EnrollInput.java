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
import ar.com.sdc.sobio.model.v1.BiometricData;
import ar.com.sdc.sobio.model.v1.EnrollmentParameters;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * EnrollInput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-08-11T10:34:31.644-03:00")
public class EnrollInput {
  @JsonProperty("auditToken")
  private String auditToken = null;

  @JsonProperty("bioInfo")
  private BiometricData bioInfo = null;

  @JsonProperty("params")
  private EnrollmentParameters params = null;

  @JsonProperty("subjectId")
  private String subjectId = null;

  public EnrollInput auditToken(String auditToken) {
    this.auditToken = auditToken;
    return this;
  }

   /**
   * Get auditToken
   * @return auditToken
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAuditToken() {
    return auditToken;
  }

  public void setAuditToken(String auditToken) {
    this.auditToken = auditToken;
  }

  public EnrollInput bioInfo(BiometricData bioInfo) {
    this.bioInfo = bioInfo;
    return this;
  }

   /**
   * Get bioInfo
   * @return bioInfo
  **/
  @ApiModelProperty(required = true, value = "")
  public BiometricData getBioInfo() {
    return bioInfo;
  }

  public void setBioInfo(BiometricData bioInfo) {
    this.bioInfo = bioInfo;
  }

  public EnrollInput params(EnrollmentParameters params) {
    this.params = params;
    return this;
  }

   /**
   * Get params
   * @return params
  **/
  @ApiModelProperty(value = "")
  public EnrollmentParameters getParams() {
    return params;
  }

  public void setParams(EnrollmentParameters params) {
    this.params = params;
  }

  public EnrollInput subjectId(String subjectId) {
    this.subjectId = subjectId;
    return this;
  }

   /**
   * Get subjectId
   * @return subjectId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSubjectId() {
    return subjectId;
  }

  public void setSubjectId(String subjectId) {
    this.subjectId = subjectId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnrollInput enrollInput = (EnrollInput) o;
    return Objects.equals(this.auditToken, enrollInput.auditToken) &&
        Objects.equals(this.bioInfo, enrollInput.bioInfo) &&
        Objects.equals(this.params, enrollInput.params) &&
        Objects.equals(this.subjectId, enrollInput.subjectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditToken, bioInfo, params, subjectId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnrollInput {\n");
    
    sb.append("    auditToken: ").append(toIndentedString(auditToken)).append("\n");
    sb.append("    bioInfo: ").append(toIndentedString(bioInfo)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    subjectId: ").append(toIndentedString(subjectId)).append("\n");
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

