package ejercicioArrays;
import java.util.Scanner;

public class TestArray {

	private final static int TAMANYO_ARRAY = 5;
	static String[] arr = new String[TAMANYO_ARRAY];
	
	public static void llenaArray () {
		Scanner sc = new Scanner(System.in);
		for (int i = 0 ; i < TAMANYO_ARRAY ; i++) {
			System.out.println("Introduce un elemento al array");
			String e = sc.next();
			arr[i] = e;
		}
		sc.close();
	}
	
	public static void imprimeArray(String[] arra) {
		int i = 0;
		for (String s: arra) {
			System.out.println("Elemento " + i + " del array: " + s);
			i++;
		}
	}
	
	public static void main(String[] args) {
		llenaArray();
		imprimeArray(arr);
	}
	
}
