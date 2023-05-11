package ejerciciosConFiguras;

public class ArraysObjetos extends Figura {
	
	public static void main(String[] args) {
		
		Rectangulo [] aR = ServicioRectangulos.getRectangulos(4, 6);
		for (Rectangulo r : aR) {
			System.out.println(r.toString());
		}
		
	}
}
