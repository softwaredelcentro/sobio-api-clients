package ar.com.sdc.sobio.api.v1;

import ar.com.sdc.sobio.client.v1.ApiException;
import ar.com.sdc.sobio.client.v1.ApiClient;
import ar.com.sdc.sobio.client.v1.Configuration;
import ar.com.sdc.sobio.client.v1.Pair;

import javax.ws.rs.core.GenericType;

import ar.com.sdc.sobio.model.v1.DeleteInput;
import ar.com.sdc.sobio.model.v1.DeleteResult;
import ar.com.sdc.sobio.model.v1.EnrollInput;
import ar.com.sdc.sobio.model.v1.EnrollResult;
import ar.com.sdc.sobio.model.v1.ListInput;
import ar.com.sdc.sobio.model.v1.ListOutput;
import ar.com.sdc.sobio.model.v1.ObtainSubjectBiometricData;
import ar.com.sdc.sobio.model.v1.ObtainSubjectInfo;
import ar.com.sdc.sobio.model.v1.Resource;
import ar.com.sdc.sobio.model.v1.SubjectBiometricDataResult;
import ar.com.sdc.sobio.model.v1.SubjectInformationResult;
import ar.com.sdc.sobio.model.v1.UpdateInput;
import ar.com.sdc.sobio.model.v1.UpdateResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-02T11:05:26.582-03:00")
public class DatabaseApi {
  private ApiClient apiClient;

  public DatabaseApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DatabaseApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Deletes an enrolled subject from biometric engine
   * 
   * @param param0 param0 (required)
   * @return DeleteResult
   * @throws ApiException if fails to make API call
   */
  public DeleteResult delete(DeleteInput param0) throws ApiException {
    Object localVarPostBody = param0;
    
    // verify the required parameter 'param0' is set
    if (param0 == null) {
      throw new ApiException(400, "Missing the required parameter 'param0' when calling delete");
    }
    
    // create path and map variables
    String localVarPath = "/v1/bio/delete";

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

    GenericType<DeleteResult> localVarReturnType = new GenericType<DeleteResult>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Download zipped subject biometric data for supplied subject id
   * 
   * @param subjectId subjectId (required)
   * @return Resource
   * @throws ApiException if fails to make API call
   */
  public Resource downloadZippedBiodata(String subjectId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'subjectId' is set
    if (subjectId == null) {
      throw new ApiException(400, "Missing the required parameter 'subjectId' when calling downloadZippedBiodata");
    }
    
    // create path and map variables
    String localVarPath = "/v1/bio/download-zipped-biodata/{subjectId}"
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
   * Performs a biometric enrollment supplied biometric data which is associated with supplied enrolled subject id
   * 
   * @param param0 param0 (required)
   * @return EnrollResult
   * @throws ApiException if fails to make API call
   */
  public EnrollResult enroll(EnrollInput param0) throws ApiException {
    Object localVarPostBody = param0;
    
    // verify the required parameter 'param0' is set
    if (param0 == null) {
      throw new ApiException(400, "Missing the required parameter 'param0' when calling enroll");
    }
    
    // create path and map variables
    String localVarPath = "/v1/bio/enroll";

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

    GenericType<EnrollResult> localVarReturnType = new GenericType<EnrollResult>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List enrolled Subject ID&#39;s
   * 
   * @param param0 param0 (required)
   * @return ListOutput
   * @throws ApiException if fails to make API call
   */
  public ListOutput list(ListInput param0) throws ApiException {
    Object localVarPostBody = param0;
    
    // verify the required parameter 'param0' is set
    if (param0 == null) {
      throw new ApiException(400, "Missing the required parameter 'param0' when calling list");
    }
    
    // create path and map variables
    String localVarPath = "/v1/bio/list";

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

    GenericType<ListOutput> localVarReturnType = new GenericType<ListOutput>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Obtain biometric enrolled data from supplied subject id
   * 
   * @param param0 param0 (required)
   * @return SubjectBiometricDataResult
   * @throws ApiException if fails to make API call
   */
  public SubjectBiometricDataResult subjectData(ObtainSubjectBiometricData param0) throws ApiException {
    Object localVarPostBody = param0;
    
    // verify the required parameter 'param0' is set
    if (param0 == null) {
      throw new ApiException(400, "Missing the required parameter 'param0' when calling subjectData");
    }
    
    // create path and map variables
    String localVarPath = "/v1/bio/subject-data";

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

    GenericType<SubjectBiometricDataResult> localVarReturnType = new GenericType<SubjectBiometricDataResult>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Obtain information of supplied subject id
   * 
   * @param param0 param0 (required)
   * @return SubjectInformationResult
   * @throws ApiException if fails to make API call
   */
  public SubjectInformationResult subjectInfo(ObtainSubjectInfo param0) throws ApiException {
    Object localVarPostBody = param0;
    
    // verify the required parameter 'param0' is set
    if (param0 == null) {
      throw new ApiException(400, "Missing the required parameter 'param0' when calling subjectInfo");
    }
    
    // create path and map variables
    String localVarPath = "/v1/bio/subject-info";

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

    GenericType<SubjectInformationResult> localVarReturnType = new GenericType<SubjectInformationResult>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Updates biometric data of an already enrolled subject
   * 
   * @param param0 param0 (required)
   * @return UpdateResult
   * @throws ApiException if fails to make API call
   */
  public UpdateResult update(UpdateInput param0) throws ApiException {
    Object localVarPostBody = param0;
    
    // verify the required parameter 'param0' is set
    if (param0 == null) {
      throw new ApiException(400, "Missing the required parameter 'param0' when calling update");
    }
    
    // create path and map variables
    String localVarPath = "/v1/bio/update";

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

    GenericType<UpdateResult> localVarReturnType = new GenericType<UpdateResult>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
