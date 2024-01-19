package condicionales;

import java.util.Scanner;

public class calcuiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("introduce cantidad.. ");
		a = teclado.nextInt();
		teclado.close();
		if (a < 20000) {
			System.out.println("el valor del iva es de un 7%");
		}
		else {
			System.out.println("el valo del iva es de un  16%");
		}
	}

}
