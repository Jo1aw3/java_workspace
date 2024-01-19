package condicionales;

import java.util.Scanner;

public class mayor3n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c ;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("Introduce un numero");
		a = teclado.nextInt();
		System.out.println("Introduce otro numero");
		b = teclado.nextInt();
		System.out.println("Introduce otro numero");
		c = teclado.nextInt();
		teclado.close();
		
		if (a >= b && a >= c) {
			System.out.println(a + " es mayor que los dos");
		}
		else if (b >= a && b >= c) {
			System.out.println(b + " es");
		}
			
	}

}
