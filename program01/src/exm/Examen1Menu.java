package exm;

import java.util.Scanner;

public class Examen1Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tec = new Scanner(System.in);
		String nombre, contraseña;
		
		System.out.println("Bienvenido");
		System.out.println("Introduce tu nombre: ");
		nombre = tec.next();
	
		if (nombre.equals("LEIRE") == true ) {
			do {System.out.println("Hola " + nombre + " Introduce tu contraseña");
			contraseña = tec.next();}
			while (contraseña.equals("ABCD") == false ); {
				System.out.println("Bienvenido " + nombre + " ¿que quieres hacer?");
				System.out.println("1. crear piramide");
				System.out.println("2. visualizar la sucesión de fibonacci");
				
			}
		}
		else if ( nombre.equals("ANTONIO") == true ) {
			do {System.out.println("Hola " + nombre + " Introduce tu contraseña");
			contraseña = tec.next();}
			while ( contraseña.equals("EFGH") == false ); {
				System.out.println("Bienvenido " + nombre + " ¿que quieres hacer?");
				System.out.println("1. crear piramide");
				System.out.println("2. visualizar la sucesión de fibonacci");
				
			}
		}
		else {
				System.out.println("Error, tu nombre no estra registrado en este programa...");
			}
		
		int menu;
		menu = tec.nextInt();
		
		while (menu <=0 || menu >2) {
			System.out.println("error la opcion selecionada debe ser 1 o 2, pueba de nuevo...");
			menu = tec.nextInt();
		}	
			switch (menu) {
			
			case 1:
			int nFilas,nContador; //nColumnas;	
			nContador = 0;
			//nColumnas = 0;
				System.out.println("elegiste crear piramide");
				do {
					System.out.println("introduce el numero de filas (numero impar): ");
					nFilas = tec.nextInt();
				}
				while ((nFilas % 2) == 0); {
					System.out.println("- - - - - - -");
					while (nContador < nFilas) {
						System.out.println("*");
						nContador++;
					}
					System.out.println("- - - - - - -");
				}
			break;
			case 2:
				System.out.println("elegiste sucesion de fibonacci");
			
			case 3:
				String salir;
				salir = tec.next();
				salir.compareToIgnoreCase(salir);
				
				System.out.println("¿quieres salir de programa?");
				System.out.println("Si/No");
				
			}
			
			
		tec.close();
		
	}

}
