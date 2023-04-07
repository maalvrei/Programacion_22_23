package pruebas;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import paquete27032023.Direccion;
import paquete27032023.Persona;

public class TestPersona {

	@Test
	void metodoDeTesting() {

		Direccion d1 = new Direccion("San Patricio", 4, 41540);

		Persona p1 = new Persona("Pepe", 21, d1);
		// crear persona p2 llamada jose de 21 años
		Persona p2 = new Persona("Jose", 21, d1);
		// crear otra persona p3 pepe de 21 años
		Persona p3 = new Persona("Pepe", 21, d1);
		// crear una persona p4 = p1
		Persona p4 = p1;
		// crear una persona p5 con el constructor copia
		Persona p5 = new Persona(p1);
		// creamos una persona p6 clonando p1
		try {
			Persona p6 = (Persona) p1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// p1 == p2? false
		assertFalse(p1.equals(p2), "deberia de ser false!");
		// p1 == p3? false
		assertTrue(p1.equals(p3), "deberia de ser false!");
		// p1 == p4? true
		assertTrue(p1.equals(p4), "debería ser true!");
		// p2 == p4? false
		assertFalse(p2.equals(p4), "debería ser false");
		// p1 == p5? true
		assertTrue(p1.equals(p5), "debería ser false");
		// p1.equals(p1)? true
		assertTrue(p1.equals(p1), "debería ser true");
		// p1.equals(p2)? false
		assertFalse(p1.equals(p2), "debería ser false");
		// p1.equals(p3)? true
		assertTrue(p1.equals(p3), "deberías ser true");
		// p1.equals(p4)? true
		assertTrue(p1.equals(p4), "deberías ser true");
		// p2.equals(p4)? false
		assertFalse(p2.equals(p4), "deberías ser false");
		// p3.equals(p4)? true
		assertTrue(p3.equals(p4), "deberías ser true");
		// p1.equals(p5)? true
		assertTrue(p1.equals(p5), "deberías ser true");
	}

	@Test
	void test_persona_direccion() throws CloneNotSupportedException {
		Direccion d1 = new Direccion("Resolana", 1, 41001);
		Direccion d2 = new Direccion("Ronda de Triana", 2, 41554);
		Direccion d3 = new Direccion("Castilla", 1, 41003);
		Direccion d4 = (Direccion) d1.clone();
		Direccion d5 = d1;

		assertFalse(d1 == d2, "Debería ser false");
		assertFalse(d1 == d3, "Debería ser false");
		assertFalse(d1 == d4, "Debería ser false");
		assertTrue(d1 == d5, "Debería ser true");
		assertFalse(d1.equals(d2), "Debería ser false");
		assertTrue(d2.equals(d2), "Debería ser true");
		assertFalse(d1.equals(d3), "Debería ser false");
		assertTrue(d1.equals(d4), "Debería ser true");

		Persona p1 = new Persona("Alex", 22);
		Persona p2 = new Persona("Pepe", 22);
		Persona p4 = new Persona("Manue", 22);
		Persona p5 = (Persona) p1.clone();
		Persona p6 = (Persona) p1.clone();

		p1.setDireccion(d1);
		p5.setDireccion(d2);
		p6.setDireccion(d1);

		assertFalse(p1.equals(p5));
		assertTrue(p1.equals(p6));
	}
}
