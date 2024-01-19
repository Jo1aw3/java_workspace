package condicionales;

import java.util.Scanner;

public class retesuel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double sueldo;
		double a;
		a = 1000.00;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("introduce el sueldo.. ");
		sueldo = teclado.nextInt();
		teclado.close();
		
		if (sueldo < a) {
			System.out.println("la retencion es de un 10%");
		}
		
		else if (sueldo > a) {
			System.out.println("la retencion es de un 14%");
		} 
		else {
			System.out.println("la retencion es de un 12%");
		}
	}

}
