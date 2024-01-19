package arrays;

import java.util.Scanner;

public class Caracmay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array410
		
		String nombre;
		int posicion, nletras;
		char caracter, mayor;
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("introduce una palabra");
		nombre = tec.next();
		tec.close();
		
		nletras = nombre.length();
		mayor = 0;
		posicion = 0;
		
		while (posicion < nletras) {
			caracter = nombre.charAt(posicion);
			if (caracter > mayor) {
				mayor = caracter;
			}
			posicion++;
		}
		
		System.out.println("caracter mayor: " + mayor);
		
		posicion = 0;
		
		while (posicion < nletras) {
			caracter = nombre.charAt(posicion);
			if (caracter == mayor) {
				System.out.println("posicion: " + (posicion + 1));
			}
			posicion++;
		}
		
	}

}
