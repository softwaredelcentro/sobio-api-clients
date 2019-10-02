package ar.com.sdc.sobio.api.v1;

import ar.com.sdc.sobio.client.v1.ApiException;
import ar.com.sdc.sobio.client.v1.ApiClient;
import ar.com.sdc.sobio.client.v1.Configuration;
import ar.com.sdc.sobio.client.v1.Pair;

import javax.ws.rs.core.GenericType;

import ar.com.sdc.sobio.model.v1.ExtractDNIARInput;
import ar.com.sdc.sobio.model.v1.ExtractDNIARResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-02T11:05:26.582-03:00")
public class DocumentExtractionApi {
  private ApiClient apiClient;

  public DocumentExtractionApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DocumentExtractionApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Extracts ARGENTINA ID Card document information
   * 
   * @param param0 param0 (required)
   * @return ExtractDNIARResult
   * @throws ApiException if fails to make API call
   */
  public ExtractDNIARResult extractDniArDocInfo(ExtractDNIARInput param0) throws ApiException {
    Object localVarPostBody = param0;
    
    // verify the required parameter 'param0' is set
    if (param0 == null) {
      throw new ApiException(400, "Missing the required parameter 'param0' when calling extractDniArDocInfo");
    }
    
    // create path and map variables
    String localVarPath = "/v1/document-extraction/dni-ar";

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

    GenericType<ExtractDNIARResult> localVarReturnType = new GenericType<ExtractDNIARResult>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
