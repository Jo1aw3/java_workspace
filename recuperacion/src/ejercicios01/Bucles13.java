package ejercicios01;

import java.util.Scanner;

public class Bucles13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Scanner tec = new Scanner(System.in);
		
		System.out.println("introduce un numero");
		num = tec.nextInt();
		
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
		
		tec.close();
	}

}
