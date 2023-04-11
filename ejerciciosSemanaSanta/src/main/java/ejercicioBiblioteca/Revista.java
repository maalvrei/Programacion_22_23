package ejercicioBiblioteca;

public class Revista extends Biblioteca implements Prestable {

	public int identificador;
	
	public Revista (String titulo, String codigo, int anyoPublicacion, int identificador) {
		super(titulo, codigo, anyoPublicacion);
		this.identificador = identificador;
	}
	
	@Override
	public String toString() {
		return "Titulo de la revista: " + titulo + "\nCodigo de la revista: " + codigo + "\nPublicada el año " + anyoPublicacion;
	}

	@Override
	public void prestar() {
		prestado = true;
	}

	@Override
	public void devolver() {
		prestado = false;
	}

	@Override
	public boolean prestado() {
		if (prestado = true) {
			System.out.println("La revista está prestada");
			return true;
		} else {
			System.out.println("La revista está disponible");
			return false;
		}
	}
}
