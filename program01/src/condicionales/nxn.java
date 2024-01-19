package condicionales;

import java.util.Scanner;

public class nxn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("introduce numero.. ");
		a = teclado.nextInt();
		teclado.close();
		
		b = (a*a*a);
		System.out.println("el volumen del cuadrado es.. " + b);
		
		if (b > 100) {
			b = (b - 100);
			System.out.println("le restaremos 100 ... " + b);
		}
		else {
			b = (100 - b);
			System.out.println("falta " + b + " para que llegue a 100");
		}
			
	}

}
