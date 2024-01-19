package objetos;

import java.util.Scanner;

public class AsignaturaBucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Asignatura a = new Asignatura();
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("introduce los datos de asignatura");
		a.leer(tec);
		
		while (a.getNota() >= 0.0) {
			System.out.println(a);
			System.out.println("introduce los datos de asignatura");
			a.leer(tec);
		}
		System.out.println("end");
		
		tec.close();
	}

}
