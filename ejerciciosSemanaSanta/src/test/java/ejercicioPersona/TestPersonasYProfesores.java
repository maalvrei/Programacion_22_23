package ejercicioPersona;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Date;

import org.junit.jupiter.api.Test;

public class TestPersonasYProfesores {
	
	@Test
	void testPersonas () throws CloneNotSupportedException {
		
		Persona p1 = new Persona("Jaime", "Martin Gomez" , 27);
		Persona p2 = new Persona("Jose Antonio", "Pachon Sancho" , 29);
		Persona p3 = new Persona(p2);
		Persona p4 = (Persona) p3.clone();
		Persona p5 = p3;
		
		// p1 == p2? false
		assertFalse(p1 == p2, "Debería ser false");
		// p2 == p3? false
		assertFalse(p2 == p3, "Debería ser false");
		// p2.equals(p3)? true
		assertTrue(p2.equals(p3), "Debería ser true");
		// p2.equals(p4)? true
		assertTrue(p2.equals(p4), "Debería ser true");
		// p2.equals(p5)? true
		assertTrue(p2.equals(p5), "Debería ser true");
		// p2 == p4? false
		assertFalse(p2 == p4, "Debería ser false");
		// p5 == p3? true
		assertTrue(p5 == p3, "Debería ser true");
		// p3.equals(p5)? true
		assertTrue(p3.equals(p5), "Debería ser true");
	}
	
	@Test
	void testProfesores () throws CloneNotSupportedException {
		
		Profesor p1 = new Profesor("Daniel", "Guzman", 41, "47484847A" , "Lengua y literatura");
		Profesor p2 = new Profesor("Jesus", "Martos", 41, "47484847B" , "Ingles");
		Profesor p3 = new Profesor(p2);
		Profesor p4 = (Profesor) p3.clone();
		Profesor p5 = p3;
		
		// p1 == p2? false
		assertFalse(p1 == p2, "Debería ser false");
		// p2 == p3? false
		assertFalse(p2 == p3, "Debería ser false");
		// p2.equals(p3)? true
		assertTrue(p2.equals(p3), "Debería ser true");
		// p2.equals(p4)? true
		assertTrue(p2.equals(p4), "Debería ser true");
		// p2.equals(p5)? true
		assertTrue(p2.equals(p5), "Debería ser true");
		// p2 == p4? false
		assertFalse(p2 == p4, "Debería ser false");
		// p5 == p3? true
		assertTrue(p5 == p3, "Debería ser true");
		// p3.equals(p5)? true
		assertTrue(p3.equals(p5), "Debería ser true");
	}
	
	@Test
	void testProfesoresInterinos () throws CloneNotSupportedException {
		Date d1 = new Date (116, 3, 5);
		Date d2 = new Date (114, 8, 7);
		ProfesorInterino p1 = new ProfesorInterino("Daniel", "Guzman", 41, "47484847A" , "Lengua y literatura", d1);
		ProfesorInterino p2 = new ProfesorInterino("Jesus", "Martos", 41, "47484847B" , "Ingles", d2);
		ProfesorInterino p3 = new ProfesorInterino(p2);
		ProfesorInterino p4 = (ProfesorInterino) p3.clone();
		ProfesorInterino p5 = p3;
		
		// p1 == p2? false
		assertFalse(p1 == p2, "Debería ser false");
		// p2 == p3? false
		assertFalse(p2 == p3, "Debería ser false");
		// p2.equals(p3)? true
		assertTrue(p2.equals(p3), "Debería ser true");
		// p2.equals(p4)? true
		assertTrue(p2.equals(p4), "Debería ser true");
		// p2.equals(p5)? true
		assertTrue(p2.equals(p5), "Debería ser true");
		// p2 == p4? false
		assertFalse(p2 == p4, "Debería ser false");
		// p5 == p3? true
		assertTrue(p5 == p3, "Debería ser true");
		// p3.equals(p5)? true
		assertTrue(p3.equals(p5), "Debería ser true");
	}
	
}
