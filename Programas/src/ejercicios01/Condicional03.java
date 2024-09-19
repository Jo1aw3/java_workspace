package ejercicios01;

import java.util.Scanner;

public class Condicional03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		Scanner tec = new Scanner(System.in);
		System.out.println("introduce un numero");
		numero = tec.nextInt();
		
		if (numero < 0) {
			System.out.println("es un numero negativo");
		} else if (numero > 0) {
			System.out.println("es un numero positivo");
		} else {
			System.out.println("el numero es 0");
		}
 		
		tec.close();
	}

}
