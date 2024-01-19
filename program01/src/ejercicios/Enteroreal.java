package ejercicios;

import java.util.Scanner;

public class Enteroreal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n;
		int e;
		double r;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("Introduce un numero.. ");
		n = teclado.nextDouble();
		teclado.close();
		
		e = (int) n;
		r = n - e;
		
		
		System.out.println("parte entera: " + e + " | parte real: " + r);
	}

}
