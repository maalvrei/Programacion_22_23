package ejercicioPrioridadMensaje;

public interface Logable {
	
	String leerMensaje();
	void cambiarMensaje(String mensaje);
	void cambiarPrioridadAlta();
	void cambiarPrioridadNormal();
	void cambiarPrioridadBaja();
	
}
