package selectivas;

import java.util.Scanner;

public class expendedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double saldo;
		int nota_e;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("Introduce la nota . . .");
		System.out.println("_ _ _ _ _ _ _ _ _");
	
		nota = teclado.nextDouble();
		teclado.close();
		
		nota_e = (int) nota;
		
		switch (nota_e) {
		case 1,2,3,4,5:
			System.out.println(" ... insuficiente ... ");
			break;
		case 6:
			System.out.println(" ... Suficiente ... ");
			break;
		case 7:
			System.out.println(" ... Bien ... ");
			break;
		case 8:
			System.out.println(" ... Notable ... ");
			break;
		case 9:
			System.out.println(" ... Sobresaliente ... ");
			break;
		case 10:
			System.out.println(" ... Exelente ... ");
			break;
		
		default:
			System.out.println("ErrOr");
			
		}
		
	}

}
