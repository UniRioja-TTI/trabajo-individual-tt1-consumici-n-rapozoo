package interfaces;

import java.util.List;

import modelo.DatosSimulation;
import modelo.DatosSolicitud;
import modelo.Entidad;

public interface InterfazContactoSim {
	// Devuelve un entero con el token que se le manda al cliente para que pueda 
	//solicitar los datos del resultado de la simulación con descargarDatos
	public int solicitarSimulation(DatosSolicitud sol);
	// Descarga los datos de la simulaciñon si se ha acabado.
	public DatosSimulation descargarDatos(int ticket);
	// Permite pedirle al servidor los datos de las entidades.
	public List<Entidad> getEntities();
	public boolean isValidEntityId(int ticket);
}
