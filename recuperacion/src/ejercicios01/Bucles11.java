package ejercicios01;

import java.util.Scanner;

public class Bucles11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		int i = 1;
		Scanner tec = new Scanner(System.in);
		
		System.out.println("introduce un numero");
		num = tec.nextInt();
		
		while (i <= num) {
			System.out.print("*");
			i++;
		}
		
		tec.close();
	}

}
