package repetitivas;

import java.util.Scanner;

public class maximini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//121
		
		int n,ma,mi;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("introduce un numero");
		n = teclado.nextInt();
		
		if (n >= 0) {
			ma = n;
			mi = n;
			while (n >= 0) {
				if (n > ma) {
					ma = n;
				}
				if (n < mi)	{
					mi = n;
				}
				System.out.println("introduce otro numero entero: ");
				n = teclado.nextInt();
			}
			System.out.println("maximo: " + ma + " minimo: " + mi );
		}
		teclado.close();
		

	}

}
