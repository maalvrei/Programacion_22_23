package ejercicioPersona;

import java.util.Date;

public class ProfesorInterino extends Profesor {

	public Date fechaInterinidad;

	public ProfesorInterino(String nombre, String apellidos, int edad, String idProfesor, String asignatura,
			Date fechaInterinidad) {
		super(nombre, apellidos, edad, idProfesor, asignatura);
		this.fechaInterinidad = fechaInterinidad;
	}

	public ProfesorInterino(ProfesorInterino p) {
		super(p.nombre, p.apellidos, p.edad, p.idProfesor, p.asignatura);
		this.fechaInterinidad = p.fechaInterinidad;
	}

	public Date getFechaInterinidad() {
		return fechaInterinidad;
	}

	public void setFechaInterinidad(Date fechaInterinidad) {
		this.fechaInterinidad = fechaInterinidad;
	}

	@Override
	public boolean equals(Object obj) {
		ProfesorInterino p = (ProfesorInterino) obj;
		if (this.nombre == p.nombre && this.apellidos == p.apellidos && this.edad == p.edad
				&& this.asignatura == p.asignatura && this.idProfesor == p.idProfesor
				&& this.fechaInterinidad == p.fechaInterinidad)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nApellidos: " + apellidos + "\nEdad: " + edad + "\nID de Profesor: " + idProfesor
				+ "\nAsignatura: " + asignatura + "\nFecha de la interinidad: " + fechaInterinidad;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		ProfesorInterino p1 = new ProfesorInterino(this.nombre, this.apellidos, this.edad, this.idProfesor, this.asignatura, this.fechaInterinidad);
		return p1;
	}
}
