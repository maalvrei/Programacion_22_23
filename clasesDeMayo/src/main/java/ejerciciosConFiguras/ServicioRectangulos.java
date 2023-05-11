package ejerciciosConFiguras;

public class ServicioRectangulos {

	public static Rectangulo[] getRectangulos(int longitud, int numeroRectangulos) {

		Rectangulo [] aR = new Rectangulo[numeroRectangulos];
		int j = 1;

		for (int i = 0; i < numeroRectangulos; i++) {
			aR[i] = new Rectangulo(longitud*j, longitud*j);
			j++;
		}

		return aR;
	}

}
