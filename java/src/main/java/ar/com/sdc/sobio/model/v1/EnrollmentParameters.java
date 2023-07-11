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
import ar.com.sdc.sobio.model.v1.Conditions;
import ar.com.sdc.sobio.model.v1.IdentifyParameters;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * EnrollmentParameters
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-06-14T14:59:22.046-03:00")
public class EnrollmentParameters {
  @JsonProperty("conditions")
  private Conditions conditions = null;

  @JsonProperty("duplicateSearchParameters")
  private IdentifyParameters duplicateSearchParameters = null;

  public EnrollmentParameters conditions(Conditions conditions) {
    this.conditions = conditions;
    return this;
  }

   /**
   * Get conditions
   * @return conditions
  **/
  @ApiModelProperty(value = "")
  public Conditions getConditions() {
    return conditions;
  }

  public void setConditions(Conditions conditions) {
    this.conditions = conditions;
  }

  public EnrollmentParameters duplicateSearchParameters(IdentifyParameters duplicateSearchParameters) {
    this.duplicateSearchParameters = duplicateSearchParameters;
    return this;
  }

   /**
   * Get duplicateSearchParameters
   * @return duplicateSearchParameters
  **/
  @ApiModelProperty(value = "")
  public IdentifyParameters getDuplicateSearchParameters() {
    return duplicateSearchParameters;
  }

  public void setDuplicateSearchParameters(IdentifyParameters duplicateSearchParameters) {
    this.duplicateSearchParameters = duplicateSearchParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnrollmentParameters enrollmentParameters = (EnrollmentParameters) o;
    return Objects.equals(this.conditions, enrollmentParameters.conditions) &&
        Objects.equals(this.duplicateSearchParameters, enrollmentParameters.duplicateSearchParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, duplicateSearchParameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnrollmentParameters {\n");
    
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    duplicateSearchParameters: ").append(toIndentedString(duplicateSearchParameters)).append("\n");
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

