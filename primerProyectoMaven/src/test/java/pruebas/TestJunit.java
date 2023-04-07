package pruebas;

import org.junit.jupiter.api.Test;


import paquete_prueba_1.CalcularIMCException;
import paquete_prueba_1.EdadException;
import paquete_prueba_1.GeneraDNIException;
import paquete_prueba_1.Persona;

public class TestJunit {

	@Test
	void testSingleSuccessTest() {
		Persona p1 = new Persona();
		try {
			p1.generaDNIExt("78457444");
		} catch (GeneraDNIException e) {

			System.out.println(e.getMessage());

		}
	}

	@Test
	void testSingleSuccessTest2() {
		Persona p1 = new Persona(84.0, 180.0);
		try {
			p1.calculaImc();
		} catch (CalcularIMCException e) {

			System.out.println(e.getMessage());

		}
	}

	@Test
	void testSingleSuccessTest3() throws EdadException {
		Persona p1 = new Persona(5);
		try {
			p1.esMayorDeEdad();
		} catch (EdadException e) {
			System.out.println(e.getMessage());

		}
	}

}
