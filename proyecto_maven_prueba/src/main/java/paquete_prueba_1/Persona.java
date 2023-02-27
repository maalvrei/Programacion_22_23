package paquete_prueba_1;

import java.util.Random;

public class Persona {
	
	private String nombre;
	private int edad;
	private String dni = generaDNI();
	private char SEXO_POR_DEFECTO = 'H';
	private char sexo;
	private double peso;
	private double altura;
	
	Persona () {
		this.sexo = SEXO_POR_DEFECTO;
	}
	
	Persona (String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	Persona (String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	public static int calcularImc (double peso, double altura) {
		final int ideal = -1;
		final int porDebajo = 0;
		final int sobrepeso = 1;
		final int error = 2;
		double imc = peso / (altura*altura);
		if (imc <20) {
			return ideal;
		} else {
			if (imc >= 20 && imc <=50) {
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
	
	public static boolean esMayorDeEdad (int edad) {
		if (edad >= 18) {
			return true;
		} else {
			return false;
		}
	}
	
	public static String comprobarSexo (char sexo) {
		if (sexo == 'H' | sexo == 'M') {
			return "El sexo está bien introducido";
		}
		return "El sexo está mal introducido";
	}
	
	public String toString() {
		return "Nombre: " + nombre + "\n" +
	"Edad: " + edad + "\n" + 
	"DNI: " + dni + "\n" + 
	"Sexo: " + sexo + "\n" + 
	"Peso: " + peso + "\n" + 
	"Altura: " + altura + "\n";
	}
	
	private String generaDNI() {
        Random rand = new Random();
        int dniNumerico = rand.nextInt(99999999); // Genera un número aleatorio de 8 cifras
        char dniLetra = calculaLetraDNI(dniNumerico); // Calcula la letra correspondiente al número
        String dniCompleto = String.format("%08d", dniNumerico) + dniLetra; // Concatena el número y la letra en una cadena de texto
        return dniCompleto;
    }
	
	private char calculaLetraDNI(int dni) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE"; // Lista de letras correspondientes a los números de DNI
        int resto = dni % 23; // Calcula el resto de dividir el DNI por 23
        return letras.charAt(resto); // Devuelve la letra correspondiente al resto calculado
    }
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public void setEdad (int edad) {
		this.edad = edad;
	}
	
	public void setSexo (char sexo) {
		this.sexo = sexo;
	}
	
	public void setAltura (double altura) {
		this.altura = altura;
	}
	
	public void setPeso (double peso) {
		this.peso = peso;
	}
	
}