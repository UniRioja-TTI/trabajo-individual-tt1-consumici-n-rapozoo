package utils;

import java.util.List;

import org.openapitools.client.*;
import org.openapitools.client.api.*;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;

import reactor.core.publisher.Flux;

public class ConsumidorOpenAPI {
	public static void main(String[] args) {
		ApiClient cliente = new ApiClient();
	    cliente.setBasePath("http://localhost:8081");
	    SolicitudApi api = new SolicitudApi(cliente);	    
	    try {
            Flux<Integer> respuesta = api.solicitudGetSolicitudesUsuarioGet("usuario");
            System.out.println("Servidor respondió: " + respuesta);
        } catch (Exception e) {
            System.out.println("Error al conectar con la VM: " + e.getMessage());
        }
	}
}
