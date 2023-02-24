package primerosEjercicios;

import java.util.Random;

public class Ejercicios {

	public static void ejercicio4() {
		int a = 1;
		int b = 2;
		System.out.println("El valor de a es " + a + "\n" + "El valor de b es " + b);
		int c = a;
		a = b;
		b = c;
		System.out.println("El valor de a es " + a + "\n" + "El valor de b es " + b);
	}

	public static void ejercicio5() {
		// este ejercicio calcula la longitud de una circunferencia, que es radio por pi
		final double pi = 3.1416;
		int radio = 3;
		System.out.println("La longitud de una circunferencia con radio " + radio + " es " + 2 * radio * pi);
	}

	public static void ejercicio6() {
		// este ejercicio calcula el area de una circunferencia, que es radio al
		// cuadrado por pi
		final double pi = 3.1416;
		int radio = 5;
		System.out.println("El área de una circunferencia con radio " + radio + " es " + radio * radio * pi);
	}

	public static void ejercicio8() {
		
        for (int i = 0 ; i<10 ; i++) {
        	Random random = new Random();
            char letraAleatoria = (char) (random.nextInt(26) + 'a');
        if (letraAleatoria == 'a' || letraAleatoria == 'e' || letraAleatoria == 'i' || letraAleatoria == 'o' || letraAleatoria == 'u') {
        System.out.println("La letra aleatoria es " + letraAleatoria + " y es una vocal");
        } else {
        	System.out.println("La letra aleatoria es " + letraAleatoria + " y es una consonante");
        }
        }
	}
	
	public static void main(String args[]) {
		ejercicio8();
	}
}
