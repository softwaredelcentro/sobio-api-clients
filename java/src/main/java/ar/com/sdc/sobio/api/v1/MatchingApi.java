package ar.com.sdc.sobio.api.v1;

import ar.com.sdc.sobio.client.v1.ApiException;
import ar.com.sdc.sobio.client.v1.ApiClient;
import ar.com.sdc.sobio.client.v1.Configuration;
import ar.com.sdc.sobio.client.v1.Pair;

import javax.ws.rs.core.GenericType;

import ar.com.sdc.sobio.model.v1.IdentifyInput;
import ar.com.sdc.sobio.model.v1.IdentifyResult;
import ar.com.sdc.sobio.model.v1.VerifyInput;
import ar.com.sdc.sobio.model.v1.VerifyResult;
import ar.com.sdc.sobio.model.v1.VerifyT2TInput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-08-11T10:34:31.644-03:00")
public class MatchingApi {
  private ApiClient apiClient;

  public MatchingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MatchingApi(ApiClient apiClient) {
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
   * @return IdentifyResult
   * @throws ApiException if fails to make API call
   */
  public IdentifyResult identify(IdentifyInput input) throws ApiException {
    Object localVarPostBody = input;
    
    // verify the required parameter 'input' is set
    if (input == null) {
      throw new ApiException(400, "Missing the required parameter 'input' when calling identify");
    }
    
    // create path and map variables
    String localVarPath = "/v1/bio/identify";

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

    GenericType<IdentifyResult> localVarReturnType = new GenericType<IdentifyResult>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Performs a verification (1:1) of supplied biometric data against a supplied enrolled subject id
   * 
   * @param input input (required)
   * @return VerifyResult
   * @throws ApiException if fails to make API call
   */
  public VerifyResult verify(VerifyInput input) throws ApiException {
    Object localVarPostBody = input;
    
    // verify the required parameter 'input' is set
    if (input == null) {
      throw new ApiException(400, "Missing the required parameter 'input' when calling verify");
    }
    
    // create path and map variables
    String localVarPath = "/v1/bio/verify";

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

    GenericType<VerifyResult> localVarReturnType = new GenericType<VerifyResult>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Performs a verification (1:1) of two supplied biometric subjects
   * 
   * @param input input (required)
   * @return VerifyResult
   * @throws ApiException if fails to make API call
   */
  public VerifyResult verifyT2t(VerifyT2TInput input) throws ApiException {
    Object localVarPostBody = input;
    
    // verify the required parameter 'input' is set
    if (input == null) {
      throw new ApiException(400, "Missing the required parameter 'input' when calling verifyT2t");
    }
    
    // create path and map variables
    String localVarPath = "/v1/bio/verify-t2t";

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

    GenericType<VerifyResult> localVarReturnType = new GenericType<VerifyResult>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
