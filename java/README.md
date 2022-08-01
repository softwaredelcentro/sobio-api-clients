# client

Generated with swagger-codegen with

```shell
mvnw -Pswagger-codegen clean package deploy
```

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>ar.com.sdc.sobio</groupId>
    <artifactId>client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "ar.com.sdc.sobio:client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import ar.com.sdc.sobio.client.v1.*;
import ar.com.sdc.sobio.client.v1.auth.*;
import ar.com.sdc.sobio.model.v1.*;
import ar.com.sdc.sobio.api.v1.AuditApi;

import java.io.File;
import java.util.*;

public class AuditApiExample {

    public static void main(String[] args) {
        
        AuditApi apiInstance = new AuditApi();
        String auditId = "auditId_example"; // String | auditId
        try {
            Resource result = apiInstance.downloadId(auditId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuditApi#downloadId");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://127.0.0.1:8081*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuditApi* | [**downloadId**](docs/AuditApi.md#downloadId) | **GET** /v1/audit/audit-id/{auditId} | Download zipped activity log for supplied audit id
*AuditApi* | [**downloadId1**](docs/AuditApi.md#downloadId1) | **GET** /v1/audit/subject-id/{subjectId} | Download zipped activity log for supplied subject id
*AuditApi* | [**downloadId2**](docs/AuditApi.md#downloadId2) | **GET** /v1/audit/audit-token/{auditToken} | Downloads zipped activity log for supplied audit token
*DatabaseApi* | [**delete**](docs/DatabaseApi.md#delete) | **POST** /v1/bio/delete | Deletes an enrolled subject from biometric engine
*DatabaseApi* | [**downloadZippedBiodata**](docs/DatabaseApi.md#downloadZippedBiodata) | **GET** /v1/bio/subject-biodata/{subjectId} | Download zipped subject biometric data for supplied subject id
*DatabaseApi* | [**enroll**](docs/DatabaseApi.md#enroll) | **POST** /v1/bio/enroll | Performs a biometric enrollment supplied biometric data which is associated with supplied enrolled subject id
*DatabaseApi* | [**subjectData**](docs/DatabaseApi.md#subjectData) | **POST** /v1/bio/subject-data | Obtain biometric enrolled data from supplied subject id
*DatabaseApi* | [**subjectInfo**](docs/DatabaseApi.md#subjectInfo) | **POST** /v1/bio/subject-info | Obtain information of supplied subject id
*DatabaseApi* | [**update**](docs/DatabaseApi.md#update) | **POST** /v1/bio/update | Updates biometric data of an already enrolled subject
*ExtractionApi* | [**extractFaceImage**](docs/ExtractionApi.md#extractFaceImage) | **POST** /v1/bio/extract-face-image | Extracts face biometric data (template) from a supplied image
*ExtractionApi* | [**extractFaceVideo**](docs/ExtractionApi.md#extractFaceVideo) | **POST** /v1/bio/extract-face-video | Extracts face biometric data (template) from a supplied video
*ExtractionApi* | [**extractFingerprintImage**](docs/ExtractionApi.md#extractFingerprintImage) | **POST** /v1/bio/extract-fingerprint-image | Extracts finger biometric data (template) from a supplied image
*MatchingApi* | [**identify**](docs/MatchingApi.md#identify) | **POST** /v1/bio/identify | Performs an identification (1:N) of supplied biometric data against enrolled subjects (that match optionally supplied conditions)
*MatchingApi* | [**verify**](docs/MatchingApi.md#verify) | **POST** /v1/bio/verify | Performs a verification (1:1) of supplied biometric data against a supplied enrolled subject id
*MatchingApi* | [**verifyT2t**](docs/MatchingApi.md#verifyT2t) | **POST** /v1/bio/verify-t2t | Performs a verification (1:1) of two supplied biometric subjects


## Documentation for Models

 - [BiometricData](docs/BiometricData.md)
 - [CompositeFingerPrint](docs/CompositeFingerPrint.md)
 - [Conditions](docs/Conditions.md)
 - [DeleteInput](docs/DeleteInput.md)
 - [DeleteResult](docs/DeleteResult.md)
 - [DetectedAction](docs/DetectedAction.md)
 - [Emotion](docs/Emotion.md)
 - [EnrollInput](docs/EnrollInput.md)
 - [EnrollResult](docs/EnrollResult.md)
 - [EnrollmentParameters](docs/EnrollmentParameters.md)
 - [Expresion](docs/Expresion.md)
 - [ExtractFaceFromImageInput](docs/ExtractFaceFromImageInput.md)
 - [ExtractFaceFromImageResult](docs/ExtractFaceFromImageResult.md)
 - [ExtractFaceFromVideoInput](docs/ExtractFaceFromVideoInput.md)
 - [ExtractFaceFromVideoResult](docs/ExtractFaceFromVideoResult.md)
 - [ExtractFingerFromImageInput](docs/ExtractFingerFromImageInput.md)
 - [ExtractedFace](docs/ExtractedFace.md)
 - [Face](docs/Face.md)
 - [FaceExtractionParams](docs/FaceExtractionParams.md)
 - [FaceMatchingParameters](docs/FaceMatchingParameters.md)
 - [FacePoseSensibilityConfig](docs/FacePoseSensibilityConfig.md)
 - [FaceProperties](docs/FaceProperties.md)
 - [FingerPrint](docs/FingerPrint.md)
 - [FingerPrintMatchingParameters](docs/FingerPrintMatchingParameters.md)
 - [Gender](docs/Gender.md)
 - [IdentifyInput](docs/IdentifyInput.md)
 - [IdentifyParameters](docs/IdentifyParameters.md)
 - [IdentifyResult](docs/IdentifyResult.md)
 - [InputStream](docs/InputStream.md)
 - [ObtainSubjectInfo](docs/ObtainSubjectInfo.md)
 - [ParametrosExtraccionHuella](docs/ParametrosExtraccionHuella.md)
 - [Point](docs/Point.md)
 - [Position](docs/Position.md)
 - [PropiedadesHuella](docs/PropiedadesHuella.md)
 - [Resource](docs/Resource.md)
 - [ResultadoExtraccionHuellaSimple](docs/ResultadoExtraccionHuellaSimple.md)
 - [SubjectBiometricDataResult](docs/SubjectBiometricDataResult.md)
 - [SubjectInformationResult](docs/SubjectInformationResult.md)
 - [Traits](docs/Traits.md)
 - [URI](docs/URI.md)
 - [URL](docs/URL.md)
 - [UpdateInput](docs/UpdateInput.md)
 - [UpdateParameters](docs/UpdateParameters.md)
 - [UpdateResult](docs/UpdateResult.md)
 - [VerificationParameters](docs/VerificationParameters.md)
 - [VerifyInput](docs/VerifyInput.md)
 - [VerifyResult](docs/VerifyResult.md)
 - [VerifyT2TInput](docs/VerifyT2TInput.md)
 - [Voice](docs/Voice.md)
 - [VoiceMatchingParameters](docs/VoiceMatchingParameters.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

info@softwaredelcentro.com.ar

