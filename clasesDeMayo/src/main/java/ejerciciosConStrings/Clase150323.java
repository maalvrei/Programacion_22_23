package ejerciciosConStrings;

public class Clase150323 {
	
	public static void main(String[] args) {
		String s1 = "HOLA";
		String s2 = "hola";
		if (s1.compareTo(s2) > 0)
			System.out.println("s1 es mayor que s2");
		else if (s1.compareTo(s2) == 0)
			System.out.println("son iguales");
		else
			System.out.println("s1 es menor que s2");
		
		String s3 = "hola".replace('a', 'b');
		int num = Integer.parseInt("4");
		System.out.println(num);
	}
	
}
