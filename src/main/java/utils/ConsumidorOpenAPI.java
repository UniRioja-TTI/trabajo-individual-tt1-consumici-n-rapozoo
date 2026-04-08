package utils;

import java.util.Map;

import org.openapitools.client.*;
import org.openapitools.client.api.*;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClientResponseException;

@Service
public class ConsumidorOpenAPI {
	private final ResultadosApi resultadosApi;

    public ConsumidorOpenAPI() {
        ApiClient cliente = new ApiClient();
        cliente.setBasePath("http://localhost:8081"); 
        this.resultadosApi = new ResultadosApi(cliente);
    }

    public String obtenerGridDesdeVM(Integer token, String nombreUsuario) {
        try {
            Object respuesta = resultadosApi.resultadosPost(nombreUsuario, token).block();
            
            if (respuesta instanceof Map) {
                Map<String, Object> mapaRespuesta = (Map<String, Object>) respuesta;
                if ((Boolean)(mapaRespuesta.get("done"))) {
                    Object data = mapaRespuesta.get("data");
                    return data != null ? data.toString() : "";
                } else {
                    return "ErrorVM: " + String.valueOf(mapaRespuesta.get("errorMessage"));
                }
            }
            return respuesta != null ? respuesta.toString() : "";
        } 
		catch(WebClientResponseException ex) {
			return "Error conectando con la API para realizar la petición.";
		}
		catch(Exception ex) {
			return "Error inesperado procesando la respuesta: " + ex.getMessage();
		}
    }
}
