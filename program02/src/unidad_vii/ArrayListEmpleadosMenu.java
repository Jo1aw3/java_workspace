package unidad_vii;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListEmpleadosMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Empleado> arlist = new ArrayList<Empleado>();
		Empleado valor = new Empleado();
		
		Scanner tec = new Scanner(System.in);
		int opcion = 0, posicion;
		
		do {
			System.out.println("1. añadir");
			System.out.println("2. buscar");
			System.out.println("3. borrar");
			System.out.println("4. listar");
			System.out.println("5. listar salario");
			System.out.println("0. salir");
			
			System.out.println("opcion: ");
			opcion = tec.nextInt();
			
			switch (opcion) {
			
			case 1:
				tec.nextLine();
				System.out.println("alumno: ");
				valor.leer(tec);
				if (!arlist.contains(valor) ) {
					arlist.add(new Empleado(valor));
					Collections.sort(arlist);
				}
				break;
			case 2:
				tec.nextLine();
				System.out.println("Empleado: ");
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
				System.out.println("Empleado: ");
				valor.leer(tec);
				
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
			case 5:
				Collections.sort(arlist, new Comparator<Empleado>() {
					@Override
					public int compare(Empleado de1, Empleado de2) {
						int comparacion;
						Double sal1 = de1.getSalario();
						Double sal2 = de2.getSalario();
						comparacion = sal1.compareTo(sal2);
						if (comparacion == 0) {
							comparacion = de1.compareTo(de2);
						}
						return (-comparacion);
					}
				});
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
