package ejercicios;

import java.util.Scanner;

public class Doblenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("Introdusca un número para multiplicarlo por dos.. ");
		n = teclado.nextInt();
		n = n * 2;
		System.out.println("El doble de número introducido es: " + n);
		teclado.close();
	}

}
