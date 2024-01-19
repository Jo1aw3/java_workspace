package subclases;

import java.util.Scanner;

public class AlumnoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno a1 = new Alumno();
		System.out.println(a1);
		Alumno a2 = new Alumno("d2","n2","a2",new FechaT5(),"2Dw3");
		System.out.println(a2);
		
		//getters and Setters
		
		a1.setDni("D1");
		a2.setGrupo("1AS3");
		System.out.println(a1);
		//equals
		Alumno a3 = new Alumno(a2);
		if (a3.equals(a2)) {
			System.out.println(a3 + " es igual a " + a2);
		}
		else {
			System.out.println(a3 + " no es igual " + a2);
		}
		
		//compare to
		a2.setDni("d1");
		a1.setGrupo("2DW3");
		int comparacion;
		comparacion = a1.compareTo(a2);
		if (comparacion > 0) {
			System.out.println(a1 + " es mayor que " + a2);
		}
		else if (comparacion < 0) {
			System.out.println(a1 + " es menor que " + a2);
		}
		else {
			System.out.println(a1 + " es igual a " + a2);
		}
		
		//leer
		Scanner tec = new Scanner(System.in);
		System.out.println("Alumno: ");
		a1.leer(tec);
		System.out.println(a1);
		
		tec.close();
		
	}

}
