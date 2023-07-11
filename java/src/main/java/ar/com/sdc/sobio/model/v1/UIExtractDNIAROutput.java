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
import ar.com.sdc.sobio.model.v1.DocumentInformation;
import ar.com.sdc.sobio.model.v1.MrzRecord;
import ar.com.sdc.sobio.model.v1.UITemplateMetada;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * UIExtractDNIAROutput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-11T17:07:14.771-03:00")
public class UIExtractDNIAROutput {
  @JsonProperty("additionalInfo")
  private String additionalInfo = null;

  @JsonProperty("backImage")
  private byte[] backImage = null;

  @JsonProperty("documentInfo")
  private DocumentInformation documentInfo = null;

  @JsonProperty("exception")
  private Boolean exception = null;

  @JsonProperty("frontImage")
  private byte[] frontImage = null;

  @JsonProperty("mrz")
  private MrzRecord mrz = null;

  @JsonProperty("mrzDetected")
  private Boolean mrzDetected = null;

  @JsonProperty("pdf417")
  private List<String> pdf417 = null;

  @JsonProperty("pdf417Detected")
  private Boolean pdf417Detected = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    OK("OK"),
    
    EXCEPTION("EXCEPTION"),
    
    SPOOF("SPOOF"),
    
    FRONT_FACE_NOT_FOUND("FRONT_FACE_NOT_FOUND"),
    
    FRONT_FACE_BAD_ILLUMINATION("FRONT_FACE_BAD_ILLUMINATION"),
    
    NEITHER_MRZ_NOR_PDF417_DETECTED("NEITHER_MRZ_NOR_PDF417_DETECTED"),
    
    NOT_ARGENTINA_ID("NOT_ARGENTINA_ID"),
    
    BAD_TEMPLATE("BAD_TEMPLATE");

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

  /**
   * Gets or Sets suggestedAction
   */
  public enum SuggestedActionEnum {
    RESCAN("RESCAN"),
    
    NONE("NONE"),
    
    RETRY("RETRY");

    private String value;

