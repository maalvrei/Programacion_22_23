package paquete_prueba_1;

public class CalcularIMCException extends Exception {
	
	public String msj;
	
	public CalcularIMCException (String msj) {
		super(msj);
	}
	
}