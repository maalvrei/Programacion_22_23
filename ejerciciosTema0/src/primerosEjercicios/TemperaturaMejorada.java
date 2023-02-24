package primerosEjercicios;

import java.util.Scanner;

public class TemperaturaMejorada {
	
	Scanner consola = new Scanner(System.in);
	
	public void celsiusAFarenheit() {
		
	System.out.println("Dime la temperatura en Celsius");
	
	double temperatura = consola.nextDouble();
	double farenheit = 1.8*temperatura + 32; 
	System.out.println("Los grados en Celsius " + temperatura + " son " + farenheit + " grados Farenheit" );
	}
	
	public void farenheitACelsius() {
		
	System.out.println("Dime la temperatura en Farenheit");

	double temperatura = consola.nextDouble();
	double celsius = (temperatura-32)/1.8;
	
	System.out.println("Los grados en Farenheit " + temperatura + " son " + celsius + " grados Celsius" );
	}
}
