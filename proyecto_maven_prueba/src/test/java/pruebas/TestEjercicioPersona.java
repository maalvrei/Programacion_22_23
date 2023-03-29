package pruebas;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import paqueteEjercicioPersona.Empleado;
import paqueteEjercicioPersona.Persona;

public class TestEjercicioPersona {

	@Test
	void testingPersonasYEmpleados () throws CloneNotSupportedException {
		Persona p1 = new Persona("Jaime" , "Martin Gomez" , 1996 , "Mochuelo");
		Persona p2 = new Persona("Antonio" , "Gonzalez Aguirre" , 1996 , "Mastodonte");
		Persona p3 = new Persona("José Antonio", "Pachón Sancho" , 1994 , "Fantasmita");
		Persona p4 = new Persona("Gabriel" , "Ropero Cívico"  , 1995  ,"Gabi el Gordo");
		Persona p5 = new Persona(p4);
		Persona p6 = p4;
        Persona p7 = (Persona) p3.clone();
		// p1 == p2? false
		assertFalse(p1.equals(p2),"Debería ser false");
		// p1 == p3? false
		assertFalse(p1.equals(p3), "Debería ser false");
		// p1 == p4? false
		assertFalse(p1.equals(p4), "Debería ser false");
		// p1 == p5? false
		assertFalse(p1.equals(p5), "Debería ser false");
		// p1 == p6? false
		assertFalse(p1.equals(p6), "Debería ser false");
		// p3 == p7? true
		assertTrue(p3.equals(p7), "Debería ser true");
		// p1.equals(p2)? false
		assertFalse(p1.equals(p2), "Debería ser false");
		// p1.equals(p3)? false
		assertFalse(p1.equals(p3), "Debería ser false");
		// p1.equals(p4)? false
		assertFalse(p1.equals(p4), "Debería ser false");
		// p5.equals(p4)? true
		assertTrue(p5.equals(p4), "Debería ser true");
		// p6.equals(p4)? true
		assertTrue(p6.equals(p4), "deberías ser true");
		// p6.equals(p5)? true
		assertTrue(p6.equals(p5), "deberías ser true");
		
		Empleado e1 = new Empleado (1,"Finanzas", p1);
		Empleado e2 = new Empleado (2,"Contabilidad", p2);
		Empleado e3 = new Empleado (3,"Publicidad", p3);
		Empleado e4 = new Empleado (4,"Gerencia", p4);
		Empleado e5 = new Empleado (e4);
		Empleado e6 = e4;
		Empleado e7 = (Empleado) e3.clone();
		
		// e1 == e2? false
		assertFalse(e1.equals(e2),"Debería ser false");
		// e1 == e3? false
		assertFalse(e1.equals(e3), "Debería ser false");
		// e1 == e4? false
		assertFalse(e1.equals(e4), "Debería ser false");
		// e1 == e5? false
		assertFalse(e1.equals(e5), "Debería ser false");
		// e1 == e6? false
		assertFalse(e1.equals(e6), "Debería ser false");
		// e3 == e7? false
		assertFalse(e3.equals(e7), "Debería ser false");
		// e1.equals(e2)? false
		assertFalse(e1.equals(e2), "Debería ser false");
		// e1.equals(e3)? false
		assertFalse(e1.equals(e3), "Debería ser false");
		// e1.equals(e4)? false
		assertFalse(e1.equals(e4), "Debería ser false");
		// e5.equals(e4)? true
		assertTrue(p5.equals(p4), "Debería ser true");
		// e6.equals(e4)? true
		assertTrue(e6.equals(e4), "deberías ser true");
		// e6.equals(e5)? true
		assertTrue(e6.equals(e5), "deberías ser true");
	}
	
}
