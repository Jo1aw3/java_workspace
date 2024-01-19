package selectivas;

import java.util.Scanner;

public class menucase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("escoge una opción, intorduce numero");
		
		System.out.println("Opcion//	1");
		System.out.println("Opcion//	2");
		System.out.println("Opcion//	3");
		System.out.println("Opcion//	4");
		System.out.println("Opcion//	5");
		System.out.println("Salir//		0");
		n = teclado.nextInt();
		teclado.close();
		
		switch (n) {
		case 1:
			System.out.println("Escogiste la opción 1");
		case 2:
			System.out.println("Escogiste la opción 2");
		case 3:
			System.out.println("Escogiste la opción 3");
		case 4:
			System.out.println("Escogiste la opción 4");
		case 0:
			System.out.println("Escogiste la opción Salir");
	}
		
		
	}

}
