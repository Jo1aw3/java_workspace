package EjerciciosBucles;

import java.util.Scanner;

public class BucleJava07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Bienbenido...");
		System.out.println("a que programa quieres entrar: ");
		System.out.println("1. Operaciones básicas");
		System.out.println("2. Operaciones compleajas");
		System.out.println("3. Terminar programa");
		
		int n;
		n = teclado.nextInt();
		
		switch (n) {
			case 1:
			System.out.println("Escogiste la opción 1");
			break;
			
			case 2:
			System.out.println("Escogiste la opción 2");
			break;
			
			case 3:
			System.out.println("hasta pronto...");
		}
	}

}
