package matrices;

import java.util.Scanner;

public class Sumamat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// J-20
		
		int[][] a;
		int[][] b;
		int[][] c;
		int nfilas, ncolumnas;
		int nfilas2, ncolumnas2;
		
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
		System.out.println("Segunda Tabla");
		System.out.println("numero de filas");
		nfilas2 = tec.nextInt();
		System.out.println("numero de columnas");
		ncolumnas2 = tec.nextInt();
		b = new int [nfilas2][ncolumnas2];
		
		for (int fila = 0; fila < b.length; fila++ ) {
			for (int columna = 0; columna < b[fila].length; columna ++) {
				System.out.print("Celda[" + fila + "][" + columna + "]=");
				b[fila][columna] = tec.nextInt();
			}
		}
		
		c = new int [a.length][a[0].length];
		
		for (int fila = 0; fila < a.length; fila++) {
		    for (int columna = 0; columna < a[fila].length; columna++) {
		        int numeroMatriz1 = a[fila][columna];
		        int numeroMatriz2 = b[fila][columna];
		        int suma = numeroMatriz1 + numeroMatriz2;
		        c[fila][columna] = suma;
		    }
		}
		for (int fila = 0; fila < a.length; fila++) {
		    for (int columna = 0; columna < a[fila].length; columna++) {
		        System.out.printf("%5d ", a[fila][columna]);
		    }
		    System.out.print(" | ");

		    for (int columna = 0; columna < b[fila].length; columna++) {
		        System.out.printf("%5d ", b[fila][columna]);
		    }
		    System.out.print(" | ");

		    for (int columna = 0; columna < c[fila].length; columna++) {
		        System.out.printf("%5d ", c[fila][columna]);
		    }
		    System.out.print(" | ");
		    System.out.println();
		}
		tec.close();
	}

}
