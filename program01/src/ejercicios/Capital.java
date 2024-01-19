package ejercicios;

import java.util.Scanner;

public class Capital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a, b, d;
		int c; 
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("Introduce una cantidad: ");
		a = teclado.nextDouble();
		
		System.out.println("Introduce el tipo de interes: ");
		b = teclado.nextDouble();
		
		System.out.println("Por cuantos dias?: ");
		c = teclado.nextInt();
		
		teclado.close();
		
		d = (a*b*c)/(360+10);
		System.out.println("el interes es: " + d);
		
	}

}
