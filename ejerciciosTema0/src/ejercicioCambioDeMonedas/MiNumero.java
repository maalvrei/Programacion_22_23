package ejercicioCambioDeMonedas;

public class MiNumero {
	
	double numero;
	
	MiNumero (double n) {
		numero = n;
	}
	
	double dobleDelNumero() {
		return numero * 2;
	}
	
	double tripleDelNumero() {
		return numero * 3;
	}
	
	double cuadrupleDelNumero () {
		return numero * 4;
	}
	
	public static void main (String args []) {
		MiNumero numero1 = new MiNumero(1);
		System.out.println(numero1.dobleDelNumero());
		System.out.println(numero1.tripleDelNumero());
		System.out.println(numero1.cuadrupleDelNumero());
		
		MiNumero numero2 = new MiNumero(2);
		System.out.println(numero2.dobleDelNumero());
		System.out.println(numero2.tripleDelNumero());
		System.out.println(numero2.cuadrupleDelNumero());
		
	}
}
