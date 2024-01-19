package repetitivas;

import java.util.Scanner;

public class sumanumd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,p,s;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		s = 0;
		p = 1;
		
		do {
			System.out.println("itroduce numero");
			n = teclado.nextInt();
		} while (n >= 0) {
			s = s + p;
			p = p + 1;
			teclado.close();
		}
		System.out.println("la suma " + n + " es " + s);
		
	}

}
