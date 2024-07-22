/*
 * BIOMIX
 * BIOMIX Biometric Services
 *
 * OpenAPI spec version: 1
 * Contact: soporte@securbase.com
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
 * Conditions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:48:09.641-03:00")
public class Conditions {
  @JsonProperty("i1")
  private Integer i1 = null;

  @JsonProperty("i2")
  private Integer i2 = null;

  @JsonProperty("i3")
  private Integer i3 = null;

  @JsonProperty("i4")
  private Integer i4 = null;

  @JsonProperty("i5")
  private Integer i5 = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("idIn")
  private String idIn = null;

  @JsonProperty("idLike")
  private String idLike = null;

  @JsonProperty("idNo")
  private String idNo = null;

  @JsonProperty("s1")
  private String s1 = null;

  @JsonProperty("s2")
  private String s2 = null;

  @JsonProperty("s3")
  private String s3 = null;

  @JsonProperty("s4")
  private String s4 = null;

  @JsonProperty("s5")
  private String s5 = null;

  public Conditions i1(Integer i1) {
    this.i1 = i1;
    return this;
  }

   /**
   * Get i1
   * @return i1
  **/
  @ApiModelProperty(value = "")
  public Integer getI1() {
    return i1;
  }

  public void setI1(Integer i1) {
    this.i1 = i1;
  }

  public Conditions i2(Integer i2) {
    this.i2 = i2;
    return this;
  }

   /**
   * Get i2
   * @return i2
  **/
  @ApiModelProperty(value = "")
  public Integer getI2() {
    return i2;
  }

  public void setI2(Integer i2) {
    this.i2 = i2;
  }

  public Conditions i3(Integer i3) {
    this.i3 = i3;
    return this;
  }

   /**
   * Get i3
   * @return i3
  **/
  @ApiModelProperty(value = "")
  public Integer getI3() {
    return i3;
  }

  public void setI3(Integer i3) {
    this.i3 = i3;
  }

  public Conditions i4(Integer i4) {
    this.i4 = i4;
    return this;
  }

   /**
   * Get i4
   * @return i4
  **/
  @ApiModelProperty(value = "")
  public Integer getI4() {
    return i4;
  }

  public void setI4(Integer i4) {
    this.i4 = i4;
  }

  public Conditions i5(Integer i5) {
    this.i5 = i5;
    return this;
  }

   /**
   * Get i5
   * @return i5
  **/
  @ApiModelProperty(value = "")
  public Integer getI5() {
    return i5;
  }

  public void setI5(Integer i5) {
    this.i5 = i5;
  }

  public Conditions id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Conditions idIn(String idIn) {
    this.idIn = idIn;
    return this;
  }

   /**
   * Get idIn
   * @return idIn
  **/
  @ApiModelProperty(value = "")
  public String getIdIn() {
    return idIn;
  }

  public void setIdIn(String idIn) {
    this.idIn = idIn;
  }

  public Conditions idLike(String idLike) {
    this.idLike = idLike;
    return this;
  }

   /**
   * Get idLike
   * @return idLike
  **/
  @ApiModelProperty(value = "")
  public String getIdLike() {
    return idLike;
  }

  public void setIdLike(String idLike) {
    this.idLike = idLike;
  }

  public Conditions idNo(String idNo) {
    this.idNo = idNo;
    return this;
  }

   /**
   * Get idNo
   * @return idNo
  **/
  @ApiModelProperty(value = "")
  public String getIdNo() {
    return idNo;
  }

  public void setIdNo(String idNo) {
    this.idNo = idNo;
  }

  public Conditions s1(String s1) {
    this.s1 = s1;
    return this;
  }

   /**
   * Get s1
   * @return s1
  **/
  @ApiModelProperty(value = "")
  public String getS1() {
    return s1;
  }

  public void setS1(String s1) {
    this.s1 = s1;
  }

  public Conditions s2(String s2) {
    this.s2 = s2;
    return this;
  }

   /**
   * Get s2
   * @return s2
  **/
  @ApiModelProperty(value = "")
  public String getS2() {
    return s2;
  }

  public void setS2(String s2) {
    this.s2 = s2;
  }

  public Conditions s3(String s3) {
    this.s3 = s3;
    return this;
  }

   /**
   * Get s3
   * @return s3
  **/
  @ApiModelProperty(value = "")
  public String getS3() {
    return s3;
  }

  public void setS3(String s3) {
    this.s3 = s3;
  }

  public Conditions s4(String s4) {
    this.s4 = s4;
    return this;
  }

   /**
   * Get s4
   * @return s4
  **/
  @ApiModelProperty(value = "")
  public String getS4() {
    return s4;
  }

  public void setS4(String s4) {
    this.s4 = s4;
  }

  public Conditions s5(String s5) {
    this.s5 = s5;
    return this;
  }

   /**
   * Get s5
   * @return s5
  **/
  @ApiModelProperty(value = "")
  public String getS5() {
    return s5;
  }

  public void setS5(String s5) {
    this.s5 = s5;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Conditions conditions = (Conditions) o;
    return Objects.equals(this.i1, conditions.i1) &&
        Objects.equals(this.i2, conditions.i2) &&
        Objects.equals(this.i3, conditions.i3) &&
        Objects.equals(this.i4, conditions.i4) &&
        Objects.equals(this.i5, conditions.i5) &&
        Objects.equals(this.id, conditions.id) &&
        Objects.equals(this.idIn, conditions.idIn) &&
        Objects.equals(this.idLike, conditions.idLike) &&
        Objects.equals(this.idNo, conditions.idNo) &&
        Objects.equals(this.s1, conditions.s1) &&
        Objects.equals(this.s2, conditions.s2) &&
        Objects.equals(this.s3, conditions.s3) &&
        Objects.equals(this.s4, conditions.s4) &&
        Objects.equals(this.s5, conditions.s5);
  }

  @Override
  public int hashCode() {
    return Objects.hash(i1, i2, i3, i4, i5, id, idIn, idLike, idNo, s1, s2, s3, s4, s5);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Conditions {\n");
    
    sb.append("    i1: ").append(toIndentedString(i1)).append("\n");
    sb.append("    i2: ").append(toIndentedString(i2)).append("\n");
    sb.append("    i3: ").append(toIndentedString(i3)).append("\n");
    sb.append("    i4: ").append(toIndentedString(i4)).append("\n");
    sb.append("    i5: ").append(toIndentedString(i5)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idIn: ").append(toIndentedString(idIn)).append("\n");
    sb.append("    idLike: ").append(toIndentedString(idLike)).append("\n");
    sb.append("    idNo: ").append(toIndentedString(idNo)).append("\n");
    sb.append("    s1: ").append(toIndentedString(s1)).append("\n");
    sb.append("    s2: ").append(toIndentedString(s2)).append("\n");
    sb.append("    s3: ").append(toIndentedString(s3)).append("\n");
    sb.append("    s4: ").append(toIndentedString(s4)).append("\n");
    sb.append("    s5: ").append(toIndentedString(s5)).append("\n");
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

