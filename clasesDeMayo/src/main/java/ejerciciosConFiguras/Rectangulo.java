package ejerciciosConFiguras;

public class Rectangulo {

	private int base;
	private int altura;
	
	Rectangulo (int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return "Base: " + base + "\nAltura: " + altura;
	}
	
}
