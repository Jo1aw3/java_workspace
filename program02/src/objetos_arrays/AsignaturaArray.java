package objetos_arrays;

import java.util.Scanner;

public class AsignaturaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Asignatura a = new Asignatura();
		
		Asignatura[] array = new Asignatura[10];
		int elementos = 0;
		
		Scanner tec = new Scanner(System.in);
		System.out.println("introduce los numeros de la asignatura a");
		a.leer(tec);
		
		while (a.getNota() >= 0 && elementos < array.length) {
			array[elementos] = new Asignatura(a);
			elementos++;
			System.out.println("introduce los numeros de la asignatura a");
			a.leer(tec);
			
		tec.close();
		
		for (int posicion = 0; posicion < elementos; posicion++) {
			System.out.println(array[posicion]);
		}
		System.out.println("fin");
		}
	}

}
