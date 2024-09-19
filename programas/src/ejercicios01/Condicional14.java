package ejercicios01;

import java.util.Scanner;

public class Condicional14 {

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
		
		if (num1 > num2 && num2 > num3) {
			System.out.println("estan ordenado decendentemente: " + num1 + ", " + num2 + ", " + num3);
		} else if (num1 < num2 && num2 < num3) {
			System.out.println("estan ordenado acendentemente: " + num1 + ", " + num2 + ", " + num3);
		} else {
			System.out.println("estan desordenados: " + num1 + ", " + num2 + ", " + num3);
		}
		
		tec.close();
	}

}