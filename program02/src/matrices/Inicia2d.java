package matrices;

public class Inicia2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// J-17
		
		char [][] a = new char [5][8];
		char [][] b = new char [2][2];
	
		
		for (int fila = 0; fila < a.length; fila++ ) {
			for (int columna = 0; columna < a[fila].length; columna ++) {
				a[fila][columna] = '#';
			}
		}
		for (int fila = 0; fila < b.length; fila++ ) {
			for (int columna = 0; columna < b[fila].length; columna ++) {
				b[fila][columna] = '#';
			}
		}
		System.out.println("- - - - - - - - - - ");
		
		for (int fila = 0; fila < a.length; fila++ ) {
			for (int columna = 0; columna < a[fila].length; columna ++) {
				System.out.print(a[fila][columna]);
			}
			System.out.println();
		}
		System.out.println("- - - - - - - - - - ");
		for (int fila = 0; fila < b.length; fila++ ) {
			for (int columna = 0; columna < b[fila].length; columna ++) {
				System.out.print(b[fila][columna]);
			}
			System.out.println();
		}		
		System.out.println("- - - - - - - - - - ");
	}
}
