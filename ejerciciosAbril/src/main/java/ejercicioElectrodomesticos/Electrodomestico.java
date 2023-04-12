package ejercicioElectrodomesticos;

public class Electrodomestico {

	public String marca;
	public String modelo;
	public int consumo;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getConsumo() {
		return consumo;
	}
	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}
	
	public Electrodomestico (String marca, String modelo, int consumo) {
		this.marca = marca;
		this.modelo = modelo;
		this.consumo = consumo;
	}
	
	public Electrodomestico (Electrodomestico e) {
		this.marca = e.marca;
		this.modelo = e.modelo;
		this.consumo = e.consumo;
	}
	
	@Override
	public String toString() {
		return "Electrodoméstico marca " + marca + " modelo " + modelo + " con un consumo de " + consumo + " vatios";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Electrodomestico e1 = new Electrodomestico(this.marca, this.modelo, this.consumo);
		return e1;
	}
	
	@Override
	public boolean equals(Object obj) {
		Electrodomestico e = (Electrodomestico) obj;
		if (this.marca.equals(e.marca) && this.modelo.equals(e.modelo) && this.consumo == e.consumo)
			return true;
		else
			return false;
	}
}
