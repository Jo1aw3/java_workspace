package ejercicios01;

import java.util.Scanner;

public class Condicional08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char letra;
		Scanner tec = new Scanner(System.in);
		
		System.out.println("introduce una letra");
		letra = tec.nextLine().charAt(0);
		
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			System.out.println("la letra es una vocal");
		} else {
			System.out.println("la letra es una consonante");
		}
		
		tec.close();
	}

}
