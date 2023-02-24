package ejercicioCambioDeMonedas;

public class Numero {
	int numeroEntero;
	
	Numero () {
		numeroEntero = 0;
	}
	
	Numero (int n) {
		numeroEntero = n;
	}
	
	public int aniade(int n) {
		return numeroEntero + n;
	}
	
	public int resta(int n) {
		return numeroEntero - n;
	}
	
	public int devuelveValor () {
		return numeroEntero;
	}
	
	public int doble() {
		return numeroEntero *2;
	}
	
	public int triple() {
		return numeroEntero *3;
	}
	
	public int setNumero() {
		return numeroEntero = 0;
	}
	
	public static void main (String args []) {
		Numero n1 = new Numero(4);
		System.out.println(n1.devuelveValor());
		n1.setNumero();
		System.out.println(n1.devuelveValor());
	}
}
