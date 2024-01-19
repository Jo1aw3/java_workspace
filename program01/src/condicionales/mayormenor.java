package condicionales;

import java.util.Scanner;

public class mayormenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("introduce numero.. ");
		a = teclado.nextInt();
		System.out.println("introduce otro numero.. ");
		b = teclado.nextInt();
		teclado.close();
		
		if (a > b) {
			System.out.println(a + " es mayor que " + b );
		}
		
		else if (a < b) {
			System.out.println(a + " es menor que " + b);
		} 
		else {
			System.out.println(a + " y " + b + " son iguales");
		}	
	}

}
