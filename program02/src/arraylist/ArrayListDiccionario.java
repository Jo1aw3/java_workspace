package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDiccionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//11
		
		ArrayList<String> arlist = new ArrayList<String>();
		Scanner tec = new Scanner(System.in);

		int menu, posicion;
		String palabra;
		
		do {
			
			System.out.println("1. Añadir String");
			System.out.println("2. Buscar String");
			System.out.println("3. Borrar String");
			System.out.println("4. Listar Array");
			System.out.println("5. Salir");
		
			menu = tec.nextInt();
			switch (menu) {
				
			case 1:
				tec.nextLine();
				System.out.println("Que palabra quieres añadir ?: ");
				palabra = tec.nextLine();
				arlist.add(palabra);
			break;
			case 2:
				tec.nextLine();
				System.out.println("Que palabra quieres buscar ?: ");
				palabra = tec.nextLine();
				posicion = arlist.indexOf(palabra);
				if (posicion >= 0) {
					System.out.println("El elemento " + palabra + " se encuentra en la posicion " + posicion);
				}
				else {
					System.out.println("El elemento " + palabra + " no se encuentra ");
				}
			break;
			case 3:
				tec.nextLine();
				System.out.println("Que palabra quieres borrar ?: ");
				palabra = tec.nextLine();
				if (arlist.remove(palabra)) {
					System.out.println("El elemento " + palabra + " ha sido borrado ");
				}
				else {
					System.out.println("El elemento " + palabra + " no se encuentra ");
				}
			break;
			case 4:
				
				Collections.sort(arlist);
				
				for (int celda = 0; celda < arlist.size(); celda++) {
					System.out.println(arlist.get(celda));
				}
			break;
			case 5:
				System.out.println("end");
				System.exit(0);
				break;
			}
		
		} while (menu != 5);
	tec.close();	
	}

}