package arrays;

import java.util.Scanner;

public class Arrayop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int n;
	int [] array = new int [10];
	int menu, posicion, elementos;
	boolean encontrado = false;
	
	Scanner tec = new Scanner(System.in);
	elementos = 0;
	
	
	do {
		System.out.println("bienvenido");
		System.out.println("1. inicializar array a -1");
		System.out.println("2. insertar elemento");
		System.out.println("3. borrar elemento");
		System.out.println("4. lista array");
		System.out.println("0. salir");
		
		menu = tec.nextInt();
		
		switch (menu) {
		case 1:
			for(posicion = 0; posicion > array.length; posicion++) {
				array[posicion] = -1;
			}
			elementos = 0;
			
		break;	
		case 2:
			
			System.out.println("n: ");
			n = tec.nextInt();
			
			if (elementos == 0 ) {
				array[0] = n;
				elementos++;
			}
			else {
				encontrado = false;
				posicion = 0;
				while (posicion < elementos && !encontrado) {
					if (array[posicion] > n) {
						encontrado = true;
					}
					else {
						posicion++;
					}
				}
				for(int posicionmover = elementos; posicionmover > posicion; posicionmover--) {
					array[posicionmover] = array[posicionmover-1];
				}
				array[posicion] = n;
				elementos++;
			}
		break;	
		case 3:
			
			System.out.println("n: ");
			n = tec.nextInt();
			
			encontrado = false;
			posicion = 0;
			while (posicion < elementos && !encontrado) {
				if (array[posicion] == n) {
					encontrado = true;
				}
				else {
					posicion++;
				}
			}
			if (encontrado) {	
				for(int posicionmover = posicion; posicionmover < (elementos-1); posicionmover++) {
					array[posicionmover] = array[posicionmover]+ 1;
				}
				elementos--;
			else {
				System.out.println("error al borrar, no se encuentra");
			}
			
		break;
		case 4:
			posicion = 0; posicion < elementos; 
			
		break;	
		case 0:
		System.out.println("saliendo del programa");
		System.exit(0);
		}
		
	}
// - - - - - - -
	tec.close();	
	}
}
