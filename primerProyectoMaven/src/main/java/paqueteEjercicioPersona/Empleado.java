package paqueteEjercicioPersona;

public class Empleado {

	public int idEmpleado;
	private String departamento;
	private Persona persona;

	public Empleado(int idEmpleado, String departamento, Persona persona) {
		this.idEmpleado = idEmpleado;
		this.departamento = departamento;
		this.persona = persona;
	}
	
	public Empleado(int idEmpleado, String departamento) {
		this.idEmpleado = idEmpleado;
		this.departamento = departamento;
	}

	public Empleado(Empleado e) {
		this.idEmpleado = e.idEmpleado;
		this.departamento = e.departamento;
		this.persona = e.persona;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Empleado e1 = new Empleado(this.idEmpleado, this.departamento);
		if (this.persona != null) {
			e1.setPersona((Persona) this.persona.clone());
		}
		return e1;
	}

	@Override
	public boolean equals(Object obj) {
		Empleado e = (Empleado) obj;
		if (this.idEmpleado == e.idEmpleado && this.departamento == e.departamento)
			if (e.persona != null) {
				return this.persona.equals(e.persona);
			}
		return false;
	}

	/**@Override
	public String toString() {
		return "Empleado cuyo id es " + idEmpleado + ", que trabaja en el departamento " + departamento + ".\n"
				+ persona.toString();
	}*/
}
