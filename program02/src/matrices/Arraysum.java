package matrices;

import java.util.Scanner;

public class Arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//J-22
		
		int[][] a;
		int nfilas, ncolumnas;
		
		Scanner tec = new Scanner(System.in);
		System.out.println("numero de filas");
		nfilas = tec.nextInt();
		System.out.println("numero de columnas");
		ncolumnas = tec.nextInt();
		a = new int [nfilas][ncolumnas];
		
		for (int fila = 0; fila < a.length; fila++ ) {
			for (int columna = 0; columna < a[fila].length; columna ++) {
				System.out.print("Celda[" + fila + "][" + columna + "]=");
				a[fila][columna] = tec.nextInt();
			}
		}
		
		int [] array = new int[nfilas];
		for (int fila = 0; fila < a.length; fila++ ) {
			for (int columna = 0; columna < a[fila].length; columna ++) {
				array[fila] = array[fila] + a[fila][columna];
			}
		}
		System.out.println("- - - - - - - -");
		
		for (int fila = 0; fila < a.length; fila++ ) {
			for (int columna = 0; columna < a[fila].length; columna ++) {
				- - -
			}
		}
		
		System.out.println("- - - - - - - -");
	}

}
