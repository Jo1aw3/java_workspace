package ejercicios;

import java.util.Scanner;

public class Leerstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n;
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("Escribe una palabra: ");
		n = teclado.next();
		System.out.println("La palabra que escribiste es: " + n);
		teclado.close();
	}

}
