package Calcu;

public class TestCalculadora {
	
	static void pruebaUnitaria () {
		
		Calculadora cal = new Calculadora();
		
		int entero1 = 1;
		int entero2 = 2;
		
		int primeraSuma = cal.suma(entero1, entero2);
		
		if (primeraSuma != 2) {
			System.out.println("El resultado esta mal");
		}
		
		if (primeraSuma != 4) {
			System.out.println("El resultado esta mal");
		}
		
		if (primeraSuma != 6) {
			System.out.println("El resultado esta mal");
		}
		
		if (primeraSuma != 10) {
			System.out.println("El resultado esta mal");
		}
	}
	
	
	public static void main (String [] args) {
		pruebaUnitaria ();
	}
}
