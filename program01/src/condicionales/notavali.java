package condicionales;

import java.util.Scanner;

public class notavali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double nota;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("introduce la nota: ");
		nota = teclado.nextInt();
		teclado.close();
		
		if (nota >= 0 && nota <=10) {
			System.out.println("La nota que introduciste es valida");
		}
		else {
			System.out.println("La nota que introduciste no es valida");
		}
		
	}

}
