package arrays;

import java.util.Scanner;

public class Medianum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array406
		
		int n;
		int contador = 0;
		int posicion = 0;
		double media = 0.0;
		int [] arrayentero = new int[5];
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce un valor");
		n = teclado.nextInt();
		
		while (n >= 0 && contador < 4) {
			arrayentero[contador] = n;
			contador = contador + 1;
			System.out.println("introduce un valor");
			n = teclado.nextInt();
		}
		
		teclado.close();
		
		while (posicion < contador) {
			media = media + arrayentero[posicion];
			posicion = posicion + 1;
		}
		
		media = media / 5;
		System.out.println("la media es: " + media);
	}

}
