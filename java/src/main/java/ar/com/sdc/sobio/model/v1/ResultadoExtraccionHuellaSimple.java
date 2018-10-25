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
import ar.com.sdc.sobio.model.v1.FingerPrint;
import ar.com.sdc.sobio.model.v1.PropiedadesHuella;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ResultadoExtraccionHuellaSimple
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-25T13:07:38.915-03:00")
public class ResultadoExtraccionHuellaSimple {
  @JsonProperty("auditId")
  private Long auditId = null;

  /**
   * Gets or Sets estado
   */
  public enum EstadoEnum {
    OK("OK"),
    
    BAJA_CALIDAD("BAJA_CALIDAD"),
    
    RESOLUCION_INVALIDA("RESOLUCION_INVALIDA");

    private String value;

    EstadoEnum(String value) {
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
    public static EstadoEnum fromValue(String text) {
      for (EstadoEnum b : EstadoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("estado")
  private EstadoEnum estado = null;

  @JsonProperty("exception")
  private Boolean exception = null;

  @JsonProperty("huella")
  private FingerPrint huella = null;

  @JsonProperty("propiedadesHuella")
  private PropiedadesHuella propiedadesHuella = null;

  public ResultadoExtraccionHuellaSimple auditId(Long auditId) {
    this.auditId = auditId;
    return this;
  }

   /**
   * Get auditId
   * @return auditId
  **/
  @ApiModelProperty(value = "")
  public Long getAuditId() {
    return auditId;
  }

  public void setAuditId(Long auditId) {
    this.auditId = auditId;
  }

  public ResultadoExtraccionHuellaSimple estado(EstadoEnum estado) {
    this.estado = estado;
    return this;
  }

   /**
   * Get estado
   * @return estado
  **/
  @ApiModelProperty(value = "")
  public EstadoEnum getEstado() {
    return estado;
  }

  public void setEstado(EstadoEnum estado) {
    this.estado = estado;
  }

  public ResultadoExtraccionHuellaSimple exception(Boolean exception) {
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

  public ResultadoExtraccionHuellaSimple huella(FingerPrint huella) {
    this.huella = huella;
    return this;
  }

   /**
   * Get huella
   * @return huella
  **/
  @ApiModelProperty(value = "")
  public FingerPrint getHuella() {
    return huella;
  }

  public void setHuella(FingerPrint huella) {
    this.huella = huella;
  }

  public ResultadoExtraccionHuellaSimple propiedadesHuella(PropiedadesHuella propiedadesHuella) {
    this.propiedadesHuella = propiedadesHuella;
    return this;
  }

   /**
   * Get propiedadesHuella
   * @return propiedadesHuella
  **/
  @ApiModelProperty(value = "")
  public PropiedadesHuella getPropiedadesHuella() {
    return propiedadesHuella;
  }

  public void setPropiedadesHuella(PropiedadesHuella propiedadesHuella) {
    this.propiedadesHuella = propiedadesHuella;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultadoExtraccionHuellaSimple resultadoExtraccionHuellaSimple = (ResultadoExtraccionHuellaSimple) o;
    return Objects.equals(this.auditId, resultadoExtraccionHuellaSimple.auditId) &&
        Objects.equals(this.estado, resultadoExtraccionHuellaSimple.estado) &&
        Objects.equals(this.exception, resultadoExtraccionHuellaSimple.exception) &&
        Objects.equals(this.huella, resultadoExtraccionHuellaSimple.huella) &&
        Objects.equals(this.propiedadesHuella, resultadoExtraccionHuellaSimple.propiedadesHuella);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditId, estado, exception, huella, propiedadesHuella);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultadoExtraccionHuellaSimple {\n");
    
    sb.append("    auditId: ").append(toIndentedString(auditId)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
    sb.append("    huella: ").append(toIndentedString(huella)).append("\n");
    sb.append("    propiedadesHuella: ").append(toIndentedString(propiedadesHuella)).append("\n");
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
