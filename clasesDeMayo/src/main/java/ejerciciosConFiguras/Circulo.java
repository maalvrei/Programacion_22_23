package ejerciciosConFiguras;

public class Circulo extends Figura {

	public double radio;
	
	public Circulo (int radio) {
		this.radio = radio;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		else if (obj == null)
			return false;
		else if (!(obj instanceof Circulo))
			return false;
		else {
			Circulo c = (Circulo) obj;
			if (super.equals(c))
				return this.radio == c.radio;
			return false;
		}

		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Circulo c = (Circulo) super.clone();
		return c;
	}
	
	
}
