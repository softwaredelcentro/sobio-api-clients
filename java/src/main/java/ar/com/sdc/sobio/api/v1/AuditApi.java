package ar.com.sdc.sobio.api.v1;

import ar.com.sdc.sobio.client.v1.ApiException;
import ar.com.sdc.sobio.client.v1.ApiClient;
import ar.com.sdc.sobio.client.v1.Configuration;
import ar.com.sdc.sobio.client.v1.Pair;

import javax.ws.rs.core.GenericType;

import ar.com.sdc.sobio.model.v1.AuditByDateInput;
import ar.com.sdc.sobio.model.v1.AuditByDateOutput;
import ar.com.sdc.sobio.model.v1.AuditDetailInput;
import ar.com.sdc.sobio.model.v1.AuditDetailListInput;
import ar.com.sdc.sobio.model.v1.AuditDetailListOutput;
import ar.com.sdc.sobio.model.v1.AuditDetailOutput;
import ar.com.sdc.sobio.model.v1.Resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-28T07:44:13.357-03:00")
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
   * Lists audit-data filtered by dates, and number of rows
   * 
   * @param input input (required)
   * @return AuditByDateOutput
   * @throws ApiException if fails to make API call
   */
  public AuditByDateOutput byDate(AuditByDateInput input) throws ApiException {
    Object localVarPostBody = input;
    
    // verify the required parameter 'input' is set
    if (input == null) {
      throw new ApiException(400, "Missing the required parameter 'input' when calling byDate");
    }
    
    // create path and map variables
    String localVarPath = "/v1/audit/by-date";

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

    GenericType<AuditByDateOutput> localVarReturnType = new GenericType<AuditByDateOutput>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Lists filtered audit-details
   * 
   * @param input input (required)
   * @return AuditDetailOutput
   * @throws ApiException if fails to make API call
   */
  public AuditDetailOutput detailsList(AuditDetailInput input) throws ApiException {
    Object localVarPostBody = input;
    
    // verify the required parameter 'input' is set
    if (input == null) {
      throw new ApiException(400, "Missing the required parameter 'input' when calling detailsList");
    }
    
    // create path and map variables
    String localVarPath = "/v1/audit/details-by-txid";

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

    GenericType<AuditDetailOutput> localVarReturnType = new GenericType<AuditDetailOutput>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Lists filtered audit-details
   * 
   * @param input input (required)
   * @return AuditDetailListOutput
   * @throws ApiException if fails to make API call
   */
  public AuditDetailListOutput detailsList1(AuditDetailListInput input) throws ApiException {
    Object localVarPostBody = input;
    
    // verify the required parameter 'input' is set
    if (input == null) {
      throw new ApiException(400, "Missing the required parameter 'input' when calling detailsList1");
    }
    
    // create path and map variables
    String localVarPath = "/v1/audit/details-list";

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

    GenericType<AuditDetailListOutput> localVarReturnType = new GenericType<AuditDetailListOutput>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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

    String[] localVarAuthNames = new String[] { "Token" };

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

    String[] localVarAuthNames = new String[] { "Token" };

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

    String[] localVarAuthNames = new String[] { "Token" };

    GenericType<Resource> localVarReturnType = new GenericType<Resource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
