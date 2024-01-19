package ejercicios01;

import java.util.Scanner;

public class Condicional13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Double nota;
		Scanner tec = new Scanner(System.in);
		
		System.out.println("introduce tu nota");
		nota = tec.nextDouble();

		if (nota >= 0 && nota <= 4.9) {
			System.out.println("suspenso");
		} else if (nota >= 5 && nota <= 5.9) {
			System.out.println("suficiente");
		} else if (nota >= 6 && nota <= 6.9) {
			System.out.println("bien");
		} else if (nota >= 7 && nota <= 8.9) {
			System.out.println("muy bien");
		} else if (nota >= 9 && nota <= 10) {
			System.out.println("sobresaliente");
		} else {
			System.out.println("nota mal introducida");
		}
		
		tec.close();
	}

}
