package ejercicios;

import java.util.Scanner;

public class Areacirc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado;
		teclado = new Scanner(System.in);
		double n;
		System.out.println("Introduce el radio: ");
		n = teclado.nextDouble();
		teclado.close();
		double a;
		a = Math.PI * n + n;
		System.out.println("El area del radio de " + n + "es" + a);
	}
}
