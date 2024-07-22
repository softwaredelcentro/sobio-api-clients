/*
 * BIOMIX
 * BIOMIX Biometric Services
 *
 * OpenAPI spec version: 1
 * Contact: soporte@securbase.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ar.com.sdc.sobio.model.v1;

import java.util.Objects;
import ar.com.sdc.sobio.model.v1.VerificationParameters;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UIVerifyInput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:48:09.641-03:00")
public class UIVerifyInput {
  @JsonProperty("auditToken")
  private String auditToken = null;

  @JsonProperty("params")
  private VerificationParameters params = null;

  @JsonProperty("subjectId")
  private String subjectId = null;

  @JsonProperty("template")
  private String template = null;

  public UIVerifyInput auditToken(String auditToken) {
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

  public UIVerifyInput params(VerificationParameters params) {
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

  public UIVerifyInput subjectId(String subjectId) {
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

  public UIVerifyInput template(String template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UIVerifyInput uiVerifyInput = (UIVerifyInput) o;
    return Objects.equals(this.auditToken, uiVerifyInput.auditToken) &&
        Objects.equals(this.params, uiVerifyInput.params) &&
        Objects.equals(this.subjectId, uiVerifyInput.subjectId) &&
        Objects.equals(this.template, uiVerifyInput.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditToken, params, subjectId, template);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UIVerifyInput {\n");
    
    sb.append("    auditToken: ").append(toIndentedString(auditToken)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    subjectId: ").append(toIndentedString(subjectId)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

