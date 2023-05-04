package ejerciciosConFiguras;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestUnitarios {
	
	@Test
	void testFiguras () throws CloneNotSupportedException {
		Circulo c1 = new Circulo(1);
		Circulo c2 = new Circulo(1);
		Circulo c3 = (Circulo) c2.clone();
		
		assertTrue(c1.equals(c2));
		assertTrue(c3.equals(c2));
	}
	
}
