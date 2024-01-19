package ejercicios01;

import java.util.Scanner;

public class Condicional06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2, num3;
		Scanner tec = new Scanner(System.in);
		
		System.out.println("introduce el primer numero");
		num1 = tec.nextInt();
		System.out.println("introduce el segundo numero");
		num2 = tec.nextInt();
		System.out.println("introduce el tercer numero");
		num3 = tec.nextInt();
		
		int numSuma = num1 + num2 + num3;
		System.out.println("la suma de los tres numeros es: " + numSuma);
		int numMedia = numSuma/3;
		System.out.println("la media de los tres numero es: " + numMedia);
		
		tec.close();
	}

}
