package ejercicios;

import java.util.Scanner;

public class cubo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n;
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("Cuanto mide el cuadrado?: ");
		n = teclado.nextDouble();
		teclado.close();
		double a;
		//para hacer potenciación con Math.pow
		a = Math.pow(n, 3);
		System.out.println("El volumen del cuadrado es.. " + a);
	}
}
