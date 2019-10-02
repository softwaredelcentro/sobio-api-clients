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
import ar.com.sdc.sobio.model.v1.Face;
import ar.com.sdc.sobio.model.v1.FaceProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ExtractedFace
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-02T11:05:26.582-03:00")
public class ExtractedFace {
  @JsonProperty("face")
  private Face face = null;

  @JsonProperty("properties")
  private FaceProperties properties = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    OK("OK"),
    
    BAD_ILLUMINATION("BAD_ILLUMINATION"),
    
    FACE_NOT_DETECTED("FACE_NOT_DETECTED");

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

  public ExtractedFace face(Face face) {
    this.face = face;
    return this;
  }

   /**
   * Get face
   * @return face
  **/
  @ApiModelProperty(value = "")
  public Face getFace() {
    return face;
  }

  public void setFace(Face face) {
    this.face = face;
  }

  public ExtractedFace properties(FaceProperties properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(value = "")
  public FaceProperties getProperties() {
    return properties;
  }

  public void setProperties(FaceProperties properties) {
    this.properties = properties;
  }

  public ExtractedFace status(StatusEnum status) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtractedFace extractedFace = (ExtractedFace) o;
    return Objects.equals(this.face, extractedFace.face) &&
        Objects.equals(this.properties, extractedFace.properties) &&
        Objects.equals(this.status, extractedFace.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(face, properties, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtractedFace {\n");
    
    sb.append("    face: ").append(toIndentedString(face)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

