package paquete_granja;

public class Perro extends Animal {
	
	private String nombre;
	
	Perro () {
		this.nombre = "timo";
	}
	
	Perro (String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public void funcion2() {
		super.funcion2();
		System.out.println("clase Perro");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "nombre perro" + nombre;
	}
	
}
