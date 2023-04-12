package ejercicioElectrodomesticos;

public class Frigorifico extends Electrodomestico {

	public int temperatura;
	
	public Frigorifico (String marca, String modelo, int consumo, int temperatura) {
		super(marca, modelo, consumo);
		this.temperatura = temperatura;
	}
	
	public Frigorifico (Frigorifico f) {
		super(f.marca, f.modelo, f.consumo);
		this.temperatura = f.temperatura;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	
	@Override
	public String toString() {
		return "Frigorifico de marca " + marca + " modelo " + modelo + " con un consumo de " + consumo + " vatios y que alcanza una temperatura de " + temperatura + " grados centigrados.";
	}
	
	@Override
	public boolean equals(Object obj) {
		Frigorifico f = (Frigorifico) obj;
		if (super.equals(f) && this.temperatura == f.temperatura)
			return true;
		else
			return false;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Frigorifico f1 = new Frigorifico(this.marca, this.modelo, this.consumo, this.temperatura);
		return f1;
	}
	
}
