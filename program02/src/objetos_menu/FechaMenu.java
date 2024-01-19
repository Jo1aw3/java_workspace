package objetos_menu;

import java.util.Scanner;

public class FechaMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fecha valor = new Fecha();
		int opcion, posicion;
		
		Fecha[] array = new Fecha [10];
		
		int elementos;
		boolean encontrado;
		
		Scanner tec = new Scanner(System.in);
		elementos = 0;
		
		do {
			System.out.println("1. añadir fecha de manera ordenada");
			System.out.println("2. buscar fecha");
			System.out.println("3. borrar fecha");
			System.out.println("4, listar array");
			System.out.println("0. salir");
			
			System.out.println("opcion: ");
			opcion = tec.nextInt();
			
			switch (opcion) {
			
			case 1:
				if (elementos < array.length) {
					System.out.println("valor: ");
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
					array[posicion] = new Fecha(valor);
					elementos++;
				}
				else {
					System.out.println("no se puede añadir");
				}
				
			break;
			case 2:
				System.out.println("valor: ");
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
					System.out.println("elemento " + valor + " encontrado en la posicion " + posicion);
				}
				else {
					System.out.println("elemento " + valor + " no encontrado");
				}
				
			break;
			case 3:
				System.out.println("valor: ");
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
					System.out.println("elemento borrado con exito");
				}
				else {
					System.out.println("no se puede borrar, no se encuentra el elemento");
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
