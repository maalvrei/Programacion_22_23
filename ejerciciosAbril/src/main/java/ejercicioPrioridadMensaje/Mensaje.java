package ejercicioPrioridadMensaje;

public class Mensaje implements Logable {
	
	public String mensaje;
	public String prioridad;
	
	public Mensaje (String mensaje) {
		this.mensaje = mensaje;
		prioridad = "normal";
	}

	@Override
	public String leerMensaje() {
		return mensaje;
	}

	@Override
	public void cambiarMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public void cambiarPrioridadAlta() {
		prioridad= "alta";
	}

	@Override
	public void cambiarPrioridadNormal() {
		prioridad = "normal";
		
	}

	@Override
	public void cambiarPrioridadBaja() {
		prioridad = "baja";
	}
	
}
