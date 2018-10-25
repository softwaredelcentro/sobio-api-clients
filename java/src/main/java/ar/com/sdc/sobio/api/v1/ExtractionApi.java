package ar.com.sdc.sobio.api.v1;

import ar.com.sdc.sobio.client.v1.ApiException;
import ar.com.sdc.sobio.client.v1.ApiClient;
import ar.com.sdc.sobio.client.v1.Configuration;
import ar.com.sdc.sobio.client.v1.Pair;

import javax.ws.rs.core.GenericType;

import ar.com.sdc.sobio.model.v1.ExtractFaceFromImageInput;
import ar.com.sdc.sobio.model.v1.ExtractFaceFromImageResult;
import ar.com.sdc.sobio.model.v1.ExtractFaceFromVideoInput;
import ar.com.sdc.sobio.model.v1.ExtractFaceFromVideoResult;
import ar.com.sdc.sobio.model.v1.ExtractFingerFromImageInput;
import ar.com.sdc.sobio.model.v1.ResultadoExtraccionHuellaSimple;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-25T13:07:38.915-03:00")
public class ExtractionApi {
  private ApiClient apiClient;

  public ExtractionApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ExtractionApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Extracts face biometric data (template) from a supplied image
   * 
   * @param input input (required)
   * @return ExtractFaceFromImageResult
   * @throws ApiException if fails to make API call
   */
  public ExtractFaceFromImageResult extractFaceImage(ExtractFaceFromImageInput input) throws ApiException {
    Object localVarPostBody = input;
    
    // verify the required parameter 'input' is set
    if (input == null) {
      throw new ApiException(400, "Missing the required parameter 'input' when calling extractFaceImage");
    }
    
    // create path and map variables
    String localVarPath = "/v1/bio/extract-face-image";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ExtractFaceFromImageResult> localVarReturnType = new GenericType<ExtractFaceFromImageResult>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Extracts face biometric data (template) from a supplied video
   * 
   * @param input input (required)
   * @return ExtractFaceFromVideoResult
   * @throws ApiException if fails to make API call
   */
  public ExtractFaceFromVideoResult extractFaceVideo(ExtractFaceFromVideoInput input) throws ApiException {
    Object localVarPostBody = input;
    
    // verify the required parameter 'input' is set
    if (input == null) {
      throw new ApiException(400, "Missing the required parameter 'input' when calling extractFaceVideo");
    }
    
    // create path and map variables
    String localVarPath = "/v1/bio/extract-face-video";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ExtractFaceFromVideoResult> localVarReturnType = new GenericType<ExtractFaceFromVideoResult>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Extracts finger biometric data (template) from a supplied image
   * 
   * @param input input (required)
   * @return ResultadoExtraccionHuellaSimple
   * @throws ApiException if fails to make API call
   */
  public ResultadoExtraccionHuellaSimple extractFingerprintImage(ExtractFingerFromImageInput input) throws ApiException {
    Object localVarPostBody = input;
    
    // verify the required parameter 'input' is set
    if (input == null) {
      throw new ApiException(400, "Missing the required parameter 'input' when calling extractFingerprintImage");
    }
    
    // create path and map variables
    String localVarPath = "/v1/bio/extract-fingerprint-image";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ResultadoExtraccionHuellaSimple> localVarReturnType = new GenericType<ResultadoExtraccionHuellaSimple>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
