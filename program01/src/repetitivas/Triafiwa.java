package repetitivas;

import java.util.Scanner;

public class Triafiwa {

	public static void main(String[] args) {
		// 145
		
		int n,filas,fila,columna;
		Scanner tec = new Scanner(System.in);
		System.out.println("introduce un numero");
		n = tec.nextInt();
		System.out.println("el numero introducido es " + n);
		tec.close();
		
		filas = n;
		fila = 1;
		while (fila<=filas) {
			columna = 1;
			while (columna<=fila) {
				System.out.print(fila);
				System.out.print("\t");
				columna++;
			}
			System.out.print("\n");
			fila++;
		}
	}
}
