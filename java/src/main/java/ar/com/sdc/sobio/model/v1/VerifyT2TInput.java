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
import ar.com.sdc.sobio.model.v1.VerificationParameters;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * VerifyT2TInput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-28T10:34:31.222-03:00")
public class VerifyT2TInput {
  @JsonProperty("auditToken")
  private String auditToken = null;

  @JsonProperty("bioInfo1")
  private BiometricData bioInfo1 = null;

  @JsonProperty("bioInfo2")
  private BiometricData bioInfo2 = null;

  @JsonProperty("params")
  private VerificationParameters params = null;

  public VerifyT2TInput auditToken(String auditToken) {
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

  public VerifyT2TInput bioInfo1(BiometricData bioInfo1) {
    this.bioInfo1 = bioInfo1;
    return this;
  }

   /**
   * Get bioInfo1
   * @return bioInfo1
  **/
  @ApiModelProperty(required = true, value = "")
  public BiometricData getBioInfo1() {
    return bioInfo1;
  }

  public void setBioInfo1(BiometricData bioInfo1) {
    this.bioInfo1 = bioInfo1;
  }

  public VerifyT2TInput bioInfo2(BiometricData bioInfo2) {
    this.bioInfo2 = bioInfo2;
    return this;
  }

   /**
   * Get bioInfo2
   * @return bioInfo2
  **/
  @ApiModelProperty(required = true, value = "")
  public BiometricData getBioInfo2() {
    return bioInfo2;
  }

  public void setBioInfo2(BiometricData bioInfo2) {
    this.bioInfo2 = bioInfo2;
  }

  public VerifyT2TInput params(VerificationParameters params) {
    this.params = params;
    return this;
  }

   /**
   * Get params
   * @return params
  **/
  @ApiModelProperty(value = "")
  public VerificationParameters getParams() {
    return params;
  }

  public void setParams(VerificationParameters params) {
    this.params = params;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyT2TInput verifyT2TInput = (VerifyT2TInput) o;
    return Objects.equals(this.auditToken, verifyT2TInput.auditToken) &&
        Objects.equals(this.bioInfo1, verifyT2TInput.bioInfo1) &&
        Objects.equals(this.bioInfo2, verifyT2TInput.bioInfo2) &&
        Objects.equals(this.params, verifyT2TInput.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditToken, bioInfo1, bioInfo2, params);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyT2TInput {\n");
    
    sb.append("    auditToken: ").append(toIndentedString(auditToken)).append("\n");
    sb.append("    bioInfo1: ").append(toIndentedString(bioInfo1)).append("\n");
    sb.append("    bioInfo2: ").append(toIndentedString(bioInfo2)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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

