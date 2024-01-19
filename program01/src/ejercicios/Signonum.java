package ejercicios;

import java.util.Scanner;

public class Signonum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("Introdusca un número.. ");
		n = teclado.nextInt();
		int r;
		r = -n;
		System.out.println("El número introducido es " + n + " y su forma negativa es" + r);
		teclado.close();
	}

}
