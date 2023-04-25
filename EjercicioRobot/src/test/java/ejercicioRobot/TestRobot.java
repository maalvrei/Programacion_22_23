package ejercicioRobot;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestRobot {
	
	@Test
	void testRobots () throws CloneNotSupportedException {
		Robot r1 = new Robot (1,1,1);
		Robot r2 = (Robot) r1.clone();
		Robot r3 = new Robot (r2);
		Robot r4 = r3;
		Robot r5 = (Robot) r4.clone();
		Robot r6 = new Robot (1,4,3);
		
		//r1 equals r2 debe ser true
		assertTrue(r1.equals(r2));
		//r1 == r2 deberia ser false
		assertFalse(r1==r2);
		// r1 y r2 equals a r3 debe ser true
		assertTrue(r1.equals(r3));
		assertTrue(r2.equals(r3));
		//pero r1 y r2 == r3 debe ser false
		assertFalse(r1==r3);
		assertFalse(r2==r3);
		// r1, r2 y r3 equals r4 debe ser true
		assertTrue(r1.equals(r4));
		assertTrue(r2.equals(r4));
		assertTrue(r3.equals(r4));
		// sin embargo, solo r3 == r4
		assertFalse(r1==r3);
		assertFalse(r2==r4);
		assertTrue(r3==r4);
		// r1, r2 , r3  y r4 equals r5 debe ser true
		assertTrue(r1.equals(r5));
		assertTrue(r2.equals(r5));
		assertTrue(r3.equals(r5));
		assertTrue(r4.equals(r5));
		// r1, r2, r3 y r4 == r5 debe ser false
		assertFalse(r1==r5);
		assertFalse(r2==r5);
		assertFalse(r3==r5);
		assertFalse(r4==r5);
		// r6 es un objeto totalmente diferente a los demas. cualquier equals debe ser false
		assertFalse(r1.equals(r6));
		assertFalse(r2.equals(r6));
		assertFalse(r3.equals(r6));
		assertFalse(r4.equals(r6));
		assertFalse(r5.equals(r6));
		
	}
	
}
