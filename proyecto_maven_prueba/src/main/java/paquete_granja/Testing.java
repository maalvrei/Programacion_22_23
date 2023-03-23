package paquete_granja;

public class Testing {
	
	
	
	public static void main(String[] args) {
		Perro perrete = new Perro("testPerro1");
		System.out.println(perrete);
		cambiarPerro(perrete);
		System.out.println(perrete);
	}
	
	public static void cambiarPerro(Perro perrete) {
		perrete = new Perro();
	}
	
}
