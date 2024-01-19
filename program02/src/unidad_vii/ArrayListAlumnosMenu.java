package unidad_vii;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListAlumnosMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<AlumnoU> arlist = new ArrayList<AlumnoU>();
		AlumnoU valor = new AlumnoU();
		
		Scanner tec = new Scanner(System.in);
		int opcion = 0, posicion;
		
		do {
			System.out.println("1. añadir");
			System.out.println("2. buscar");
			System.out.println("3. borrar");
			System.out.println("4. listar");
			System.out.println("0. salir");
			
			System.out.println("opcion: ");
			opcion = tec.nextInt();
			
			switch (opcion) {
			
			case 1:
				tec.nextLine();
				System.out.println("alumno: ");
				valor.leer(tec);
				if (!arlist.contains(valor) ) {
					arlist.add(new AlumnoU(valor));
					Collections.sort(arlist);
				}
				break;
			case 2:
				tec.nextLine();
				System.out.println("alumno: ");
				valor.leer(tec);
				posicion = arlist.indexOf(valor);
				if (posicion >= 0) {
					System.out.println("El elemento " + valor + "se encuentra en " + posicion);
				}
				else {
					System.out.println("El elemento " + valor + " no se encuenta en el arralist");
				}
				break;
			case 3:
				tec.nextLine();
				System.out.println("alumno: ");
				valor.leer(tec);
				posicion = arlist.indexOf(valor);
				if (arlist.remove(valor)) {
					System.out.println("El elemento " + valor + " ha sido borrado ");
				}
				else {
					System.out.println("El elemento " + valor + " no se encuentra ");
				}
				break;
			case 4:
				for (int celda = 0; celda < arlist.size(); celda++) {
					System.out.println(arlist.get(celda));
				}
				break;
			case 0:
				System.out.println("fin");
				System.exit(0);
			}
			
		} while (opcion != 0);

		tec.close();
		
	}

}
