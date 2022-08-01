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
import ar.com.sdc.sobio.model.v1.Emotion;
import ar.com.sdc.sobio.model.v1.Expresion;
import ar.com.sdc.sobio.model.v1.Gender;
import ar.com.sdc.sobio.model.v1.Position;
import ar.com.sdc.sobio.model.v1.Traits;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * FaceProperties
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-01T17:51:31.127-03:00")
public class FaceProperties {
  @JsonProperty("age")
  private Integer age = null;

  @JsonProperty("clahe")
  private Integer clahe = null;

  @JsonProperty("confidence")
  private byte[] confidence = null;

  @JsonProperty("emotion")
  private Emotion emotion = null;

  @JsonProperty("expression")
  private Expresion expression = null;

  @JsonProperty("gender")
  private Gender gender = null;

  @JsonProperty("position")
  private Position position = null;

  @JsonProperty("thumbnail")
  private byte[] thumbnail = null;

  @JsonProperty("traits")
  private Traits traits = null;

  public FaceProperties age(Integer age) {
    this.age = age;
    return this;
  }

   /**
   * Get age
   * @return age
  **/
  @ApiModelProperty(value = "")
  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public FaceProperties clahe(Integer clahe) {
    this.clahe = clahe;
    return this;
  }

   /**
   * Get clahe
   * @return clahe
  **/
  @ApiModelProperty(value = "")
  public Integer getClahe() {
    return clahe;
  }

  public void setClahe(Integer clahe) {
    this.clahe = clahe;
  }

  public FaceProperties confidence(byte[] confidence) {
    this.confidence = confidence;
    return this;
  }

   /**
   * Get confidence
   * @return confidence
  **/
  @ApiModelProperty(value = "")
  public byte[] getConfidence() {
    return confidence;
  }

  public void setConfidence(byte[] confidence) {
    this.confidence = confidence;
  }

  public FaceProperties emotion(Emotion emotion) {
    this.emotion = emotion;
    return this;
  }

   /**
   * Get emotion
   * @return emotion
  **/
  @ApiModelProperty(value = "")
  public Emotion getEmotion() {
    return emotion;
  }

  public void setEmotion(Emotion emotion) {
    this.emotion = emotion;
  }

  public FaceProperties expression(Expresion expression) {
    this.expression = expression;
    return this;
  }

   /**
   * Get expression
   * @return expression
  **/
  @ApiModelProperty(value = "")
  public Expresion getExpression() {
    return expression;
  }

  public void setExpression(Expresion expression) {
    this.expression = expression;
  }

  public FaceProperties gender(Gender gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(value = "")
  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public FaceProperties position(Position position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(value = "")
  public Position getPosition() {
    return position;
  }

  public void setPosition(Position position) {
    this.position = position;
  }

  public FaceProperties thumbnail(byte[] thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

   /**
   * Get thumbnail
   * @return thumbnail
  **/
  @ApiModelProperty(value = "")
  public byte[] getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(byte[] thumbnail) {
    this.thumbnail = thumbnail;
  }

  public FaceProperties traits(Traits traits) {
    this.traits = traits;
    return this;
  }

   /**
   * Get traits
   * @return traits
  **/
  @ApiModelProperty(value = "")
  public Traits getTraits() {
    return traits;
  }

  public void setTraits(Traits traits) {
    this.traits = traits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaceProperties faceProperties = (FaceProperties) o;
    return Objects.equals(this.age, faceProperties.age) &&
        Objects.equals(this.clahe, faceProperties.clahe) &&
        Objects.equals(this.confidence, faceProperties.confidence) &&
        Objects.equals(this.emotion, faceProperties.emotion) &&
        Objects.equals(this.expression, faceProperties.expression) &&
        Objects.equals(this.gender, faceProperties.gender) &&
        Objects.equals(this.position, faceProperties.position) &&
        Objects.equals(this.thumbnail, faceProperties.thumbnail) &&
        Objects.equals(this.traits, faceProperties.traits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, clahe, confidence, emotion, expression, gender, position, thumbnail, traits);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaceProperties {\n");
    
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    clahe: ").append(toIndentedString(clahe)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    emotion: ").append(toIndentedString(emotion)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    traits: ").append(toIndentedString(traits)).append("\n");
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

