package ejercicios;

import java.util.Scanner;

public class Leernum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("Introdusca un número: ");
		n = teclado.nextInt();
		n = n + 1;
		System.out.println("El número introducido es.. lo siento le sumamos uno :>>.. " + n);
		teclado.close();
	}

}
