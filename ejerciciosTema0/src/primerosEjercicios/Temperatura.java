package primerosEjercicios;

public class Temperatura {
	
	static int i = 8;
	
	double farenheitACelsius (double temp) {
		
		return (temp-32)/1.8;

	}
	
	double celsiusAFarenheit (double temp) {
		return 1.8*temp + 32;

	}
}
