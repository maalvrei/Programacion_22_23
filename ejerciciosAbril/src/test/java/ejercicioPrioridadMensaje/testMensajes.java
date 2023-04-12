package ejercicioPrioridadMensaje;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class testMensajes {
	
	@Test
	void testMensaje () {
		
		Mensaje m1 = new Mensaje("Tu pedido se ha procesado");
		
		// creamos el mensaje m1 con el contenido "Tu pedido se ha procesado"
		assertTrue(m1.mensaje.equals("Tu pedido se ha procesado"));
		// el constructor establece por defecto la prioridad como normal, asi que el test deberia ser true
		assertTrue(m1.prioridad.equals("normal"));
		
		//cambiamos la prioridad a alta
		m1.cambiarPrioridadAlta();
		assertTrue(m1.prioridad.equals("alta"));
		
		// y la cambiamos a baja
		m1.cambiarPrioridadBaja();
		assertTrue(m1.prioridad.equals("baja"));
		
		
		// la volvemos a cambiar a su estado por defecto
		m1.cambiarPrioridadNormal();
		assertTrue(m1.prioridad.equals("normal"));
		
	}
	
}
