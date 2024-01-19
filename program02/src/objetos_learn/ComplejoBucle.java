package objetos_learn;

import java.util.Scanner;

public class ComplejoBucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Complejo c = new Complejo();
		Complejo f = new Complejo(-1,-1);
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("introduce los datos del complejo c");
		c.leer(tec);
		
		while (!c.equals(f)) {
			System.out.println(c);
			System.out.println("introduce los datos del complejo c");
			c.leer(tec);
		}
		System.out.println("end");
		
		tec.close();
	}

}
