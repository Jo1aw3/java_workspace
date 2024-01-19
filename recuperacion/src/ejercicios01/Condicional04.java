package ejercicios01;

import java.util.Scanner;

public class Condicional04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		Scanner tec = new Scanner(System.in);
		
		System.out.println("introduce un numero");
		numero = tec.nextInt();
		
		if ((numero % 2 == 0)) {
			System.out.println("el numero es par");
		} else {
			System.out.println("el numero es impar");
		}
		
		tec.close();
	}

}
