package com.tt1.trabajo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.DatosSolicitud;
import modelo.Entidad;
import servicios.ContactoSim;

class ContactoSimTest {

	private ContactoSim contactoSim;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		contactoSim = new ContactoSim();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSimulation() {
		Map<Integer,Integer> datos = new HashMap<Integer,Integer>();
		datos.put(1, 2);
		DatosSolicitud ds = new DatosSolicitud(datos);
		int ticket = contactoSim.solicitarSimulation(ds);
		assertNotEquals(0, ticket, "No puede ser 0");
		assertNotNull(contactoSim.descargarDatos(ticket));
	}

	@Test
	void testIsValidEntityId() {
		List<Entidad> entidades = contactoSim.getEntities();
		if(entidades != null && !entidades.isEmpty()){
			assertTrue(contactoSim.isValidEntityId(entidades.get(0).getId()), "Tiene que ser válida");
		}
	}
}
