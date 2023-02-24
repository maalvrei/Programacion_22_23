package ejercicioCambioDeMonedas;

public class Finanzas {
	
	double cambio;
	
	Finanzas (double c) {
		cambio = c; 
	}
	
	Finanzas () {
		this.cambio = 1.36;
	}
	
	public double dolaresToEuros(double dolares) {
		return dolares*cambio;
	}
	
	public double eurosToDolares(double euros) {
		return euros/cambio;
	}
	
	public static void main (String args []) {
		Finanzas fin = new Finanzas();
		System.out.println(fin.dolaresToEuros(4));
		Finanzas fin2 = new Finanzas(1.4);
		System.out.println(fin2.dolaresToEuros(4));
	}
}
