package ejercicios;

public class Ejercicio5 {

	    public static void main(String[] args) {

	        int[] numeros = {1, 2, 3, 4, 5};
	        int[] numerosInvertidos = new int[numeros.length];

	        for (int i = 0; i < numeros.length; i++) {
	            numerosInvertidos[i] = numeros[numeros.length - 1 - i];
	        }
	        
	        
	    }
	}
