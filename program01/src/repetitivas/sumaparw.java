package repetitivas;

import java.util.Scanner;

public class sumaparw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,p,s;
		s = 0;
		p = 2;	
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("itroduce numero");
		n = teclado.nextInt();
		teclado.close();
		
		while (p <= n) {
			s = s + p;
			p = p + 2;
		}
		System.out.println("la suma de los numero pares de " + n + " es " + s);
	}

}
