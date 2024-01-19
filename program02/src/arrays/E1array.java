package arrays;

import java.util.Scanner;

public class E1array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// por completar
		
		
		int i;
		int menu = 0;
		int[] arrayn = new int[100];
	
		for (i=0;i<100;i++) {
			arrayn[i] = (int)(Math.random()*100+1);
			//System.out.println(arrayn[i]);
		}
		
		do {
			System.out.println("Elije algunas de estas opciones");
			System.out.println("- - - - - - - - - - - - - - - - -");
			System.out.println("1 salir");
			System.out.println("2 mostrar suma");
			System.out.println("3 mostrar maximo");
			System.out.println("4 mostrar minimo");
			System.out.println("5 mostrar media");
			System.out.println("6 rellenarno nuevamente con numeros");
			
			Scanner tec = new Scanner(System.in);
			menu = tec.nextInt();
			switch (menu) {
			
			
				// salir
				case 1:
					System.exit(0);
					
					break;
				// mostrar suma
				case 2:
				
					
					break;
				// mostrar maximo
				case 3:
					
					break;
				// mostrar minimo	
				case 4:
					
					break;
				// mostrar media
				case 5:
					
					break;
				// rellenarlo nuevamente
				case 6:
					for (i=0;i<100;i++) {
						arrayn[i] = (int)(Math.random()*100+1);
						System.out.println(arrayn[i]);
					}
				tec.close();
			}
		} while (menu !=1);
		
		
		
		

		
		
	}

}
