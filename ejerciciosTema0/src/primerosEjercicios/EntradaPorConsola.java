package primerosEjercicios;

public class EntradaPorConsola {
	public static void main(String args[]) {
		char c;
		try {
			c = (char) System.in.read();
			System.out.println("Introducido el caracter " + c);
		} catch (Exception e) {
			e.getMessage();
		}
	}
}
