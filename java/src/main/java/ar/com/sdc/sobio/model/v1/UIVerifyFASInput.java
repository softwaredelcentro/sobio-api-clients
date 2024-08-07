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
import ar.com.sdc.sobio.model.v1.UIVerifyFASParameters;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UIVerifyFASInput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:48:09.641-03:00")
public class UIVerifyFASInput {
  @JsonProperty("auditToken")
  private String auditToken = null;

  @JsonProperty("image")
  private byte[] image = null;

  @JsonProperty("params")
  private UIVerifyFASParameters params = null;

  @JsonProperty("uiTemplate")
  private String uiTemplate = null;

  public UIVerifyFASInput auditToken(String auditToken) {
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

  public UIVerifyFASInput image(byte[] image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(value = "")
  public byte[] getImage() {
    return image;
  }

  public void setImage(byte[] image) {
    this.image = image;
  }

  public UIVerifyFASInput params(UIVerifyFASParameters params) {
    this.params = params;
    return this;
  }

   /**
   * Get params
   * @return params
  **/
  @ApiModelProperty(value = "")
  public UIVerifyFASParameters getParams() {
    return params;
  }

  public void setParams(UIVerifyFASParameters params) {
    this.params = params;
  }

  public UIVerifyFASInput uiTemplate(String uiTemplate) {
    this.uiTemplate = uiTemplate;
    return this;
  }

   /**
   * Get uiTemplate
   * @return uiTemplate
  **/
  @ApiModelProperty(required = true, value = "")
  public String getUiTemplate() {
    return uiTemplate;
  }

  public void setUiTemplate(String uiTemplate) {
    this.uiTemplate = uiTemplate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UIVerifyFASInput uiVerifyFASInput = (UIVerifyFASInput) o;
    return Objects.equals(this.auditToken, uiVerifyFASInput.auditToken) &&
        Objects.equals(this.image, uiVerifyFASInput.image) &&
        Objects.equals(this.params, uiVerifyFASInput.params) &&
        Objects.equals(this.uiTemplate, uiVerifyFASInput.uiTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditToken, image, params, uiTemplate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UIVerifyFASInput {\n");
    
    sb.append("    auditToken: ").append(toIndentedString(auditToken)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    uiTemplate: ").append(toIndentedString(uiTemplate)).append("\n");
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

