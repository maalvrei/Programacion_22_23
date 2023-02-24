package com.corenetworks.dam.tema2.ejercicio2;

import java.util.Scanner;

public class ChocosConPapas {

	double kgChocos;
	double kgPapas;

	public double getComensales() {
		int personas = 0;
		while (kgChocos >= 0.16 && kgPapas >= 0.33) {
			personas += 1;
			kgChocos -= 0.16;
			kgPapas -= 0.33;
		}
		return personas;
	}

	public void añadirChocos(double cantidad) {
		kgChocos += cantidad;
	}

	public void añadirPapas(double cantidad) {
		kgPapas += cantidad;
	}

	public double mostrarChocos() {
		return kgChocos;
	}

	public double mostrarPapas() {
		return kgPapas;
	}

	public static void main(String args[]) {
		ChocosConPapas restaurante = new ChocosConPapas();
		Scanner consola = new Scanner (System.in);
		System.out.println("¿Cuántos kg de chocos tienes?");
		double entradaChocos = consola.nextDouble();
		restaurante.añadirChocos(entradaChocos);
		System.out.println("¿Cuántos kg de papas tienes?");
		double entradaPapas = consola.nextDouble();
		restaurante.añadirPapas(entradaPapas);
		System.out.println("Tienes " + restaurante.mostrarChocos() + " kilogramos de chocos " + "y "
				+ restaurante.mostrarPapas() + " kilogramos de papas.\n" + "Con esto, puedes atender a "
				+ restaurante.getComensales() + " personas.\n" + "Te quedan " + restaurante.mostrarChocos()
				+ " kilogramos de chocos y " + restaurante.mostrarPapas() + " kilogramos de papas");
		consola.close();
	}
}