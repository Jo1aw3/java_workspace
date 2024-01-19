package ejercicios01;

import java.util.Scanner;

public class Condicional12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double potencia;
		char unidad; 
		Scanner tec = new Scanner(System.in);
		
		System.out.println("|convertidor de energia|");
		System.out.println("introduce la potencia");
		potencia = tec.nextDouble();
		System.out.println("en que unidad esta?");
		unidad = tec.next().toLowerCase().charAt(0);
		
		if (unidad == 'k') {
			System.out.println(potencia + " Kw");
			potencia = potencia * 1.35;
			System.out.println(potencia + " Cv");
		} else if (unidad == 'c') {
			System.out.println(potencia + " Cv");
			potencia = potencia / 1.35;
			System.out.println(potencia + " Kw");
		} else {
			System.out.println("error de introduccion");
		}
		
		tec.close();
	}

}
