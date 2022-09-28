package ar.com.sdc.sobio.api.v1;

import ar.com.sdc.sobio.client.v1.ApiException;
import ar.com.sdc.sobio.client.v1.ApiClient;
import ar.com.sdc.sobio.client.v1.Configuration;
import ar.com.sdc.sobio.client.v1.Pair;

import javax.ws.rs.core.GenericType;

import ar.com.sdc.sobio.model.v1.UIEnrollInput;
import ar.com.sdc.sobio.model.v1.UIEnrollOutput;
import ar.com.sdc.sobio.model.v1.UIExtractDNIARInput;
import ar.com.sdc.sobio.model.v1.UIExtractDNIAROutput;
import ar.com.sdc.sobio.model.v1.UIExtractFaceFromImageInput;
import ar.com.sdc.sobio.model.v1.UIExtractFaceFromImageResult;
import ar.com.sdc.sobio.model.v1.UIVerifyInput;
import ar.com.sdc.sobio.model.v1.UIVerifyOutput;
import ar.com.sdc.sobio.model.v1.UIVerifyT2TInput;
import ar.com.sdc.sobio.model.v1.UIVerifyT2TOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-28T09:56:20.444-03:00")
public class UiComponentApi {
  private ApiClient apiClient;

  public UiComponentApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UiComponentApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Performs a biometric enrollment supplied biometric data which is associated with supplied enrolled subject id
   * 
   * @param input input (required)
   * @return UIEnrollOutput
   * @throws ApiException if fails to make API call
   */
  public UIEnrollOutput enroll1(UIEnrollInput input) throws ApiException {
    Object localVarPostBody = input;
    
    // verify the required parameter 'input' is set
    if (input == null) {
      throw new ApiException(400, "Missing the required parameter 'input' when calling enroll1");
    }
    
    // create path and map variables
    String localVarPath = "/v1/ui/enroll";

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

    GenericType<UIEnrollOutput> localVarReturnType = new GenericType<UIEnrollOutput>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Performs a biometric enrollment supplied biometric data which is associated with supplied enrolled subject id,performing a duplicate search against current enrollments
   * 
   * @param input input (required)
   * @return UIEnrollOutput
   * @throws ApiException if fails to make API call
   */
  public UIEnrollOutput enrollWithDuplicateSearch(UIEnrollInput input) throws ApiException {
    Object localVarPostBody = input;
    
    // verify the required parameter 'input' is set
    if (input == null) {
      throw new ApiException(400, "Missing the required parameter 'input' when calling enrollWithDuplicateSearch");
    }
    
    // create path and map variables
    String localVarPath = "/v1/ui/enroll-with-duplicate-search";

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

    GenericType<UIEnrollOutput> localVarReturnType = new GenericType<UIEnrollOutput>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Extracts ARGENTINA ID Card document information
   * 
   * @param input input (required)
   * @return UIExtractDNIAROutput
   * @throws ApiException if fails to make API call
   */
  public UIExtractDNIAROutput extractDniArDocInfo1(UIExtractDNIARInput input) throws ApiException {
    Object localVarPostBody = input;
    
    // verify the required parameter 'input' is set
    if (input == null) {
      throw new ApiException(400, "Missing the required parameter 'input' when calling extractDniArDocInfo1");
    }
    
    // create path and map variables
    String localVarPath = "/v1/ui/dni-ar-extraction";

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

    GenericType<UIExtractDNIAROutput> localVarReturnType = new GenericType<UIExtractDNIAROutput>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Extracts face biometric data (template) from a supplied image
   * 
   * @param input input (required)
   * @return UIExtractFaceFromImageResult
   * @throws ApiException if fails to make API call
   */
  public UIExtractFaceFromImageResult extractFaceImage1(UIExtractFaceFromImageInput input) throws ApiException {
    Object localVarPostBody = input;
    
    // verify the required parameter 'input' is set
    if (input == null) {
      throw new ApiException(400, "Missing the required parameter 'input' when calling extractFaceImage1");
    }
    
    // create path and map variables
    String localVarPath = "/v1/ui/extract-face-image";

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

    GenericType<UIExtractFaceFromImageResult> localVarReturnType = new GenericType<UIExtractFaceFromImageResult>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Performs a biometric verification against an enrolled subject id
   * 
   * @param input input (required)
   * @return UIVerifyOutput
   * @throws ApiException if fails to make API call
   */
  public UIVerifyOutput verify1(UIVerifyInput input) throws ApiException {
    Object localVarPostBody = input;
    
    // verify the required parameter 'input' is set
    if (input == null) {
      throw new ApiException(400, "Missing the required parameter 'input' when calling verify1");
    }
    
    // create path and map variables
    String localVarPath = "/v1/ui/verify";

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

    GenericType<UIVerifyOutput> localVarReturnType = new GenericType<UIVerifyOutput>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Performs a biometric verification between an UI component template vs an extracted template
   * 
   * @param input input (required)
   * @return UIVerifyT2TOutput
   * @throws ApiException if fails to make API call
   */
  public UIVerifyT2TOutput verifyT2t1(UIVerifyT2TInput input) throws ApiException {
    Object localVarPostBody = input;
    
    // verify the required parameter 'input' is set
    if (input == null) {
      throw new ApiException(400, "Missing the required parameter 'input' when calling verifyT2t1");
    }
    
    // create path and map variables
    String localVarPath = "/v1/ui/verify-t2t";

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

    GenericType<UIVerifyT2TOutput> localVarReturnType = new GenericType<UIVerifyT2TOutput>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
