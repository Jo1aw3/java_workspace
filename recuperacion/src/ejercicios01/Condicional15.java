package ejercicios01;

import java.util.Scanner;

public class Condicional15 {

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
		
		System.out.println("en orden " + num1 + ", " + num2 + ", " + num3);
		
		if (num1 < num2 && num2 < num3) {
			System.out.println("acendente " + num1 + ", " + num2 + ", " + num3);
		} else if (num1 < num3 && num3 < num2) {
			System.out.println("acendente " + num1 + ", " + num3 + ", " + num2);
		} else if (num2 < num1 && num1 < num3){
			System.out.println("acendente " + num2 + ", " + num1 + ", " + num3);
		} else if (num2 < num3 && num3 < num1){
			System.out.println("acendente " + num2 + ", " + num3 + ", " + num1);
		} else if (num3 < num1 && num1 < num2){
			System.out.println("acendente " + num3 + ", " + num1 + ", " + num2);
		} else if (num3 < num2 && num2 < num1){
			System.out.println("acendente " + num3 + ", " + num2 + ", " + num1);
		}
		
		tec.close();
	}

}
