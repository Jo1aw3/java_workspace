package arrays;

import java.util.Scanner;

public class Arraysumaprimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array408
		
		int n;
		int suma;
		int	elementos;
		int posicion;
		int [] arrayentero = new int[10];
		boolean esprimo;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca un número entero (-1 para finalizar)");
		n = teclado.nextInt();
		
		elementos = 0;
		while ((elementos < 10) && (n >= 0)) {
			arrayentero[elementos] = n;
			elementos++;
			System.out.println("introduzca un número entero (-1 para finalizar)");
			n = teclado.nextInt();
		}
		
		suma = 0;
		posicion = 0;
		while (posicion < 9) {
			suma = suma + arrayentero[posicion];
			posicion = posicion + 1;
		}
		
		System.out.println("la suma es " + suma);
		
		esprimo = true;
 		posicion = 2;
		while (posicion < suma && esprimo){
			if ((n % posicion) == 0){
				esprimo = false;
			}
			posicion = posicion + 1;
		}

		if (esprimo){
			System.out.println("El numero "+n+" es primo");
		}
		else{
			System.out.println("El numero "+n+" no es primo");
		}
		
		teclado.close();
	}

}
