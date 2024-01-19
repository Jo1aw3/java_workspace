package objetos_menu;

import java.util.Scanner;

public class AsignaturaMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Asignatura valor = new Asignatura();
		int opcion, posicion;
		
		Asignatura[] array = new Asignatura [10];
		
		int elementos;
		boolean encontrado;
		
		Scanner tec = new Scanner(System.in);
		elementos = 0;
		
		do {
			System.out.println("1. añadir asignatura");
			System.out.println("2. buscar asignatura");
			System.out.println("3. borrar asignatura");
			System.out.println("4, listar asignatura");
			System.out.println("0. salir");
			
			System.out.println("opcion: ");
			opcion = tec.nextInt();
			
			switch (opcion) {
			
			case 1:
				if (elementos < array.length) {
					System.out.println("asignatura: ");
					valor.leer(tec);
					
					posicion = 0;
					encontrado = false;
					while (posicion < elementos && !encontrado) {
						if (array[posicion].compareTo(valor) > 0) {
							encontrado = true;
						}
						else {
							posicion++;
						}
					}
					for (int posicionmover = elementos; posicionmover > posicion; posicionmover--) {
						array[posicionmover] = array[posicionmover - 1];
					}
					array[posicion] = new Asignatura(valor);
					elementos++;
				}
				else {
					System.out.println("no se puede añadir");
				}
				
			break;
			case 2:
				System.out.println("asignatura: ");
				valor.leer(tec);
				posicion = 0;
				encontrado = false;
				while (posicion < elementos && !encontrado) {
					if (array[posicion].compareTo(valor) == 0) {
						encontrado = true;
					}
					else {
						posicion ++;
					}
				}
				if(encontrado) {
					System.out.println("Asignatura " + valor + " encontrado en la posicion " + posicion);
				}
				else {
					System.out.println("Asignatura " + valor + " no encontrado");
				}
				
			break;
			case 3:
				System.out.println("asignatura: ");
				valor.leer(tec);
				posicion = 0;
				encontrado = false;
				while (posicion < elementos && !encontrado) {
					if (array[posicion].compareTo(valor) == 0) {
						encontrado = true;
					}
					else {
						posicion ++;
					}
				}
				if(encontrado) {
					for(int posicionmover = posicion; posicionmover < (elementos - 1); posicionmover++) {
						array[posicionmover] = array[posicionmover + 1];
					}
					System.out.println("Asignatura borrado con exito");
				}
				else {
					System.out.println("no se puede borrar, no se encuentra");
				}
				
			break;
			case 4:
				for (posicion = 0; posicion < elementos; posicion++) {
					System.out.println(array[posicion]);
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
