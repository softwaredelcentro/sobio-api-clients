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
import ar.com.sdc.sobio.model.v1.CompositeFingerPrint;
import ar.com.sdc.sobio.model.v1.Face;
import ar.com.sdc.sobio.model.v1.FingerPrint;
import ar.com.sdc.sobio.model.v1.TextDependentVoice;
import ar.com.sdc.sobio.model.v1.TextIndependentVoice;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * BiometricData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-11T17:05:54.141-03:00")
public class BiometricData {
  @JsonProperty("compositeFingerPrints")
  private List<CompositeFingerPrint> compositeFingerPrints = null;

  @JsonProperty("faces")
  private List<Face> faces = null;

  @JsonProperty("fingerPrints")
  private List<FingerPrint> fingerPrints = null;

  @JsonProperty("textDependentVoices")
  private List<TextDependentVoice> textDependentVoices = null;

  @JsonProperty("textIndependentVoice")
  private TextIndependentVoice textIndependentVoice = null;

  public BiometricData compositeFingerPrints(List<CompositeFingerPrint> compositeFingerPrints) {
    this.compositeFingerPrints = compositeFingerPrints;
    return this;
  }

  public BiometricData addCompositeFingerPrintsItem(CompositeFingerPrint compositeFingerPrintsItem) {
    if (this.compositeFingerPrints == null) {
      this.compositeFingerPrints = new ArrayList<CompositeFingerPrint>();
    }
    this.compositeFingerPrints.add(compositeFingerPrintsItem);
    return this;
  }

   /**
   * Get compositeFingerPrints
   * @return compositeFingerPrints
  **/
  @ApiModelProperty(value = "")
  public List<CompositeFingerPrint> getCompositeFingerPrints() {
    return compositeFingerPrints;
  }

  public void setCompositeFingerPrints(List<CompositeFingerPrint> compositeFingerPrints) {
    this.compositeFingerPrints = compositeFingerPrints;
  }

  public BiometricData faces(List<Face> faces) {
    this.faces = faces;
    return this;
  }

  public BiometricData addFacesItem(Face facesItem) {
    if (this.faces == null) {
      this.faces = new ArrayList<Face>();
    }
    this.faces.add(facesItem);
    return this;
  }

   /**
   * Get faces
   * @return faces
  **/
  @ApiModelProperty(value = "")
  public List<Face> getFaces() {
    return faces;
  }

  public void setFaces(List<Face> faces) {
    this.faces = faces;
  }

  public BiometricData fingerPrints(List<FingerPrint> fingerPrints) {
    this.fingerPrints = fingerPrints;
    return this;
  }

  public BiometricData addFingerPrintsItem(FingerPrint fingerPrintsItem) {
    if (this.fingerPrints == null) {
      this.fingerPrints = new ArrayList<FingerPrint>();
    }
    this.fingerPrints.add(fingerPrintsItem);
    return this;
  }

   /**
   * Get fingerPrints
   * @return fingerPrints
  **/
  @ApiModelProperty(value = "")
  public List<FingerPrint> getFingerPrints() {
    return fingerPrints;
  }

  public void setFingerPrints(List<FingerPrint> fingerPrints) {
    this.fingerPrints = fingerPrints;
  }

  public BiometricData textDependentVoices(List<TextDependentVoice> textDependentVoices) {
    this.textDependentVoices = textDependentVoices;
    return this;
  }

  public BiometricData addTextDependentVoicesItem(TextDependentVoice textDependentVoicesItem) {
    if (this.textDependentVoices == null) {
      this.textDependentVoices = new ArrayList<TextDependentVoice>();
    }
    this.textDependentVoices.add(textDependentVoicesItem);
    return this;
  }

   /**
   * Get textDependentVoices
   * @return textDependentVoices
  **/
  @ApiModelProperty(value = "")
  public List<TextDependentVoice> getTextDependentVoices() {
    return textDependentVoices;
  }

  public void setTextDependentVoices(List<TextDependentVoice> textDependentVoices) {
    this.textDependentVoices = textDependentVoices;
  }

  public BiometricData textIndependentVoice(TextIndependentVoice textIndependentVoice) {
    this.textIndependentVoice = textIndependentVoice;
    return this;
  }

   /**
   * Get textIndependentVoice
   * @return textIndependentVoice
  **/
  @ApiModelProperty(value = "")
  public TextIndependentVoice getTextIndependentVoice() {
    return textIndependentVoice;
  }

  public void setTextIndependentVoice(TextIndependentVoice textIndependentVoice) {
    this.textIndependentVoice = textIndependentVoice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BiometricData biometricData = (BiometricData) o;
    return Objects.equals(this.compositeFingerPrints, biometricData.compositeFingerPrints) &&
        Objects.equals(this.faces, biometricData.faces) &&
        Objects.equals(this.fingerPrints, biometricData.fingerPrints) &&
        Objects.equals(this.textDependentVoices, biometricData.textDependentVoices) &&
        Objects.equals(this.textIndependentVoice, biometricData.textIndependentVoice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compositeFingerPrints, faces, fingerPrints, textDependentVoices, textIndependentVoice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BiometricData {\n");
    
    sb.append("    compositeFingerPrints: ").append(toIndentedString(compositeFingerPrints)).append("\n");
    sb.append("    faces: ").append(toIndentedString(faces)).append("\n");
    sb.append("    fingerPrints: ").append(toIndentedString(fingerPrints)).append("\n");
    sb.append("    textDependentVoices: ").append(toIndentedString(textDependentVoices)).append("\n");
    sb.append("    textIndependentVoice: ").append(toIndentedString(textIndependentVoice)).append("\n");
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

