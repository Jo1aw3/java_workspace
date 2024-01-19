package ejercicios;

import java.util.Scanner;

public class Centimoseuro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n;
		int e;
		double c;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("Introduce la cantidad de euros: ");
		n = teclado.nextDouble();
		teclado.close();
		
		e = (int) n;
		c = (int)((n-e)*100);
		
		System.out.println("Euros: " + e + " Centimos: " + c);
		
	}

}
