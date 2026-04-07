package com.tt1.trabajo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import interfaces.InterfazEnviarEmails;
import modelo.Destinatario;
import servicios.EnviarEmails;
import servicios.LoggerConfig;

class EnviarEmailsTest {

	InterfazEnviarEmails mailer;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		LoggerConfig loggerConfig = new LoggerConfig();
		mailer = new EnviarEmails(loggerConfig.simulationLogger());
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testEnviarEmail() {
		assertTrue(!mailer.enviarEmail(null, null));
		assertTrue(!mailer.enviarEmail(new Destinatario(), ""));
		assertTrue(mailer.enviarEmail(new Destinatario(), "A mis 50 años, decidí dejar mi zona de confort en La Mancha y hacer el mayor pivot de mi carrera. 🚀\r\n"
				+ "\r\n"
				+ "Vivía una vida estable y acomodada. Tenía patrimonio, un equipo de apoyo increíble en casa (un ama, mi sobrina y un Facility Manager todoterreno) y mi rutina estaba basada en el slow living: caza, madrugones y una dieta tradicional. 🥘\r\n"
				+ "\r\n"
				+ "Pero sentía que me faltaba propósito.\r\n"
				+ "\r\n"
				+ "Empecé a consumir contenido intensivamente. Me obsesioné tanto con el mindset de los grandes referentes de la caballería que liquidé activos inmobiliarios (tierras de sembradura) solo para seguir formándome y comprar más libros.\r\n"
				+ "\r\n"
				+ "Feliciano de Silva se convirtió en mi mentor virtual. Sus textos eran una pura masterclass de copywriting. 📚\r\n"
				+ "\r\n"
				+ "Hacía networking y debatía horas con mi círculo de confianza (el cura y el barbero de mi pueblo) sobre liderazgo: ¿Quién fue mejor CEO, Amadís de Gaula o el Caballero del Febo?\r\n"
				+ "\r\n"
				+ "Me metí tanto en el proyecto que sufrí un burnout severo (literalmente, se me secó el cerebro de tanto leer y tan poco dormir). Pero en esa crisis de salud mental encontré mi verdadera visión: la ficción que leía era mi estudio de mercado. El mundo necesitaba mi propuesta de valor. 💡\r\n"
				+ "\r\n"
				+ "Decidí emprender en solitario como Caballero Andante.\r\n"
				+ "\r\n"
				+ "Mi misión: solucionar puntos de dolor en la sociedad, deshacer agravios y posicionar mi marca personal a nivel global para, eventualmente, adquirir el imperio de Trapisonda. 🌍\r\n"
				+ "\r\n"
				+ "¿Cómo apliqué la metodología Lean Startup para mi lanzamiento?\r\n"
				+ "\r\n"
				+ "1️⃣ Bootstrapping y hardware: En lugar de buscar rondas de inversión, reciclé la armadura vintage de mis bisabuelos. Optimización de recursos al máximo.\r\n"
				+ "2️⃣ Iteración del MVP (Producto Mínimo Viable): Creé un casco con cartón. Falló el primer testeo de estrés (lo rompí de un espadazo), así que pivoté, lo reforcé con hierro y lo di por validado. Confianza total en el producto. 🛠️\r\n"
				+ "3️⃣ Rebranding y Naming: Tras 4 días de brainstorming, rediseñé la identidad de mi principal activo de movilidad. Mi caballo flaco pasó a llamarse Rocinante. Un nombre potente, sonoro y posicionado como líder absoluto de su sector. 🐎\r\n"
				+ "\r\n"
				+ "Nunca es tarde para salir a buscar tus propias aventuras y escalar tu honor.\r\n"
				+ "\r\n"
				+ "¿Y tú? ¿Estás dispuesto a que te llamen loco por perseguir tu propósito? Te leo en los comentarios. 👇\r\n"
				+ "\r\n"
				+ "#Emprendimiento #ReinvencionProfesional #Mindset #LeanStartup #CaballeriaAndante #LaMancha #Growth"));
		
	}

}
