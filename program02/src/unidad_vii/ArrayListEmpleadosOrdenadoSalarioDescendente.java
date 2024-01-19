package unidad_vii;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListEmpleadosOrdenadoSalarioDescendente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Empleado> arlist = new ArrayList<Empleado>();
		
		Scanner tec = new Scanner(System.in);
		
		Empleado e1 = new Empleado();
		
		char continuar;
		
		do {
			System.out.println("empleado: ");
			e1.leer(tec);
			arlist.add(new Empleado(e1));
			tec.nextLine();
			System.out.println("desea continuar: S/N");
			continuar = tec.nextLine().toLowerCase().charAt(0);
		} while (continuar == 's');
		
		tec.close();
		
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
		
		for (int posicion = 0; posicion < arlist.size(); posicion++) {
			System.out.println(arlist.get(posicion));
		}
	}

}
