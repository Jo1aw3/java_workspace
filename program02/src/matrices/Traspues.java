package matrices;

import java.util.Scanner;

public class Traspues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//J-19
		
		int[][]	a;
		int[][]	b;
		int numfilas, numcolumnas;
		
		//leo el numero de filas y el numero de columnas
		Scanner tec = new Scanner(System.in);
		System.out.println("numnero de filas");
		numfilas = tec.nextInt();
		System.out.println("numero de columnas");
		numcolumnas = tec.nextInt();
		a = new int [numfilas][numcolumnas];
		b = new int [numcolumnas][numfilas];
		
		// empiezo a recorrer la matriz
		for (int fila = 0; fila < a.length; fila++ ) {
			for (int columna = 0; columna < a[fila].length; columna ++) {
				System.out.print("Celda[" + fila + "][" + columna + "]=");
				int num = tec.nextInt();
				a[numfilas][numcolumnas] = num;
			}
		}
		//muestro el contenido de la martiz
		for (int fila = 0; fila < a.length; fila++ ) {
			for (int columna = 0; columna < a[fila].length; columna ++) {
				System.out.print(a[fila][columna]);
			}
			System.out.println();
		}
		
		System.out.println("- - - - - - - -");

		for (int fila = 0; fila < a.length; fila++ ) {
			for (numcolumnas = 0; numcolumnas < a[fila].length; numcolumnas++) {
				b[numcolumnas][numfilas] = a[numfilas][numcolumnas];
			}
		}
		for (int fila = 0; fila < a.length; fila++ ) {
			for (int columna = 0; columna < a[fila].length; columna ++) {
				b[numcolumnas][numfilas] = a[numfilas][numcolumnas];
			}
			System.out.println();
		}
		
		//muestro el contenido de la martiz de manera inversa 
		/*for (int columna = 0; columna < matriz.length; columna++ ) {
			for (int fila = 0; fila < matriz[columna].length; fila ++) {
				System.out.print(matriz[columna][fila]);
			}
			System.out.println();
		}		*/
		
		tec.close();
	}

}