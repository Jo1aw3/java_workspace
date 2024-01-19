package objetos_arrays;

import java.util.Scanner;

public class ComplejoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Complejo[] arc = new Complejo[10];
		Complejo c = new Complejo ();
		Complejo f = new Complejo (-1,-1);
		
		int elementos = 0;
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("introduce los numeros complejos:");
		c.leer(tec);
		
		while (elementos < arc.length && (!c.equals(f))) {
			arc[elementos] = new Complejo(c);
			elementos++;
			System.out.println("introduce los numeros complejos");
			c.leer(tec);
		}
		tec.close();
		
		for (int posicion = 0, , posicion++) {
			System.out.println(arc[posicion]);
		}
		
	}

}
