package ejercicios01;

import java.util.Scanner;

public class Bucles12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Scanner tec = new Scanner(System.in);
		
		System.out.println("tabla de multiplicar");
		System.out.println("pon un numero");
		num = tec.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " * " + num + " = " + (i*num));
		}
		
		tec.close();
	}

}
