package com.corenetworks.dam.tema2.ejercicio2;

public class Ejercicio2 {
	public static void main (String args []) {
		Coche coche1 = new Coche();
		System.out.println(coche1.getVelocidad());
		coche1.aceleraMas(4);
		System.out.println(coche1.getVelocidad());
		coche1.aceleraMenos(1);
		System.out.println(coche1.getVelocidad());
	}
}
