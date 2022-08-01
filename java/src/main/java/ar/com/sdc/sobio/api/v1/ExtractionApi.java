package ar.com.sdc.sobio.api.v1;

import ar.com.sdc.sobio.client.v1.ApiException;
import ar.com.sdc.sobio.client.v1.ApiClient;
import ar.com.sdc.sobio.client.v1.Configuration;
import ar.com.sdc.sobio.client.v1.Pair;

import javax.ws.rs.core.GenericType;

import ar.com.sdc.sobio.model.v1.ConcatAudioStreamsInput;
import ar.com.sdc.sobio.model.v1.ConcatAudioStreamsResult;
import ar.com.sdc.sobio.model.v1.ConvertFingerprintImageInput;
import ar.com.sdc.sobio.model.v1.ConvertFingerprintImageOutput;
import ar.com.sdc.sobio.model.v1.ExtractFaceFromImageInput;
import ar.com.sdc.sobio.model.v1.ExtractFaceFromImageResult;
import ar.com.sdc.sobio.model.v1.ExtractFaceFromVideoInput;
import ar.com.sdc.sobio.model.v1.ExtractFaceFromVideoResult;
import ar.com.sdc.sobio.model.v1.ExtractFingerPrintFromImageInput;
import ar.com.sdc.sobio.model.v1.ExtractFingerPrintFromImageResult;
import ar.com.sdc.sobio.model.v1.ExtractTextDependentVoiceFromAudioInput;
import ar.com.sdc.sobio.model.v1.ExtractTextDependentVoiceFromAudioResult;
import ar.com.sdc.sobio.model.v1.ExtractTextIndependentVoiceFromAudioInput;
import ar.com.sdc.sobio.model.v1.ExtractTextIndependentVoiceFromAudioResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-01T17:51:31.127-03:00")
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
   * Concats multiple audio-streams
   * 
   * @param input input (required)
   * @return ConcatAudioStreamsResult
   * @throws ApiException if fails to make API call
   */
  public ConcatAudioStreamsResult concatAudioStream(ConcatAudioStreamsInput input) throws ApiException {
    Object localVarPostBody = input;
    
    // verify the required parameter 'input' is set
    if (input == null) {
      throw new ApiException(400, "Missing the required parameter 'input' when calling concatAudioStream");
    }
    
    // create path and map variables
    String localVarPath = "/v1/bio/concat-audio-stream";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Token" };

    GenericType<ConcatAudioStreamsResult> localVarReturnType = new GenericType<ConcatAudioStreamsResult>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Convert Fingerprint in PNG to WSQ format
   * 
   * @param input input (required)
   * @return ConvertFingerprintImageOutput
   * @throws ApiException if fails to make API call
   */
  public ConvertFingerprintImageOutput convertFingerprintImagePngToWsq(ConvertFingerprintImageInput input) throws ApiException {
    Object localVarPostBody = input;
    
    // verify the required parameter 'input' is set
    if (input == null) {
      throw new ApiException(400, "Missing the required parameter 'input' when calling convertFingerprintImagePngToWsq");
    }
    
    // create path and map variables
    String localVarPath = "/v1/bio/convert-fingerprint-image-png-to-wsq";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Token" };

    GenericType<ConvertFingerprintImageOutput> localVarReturnType = new GenericType<ConvertFingerprintImageOutput>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Convert Fingerprint in WSQ to PNG format
   * 
   * @param input input (required)
   * @return ConvertFingerprintImageOutput
   * @throws ApiException if fails to make API call
   */
  public ConvertFingerprintImageOutput convertFingerprintImageWsqToPng(ConvertFingerprintImageInput input) throws ApiException {
    Object localVarPostBody = input;
    
    // verify the required parameter 'input' is set
    if (input == null) {
      throw new ApiException(400, "Missing the required parameter 'input' when calling convertFingerprintImageWsqToPng");
    }
    
    // create path and map variables
    String localVarPath = "/v1/bio/convert-fingerprint-image-wsq-to-png";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Token" };

    GenericType<ConvertFingerprintImageOutput> localVarReturnType = new GenericType<ConvertFingerprintImageOutput>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Token" };

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
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Token" };

    GenericType<ExtractFaceFromVideoResult> localVarReturnType = new GenericType<ExtractFaceFromVideoResult>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Extracts finger biometric data (template) from a supplied image
   * 
   * @param input input (required)
   * @return ExtractFingerPrintFromImageResult
   * @throws ApiException if fails to make API call
   */
  public ExtractFingerPrintFromImageResult extractFingerprintImage(ExtractFingerPrintFromImageInput input) throws ApiException {
    Object localVarPostBody = input;
    
    // verify the required parameter 'input' is set
    if (input == null) {
      throw new ApiException(400, "Missing the required parameter 'input' when calling extractFingerprintImage");
    }
    
    // create path and map variables
    String localVarPath = "/v1/bio/extract-fingerprint-image";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Token" };

    GenericType<ExtractFingerPrintFromImageResult> localVarReturnType = new GenericType<ExtractFingerPrintFromImageResult>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Extracts text-dependent voice biometric data (template) from a supplied audio
   * 
   * @param input input (required)
   * @return ExtractTextDependentVoiceFromAudioResult
   * @throws ApiException if fails to make API call
   */
  public ExtractTextDependentVoiceFromAudioResult extractTextDependentVoice(ExtractTextDependentVoiceFromAudioInput input) throws ApiException {
    Object localVarPostBody = input;
    
    // verify the required parameter 'input' is set
    if (input == null) {
      throw new ApiException(400, "Missing the required parameter 'input' when calling extractTextDependentVoice");
    }
    
    // create path and map variables
    String localVarPath = "/v1/bio/extract-text-dependent-voice";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Token" };

    GenericType<ExtractTextDependentVoiceFromAudioResult> localVarReturnType = new GenericType<ExtractTextDependentVoiceFromAudioResult>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Extracts text-independent voice biometric data (template) from a supplied audio
   * 
   * @param input input (required)
   * @return ExtractTextIndependentVoiceFromAudioResult
   * @throws ApiException if fails to make API call
   */
  public ExtractTextIndependentVoiceFromAudioResult extractTextIndependentVoice(ExtractTextIndependentVoiceFromAudioInput input) throws ApiException {
    Object localVarPostBody = input;
    
    // verify the required parameter 'input' is set
    if (input == null) {
      throw new ApiException(400, "Missing the required parameter 'input' when calling extractTextIndependentVoice");
    }
    
    // create path and map variables
    String localVarPath = "/v1/bio/extract-text-independent-voice";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Token" };

    GenericType<ExtractTextIndependentVoiceFromAudioResult> localVarReturnType = new GenericType<ExtractTextIndependentVoiceFromAudioResult>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
