package unidad_vii;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListEmpleadosOrdenado {

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
		
		Collections.sort(arlist);
		
		for (int posicion = 0; posicion < arlist.size(); posicion++) {
			System.out.println(arlist.get(posicion));
		}
	}

}
