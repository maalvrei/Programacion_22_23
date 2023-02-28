
import java.util.Random;

import org.junit.jupiter.api.Test;
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
	
	@Test
	
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
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	@Test
	
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
	
	
	@Test
	public static void main (String args []) {
		Persona p1 = new Persona ();
		System.out.println(p1.toString());
		Persona p2 = new Persona ();
		System.out.println(p2.toString());
	}
}