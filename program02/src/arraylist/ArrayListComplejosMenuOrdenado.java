package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListComplejosMenuOrdenado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//15
		
		ArrayList<Complejo> arlist = new ArrayList<Complejo>();
		Complejo valor = new Complejo();
		Scanner tec = new Scanner(System.in);

		int menu, posicion;
		
		do {
			
			System.out.println("1. Añadir numero complejo");
			System.out.println("2. Buscar numero complejo");
			System.out.println("3. Borrar numero complejo");
			System.out.println("4. Listar numero complejo");
			System.out.println("5. Salir");
		
			menu = tec.nextInt();
			switch (menu) {
				
			case 1:
				
				System.out.println("Que numero complejo quieres añadir ?: ");
				valor.leer(tec);
				if (!arlist.contains(valor)) {
					arlist.add(new Complejo(valor));
					Collections.sort(arlist);
				}
			break;
			case 2:
				
				System.out.println("Que numero complejo quieres buscar ?: ");
				valor.leer(tec);
				posicion = arlist.indexOf(valor);
				if (posicion >= 0) {
					System.out.println("El numero complejo " + valor + " se encuentra en la posicion " + posicion);
				}
				else {
					System.out.println("El numero complejo " + valor + " no se encuentra ");
				}
			break;
			case 3:
				
				System.out.println("Que numero complejo quieres borrar ?: ");
				valor.leer(tec);
				if (arlist.remove(valor)) {
					System.out.println("El numero complejo " + valor + " ha sido borrado ");
				}
				else {
					System.out.println("El numero complejo " + valor + " no se encuentra ");
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
