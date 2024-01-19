package ejercicios01;

import java.util.Scanner;

public class Bucles16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numIntrod;
		int numMayor = 0;
		Scanner tec = new Scanner(System.in);
		
		for (int i = 0; i <= 10; i++) {
			System.out.println("introduce un numero");
			numIntrod = tec.nextInt();
			if (numIntrod > numMayor) {
				numMayor = numIntrod;
			}
		}
		System.out.println("el numero mayor es: " + numMayor);
		
		tec.close();
	}

}
