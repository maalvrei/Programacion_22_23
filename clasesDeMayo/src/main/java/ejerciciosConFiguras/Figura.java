package ejerciciosConFiguras;

public class Figura implements Cloneable {
	
	protected String color;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		else if (obj == null)
			return false;
		else if (!(obj instanceof Figura))
			return false;	
		else {
			Figura f = (Figura) obj;
			if (this.color==null && f.color==null)
				return true;
			return this.color.equals(f.color);
		}
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
