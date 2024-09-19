package ejercicios01;

import java.util.Scanner;

public class Condicional02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero1, numero2;
		Scanner tec = new Scanner(System.in);
		
		System.out.println("introduce el primer numero");
		numero1 = tec.nextInt();
		System.out.println("introduce el segundo numero");
		numero2 = tec.nextInt();
		
		if (numero1 > numero2) {
			System.out.println("el primer numero es mas grande que el segundo");
		} else if (numero2 > numero1) {
			System.out.println("el segundo numero es mas grande que el primero");
		} else  {
			System.out.println("los dos numeros tienen el mismo valor");
		}
		
		tec.close();
	}

}
