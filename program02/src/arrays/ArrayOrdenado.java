package arrays;

import java.util.Scanner;

public class ArrayOrdenado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array412
		
		int n, posicion, nletras = 0;
		int [] arrayn = new int [5];
		boolean encontrado, lleno;
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("introduce un numero");
		n = tec.nextInt();
		
		
		int elementos = 0;
		
		lleno = false;
		while(n >= 0 && !lleno) {
			posicion = 0;
			encontrado = false; 
			while (posicion < nletras && !encontrado) {
				if (arrayn[posicion] > n) {
					encontrado = true;
				}
				else {
					posicion++;
				}
				for(int posicionmover = elementos;posicionmover > posicion;posicionmover--) {
					arrayn[posicionmover] = arrayn[posicionmover-1];
				}
			}
			arrayn[posicion] = n;
			elementos++;
			if (elementos >= 5) {
				lleno = true;
			}   
			else {
				System.out.println("introduce un numero");
				n = tec.nextInt();
			}
			
		}
		tec.close();
		for (posicion = 0; posicion < elementos; posicion++) {
		System.out.println(arrayn[posicion]);
		}
		
	}

}
