package ejercicios01;

import java.util.Scanner;

public class Bucles17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec = new Scanner(System.in);
		System.out.println("ingresa el numero #1");
		int numIntrod = tec.nextInt();
		int numMayor = numIntrod;
		int numMenor = numIntrod;
		
		for (int contador = 2; contador <= 10; contador++) {
			System.out.println("ingresa el numero #" + contador);
			numIntrod = tec.nextInt();
			if (numIntrod > numMayor) {
				numMayor = numIntrod;
			}
			if (numIntrod < numMenor) {
				numMenor = numIntrod;
			}
		}
		System.out.println("el numero mayor es: " + numMayor);
		System.out.println("el numero menor es: " + numMenor);
		
		tec.close();
	}

}
