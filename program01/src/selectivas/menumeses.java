package selectivas;

import java.util.Scanner;

public class menumeses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mes;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("Introduce el Mes para saber su numero");
		System.out.println("_ _ _ _ _ _ _ _ _");
	
		mes = teclado.next();
		teclado.close();
		
		switch (mes) {
		case "enero":
			System.out.println(" ... 01 ... ");
			break;
		case "febrero":
			System.out.println(" ... 02 ... ");
			break;
		case "marzo":
			System.out.println(" ... 03 ... ");
			break;
		case "mayo":
			System.out.println(" ... 04 ... ");
			break;
		case "abril":
			System.out.println(" ... 05 ... ");
			break;
		case "junio":
			System.out.println(" ... 06 ... ");
			break;
		case "julio":
			System.out.println(" ... 07 ... ");
			break;
		case "agosto":
			System.out.println(" ... 08 ... ");
			break;
		case "septiembre":
			System.out.println(" ... 09 ... ");
			break;
		case "octubre":
			System.out.println(" ... 10 ... ");
			break;
		case "noviembre":
			System.out.println(" ... 11 ... ");
			break;
		case "diciembre":
			System.out.println(" ... 12 ... ");
			break;
		default:
			System.out.println("ErrOr");
		}
	}

}
