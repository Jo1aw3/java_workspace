package objetos_arrays;

import java.util.Scanner;

public class FechaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fecha f = new Fecha();
		Fecha end = new Fecha();
		
		Fecha[] array = new Fecha[10];
		int elementos;
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("introduce los datos de la fecha f");
		f.leer(tec);
		
		elementos = 0;
		while (!f.equals(end) && elementos < array.length) {
			array[elementos] = new Fecha(f);
			elementos ++;
			System.out.println("introduce los datos de la fecha f");
			f.leer(tec);
		}
		tec.close();
		
		for (int posicion = 0; posicion < elementos; posicion++) {
			System.out.println(array[posicion]);
		}
		System.out.println("fin del programa");
	}

}
