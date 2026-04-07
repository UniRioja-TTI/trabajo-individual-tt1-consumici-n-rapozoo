package servicios;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import interfaces.InterfazContactoSim;
import modelo.DatosSimulation;
import modelo.DatosSolicitud;
import modelo.Entidad;

@Service
public class ContactoSim implements InterfazContactoSim {

	private List<Entidad> entidades;
    private Map<Integer, DatosSolicitud> solicitudes;
    private SecureRandom random;
 
    public ContactoSim() {
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
    	solicitudes = new HashMap<>();
    	random = new SecureRandom();
    }
    
	@Override
	public int solicitarSimulation(DatosSolicitud sol) {
		int token = random.nextInt(1000000) + 1;
		solicitudes.put(token, sol);
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
	public boolean isValidEntityId(int ticket) {
		return solicitudes.containsKey(ticket);
	}

}
