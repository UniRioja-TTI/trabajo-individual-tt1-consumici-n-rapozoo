package servicios;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openapitools.client.ApiClient;
import org.openapitools.client.api.SolicitudApi;
import org.openapitools.client.model.Solicitud;

import interfaces.InterfazContactoSim;
import modelo.DatosSimulation;
import modelo.DatosSolicitud;
import modelo.Entidad;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClientResponseException;

@Service
public class ContactoSimAPI implements InterfazContactoSim {

	private List<Entidad> entidades;
	private final SolicitudApi solicitudApi;
	private Logger logger;
 
    public ContactoSimAPI(Logger logger) {
    	this.logger = logger;
    	ApiClient cliente = new ApiClient();
        cliente.setBasePath("http://localhost:8081");
        this.solicitudApi = new SolicitudApi(cliente);
        
    	entidades = new ArrayList<>();
    	Entidad e1 = new Entidad(), e2 = new Entidad();
    	e1.setId(1);
    	e1.setName("Manolo");
    	e1.setDescripcion("Cabezabolo");
    	e2.setId(2);
    	e2.setName("Sans");
    	e2.setDescripcion("Undertale");
    	
    	entidades.add(e1);
    	entidades.add(e2);
    }
    
	@Override
	public int solicitarSimulation(DatosSolicitud sol) {
		int token = -1;
		Solicitud solicitud = new Solicitud();
		Map<Integer, Integer> cantidades = sol.getNums();
		
		for (Entidad entidad : entidades) {
            Integer cantidadPedida = cantidades.get(entidad.getId());
            
            if (cantidadPedida != null && cantidadPedida > 0) {
                solicitud.addNombreEntidadesItem(entidad.getName());
                solicitud.addCantidadesInicialesItem(cantidadPedida);
            }
        }
		
		try {
			Object respuesta = solicitudApi.solicitudSolicitarPost("usuarioPrueba", solicitud).block();
			Map<String, Object> mapaRespuesta = (Map<String, Object>) respuesta;
			if((Boolean)mapaRespuesta.get("done")) {
				token = Integer.parseInt(mapaRespuesta.get("tokenSolicitud").toString().trim());
			}
			else {
				logger.error("Error en la VM: " + String.valueOf(mapaRespuesta.get("errorMessage")));
			}
		}
		catch(NumberFormatException ex) {
			logger.error("Error parseando el token.");
		}
		catch(WebClientResponseException ex) {
			logger.error("Error conectando con la API para realizar la petición.");
		}
		catch(Exception ex) {
			logger.error("Error inesperado procesando la respuesta: " + ex.getMessage());
		}
		return token;
	}

	@Override
	public DatosSimulation descargarDatos(int ticket) {
		return new DatosSimulation();
	}

	@Override
	public List<Entidad> getEntities() {
		return entidades;
	}

	@Override
	public boolean isValidEntityId(int id) {
		for (Entidad e : entidades) {
            if (e.getId() == id) return true;
        }
        return false;
    }

	
}
