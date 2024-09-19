package ejercicios01;

import java.util.Scanner;

public class Condicional01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nota;
		Scanner tec = new Scanner(System.in);
		System.out.println("que nota tienes?");		
		nota = tec.nextInt();
		
		if (nota >= 5) {
			System.out.println("aprobado");
		} else {
			System.out.println("desaprobado");
		}
		
		tec.close();
	}

}
