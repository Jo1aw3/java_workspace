package ejercicios01;

import java.util.Scanner;

public class Bucles18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tec = new Scanner(System.in);
		int suma = 0;
		int contador = 0;
		
//		System.out.println("introduce numeros (0 para terminar)");
//		
//		while(true) {
//			int numero = tec.nextInt();
//			if (numero == 0) {
//				break;
//			}
//			suma += numero; 
//			contador++;
//		}
//		double media = (contador != 0) ? (double) suma / contador : 0;
//		System.out.println("la media de los numeros es: " + media);
		
		int numero;
		
		do {
			System.out.println("introduce un numero (0 para terminar)");
			numero = tec.nextInt();
			suma += numero;
			contador++;
		} while (numero != 0);
		
		double media = suma / contador;
		System.out.println("la media de los numeros es: " + media);
		
		tec.close();
	}

}
