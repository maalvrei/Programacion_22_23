package ejercicioPersona;

public class Profesor extends Persona {
	
	public String idProfesor;
	public String asignatura;
	
	public String getIdProfesor() {
		return idProfesor;
	}
	public void setIdProfesor(String idProfesor) {
		this.idProfesor = idProfesor;
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	
	public Profesor (String nombre, String apellidos, int edad, String idProfesor, String asignatura) {
		super(nombre, apellidos, edad);
		this.idProfesor = idProfesor;
		this.asignatura = asignatura;
	}
	
	public Profesor (Profesor p) {
		super(p.nombre, p.apellidos, p.edad);
		this.idProfesor = p.idProfesor;
		this.asignatura = p.asignatura;
	}
	
	@Override
	public boolean equals(Object obj) {
		Profesor p = (Profesor) obj;
		if (this.nombre == p.nombre && this.apellidos == p.apellidos && this.edad == p.edad && this.asignatura == p.asignatura && this.idProfesor == p.idProfesor)
			return true;
		else
			return false;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nApellidos: " + apellidos + "\nEdad: " + edad + "\nID de Profesor: " + idProfesor + "\nAsignatura: " + asignatura;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Profesor p1 = new Profesor(this.nombre, this.apellidos, this.edad, this.idProfesor, this.asignatura);
		return p1;
	}
}
