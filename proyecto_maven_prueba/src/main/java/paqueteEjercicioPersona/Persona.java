package paqueteEjercicioPersona;

import paquete27032023.Direccion;

public class Persona {

	public String nombre;
	public String apellidos;
	public int anyoDeNacimiento;
	private String apodo;
	
	public Persona(String nombre, String apellidos, int anyoDeNacimiento, String apodo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.anyoDeNacimiento = anyoDeNacimiento;
        this.apodo = apodo;
    }
	
	public Persona (Persona p) {
		this.nombre = p.nombre;
        this.apellidos = p.apellidos;
        this.anyoDeNacimiento = p.anyoDeNacimiento;
        this.apodo = p.apodo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public int getAnyio() {
		return anyoDeNacimiento;
	}
	
	public void setAnyio(int anyo) {
		anyoDeNacimiento = anyo;
	}
	
	public String getApodo() {
		return apodo;
	}
	
	public void setApodo (String apodo) {
		this.apodo = apodo;
	}
	
	@Override
	public boolean equals(Object obj) {
		Persona p = (Persona) obj;
		if (this.nombre == p.nombre && this.apellidos == p.apellidos && this.anyoDeNacimiento == p.anyoDeNacimiento && this.apodo == p.apodo)
			return true;
			else
				return false;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Persona p1 = new Persona(this.nombre, this.apellidos, this.anyoDeNacimiento, this.apodo);
		return p1;
	}
	
	@Override
	public String toString() {
		return "Persona que se llama " + nombre + ", cuyos apellidos son " + apellidos + ", nacida en el año " + anyoDeNacimiento + ", conocida como " + apodo;
	}
}
