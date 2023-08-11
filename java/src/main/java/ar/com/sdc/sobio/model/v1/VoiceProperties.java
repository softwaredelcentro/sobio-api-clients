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
 * VoiceProperties
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-08-11T10:24:49.696-03:00")
public class VoiceProperties {
  @JsonProperty("level")
  private Double level = null;

  @JsonProperty("quality")
  private Integer quality = null;

  @JsonProperty("signalToNoiseRatio")
  private Integer signalToNoiseRatio = null;

  public VoiceProperties level(Double level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @ApiModelProperty(value = "")
  public Double getLevel() {
    return level;
  }

  public void setLevel(Double level) {
    this.level = level;
  }

  public VoiceProperties quality(Integer quality) {
    this.quality = quality;
    return this;
  }

   /**
   * Get quality
   * @return quality
  **/
  @ApiModelProperty(value = "")
  public Integer getQuality() {
    return quality;
  }

  public void setQuality(Integer quality) {
    this.quality = quality;
  }

  public VoiceProperties signalToNoiseRatio(Integer signalToNoiseRatio) {
    this.signalToNoiseRatio = signalToNoiseRatio;
    return this;
  }

   /**
   * Get signalToNoiseRatio
   * @return signalToNoiseRatio
  **/
  @ApiModelProperty(value = "")
  public Integer getSignalToNoiseRatio() {
    return signalToNoiseRatio;
  }

  public void setSignalToNoiseRatio(Integer signalToNoiseRatio) {
    this.signalToNoiseRatio = signalToNoiseRatio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoiceProperties voiceProperties = (VoiceProperties) o;
    return Objects.equals(this.level, voiceProperties.level) &&
        Objects.equals(this.quality, voiceProperties.quality) &&
        Objects.equals(this.signalToNoiseRatio, voiceProperties.signalToNoiseRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, quality, signalToNoiseRatio);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoiceProperties {\n");
    
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    signalToNoiseRatio: ").append(toIndentedString(signalToNoiseRatio)).append("\n");
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

