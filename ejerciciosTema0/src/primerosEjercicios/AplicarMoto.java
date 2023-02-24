package primerosEjercicios;

public class AplicarMoto {
	public static void main(String args []) {
		Moto moto1 = new Moto("Yamaha" , 1);
		System.out.println(moto1.marca);
		System.out.println(moto1.velocidad);
		
		Moto moto2 = new Moto();
		System.out.println(moto2.marca);
		System.out.println(moto2.velocidad);
	}
}
