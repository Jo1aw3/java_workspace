package ejercicios;

import java.util.Scanner;

public class Leercaracter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char n;
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("Introdusca una letra...");
		n = teclado.nextLine().charAt(2);
		System.out.println("La letra introducida es: " + n);
		teclado.close();
	}

}
