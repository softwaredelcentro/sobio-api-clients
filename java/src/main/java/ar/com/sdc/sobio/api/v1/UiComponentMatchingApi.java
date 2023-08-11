package ar.com.sdc.sobio.api.v1;

import ar.com.sdc.sobio.client.v1.ApiException;
import ar.com.sdc.sobio.client.v1.ApiClient;
import ar.com.sdc.sobio.client.v1.Configuration;
import ar.com.sdc.sobio.client.v1.Pair;

import javax.ws.rs.core.GenericType;

import ar.com.sdc.sobio.model.v1.UIIdentifyInput;
import ar.com.sdc.sobio.model.v1.UIIdentifyOutput;
import ar.com.sdc.sobio.model.v1.UIVerifyInput;
import ar.com.sdc.sobio.model.v1.UIVerifyOutput;
import ar.com.sdc.sobio.model.v1.UIVerifyT2TInput;
import ar.com.sdc.sobio.model.v1.UIVerifyT2TOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-08-11T10:24:49.696-03:00")
public class UiComponentMatchingApi {
  private ApiClient apiClient;

  public UiComponentMatchingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UiComponentMatchingApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Performs an identification (1:N) of supplied biometric data against enrolled subjects (that match optionally supplied conditions)
   * 
   * @param input input (required)
   * @return UIIdentifyOutput
   * @throws ApiException if fails to make API call
   */
  public UIIdentifyOutput identify1(UIIdentifyInput input) throws ApiException {
    Object localVarPostBody = input;
    
    // verify the required parameter 'input' is set
    if (input == null) {
      throw new ApiException(400, "Missing the required parameter 'input' when calling identify1");
    }
    
    // create path and map variables
    String localVarPath = "/v1/ui/identify";

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

    GenericType<UIIdentifyOutput> localVarReturnType = new GenericType<UIIdentifyOutput>() {};
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
