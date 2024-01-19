package arrays;

import java.util.Scanner;

public class Contavoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array411
		
		String palabra;
		int posicion, nletras;
		char caracter;
		int[] contador = new int [5];
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("introduce una palabra");
		palabra = tec.nextLine();
		palabra.toLowerCase();
		tec.close();
		
		nletras = palabra.length();
		posicion = 0;
		
		while (posicion < nletras) {
			caracter = palabra.charAt(posicion);
			if (caracter == 'a') {
				 contador[0]++;
			}
			else if (caracter == 'e') {
				contador[1]++;
			}
			else if (caracter == 'i') {
				contador[2]++;
			}
			else if (caracter == 'o') {
				contador[3]++;
			}
			else if (caracter == 'u') {
				contador[4]++;
			}
			posicion++;
		}
		System.out.println("la palabra contiene " + contador[0] + " a");
		System.out.println("la palabra contiene " + contador[1] + " e");
		System.out.println("la palabra contiene " + contador[2] + " i");
		System.out.println("la palabra contiene " + contador[3] + " o");
		System.out.println("la palabra contiene " + contador[4] + " u");
		
	}

}
