package selectivas;

import java.util.Scanner;

public class menudias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char m;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("escoge una opción, intorduce numero");
		
		System.out.println("_ _ _ _ _ _ _ _");
		System.out.println("Introduce el dia de la semana por medio de su caracter...");
		System.out.println("- - - - - - - -");
	
		m = teclado.nextLine().charAt(0);
		teclado.close();
		
		switch (m) {
		case 'l':
			System.out.println("Escogiste Lunes");
			break;
		case 'm':
			System.out.println("Escogiste Martes");
			break;
		case 'x':
			System.out.println("Escogiste Miercoles");
			break;
		case 'j':
			System.out.println("Escogiste Jueves");
			break;
		case 'v':
			System.out.println("Escogiste Viernes");
			break;
		case 's':
			System.out.println("Escogiste Sabado");
			break;
		case 'd':
			System.out.println("Escogiste Domingo");
			break;
		default:
			System.out.println("ERROR");
		}
	}

}
