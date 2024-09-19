package ejercicios01;

import java.util.Scanner;

public class Bucles15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		Scanner tec = new Scanner(System.in);
		System.out.println("introduce un numero");
		numero = tec.nextInt();
		
		for (int contador = 0; contador <= 100; contador++) {
			if (contador % numero == 0) {
				System.out.println(contador);
			}
		}
		
		tec.close();
	}

}
