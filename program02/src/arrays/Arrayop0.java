package arrays;

import java.util.Scanner;

public class Arrayop0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, menu, contador;
		int [] arrayn = new int [5];
		boolean encontrado, lleno;
		
		Scanner teclado = new Scanner(System.in);
		
		
		
		System.out.println("bienvenido");
		System.out.println("1. inicializar array a -1");
		System.out.println("2. insertar elemento");
		System.out.println("3. borrar elemento");
		System.out.println("4. lista array");
		System.out.println("0. salir");
		
		menu = teclado.nextInt();
		
		switch (menu) {
		
		case 1:
			System.out.println("introduce un numero");
			n = teclado.nextInt();
			
			n = n - 1;
			contador = 0;
			
			while (n >= 0 && contador < 4) {
				arrayn[contador] = n;
				contador = contador + 1;
				System.out.println("introduce un numero");
				n = teclado.nextInt();
			}
			
		break;	
		case 2:
			
			
		break;	
		case 3:
		
			
		break;
		case 4:
			
			
		break;	
		case 0:
			
		}
		teclado.close();
	}
}
