package ejercicios;

import java.util.Scanner;

public class Loncircu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introdusca el valor de Radio.. ");
		n = teclado.nextDouble();
		teclado.close();
		// para calcular la sircunferencia usamo Math.Pi
		double r;
		r = Math.PI * n * 2;
		System.out.println("La circunferencia es.. " + r);
	}

}
