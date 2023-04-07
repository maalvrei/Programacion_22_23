package paquete_granja;

public class Testing {

	public static void main(String[] args) throws CloneNotSupportedException {
		Perro perrete = new Perro("testPerro1");
		System.out.println(perrete);
		cambiarPerro(perrete);
		System.out.println(perrete);
		Perro p2 = (Perro) perrete.clone();
	}

	public static void cambiarPerro(Perro perrete) {
		perrete = new Perro();
	}

}
