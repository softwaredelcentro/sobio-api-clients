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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-02T11:05:26.582-03:00")
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
   * @param param0 param0 (required)
   * @return IdentifyResult
   * @throws ApiException if fails to make API call
   */
  public IdentifyResult identify(IdentifyInput param0) throws ApiException {
    Object localVarPostBody = param0;
    
    // verify the required parameter 'param0' is set
    if (param0 == null) {
      throw new ApiException(400, "Missing the required parameter 'param0' when calling identify");
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

    String[] localVarAuthNames = new String[] {  };

    GenericType<IdentifyResult> localVarReturnType = new GenericType<IdentifyResult>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Performs a verification (1:1) of supplied biometric data against a supplied enrolled subject id
   * 
   * @param param0 param0 (required)
   * @return VerifyResult
   * @throws ApiException if fails to make API call
   */
  public VerifyResult verify(VerifyInput param0) throws ApiException {
    Object localVarPostBody = param0;
    
    // verify the required parameter 'param0' is set
    if (param0 == null) {
      throw new ApiException(400, "Missing the required parameter 'param0' when calling verify");
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

    String[] localVarAuthNames = new String[] {  };

    GenericType<VerifyResult> localVarReturnType = new GenericType<VerifyResult>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Performs a verification (1:1) of two supplied biometric subjects
   * 
   * @param param0 param0 (required)
   * @return VerifyResult
   * @throws ApiException if fails to make API call
   */
  public VerifyResult verifyT2t(VerifyT2TInput param0) throws ApiException {
    Object localVarPostBody = param0;
    
    // verify the required parameter 'param0' is set
    if (param0 == null) {
      throw new ApiException(400, "Missing the required parameter 'param0' when calling verifyT2t");
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

    String[] localVarAuthNames = new String[] {  };

    GenericType<VerifyResult> localVarReturnType = new GenericType<VerifyResult>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
