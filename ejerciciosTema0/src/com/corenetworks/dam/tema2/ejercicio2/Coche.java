package com.corenetworks.dam.tema2.ejercicio2;

public class Coche {
	private int velocidad;	
	Coche () {
		velocidad = 0;
		
	}
	int getVelocidad() {
		// TODO MIGUE
		return velocidad;
	}
	
	void aceleraMas(int mas) {
		velocidad += mas;
	}
	
	void aceleraMenos (int menos) {
		velocidad -= menos;
	}
}
