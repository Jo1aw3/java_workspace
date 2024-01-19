package condicionales;

import java.util.Scanner;

public class segundoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hora, minuto, segundo;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("Introduce la hora");
		hora = teclado.nextInt();
		System.out.println("Introduce el minuto");
		minuto = teclado.nextInt();
		System.out.println("Introduce el segundo");
		segundo = teclado.nextInt();
		teclado.close();
		
		segundo = segundo + 1;
		System.out.println("la hora es: " + hora + ":" + minuto + ":" + segundo);
		
	}

}
