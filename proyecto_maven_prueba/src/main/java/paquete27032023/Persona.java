package paquete27032023;

public class Persona {

	private String nombre;
	private int edad;
	private Direccion direccion;

	public Persona(String nombre, int edad, Direccion direccion) {
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
	}

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public Persona(Persona p) {
		nombre = p.nombre;
		edad = p.edad;
		direccion = p.direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion d) {
		direccion = d;
	}

	public String toString() {
		return "Mi nombre es " + nombre + " y mi edad es" + edad + " y mi direccion es " + direccion;
	}

	@Override
	public boolean equals(Object obj) {
		Persona p = (Persona) obj;
		if (this.nombre == p.nombre && this.edad == p.edad)
			if (direccion != null)
				return this.direccion.equals(p.direccion);
			else
				return false;
		return false;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Persona p1 = new Persona(this.nombre, this.edad);
		if (direccion != null)
			p1.direccion = (Direccion) this.direccion.clone();
		return p1;
	}

	public static void main(String[] args) {

		Direccion d1 = new Direccion("San Patricio", 4, 41540);

		// crear persona p1 llamada pepe de 21 años

		Persona p1 = new Persona("Pepe", 21, d1);

		// crear persona p2 llamada jose de 21 años

		Persona p2 = new Persona("Jose", 21, d1);

		// crear otra persona p3 pepe de 21 años

		Persona p3 = new Persona("Pepe", 21, d1);

		// crear una persona p4 = p1

		Persona p4 = p1;

		// crear una persona p5 con el constructor copia

		Persona p5 = new Persona(p1);

		// creamos una persona p6 clonando p1

		try {
			Persona p6 = (Persona) p1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Persona p7 = new Persona("Juanito", 4, d1);
		System.out.println(p7);

	}

}
