package discografia;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tec = new Scanner(System.in);
		
		int menu;
		
		do {
			
			System.out.println("º - - - - - - - - - - - - - - - - - - - - - - - º");
			System.out.println("|                  Welcome!                     |");
			System.out.println("|                                               |");
			System.out.println("|             ¿Que quieres hacer?               |");
			System.out.println("|                                               |");
			System.out.println("|  0 - Salir                                    |");
			System.out.println("|  1 - Visualizar productores                   |");
			System.out.println("|  2 - Visualizar cantantes                     |");
			System.out.println("|  3 - Cabiar genero musical de un productor    |");
			System.out.println("|  4 - Eliminar un cantante                     |");
			System.out.println("|  5 - Añadir nueva cancion de un cantante      |");
			System.out.println("|  6 - Visualizar los cantantes de una canción  |");
			System.out.println("º - - - - - - - - - - - - - - - - - - - - - - - º");
			
			menu = tec.nextInt();
			
			switch(menu) {
			case 0:
				System.exit(menu);
				
			case 1:
				
				System.out.println("ª - - - - - - - - - - - - ª");
				System.out.println("|  Productores Musicales  |");
				System.out.println("º - - - - - - - - - - - - º");
				
				break;
				
			case 2:
				
				System.out.println("ª - - - - - - - - - - - - ª");
				System.out.println("|        Cantantes        |");
				System.out.println("º - - - - - - - - - - - - º");
				
				break;
				
			case 3:
				
				System.out.println("ª - - - - - - - - - - - - ª");
				System.out.println("|  Cambiar genero musical |");
				System.out.println("º - - - - - - - - - - - - º");
				
				break;
				
			case 4:
				
				System.out.println("ª - - - - - - - - - - - - ª");
				System.out.println("|    Eliminar cantante    |");
				System.out.println("º - - - - - - - - - - - - º");
				
				break;
				
			case 5:
				
				System.out.println("ª - - - - - - - - - - - - - - - - - - - ª");
				System.out.println("|  Añadir nueva cancion de un cantante  |");
				System.out.println("º - - - - - - - - - - - - - - - - - - - º");
				
				break;
				
			case 6:
				
				System.out.println("ª - - - - - - - - - - - - - - - - - - - - ª");
				System.out.println("|   Visuzalizar cantantes de una cancion  |");
				System.out.println("º - - - - - - - - - - - - - - - - - - - - º");
			
			}
			
		} while (menu >= 0);
		
		tec.close();
		
	}

}
