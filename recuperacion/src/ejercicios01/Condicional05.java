package ejercicios01;

import java.util.Scanner;

public class Condicional05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		Scanner tec = new Scanner(System.in);
		
		System.out.println("introduce un numero");
		numero = tec.nextInt();
		
		if (numero >= 0 && numero <= 10) {
			System.out.println("el numero introducido esta dentro de 0-10");
		} else {
			System.out.println("el numero introducido no esta dentro");
		}
		
		tec.close();
	}

}
