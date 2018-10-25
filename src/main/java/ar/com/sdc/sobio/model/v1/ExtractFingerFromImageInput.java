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
import ar.com.sdc.sobio.model.v1.ParametrosExtraccionHuella;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ExtractFingerFromImageInput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-25T13:07:38.915-03:00")
public class ExtractFingerFromImageInput {
  @JsonProperty("auditToken")
  private String auditToken = null;

  @JsonProperty("image")
  private byte[] image = null;

  /**
   * Gets or Sets imageSource
   */
  public enum ImageSourceEnum {
    LIVE_FINGERPRINT("LIVE_FINGERPRINT"),
    
    SCANNED_FINGERPRINT_IMAGE("SCANNED_FINGERPRINT_IMAGE"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    ImageSourceEnum(String value) {
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
    public static ImageSourceEnum fromValue(String text) {
      for (ImageSourceEnum b : ImageSourceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("imageSource")
  private ImageSourceEnum imageSource = null;

  @JsonProperty("params")
  private ParametrosExtraccionHuella params = null;

  /**
   * Gets or Sets position
   */
  public enum PositionEnum {
    RIGHT_THUMB("RIGHT_THUMB"),
    
    LEFT_THUMB("LEFT_THUMB"),
    
    RIGHT_INDEX_FINGER("RIGHT_INDEX_FINGER"),
    
    LEFT_INDEX_FINGER("LEFT_INDEX_FINGER"),
    
    RIGHT_MIDDLE_FINGER("RIGHT_MIDDLE_FINGER"),
    
    LEFT_MIDDLE_FINGER("LEFT_MIDDLE_FINGER"),
    
    LEFT_RING_FINGER("LEFT_RING_FINGER"),
    
    RIGHT_RING_FINGER("RIGHT_RING_FINGER"),
    
    LEFT_LITTLE_FINGER("LEFT_LITTLE_FINGER"),
    
    RIGHT_LITTLE_FINGER("RIGHT_LITTLE_FINGER"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    PositionEnum(String value) {
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
    public static PositionEnum fromValue(String text) {
      for (PositionEnum b : PositionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("position")
  private PositionEnum position = null;

  public ExtractFingerFromImageInput auditToken(String auditToken) {
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

  public ExtractFingerFromImageInput image(byte[] image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(required = true, value = "")
  public byte[] getImage() {
    return image;
  }

  public void setImage(byte[] image) {
    this.image = image;
  }

  public ExtractFingerFromImageInput imageSource(ImageSourceEnum imageSource) {
    this.imageSource = imageSource;
    return this;
  }

   /**
   * Get imageSource
   * @return imageSource
  **/
  @ApiModelProperty(required = true, value = "")
  public ImageSourceEnum getImageSource() {
    return imageSource;
  }

  public void setImageSource(ImageSourceEnum imageSource) {
    this.imageSource = imageSource;
  }

  public ExtractFingerFromImageInput params(ParametrosExtraccionHuella params) {
    this.params = params;
    return this;
  }

   /**
   * Get params
   * @return params
  **/
  @ApiModelProperty(value = "")
  public ParametrosExtraccionHuella getParams() {
    return params;
  }

  public void setParams(ParametrosExtraccionHuella params) {
    this.params = params;
  }

  public ExtractFingerFromImageInput position(PositionEnum position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(required = true, value = "")
  public PositionEnum getPosition() {
    return position;
  }

  public void setPosition(PositionEnum position) {
    this.position = position;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtractFingerFromImageInput extractFingerFromImageInput = (ExtractFingerFromImageInput) o;
    return Objects.equals(this.auditToken, extractFingerFromImageInput.auditToken) &&
        Objects.equals(this.image, extractFingerFromImageInput.image) &&
        Objects.equals(this.imageSource, extractFingerFromImageInput.imageSource) &&
        Objects.equals(this.params, extractFingerFromImageInput.params) &&
        Objects.equals(this.position, extractFingerFromImageInput.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditToken, image, imageSource, params, position);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtractFingerFromImageInput {\n");
    
    sb.append("    auditToken: ").append(toIndentedString(auditToken)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageSource: ").append(toIndentedString(imageSource)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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

