package ejercicios;

import java.util.Scanner;

public class Leerstringcompuesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n;
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("Introdusca una frase: ");
		n = teclado.nextLine();
		System.out.println("La frase introducida es: " + n);
		teclado.close();
	}

}
