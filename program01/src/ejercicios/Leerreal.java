package ejercicios;

import java.util.Scanner;

public class Leerreal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n;
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("Introduce un número real: ");
		n = teclado.nextDouble();
		System.out.println("El número introducido es: " + n);
		teclado.close();
	}

}
