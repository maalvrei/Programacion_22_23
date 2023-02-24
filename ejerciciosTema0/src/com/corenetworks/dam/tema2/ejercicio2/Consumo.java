package com.corenetworks.dam.tema2.ejercicio2;

public class Consumo {
	private double km;
	private double litros;
	private double vmed;
	private double pgas;
	
	public Consumo (double kms, double litrosCombustible, double velocidadMedia, double precioCombustible) {
		km = kms;
		litros = litrosCombustible;
		vmed = velocidadMedia;
		pgas = precioCombustible;
	}
	
	public double getTiempo () {
		return km / vmed;
	}
	
	public double consumoMedio () {
		return (litros*100)/km;
	}
	
	public double consumoEuros () {
		return consumoMedio() * pgas;
	}
	
	public void setKms (float kilometros) {
		km = kilometros;
	}
	
	public void setLitros (float litrosCombustible) {
		litros = litrosCombustible;
	}
	
	public void setVmed (float velocidadMedia) {
		vmed = velocidadMedia;
	}
	
	public void setPgas (float precioGasolina) {
		pgas = precioGasolina;
	}
	
	public static void main(String args []) {
		Consumo coche1 = new Consumo (600, 30, 140.0, 1.45);
		System.out.println(coche1.consumoEuros());
	}
}
