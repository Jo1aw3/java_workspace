package ejercicios01;

import java.util.Scanner;

public class Condicional11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char letra;
		Scanner tec = new Scanner(System.in);
		
		System.out.println("si(s) o no(n)?");
		letra = tec.nextLine().charAt(0);
		
		if (letra == 's') {
			System.out.println("BIEN");
		} else if (letra == 'n') {
			System.out.println("ERROR");
		} else {
			System.out.println("no puedes introducir otro caracter");
		}
		
		tec.close();
	}

}
