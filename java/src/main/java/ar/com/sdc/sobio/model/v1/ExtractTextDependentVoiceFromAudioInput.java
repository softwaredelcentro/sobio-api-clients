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
import ar.com.sdc.sobio.model.v1.TextDependentVoiceExtractionParameters;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ExtractTextDependentVoiceFromAudioInput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-11T17:07:14.771-03:00")
public class ExtractTextDependentVoiceFromAudioInput {
  @JsonProperty("audio")
  private byte[] audio = null;

  @JsonProperty("auditToken")
  private String auditToken = null;

  @JsonProperty("params")
  private TextDependentVoiceExtractionParameters params = null;

  @JsonProperty("phraseId")
  private Integer phraseId = null;

  public ExtractTextDependentVoiceFromAudioInput audio(byte[] audio) {
    this.audio = audio;
    return this;
  }

   /**
   * Get audio
   * @return audio
  **/
  @ApiModelProperty(required = true, value = "")
  public byte[] getAudio() {
    return audio;
  }

  public void setAudio(byte[] audio) {
    this.audio = audio;
  }

  public ExtractTextDependentVoiceFromAudioInput auditToken(String auditToken) {
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

  public ExtractTextDependentVoiceFromAudioInput params(TextDependentVoiceExtractionParameters params) {
    this.params = params;
    return this;
  }

   /**
   * Get params
   * @return params
  **/
  @ApiModelProperty(value = "")
  public TextDependentVoiceExtractionParameters getParams() {
    return params;
  }

  public void setParams(TextDependentVoiceExtractionParameters params) {
    this.params = params;
  }

  public ExtractTextDependentVoiceFromAudioInput phraseId(Integer phraseId) {
    this.phraseId = phraseId;
    return this;
  }

   /**
   * Get phraseId
   * @return phraseId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getPhraseId() {
    return phraseId;
  }

  public void setPhraseId(Integer phraseId) {
    this.phraseId = phraseId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtractTextDependentVoiceFromAudioInput extractTextDependentVoiceFromAudioInput = (ExtractTextDependentVoiceFromAudioInput) o;
    return Objects.equals(this.audio, extractTextDependentVoiceFromAudioInput.audio) &&
        Objects.equals(this.auditToken, extractTextDependentVoiceFromAudioInput.auditToken) &&
        Objects.equals(this.params, extractTextDependentVoiceFromAudioInput.params) &&
        Objects.equals(this.phraseId, extractTextDependentVoiceFromAudioInput.phraseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audio, auditToken, params, phraseId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtractTextDependentVoiceFromAudioInput {\n");
    
    sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
    sb.append("    auditToken: ").append(toIndentedString(auditToken)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    phraseId: ").append(toIndentedString(phraseId)).append("\n");
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

