package objetos;

import java.util.Scanner;

public class FechaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		Fecha f1 = new Fecha ();
		Fecha f2 = new Fecha (14,11,2022);
		Fecha f3 = new Fecha (f2);
		Fecha f4 = new Fecha ();

		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		f4.leer(teclado);
		System.out.println(f4);
		
		teclado.close();
	}

}
