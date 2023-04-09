package ejercicioPersona;

public class Persona {
	
	public String nombre;
	public String apellidos;
	public int edad;
	
	public Persona (String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	public Persona (Persona p) {
		this.nombre = p.nombre;
		this.apellidos = p.apellidos;
		this.edad = p.edad;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public boolean equals(Object obj) {
		Persona p = (Persona) obj;
		if (this.nombre == p.nombre && this.apellidos == p.apellidos && this.edad == p.edad)
			return true;
		else
			return false;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nApellidos: " + apellidos + "\nEdad: " + edad;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Persona p1 = new Persona(this.nombre, this.apellidos, this.edad);
		return p1;
	}
}