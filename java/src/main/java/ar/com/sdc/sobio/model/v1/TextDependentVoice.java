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
 * TextDependentVoice
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-11T17:05:54.141-03:00")
public class TextDependentVoice {
  @JsonProperty("audio")
  private byte[] audio = null;

  @JsonProperty("phraseId")
  private Integer phraseId = null;

  @JsonProperty("template")
  private byte[] template = null;

  public TextDependentVoice audio(byte[] audio) {
    this.audio = audio;
    return this;
  }

   /**
   * Get audio
   * @return audio
  **/
  @ApiModelProperty(value = "")
  public byte[] getAudio() {
    return audio;
  }

  public void setAudio(byte[] audio) {
    this.audio = audio;
  }

  public TextDependentVoice phraseId(Integer phraseId) {
    this.phraseId = phraseId;
    return this;
  }

   /**
   * Get phraseId
   * @return phraseId
  **/
  @ApiModelProperty(value = "")
  public Integer getPhraseId() {
    return phraseId;
  }

  public void setPhraseId(Integer phraseId) {
    this.phraseId = phraseId;
  }

  public TextDependentVoice template(byte[] template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @ApiModelProperty(value = "")
  public byte[] getTemplate() {
    return template;
  }

  public void setTemplate(byte[] template) {
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
    TextDependentVoice textDependentVoice = (TextDependentVoice) o;
    return Objects.equals(this.audio, textDependentVoice.audio) &&
        Objects.equals(this.phraseId, textDependentVoice.phraseId) &&
        Objects.equals(this.template, textDependentVoice.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audio, phraseId, template);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextDependentVoice {\n");
    
    sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
    sb.append("    phraseId: ").append(toIndentedString(phraseId)).append("\n");
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

