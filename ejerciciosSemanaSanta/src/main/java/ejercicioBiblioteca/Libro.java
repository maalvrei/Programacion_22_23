package ejercicioBiblioteca;

public class Libro extends Biblioteca implements Prestable {
	
	public Libro (String titulo, String codigo, int anyoPublicacion) {
		super(titulo, codigo, anyoPublicacion);
	}
	
	@Override
	public String toString() {
		return "Titulo del libro: " + titulo + "\nCodigo del libro" + codigo + "\nPublicado el año " + anyoPublicacion;
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
			System.out.println("El libro está prestado");
			return true;
		} else {
			System.out.println("El libro está disponible");
			return false;
		}
	}
	
}
