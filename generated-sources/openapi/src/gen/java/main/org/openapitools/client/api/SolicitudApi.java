package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ProblemDetails;
import org.openapitools.client.model.Solicitud;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-04-07T20:19:18.508386700+02:00[Europe/Madrid]", comments = "Generator version: 7.21.0")
public class SolicitudApi {
    private ApiClient apiClient;

    public SolicitudApi() {
        this(new ApiClient());
    }

    public SolicitudApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param nombreUsuario The nombreUsuario parameter
     * @param tok The tok parameter
     * @return List&lt;Integer&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec solicitudComprobarSolicitudGetRequestCreation(@jakarta.annotation.Nullable String nombreUsuario, @jakarta.annotation.Nullable Integer tok) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nombreUsuario", nombreUsuario));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tok", tok));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Integer> localVarReturnType = new ParameterizedTypeReference<Integer>() {};
        return apiClient.invokeAPI("/Solicitud/ComprobarSolicitud", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param nombreUsuario The nombreUsuario parameter
     * @param tok The tok parameter
     * @return List&lt;Integer&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Integer> solicitudComprobarSolicitudGet(@jakarta.annotation.Nullable String nombreUsuario, @jakarta.annotation.Nullable Integer tok) throws WebClientResponseException {
        ParameterizedTypeReference<Integer> localVarReturnType = new ParameterizedTypeReference<Integer>() {};
        return solicitudComprobarSolicitudGetRequestCreation(nombreUsuario, tok).bodyToFlux(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param nombreUsuario The nombreUsuario parameter
     * @param tok The tok parameter
     * @return ResponseEntity&lt;List&lt;Integer&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Integer>>> solicitudComprobarSolicitudGetWithHttpInfo(@jakarta.annotation.Nullable String nombreUsuario, @jakarta.annotation.Nullable Integer tok) throws WebClientResponseException {
        ParameterizedTypeReference<Integer> localVarReturnType = new ParameterizedTypeReference<Integer>() {};
        return solicitudComprobarSolicitudGetRequestCreation(nombreUsuario, tok).toEntityList(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param nombreUsuario The nombreUsuario parameter
     * @param tok The tok parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec solicitudComprobarSolicitudGetWithResponseSpec(@jakarta.annotation.Nullable String nombreUsuario, @jakarta.annotation.Nullable Integer tok) throws WebClientResponseException {
        return solicitudComprobarSolicitudGetRequestCreation(nombreUsuario, tok);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param nombreUsuario The nombreUsuario parameter
     * @return List&lt;Integer&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec solicitudGetSolicitudesUsuarioGetRequestCreation(@jakarta.annotation.Nullable String nombreUsuario) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nombreUsuario", nombreUsuario));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Integer> localVarReturnType = new ParameterizedTypeReference<Integer>() {};
        return apiClient.invokeAPI("/Solicitud/GetSolicitudesUsuario", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param nombreUsuario The nombreUsuario parameter
     * @return List&lt;Integer&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Integer> solicitudGetSolicitudesUsuarioGet(@jakarta.annotation.Nullable String nombreUsuario) throws WebClientResponseException {
        ParameterizedTypeReference<Integer> localVarReturnType = new ParameterizedTypeReference<Integer>() {};
        return solicitudGetSolicitudesUsuarioGetRequestCreation(nombreUsuario).bodyToFlux(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param nombreUsuario The nombreUsuario parameter
     * @return ResponseEntity&lt;List&lt;Integer&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Integer>>> solicitudGetSolicitudesUsuarioGetWithHttpInfo(@jakarta.annotation.Nullable String nombreUsuario) throws WebClientResponseException {
        ParameterizedTypeReference<Integer> localVarReturnType = new ParameterizedTypeReference<Integer>() {};
        return solicitudGetSolicitudesUsuarioGetRequestCreation(nombreUsuario).toEntityList(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param nombreUsuario The nombreUsuario parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec solicitudGetSolicitudesUsuarioGetWithResponseSpec(@jakarta.annotation.Nullable String nombreUsuario) throws WebClientResponseException {
        return solicitudGetSolicitudesUsuarioGetRequestCreation(nombreUsuario);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param nombreUsuario The nombreUsuario parameter
     * @param solicitud The solicitud parameter
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec solicitudSolicitarPostRequestCreation(@jakarta.annotation.Nullable String nombreUsuario, @jakarta.annotation.Nullable Solicitud solicitud) throws WebClientResponseException {
        Object postBody = solicitud;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nombreUsuario", nombreUsuario));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json", "application/*+json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/Solicitud/Solicitar", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param nombreUsuario The nombreUsuario parameter
     * @param solicitud The solicitud parameter
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Object> solicitudSolicitarPost(@jakarta.annotation.Nullable String nombreUsuario, @jakarta.annotation.Nullable Solicitud solicitud) throws WebClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return solicitudSolicitarPostRequestCreation(nombreUsuario, solicitud).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param nombreUsuario The nombreUsuario parameter
     * @param solicitud The solicitud parameter
     * @return ResponseEntity&lt;Object&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Object>> solicitudSolicitarPostWithHttpInfo(@jakarta.annotation.Nullable String nombreUsuario, @jakarta.annotation.Nullable Solicitud solicitud) throws WebClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return solicitudSolicitarPostRequestCreation(nombreUsuario, solicitud).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param nombreUsuario The nombreUsuario parameter
     * @param solicitud The solicitud parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec solicitudSolicitarPostWithResponseSpec(@jakarta.annotation.Nullable String nombreUsuario, @jakarta.annotation.Nullable Solicitud solicitud) throws WebClientResponseException {
        return solicitudSolicitarPostRequestCreation(nombreUsuario, solicitud);
    }
}
