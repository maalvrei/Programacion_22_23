package ejercicios;

public class Ejercicio4 {

	static boolean comparaArrays(String[] arr1, String[] arr2) {

		if (arr1.length != arr2.length) {
			System.out.println("No se pueden comparar los arrays porque tienen tamaños diferentes");
			return false;
		} else {
			for (int i = 0; i < arr1.length; i++) {
				if (!(arr1[i].equals(arr2[i])))
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		String[] arr1 = { "Hola", "que", "tal"};
		String[] arr2 = { "Hola", "que", "tal"};
		String[] arr3 = { "Hola", "como", "estas"};

		boolean sonIguales1 = comparaArrays(arr1, arr2);
		boolean sonIguales2 = comparaArrays(arr1, arr3);

		if (comparaArrays(arr1, arr2)) {
			System.out.println("Los arrays arr1 y arr2 son iguales.");
		} else {
			System.out.println("Los arrays arr1 y arr2 no son iguales.");
		}

		if (sonIguales2) {
			System.out.println("Los arrays arr1 y arr3 son iguales.");
		} else {
			System.out.println("Los arrays arr1 y arr3 no son iguales.");
		}
	}
}
