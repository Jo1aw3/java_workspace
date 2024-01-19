package arrays;

import java.util.Scanner;

public class Numveces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// arrays405
		
		int n, posicion;
		int [] arrayenteros = new int [10];
		Scanner tec = new Scanner(System.in);
		
		System.out.println("introduce un valor");
		n = tec.nextInt();
		
		while(n>=0 && n<=9) {
			arrayenteros[n] = arrayenteros[n] + 1;
			System.out.println("introduce un valor");
			n = tec.nextInt();
		}
		
		tec.close();
		
		posicion = 0;
		while (posicion < 10) {
			System.out.println(posicion + " : " + arrayenteros[posicion] + " veces");
			posicion = posicion +1;
		}
		
	}

}
