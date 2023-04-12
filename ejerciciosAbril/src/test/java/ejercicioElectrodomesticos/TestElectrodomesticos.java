package ejercicioElectrodomesticos;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestElectrodomesticos {
	
	@Test
	void testFrigorificos() throws CloneNotSupportedException {
		
		Frigorifico f1 = new Frigorifico ("Samsung", "Acero inoxidable" , 100, 1);
		Frigorifico f2 = new Frigorifico ("Samsung" , "Acero inoxidable" , 100, 1);
		Frigorifico f3 = (Frigorifico) f2.clone();
		Frigorifico f4 = new Frigorifico (f3);
		Frigorifico f5 = f4;
		
		// f1, f2 y f3 son iguales entre ellos, por lo tanto, los equals entre ellos devolveran true
		assertTrue(f1.equals(f2));
		assertTrue(f1.equals(f3));
		assertTrue(f2.equals(f3));
		// sin embargo, aunque equals devuelva true, no son el mismo objeto, asi que la referencia es diferente y por lo tanto devuelve false
		assertFalse(f1 == f2);
		assertFalse(f1 == f3);
		assertFalse(f2 == f3);
		// creamos f4 con el constructor copia pasandole f3, por lo tanto, f4 es equals a f3, f2 y f1
		assertTrue(f3.equals(f4));
		assertTrue(f1.equals(f4));
		assertTrue(f2.equals(f4));
		// pero no es el mismo objeto que f3, por lo que f3 == f4 devuelve false
		assertFalse(f3 == f4);
		// por ultimo creamos f5 diciendo que f5 es igual a f4. en este caso, f5 es equals que f4 y ademas hacen referencia al mismo objeto
		assertTrue(f4 == f5);
		assertTrue(f4.equals(f5));
		// f5 sera equals que f4, f3, f2 y f1, pero solo es == a f4
		assertTrue(f5.equals(f3));
		assertTrue(f5.equals(f2));
		assertTrue(f5.equals(f1));
	}
	
}
