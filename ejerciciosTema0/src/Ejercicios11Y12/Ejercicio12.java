package Ejercicios11Y12;

public class Ejercicio12 {
	public static void main(String[] args) {
		
		int dinero = 804;
		
		int b200 = 0, b20 = 0, b10 = 0;

		while (dinero >= 200) {
			b200 = dinero / 200;
			dinero = dinero - (b200 * 200);
		}
		
		while (dinero >= 20) {
			b20 = dinero / 20;
			dinero = dinero - (b20 * 20);
		}
		while (dinero >= 10) {
			b10 = dinero / 10;
			dinero = dinero - (b10 * 10);
		}
		System.out.println("Tienes " 
				+ b200 + " billetes de 200 euros\nTienes " 
				+ b20 + " billetes de 20 euros\nTienes " 
				+ b10 + " billetes de 10 euros\nTe sobran "
				+ dinero + " euros");
	}
	}
		
