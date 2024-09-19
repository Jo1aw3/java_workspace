package ejercicios01;

import java.util.Scanner;

public class Condicional10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2, num3;
		Scanner tec = new Scanner(System.in);
		
		System.out.println("introduce un numero");
		num1 = tec.nextInt();
		System.out.println("introduce otro numero");
		num2 = tec.nextInt();
		System.out.println("introduce otro numero");
		num3 = tec.nextInt();
		
		if (num1 >= num2 || num1 >= num3 || num2 >= num3) {
			System.out.println("error, el numero tiene que ser mas grande que el anterior");
		} else {
			System.out.println("introduciste bien los numeros: " + num1 + ", " + num2 + ", " + num3);
		}
		
		tec.close();
	}

}
