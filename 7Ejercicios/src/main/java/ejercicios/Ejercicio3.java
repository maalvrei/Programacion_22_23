package ejercicios;

public class Ejercicio3 {

	static boolean comparaArrays(int[] arr1, int[] arr2) {
		
		if (arr1.length != arr2.length) {
			System.out.println("No se pueden comparar los arrays porque tienen tamaños diferentes");
			return false;
		} else {
			for (int i = 0 ; i < arr1.length ; i++) {
				if (arr1[i] != arr2[i])
					return false;
			}
		}
		return true;
	}
	

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {1, 2, 4};

        boolean sonIguales1 = comparaArrays(arr1, arr2);
        boolean sonIguales2 = comparaArrays(arr1, arr3);

        if (sonIguales1) {
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
