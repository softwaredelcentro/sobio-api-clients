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
 * FingerPrintExtractionParameters
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-01T17:51:31.127-03:00")
public class FingerPrintExtractionParameters {
  @JsonProperty("determinePatternClass")
  private Boolean determinePatternClass = null;

  @JsonProperty("evaluateNFIQ")
  private Boolean evaluateNFIQ = null;

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

  @JsonProperty("maxRotation")
  private Float maxRotation = null;

  @JsonProperty("minQuality")
  private byte[] minQuality = null;

  /**
   * Gets or Sets position
   */
  public enum PositionEnum {
    LEFT_INDEX_FINGER("LEFT_INDEX_FINGER"),
    
    LEFT_LITTLE_FINGER("LEFT_LITTLE_FINGER"),
    
    LEFT_MIDDLE_FINGER("LEFT_MIDDLE_FINGER"),
    
    LEFT_RING_FINGER("LEFT_RING_FINGER"),
    
    LEFT_THUMB("LEFT_THUMB"),
    
    RIGHT_INDEX_FINGER("RIGHT_INDEX_FINGER"),
    
    RIGHT_LITTLE_FINGER("RIGHT_LITTLE_FINGER"),
    
    RIGHT_MIDDLE_FINGER("RIGHT_MIDDLE_FINGER"),
    
    RIGHT_RING_FINGER("RIGHT_RING_FINGER"),
    
    RIGHT_THUMB("RIGHT_THUMB"),
    
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

  @JsonProperty("useCache")
  private Boolean useCache = null;

  @JsonProperty("useOnlyAnsi378")
  private Boolean useOnlyAnsi378 = null;

  public FingerPrintExtractionParameters determinePatternClass(Boolean determinePatternClass) {
    this.determinePatternClass = determinePatternClass;
    return this;
  }

   /**
   * Get determinePatternClass
   * @return determinePatternClass
  **/
  @ApiModelProperty(value = "")
  public Boolean isDeterminePatternClass() {
    return determinePatternClass;
  }

  public void setDeterminePatternClass(Boolean determinePatternClass) {
    this.determinePatternClass = determinePatternClass;
  }

  public FingerPrintExtractionParameters evaluateNFIQ(Boolean evaluateNFIQ) {
    this.evaluateNFIQ = evaluateNFIQ;
    return this;
  }

   /**
   * Get evaluateNFIQ
   * @return evaluateNFIQ
  **/
  @ApiModelProperty(value = "")
  public Boolean isEvaluateNFIQ() {
    return evaluateNFIQ;
  }

  public void setEvaluateNFIQ(Boolean evaluateNFIQ) {
    this.evaluateNFIQ = evaluateNFIQ;
  }

  public FingerPrintExtractionParameters imageSource(ImageSourceEnum imageSource) {
    this.imageSource = imageSource;
    return this;
  }

   /**
   * Get imageSource
   * @return imageSource
  **/
  @ApiModelProperty(value = "")
  public ImageSourceEnum getImageSource() {
    return imageSource;
  }

  public void setImageSource(ImageSourceEnum imageSource) {
    this.imageSource = imageSource;
  }

  public FingerPrintExtractionParameters maxRotation(Float maxRotation) {
    this.maxRotation = maxRotation;
    return this;
  }

   /**
   * Get maxRotation
   * @return maxRotation
  **/
  @ApiModelProperty(value = "")
  public Float getMaxRotation() {
    return maxRotation;
  }

  public void setMaxRotation(Float maxRotation) {
    this.maxRotation = maxRotation;
  }

  public FingerPrintExtractionParameters minQuality(byte[] minQuality) {
    this.minQuality = minQuality;
    return this;
  }

   /**
   * Get minQuality
   * @return minQuality
  **/
  @ApiModelProperty(value = "")
  public byte[] getMinQuality() {
    return minQuality;
  }

  public void setMinQuality(byte[] minQuality) {
    this.minQuality = minQuality;
  }

  public FingerPrintExtractionParameters position(PositionEnum position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(value = "")
  public PositionEnum getPosition() {
    return position;
  }

  public void setPosition(PositionEnum position) {
    this.position = position;
  }

  public FingerPrintExtractionParameters useCache(Boolean useCache) {
    this.useCache = useCache;
    return this;
  }

   /**
   * Get useCache
   * @return useCache
  **/
  @ApiModelProperty(value = "")
  public Boolean isUseCache() {
    return useCache;
  }

  public void setUseCache(Boolean useCache) {
    this.useCache = useCache;
  }

  public FingerPrintExtractionParameters useOnlyAnsi378(Boolean useOnlyAnsi378) {
    this.useOnlyAnsi378 = useOnlyAnsi378;
    return this;
  }

   /**
   * Get useOnlyAnsi378
   * @return useOnlyAnsi378
  **/
  @ApiModelProperty(value = "")
  public Boolean isUseOnlyAnsi378() {
    return useOnlyAnsi378;
  }

  public void setUseOnlyAnsi378(Boolean useOnlyAnsi378) {
    this.useOnlyAnsi378 = useOnlyAnsi378;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FingerPrintExtractionParameters fingerPrintExtractionParameters = (FingerPrintExtractionParameters) o;
    return Objects.equals(this.determinePatternClass, fingerPrintExtractionParameters.determinePatternClass) &&
        Objects.equals(this.evaluateNFIQ, fingerPrintExtractionParameters.evaluateNFIQ) &&
        Objects.equals(this.imageSource, fingerPrintExtractionParameters.imageSource) &&
        Objects.equals(this.maxRotation, fingerPrintExtractionParameters.maxRotation) &&
        Objects.equals(this.minQuality, fingerPrintExtractionParameters.minQuality) &&
        Objects.equals(this.position, fingerPrintExtractionParameters.position) &&
        Objects.equals(this.useCache, fingerPrintExtractionParameters.useCache) &&
        Objects.equals(this.useOnlyAnsi378, fingerPrintExtractionParameters.useOnlyAnsi378);
  }

  @Override
  public int hashCode() {
    return Objects.hash(determinePatternClass, evaluateNFIQ, imageSource, maxRotation, minQuality, position, useCache, useOnlyAnsi378);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FingerPrintExtractionParameters {\n");
    
    sb.append("    determinePatternClass: ").append(toIndentedString(determinePatternClass)).append("\n");
    sb.append("    evaluateNFIQ: ").append(toIndentedString(evaluateNFIQ)).append("\n");
    sb.append("    imageSource: ").append(toIndentedString(imageSource)).append("\n");
    sb.append("    maxRotation: ").append(toIndentedString(maxRotation)).append("\n");
    sb.append("    minQuality: ").append(toIndentedString(minQuality)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    useCache: ").append(toIndentedString(useCache)).append("\n");
    sb.append("    useOnlyAnsi378: ").append(toIndentedString(useOnlyAnsi378)).append("\n");
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

