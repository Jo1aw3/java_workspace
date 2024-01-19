package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Leerentero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner teclado; 
		
	try {
		
		teclado = new Scanner(System.in);
		System.out.println("Introduce un número entero: ");
		n = teclado.nextInt();
		System.out.println("El número introducido es: " + n);
		teclado.close();
		
	}  catch(InputMismatchException ex) {
		System.out.println("error");
	}
	
	}
		
	
}
