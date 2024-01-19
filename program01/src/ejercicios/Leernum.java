package ejercicios;

import java.util.Scanner;

public class Leernum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("introdusca un número entero: ");
		n = teclado.nextInt();
		System.out.println("El número introducido es: " + n);
		teclado.close();
	}

}
