package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEnterosMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//08
		
		ArrayList<Integer> arlist = new ArrayList<Integer>();
		Scanner tec = new Scanner(System.in);

		int menu, posicion, numero;
		
		do {
			
			System.out.println("1. Añadir numero");
			System.out.println("2. Buscar numero");
			System.out.println("3. Borrar numero");
			System.out.println("4. Listar numero");
			System.out.println("5. Salir");
		
			menu = tec.nextInt();
			switch (menu) {
				
			case 1:
				
				System.out.println("Que palabra quieres añadir ?: ");
				numero = tec.nextInt();
				arlist.add(numero);
			break;
			case 2:
				
				System.out.println("Que palabra quieres buscar ?: ");
				numero = tec.nextInt();				posicion = arlist.indexOf(numero);
				if (posicion >= 0) {
					System.out.println("El elemento " + numero + " se encuentra en la posicion " + posicion);
				}
				else {
					System.out.println("El elemento " + numero + " no se encuentra ");
				}
			break;
			case 3:
				/*
				 * case incompleto
				 *
				System.out.println("Que palabra quieres borrar ?: ");
				numero = tec.nextInt();
				if (arlist.remove(numero) {
					System.out.println("El elemento " + numero + " ha sido borrado ");
				}
				else {
					System.out.println("El elemento " + numero + " no se encuentra ");
				}
				*/
			break;
			case 4:
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
