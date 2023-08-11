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
import ar.com.sdc.sobio.model.v1.TextIndependentVoice;
import ar.com.sdc.sobio.model.v1.VoiceProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ExtractTextIndependentVoiceFromAudioResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-08-11T10:34:31.644-03:00")
public class ExtractTextIndependentVoiceFromAudioResult {
  @JsonProperty("exception")
  private Boolean exception = null;

  @JsonProperty("properties")
  private VoiceProperties properties = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    OK("OK"),
    
    LOW_QUALITY("LOW_QUALITY"),
    
    VOICE_NOT_DETECTED("VOICE_NOT_DETECTED"),
    
    NOISY("NOISY"),
    
    LOW_LEVEL("LOW_LEVEL"),
    
    EXCEPTION("EXCEPTION"),
    
    TOO_SHORT("TOO_SHORT");

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

  @JsonProperty("voice")
  private TextIndependentVoice voice = null;

  public ExtractTextIndependentVoiceFromAudioResult exception(Boolean exception) {
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

  public ExtractTextIndependentVoiceFromAudioResult properties(VoiceProperties properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(value = "")
  public VoiceProperties getProperties() {
    return properties;
  }

  public void setProperties(VoiceProperties properties) {
    this.properties = properties;
  }

  public ExtractTextIndependentVoiceFromAudioResult status(StatusEnum status) {
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

  public ExtractTextIndependentVoiceFromAudioResult txId(String txId) {
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

  public ExtractTextIndependentVoiceFromAudioResult voice(TextIndependentVoice voice) {
    this.voice = voice;
    return this;
  }

   /**
   * Get voice
   * @return voice
  **/
  @ApiModelProperty(value = "")
  public TextIndependentVoice getVoice() {
    return voice;
  }

  public void setVoice(TextIndependentVoice voice) {
    this.voice = voice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtractTextIndependentVoiceFromAudioResult extractTextIndependentVoiceFromAudioResult = (ExtractTextIndependentVoiceFromAudioResult) o;
    return Objects.equals(this.exception, extractTextIndependentVoiceFromAudioResult.exception) &&
        Objects.equals(this.properties, extractTextIndependentVoiceFromAudioResult.properties) &&
        Objects.equals(this.status, extractTextIndependentVoiceFromAudioResult.status) &&
        Objects.equals(this.txId, extractTextIndependentVoiceFromAudioResult.txId) &&
        Objects.equals(this.voice, extractTextIndependentVoiceFromAudioResult.voice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exception, properties, status, txId, voice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtractTextIndependentVoiceFromAudioResult {\n");
    
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    txId: ").append(toIndentedString(txId)).append("\n");
    sb.append("    voice: ").append(toIndentedString(voice)).append("\n");
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

