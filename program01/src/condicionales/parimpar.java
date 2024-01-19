package condicionales;

import java.util.Scanner;

public class parimpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("introduce un numero entero.. ");
		a = teclado.nextInt();
		teclado.close();
		
		if ((a % 2) == 0) {
			System.out.println(" el número " + a + " es par ");
		} 
		else {
			System.out.println(" el número " + a + " no es par ");
		}
	}

}
