package ejercicioBiblioteca;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestBiblioteca {

	@Test
	void testLibros() {
		Libro l1 = new Libro("Juego de Tronos", "12345A", 1996);
		Libro l2 = new Libro("Choque de Reyes", "12345B", 1998);
		Libro l3 = new Libro("Tormenta de Espadas", "12345C", 2000);
		Libro l4 = new Libro("Festin de Cuervos", "12345D", 2005);
		Libro l5 = new Libro("Danza de Dragones", "12345E", 2011);
		
		// el libro se inicializa como no prestado, es decir, prestado = false
		assertFalse(l1.prestado);
		// procedemos a prestarlo, es decir, prestado = true
		l1.prestar();
		assertTrue(l1.prestado);
		// y lo devolvemos, volviendo el atributo prestado a false
		l1.devolver();
		assertFalse(l1.prestado);
		
		// el libro se inicializa como no prestado, es decir, prestado = false
		assertFalse(l2.prestado);
		// procedemos a prestarlo, es decir, prestado = true
		l2.prestar();
		assertTrue(l2.prestado);
		// y lo devolvemos, volviendo el atributo prestado a false
		l2.devolver();
		assertFalse(l2.prestado);
		
		// el libro se inicializa como no prestado, es decir, prestado = false
		assertFalse(l3.prestado);
		// procedemos a prestarlo, es decir, prestado = true
		l3.prestar();
		assertTrue(l3.prestado);
		// y lo devolvemos, volviendo el atributo prestado a false
		l3.devolver();
		assertFalse(l3.prestado);
		
		// el libro se inicializa como no prestado, es decir, prestado = false
		assertFalse(l4.prestado);
		// procedemos a prestarlo, es decir, prestado = true
		l4.prestar();
		assertTrue(l4.prestado);
		// y lo devolvemos, volviendo el atributo prestado a false
		l4.devolver();
		assertFalse(l4.prestado);
		
		// el libro se inicializa como no prestado, es decir, prestado = false
		assertFalse(l5.prestado);
		// procedemos a prestarlo, es decir, prestado = true
		l5.prestar();
		assertTrue(l5.prestado);
		// y lo devolvemos, volviendo el atributo prestado a false
		l5.devolver();
		assertFalse(l5.prestado);
	}
	
	@Test
	void testRevistas() {
		Revista r1 = new Revista("Muy Interesante" , "54321A" , 2001 , 1);
		Revista r2 = new Revista("Muy Interesante" , "54321B" , 2001 , 2);
		Revista r3 = new Revista("Muy Interesante" , "54321C" , 2001 , 3);
		Revista r4 = new Revista("Muy Interesante" , "54321D" , 2001 , 4);
		Revista r5 = new Revista("Muy Interesante" , "54321E" , 2001 , 5);
		
		// la revista se inicializa como no prestado, es decir, prestado = false
		assertFalse(r1.prestado);
		// procedemos a prestarlo, es decir, prestado = true
		r1.prestar();
		assertTrue(r1.prestado);
		// y lo devolvemos, volviendo el atributo prestado a false
		r1.devolver();
		assertFalse(r1.prestado);
		
		// la revista se inicializa como no prestado, es decir, prestado = false
		assertFalse(r2.prestado);
		// procedemos a prestarlo, es decir, prestado = true
		r2.prestar();
		assertTrue(r2.prestado);
		// y lo devolvemos, volviendo el atributo prestado a false
		r2.devolver();
		assertFalse(r2.prestado);
			
		// la revista se inicializa como no prestado, es decir, prestado = false
		assertFalse(r3.prestado);
		// procedemos a prestarlo, es decir, prestado = true
		r3.prestar();
		assertTrue(r3.prestado);
		// y lo devolvemos, volviendo el atributo prestado a false
		r3.devolver();
		assertFalse(r3.prestado);
				
		// la revista se inicializa como no prestado, es decir, prestado = false
		assertFalse(r4.prestado);
		// procedemos a prestarlo, es decir, prestado = true
		r4.prestar();
		assertTrue(r4.prestado);
		// y lo devolvemos, volviendo el atributo prestado a false
		r4.devolver();
		assertFalse(r4.prestado);
				
		// la revista se inicializa como no prestado, es decir, prestado = false
		assertFalse(r5.prestado);
		// procedemos a prestarlo, es decir, prestado = true
		r5.prestar();
		assertTrue(r5.prestado);
		// y lo devolvemos, volviendo el atributo prestado a false
		r5.devolver();
		assertFalse(r5.prestado);
	}

}
