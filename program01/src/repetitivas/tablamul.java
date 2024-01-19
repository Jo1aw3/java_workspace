package repetitivas;

import java.util.Scanner;

public class tablamul {

	public static void main(String[] args) {

		//tema02 122
		
		int n, m, j;
		
		
		m = 1;
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce un numero entero");
		n = teclado.nextInt();
		teclado.close();
		System.out.println("el numero que seleccionaste es " + n);
		System.out.println("su tabla de multiplicar es la siguiente: ");
		m = 1;
		while (m <= 10) {
			n = n * m;
			m = m + 1;
		}
	}

}
