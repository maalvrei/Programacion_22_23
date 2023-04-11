package ejercicioBiblioteca;

public class Biblioteca {
	
	public String titulo;
	public String codigo;
	public int anyoPublicacion;
	public boolean prestado;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getAnyoPublicacion() {
		return anyoPublicacion;
	}
	public void setAnyoPublicacion(int anyoPublicacion) {
		this.anyoPublicacion = anyoPublicacion;
	}
	
	public Biblioteca (String titulo, String codigo, int anyoPublicacion) {
		this.titulo = titulo;
		this.codigo = codigo;
		this.anyoPublicacion = anyoPublicacion;
		prestado = false;
	}
}
