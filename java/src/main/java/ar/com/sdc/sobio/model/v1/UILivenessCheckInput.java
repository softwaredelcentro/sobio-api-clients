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
 * UILivenessCheckInput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-08-11T10:24:49.696-03:00")
public class UILivenessCheckInput {
  @JsonProperty("auditToken")
  private String auditToken = null;

  /**
   * Gets or Sets checkLivenessMode
   */
  public enum CheckLivenessModeEnum {
    PASSIVE("PASSIVE"),
    
    ACTIVE("ACTIVE"),
    
    SIMPLE("SIMPLE"),
    
    BLINK("BLINK"),
    
    CUSTOM("CUSTOM");

    private String value;

    CheckLivenessModeEnum(String value) {
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
    public static CheckLivenessModeEnum fromValue(String text) {
      for (CheckLivenessModeEnum b : CheckLivenessModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("checkLivenessMode")
  private CheckLivenessModeEnum checkLivenessMode = null;

  /**
   * Gets or Sets checkLivnessLevel
   */
  public enum CheckLivnessLevelEnum {
    LOW("LOW"),
    
    MEDIUM("MEDIUM"),
    
    HIGH("HIGH");

    private String value;

    CheckLivnessLevelEnum(String value) {
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
    public static CheckLivnessLevelEnum fromValue(String text) {
      for (CheckLivnessLevelEnum b : CheckLivnessLevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("checkLivnessLevel")
  private CheckLivnessLevelEnum checkLivnessLevel = null;

  @JsonProperty("checkLivnessTryLowerLevel")
  private Boolean checkLivnessTryLowerLevel = null;

  @JsonProperty("uiTemplate")
  private String uiTemplate = null;

  public UILivenessCheckInput auditToken(String auditToken) {
    this.auditToken = auditToken;
    return this;
  }

   /**
   * Get auditToken
   * @return auditToken
  **/
  @ApiModelProperty(value = "")
  public String getAuditToken() {
    return auditToken;
  }

  public void setAuditToken(String auditToken) {
    this.auditToken = auditToken;
  }

  public UILivenessCheckInput checkLivenessMode(CheckLivenessModeEnum checkLivenessMode) {
    this.checkLivenessMode = checkLivenessMode;
    return this;
  }

   /**
   * Get checkLivenessMode
   * @return checkLivenessMode
  **/
  @ApiModelProperty(required = true, value = "")
  public CheckLivenessModeEnum getCheckLivenessMode() {
    return checkLivenessMode;
  }

  public void setCheckLivenessMode(CheckLivenessModeEnum checkLivenessMode) {
    this.checkLivenessMode = checkLivenessMode;
  }

  public UILivenessCheckInput checkLivnessLevel(CheckLivnessLevelEnum checkLivnessLevel) {
    this.checkLivnessLevel = checkLivnessLevel;
    return this;
  }

   /**
   * Get checkLivnessLevel
   * @return checkLivnessLevel
  **/
  @ApiModelProperty(required = true, value = "")
  public CheckLivnessLevelEnum getCheckLivnessLevel() {
    return checkLivnessLevel;
  }

  public void setCheckLivnessLevel(CheckLivnessLevelEnum checkLivnessLevel) {
    this.checkLivnessLevel = checkLivnessLevel;
  }

  public UILivenessCheckInput checkLivnessTryLowerLevel(Boolean checkLivnessTryLowerLevel) {
    this.checkLivnessTryLowerLevel = checkLivnessTryLowerLevel;
    return this;
  }

   /**
   * Get checkLivnessTryLowerLevel
   * @return checkLivnessTryLowerLevel
  **/
  @ApiModelProperty(value = "")
  public Boolean isCheckLivnessTryLowerLevel() {
    return checkLivnessTryLowerLevel;
  }

  public void setCheckLivnessTryLowerLevel(Boolean checkLivnessTryLowerLevel) {
    this.checkLivnessTryLowerLevel = checkLivnessTryLowerLevel;
  }

  public UILivenessCheckInput uiTemplate(String uiTemplate) {
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
    UILivenessCheckInput uiLivenessCheckInput = (UILivenessCheckInput) o;
    return Objects.equals(this.auditToken, uiLivenessCheckInput.auditToken) &&
        Objects.equals(this.checkLivenessMode, uiLivenessCheckInput.checkLivenessMode) &&
        Objects.equals(this.checkLivnessLevel, uiLivenessCheckInput.checkLivnessLevel) &&
        Objects.equals(this.checkLivnessTryLowerLevel, uiLivenessCheckInput.checkLivnessTryLowerLevel) &&
        Objects.equals(this.uiTemplate, uiLivenessCheckInput.uiTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditToken, checkLivenessMode, checkLivnessLevel, checkLivnessTryLowerLevel, uiTemplate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UILivenessCheckInput {\n");
    
    sb.append("    auditToken: ").append(toIndentedString(auditToken)).append("\n");
    sb.append("    checkLivenessMode: ").append(toIndentedString(checkLivenessMode)).append("\n");
    sb.append("    checkLivnessLevel: ").append(toIndentedString(checkLivnessLevel)).append("\n");
    sb.append("    checkLivnessTryLowerLevel: ").append(toIndentedString(checkLivnessTryLowerLevel)).append("\n");
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

