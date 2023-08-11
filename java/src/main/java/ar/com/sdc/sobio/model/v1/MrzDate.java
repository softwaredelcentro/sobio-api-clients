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
 * MrzDate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-08-11T10:34:31.644-03:00")
public class MrzDate {
  @JsonProperty("dateValid")
  private Boolean dateValid = null;

  @JsonProperty("day")
  private Integer day = null;

  @JsonProperty("month")
  private Integer month = null;

  @JsonProperty("year")
  private Integer year = null;

  public MrzDate dateValid(Boolean dateValid) {
    this.dateValid = dateValid;
    return this;
  }

   /**
   * Get dateValid
   * @return dateValid
  **/
  @ApiModelProperty(value = "")
  public Boolean isDateValid() {
    return dateValid;
  }

  public void setDateValid(Boolean dateValid) {
    this.dateValid = dateValid;
  }

  public MrzDate day(Integer day) {
    this.day = day;
    return this;
  }

   /**
   * Get day
   * @return day
  **/
  @ApiModelProperty(value = "")
  public Integer getDay() {
    return day;
  }

  public void setDay(Integer day) {
    this.day = day;
  }

  public MrzDate month(Integer month) {
    this.month = month;
    return this;
  }

   /**
   * Get month
   * @return month
  **/
  @ApiModelProperty(value = "")
  public Integer getMonth() {
    return month;
  }

  public void setMonth(Integer month) {
    this.month = month;
  }

  public MrzDate year(Integer year) {
    this.year = year;
    return this;
  }

   /**
   * Get year
   * @return year
  **/
  @ApiModelProperty(value = "")
  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MrzDate mrzDate = (MrzDate) o;
    return Objects.equals(this.dateValid, mrzDate.dateValid) &&
        Objects.equals(this.day, mrzDate.day) &&
        Objects.equals(this.month, mrzDate.month) &&
        Objects.equals(this.year, mrzDate.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateValid, day, month, year);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MrzDate {\n");
    
    sb.append("    dateValid: ").append(toIndentedString(dateValid)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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