    SuggestedActionEnum(String value) {
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
    public static SuggestedActionEnum fromValue(String text) {
      for (SuggestedActionEnum b : SuggestedActionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("suggestedAction")
  private SuggestedActionEnum suggestedAction = null;

  @JsonProperty("txId")
  private String txId = null;

  @JsonProperty("uiTemplateMetadata")
  private UITemplateMetada uiTemplateMetadata = null;

  public UIExtractDNIAROutput additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

   /**
   * Get additionalInfo
   * @return additionalInfo
  **/
  @ApiModelProperty(value = "")
  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public UIExtractDNIAROutput backImage(byte[] backImage) {
    this.backImage = backImage;
    return this;
  }

   /**
   * Get backImage
   * @return backImage
  **/
  @ApiModelProperty(value = "")
  public byte[] getBackImage() {
    return backImage;
  }

  public void setBackImage(byte[] backImage) {
    this.backImage = backImage;
  }

  public UIExtractDNIAROutput documentInfo(DocumentInformation documentInfo) {
    this.documentInfo = documentInfo;
    return this;
  }

   /**
   * Get documentInfo
   * @return documentInfo
  **/
  @ApiModelProperty(value = "")
  public DocumentInformation getDocumentInfo() {
    return documentInfo;
  }

  public void setDocumentInfo(DocumentInformation documentInfo) {
    this.documentInfo = documentInfo;
  }

  public UIExtractDNIAROutput exception(Boolean exception) {
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

  public UIExtractDNIAROutput frontImage(byte[] frontImage) {
    this.frontImage = frontImage;
    return this;
  }

   /**
   * Get frontImage
   * @return frontImage
  **/
  @ApiModelProperty(value = "")
  public byte[] getFrontImage() {
    return frontImage;
  }

  public void setFrontImage(byte[] frontImage) {
    this.frontImage = frontImage;
  }

  public UIExtractDNIAROutput mrz(MrzRecord mrz) {
    this.mrz = mrz;
    return this;
  }

   /**
   * Get mrz
   * @return mrz
  **/
  @ApiModelProperty(value = "")
  public MrzRecord getMrz() {
    return mrz;
  }

  public void setMrz(MrzRecord mrz) {
    this.mrz = mrz;
  }

  public UIExtractDNIAROutput mrzDetected(Boolean mrzDetected) {
    this.mrzDetected = mrzDetected;
    return this;
  }

   /**
   * Get mrzDetected
   * @return mrzDetected
  **/
  @ApiModelProperty(value = "")
  public Boolean isMrzDetected() {
    return mrzDetected;
  }

  public void setMrzDetected(Boolean mrzDetected) {
    this.mrzDetected = mrzDetected;
  }

  public UIExtractDNIAROutput pdf417(List<String> pdf417) {
    this.pdf417 = pdf417;
    return this;
  }

  public UIExtractDNIAROutput addPdf417Item(String pdf417Item) {
    if (this.pdf417 == null) {
      this.pdf417 = new ArrayList<String>();
    }
    this.pdf417.add(pdf417Item);
    return this;
  }

   /**
   * Get pdf417
   * @return pdf417
  **/
  @ApiModelProperty(value = "")
  public List<String> getPdf417() {
    return pdf417;
  }

  public void setPdf417(List<String> pdf417) {
    this.pdf417 = pdf417;
  }

  public UIExtractDNIAROutput pdf417Detected(Boolean pdf417Detected) {
    this.pdf417Detected = pdf417Detected;
    return this;
  }

   /**
   * Get pdf417Detected
   * @return pdf417Detected
  **/
  @ApiModelProperty(value = "")
  public Boolean isPdf417Detected() {
    return pdf417Detected;
  }

  public void setPdf417Detected(Boolean pdf417Detected) {
    this.pdf417Detected = pdf417Detected;
  }

  public UIExtractDNIAROutput status(StatusEnum status) {
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

  public UIExtractDNIAROutput suggestedAction(SuggestedActionEnum suggestedAction) {
    this.suggestedAction = suggestedAction;
    return this;
  }

   /**
   * Get suggestedAction
   * @return suggestedAction
  **/
  @ApiModelProperty(value = "")
  public SuggestedActionEnum getSuggestedAction() {
    return suggestedAction;
  }

  public void setSuggestedAction(SuggestedActionEnum suggestedAction) {
    this.suggestedAction = suggestedAction;
  }

  public UIExtractDNIAROutput txId(String txId) {
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

  public UIExtractDNIAROutput uiTemplateMetadata(UITemplateMetada uiTemplateMetadata) {
    this.uiTemplateMetadata = uiTemplateMetadata;
    return this;
  }

   /**
   * Get uiTemplateMetadata
   * @return uiTemplateMetadata
  **/
  @ApiModelProperty(value = "")
  public UITemplateMetada getUiTemplateMetadata() {
    return uiTemplateMetadata;
  }

  public void setUiTemplateMetadata(UITemplateMetada uiTemplateMetadata) {
    this.uiTemplateMetadata = uiTemplateMetadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UIExtractDNIAROutput uiExtractDNIAROutput = (UIExtractDNIAROutput) o;
    return Objects.equals(this.additionalInfo, uiExtractDNIAROutput.additionalInfo) &&
        Objects.equals(this.backImage, uiExtractDNIAROutput.backImage) &&
        Objects.equals(this.documentInfo, uiExtractDNIAROutput.documentInfo) &&
        Objects.equals(this.exception, uiExtractDNIAROutput.exception) &&
        Objects.equals(this.frontImage, uiExtractDNIAROutput.frontImage) &&
        Objects.equals(this.mrz, uiExtractDNIAROutput.mrz) &&
        Objects.equals(this.mrzDetected, uiExtractDNIAROutput.mrzDetected) &&
        Objects.equals(this.pdf417, uiExtractDNIAROutput.pdf417) &&
        Objects.equals(this.pdf417Detected, uiExtractDNIAROutput.pdf417Detected) &&
        Objects.equals(this.status, uiExtractDNIAROutput.status) &&
        Objects.equals(this.suggestedAction, uiExtractDNIAROutput.suggestedAction) &&
        Objects.equals(this.txId, uiExtractDNIAROutput.txId) &&
        Objects.equals(this.uiTemplateMetadata, uiExtractDNIAROutput.uiTemplateMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfo, backImage, documentInfo, exception, frontImage, mrz, mrzDetected, pdf417, pdf417Detected, status, suggestedAction, txId, uiTemplateMetadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UIExtractDNIAROutput {\n");
    
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    backImage: ").append(toIndentedString(backImage)).append("\n");
    sb.append("    documentInfo: ").append(toIndentedString(documentInfo)).append("\n");
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
    sb.append("    frontImage: ").append(toIndentedString(frontImage)).append("\n");
    sb.append("    mrz: ").append(toIndentedString(mrz)).append("\n");
    sb.append("    mrzDetected: ").append(toIndentedString(mrzDetected)).append("\n");
    sb.append("    pdf417: ").append(toIndentedString(pdf417)).append("\n");
    sb.append("    pdf417Detected: ").append(toIndentedString(pdf417Detected)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    suggestedAction: ").append(toIndentedString(suggestedAction)).append("\n");
    sb.append("    txId: ").append(toIndentedString(txId)).append("\n");
    sb.append("    uiTemplateMetadata: ").append(toIndentedString(uiTemplateMetadata)).append("\n");
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

