package primerosEjercicios;

public class Rebajas {
	    static double descubrePorcentaje(double precioOriginal, double precioFinal) {
		double precioRebajado = precioOriginal - precioFinal;
		double porcentaje = precioRebajado * 100 / precioOriginal;
		return porcentaje;
	    }
}
