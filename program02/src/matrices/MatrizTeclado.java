package matrices;

import java.util.Scanner;

public class MatrizTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//J-18
		
		int[][]	matriz;
		int numfilas, numcolumnas;
		
		//leo el numero de filas y el numero de columnas
		Scanner tec = new Scanner(System.in);
		System.out.println("numnero de filas");
		numfilas = tec.nextInt();
		System.out.println("numero de columnas");
		numcolumnas = tec.nextInt();
		matriz = new int [numfilas][numcolumnas];
		
		// empiezo a recorrer la matriz
		for (int fila = 0; fila < matriz.length; fila++ ) {
			for (int columna = 0; columna < matriz[fila].length; columna ++) {
				System.out.print("Celda[" + fila + "][" + columna + "]=");
				matriz[fila][columna] = tec.nextInt();
			}
		}
		
		//muestro el contenido de la martiz
		for (int fila = 0; fila < matriz.length; fila++ ) {
			for (int columna = 0; columna < matriz[fila].length; columna ++) {
				System.out.print(matriz[fila][columna]);
			}
			System.out.println();
		}
		tec.close();
	}

}
