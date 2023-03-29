package paquete_prueba_1;

import java.util.Random;

public class Persona {

	private String nombre;
	private int edad;
	private String dni = generaDNI();
	private char SEXO_POR_DEFECTO = 'H';
	private char sexo;
	private static double peso;
	private static double altura;

	public Persona() {
		this.sexo = SEXO_POR_DEFECTO;
	}

	Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	Persona(String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	public Persona(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}

	public Persona(int edad) {
		this.edad = edad;
	}

	public static int calcularImc(double peso, double altura) {
		final int ideal = -1;
		final int porDebajo = 0;
		final int sobrepeso = 1;
		final int error = 2;
		double imc = peso / (altura * altura);
		if (imc < 20) {
			return ideal;
		} else {
			if (imc >= 20 && imc <= 50) {
				return porDebajo;
			} else {
				if (imc > 25) {
					return sobrepeso;
				} else {
					return error;
				}
			}

		}

	}

	public static double calculaImc() throws CalcularIMCException {

		try {
			if (peso < 5 | altura < 40) {
				throw new CalcularIMCException("No se cumplen los requisitos");
			} else {
				System.out.println("El IMC es " + peso / (altura * altura));
			}

		} catch (Exception e) {
			throw new CalcularIMCException("Los datos no son correctos");
		}

		return peso / (altura * altura);
	}

	public boolean esMayorDeEdad() throws EdadException {
		if (edad > 0) {
			return edad >= 18;
		} else {
			throw new EdadException("La edad tiene que ser mayor que cero");
		}
	}

	public static String comprobarSexo(char sexo) {
		if (sexo == 'H' | sexo == 'M') {
			return "El sexo está bien introducido";
		}
		return "El sexo está mal introducido";
	}

	public String toString() {
		return "Nombre: " + nombre + "\n" + "Edad: " + edad + "\n" + "DNI: " + dni + "\n" + "Sexo: " + sexo + "\n"
				+ "Peso: " + peso + "\n" + "Altura: " + altura + "\n";
	}

	private String generaDNI() {
		Random rand = new Random();
		int dniNumerico = rand.nextInt(99999999);
		char dniLetra = calculaLetraDNI(dniNumerico);
		String dniCompleto = String.format("%08d", dniNumerico) + dniLetra;
		return dniCompleto;
	}

	private char calculaLetraDNI(int dni) {
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		int resto = dni % 23;
		return letras.charAt(resto);
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String generaDNIExt(String dni) throws GeneraDNIException {

		int dniNumerico = 0;
		int resto = 0;
		try {
			dniNumerico = Integer.parseInt(dni);
			if (dni.length() != 8) {
				throw new GeneraDNIException("La longitud del DNI no es correcta");
			} else {
				String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
				resto = dniNumerico % 23;
				char letra = letras.charAt(resto);
				String dniCompleto = dni + letra;
				System.out.println("El DNI obtenido es " + dniCompleto);
				return dniCompleto;
			}
		} catch (NumberFormatException e) {
			throw new GeneraDNIException("Lo que se ha ingresado como DNI no cumple el formato adecuado.");
		}

	}

	public static void main(String args[]) {

	}

}