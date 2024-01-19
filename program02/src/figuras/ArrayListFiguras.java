package figuras;

import java.util.ArrayList;

public class ArrayListFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Figura> arlist = new ArrayList<Figura>();
		arlist.add(new Circulo(0,0,5));
		arlist.add(new Cuadrado(0,0,4));
		arlist.add(new Rectangulo(0,0,6,8));
		arlist.add(new Triangulo(0,0,7,9));

		for (int posicion = 0; posicion < arlist.size(); posicion++) {
			System.out.println(arlist.get(posicion).getClass().getSimpleName() + " Area: " + arlist.get(posicion).area());
		}
	}

}
