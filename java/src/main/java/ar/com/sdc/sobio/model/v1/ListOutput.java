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
import java.util.ArrayList;
import java.util.List;

/**
 * ListOutput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:48:09.641-03:00")
public class ListOutput {
  @JsonProperty("exception")
  private Boolean exception = null;

  @JsonProperty("ids")
  private List<String> ids = null;

  @JsonProperty("txId")
  private String txId = null;

  public ListOutput exception(Boolean exception) {
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

  public ListOutput ids(List<String> ids) {
    this.ids = ids;
    return this;
  }

  public ListOutput addIdsItem(String idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<String>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * Get ids
   * @return ids
  **/
  @ApiModelProperty(value = "")
  public List<String> getIds() {
    return ids;
  }

  public void setIds(List<String> ids) {
    this.ids = ids;
  }

  public ListOutput txId(String txId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListOutput listOutput = (ListOutput) o;
    return Objects.equals(this.exception, listOutput.exception) &&
        Objects.equals(this.ids, listOutput.ids) &&
        Objects.equals(this.txId, listOutput.txId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exception, ids, txId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListOutput {\n");
    
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    txId: ").append(toIndentedString(txId)).append("\n");
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

