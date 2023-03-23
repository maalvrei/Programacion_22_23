package paquete_granja;

public class Granja {
	
	Animal a;
	Perro p;
	
	Granja (Animal a, Perro p) {
		this.a = a;
		this.p = p;
	}
	
	void setAnimales (Animal a, Perro p) {
		a = this.a;
		this.p = p;
	}
	
	Animal getAnimal() {
		return this.a;
	}
	
	
}