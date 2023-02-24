package Ejercicios11Y12;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main (String args []) {
		Scanner input = new Scanner(System.in);
		System.out.println("Dime cuantos segundos tienes");
		int segundos = input.nextInt();
		int minutos = segundos/60;
		int segundosSobrantes = segundos%60;
		int horas = minutos/60;
		int minutosSobrantes = minutos%60;
		System.out.println(segundos 
				+ " segundos equivalen a "
				+ horas
				+ " horas, " + minutosSobrantes 
				+ " minutos" 
				+ " y " 
				+ segundosSobrantes + 
				" segundos a");
		input.close();
	}
}
