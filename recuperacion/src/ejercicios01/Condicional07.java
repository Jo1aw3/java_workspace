package ejercicios01;

import java.util.Scanner;

public class Condicional07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		Scanner tec = new Scanner(System.in);
		
		do {
			
			System.out.println("introduce un numero de 1 a 7");
			numero = tec.nextInt();
			
			if (numero == 1) {
				System.out.println("lunes");
			} else if (numero == 2) {
				System.out.println("martes");
			} else if (numero == 3) {
				System.out.println("miercoles");
			} else if (numero == 4) {
				System.out.println("jueves");
			} else if (numero == 5) {
				System.out.println("viernes");
			} else if (numero == 6) {
				System.out.println("sabado");
			} else if (numero == 7) {
				System.out.println("domingo");
			} else if (numero == 0) {
				System.out.println("hasta luego!");
			} else {
				System.out.println("el numero introducido no es valido");
			}
		
		} while (numero != 0);
		
		tec.close();
	}

}
