package ar.com.sdc.sobio.api.v1;

import ar.com.sdc.sobio.client.v1.ApiException;
import ar.com.sdc.sobio.client.v1.ApiClient;
import ar.com.sdc.sobio.client.v1.Configuration;
import ar.com.sdc.sobio.client.v1.Pair;

import javax.ws.rs.core.GenericType;

import ar.com.sdc.sobio.model.v1.Resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-02T11:05:26.582-03:00")
public class AuditApi {
  private ApiClient apiClient;

  public AuditApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AuditApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Download zipped activity log for supplied audit id
   * 
   * @param auditId auditId (required)
   * @return Resource
   * @throws ApiException if fails to make API call
   */
  public Resource downloadId(String auditId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'auditId' is set
    if (auditId == null) {
      throw new ApiException(400, "Missing the required parameter 'auditId' when calling downloadId");
    }
    
    // create path and map variables
    String localVarPath = "/v1/audit/by-audit-id/{auditId}"
      .replaceAll("\\{" + "auditId" + "\\}", apiClient.escapeString(auditId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/octet-stream"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Resource> localVarReturnType = new GenericType<Resource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Download zipped activity log for supplied subject id
   * 
   * @param subjectId subjectId (required)
   * @return Resource
   * @throws ApiException if fails to make API call
   */
  public Resource downloadId1(String subjectId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'subjectId' is set
    if (subjectId == null) {
      throw new ApiException(400, "Missing the required parameter 'subjectId' when calling downloadId1");
    }
    
    // create path and map variables
    String localVarPath = "/v1/audit/by-subject-id/{subjectId}"
      .replaceAll("\\{" + "subjectId" + "\\}", apiClient.escapeString(subjectId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/octet-stream"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Resource> localVarReturnType = new GenericType<Resource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Downloads zipped activity log for supplied audit token
   * 
   * @param auditToken auditToken (required)
   * @return Resource
   * @throws ApiException if fails to make API call
   */
  public Resource downloadId2(String auditToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'auditToken' is set
    if (auditToken == null) {
      throw new ApiException(400, "Missing the required parameter 'auditToken' when calling downloadId2");
    }
    
    // create path and map variables
    String localVarPath = "/v1/audit/by-audit-token/{auditToken}"
      .replaceAll("\\{" + "auditToken" + "\\}", apiClient.escapeString(auditToken.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/octet-stream"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Resource> localVarReturnType = new GenericType<Resource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
