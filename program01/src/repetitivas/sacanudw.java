package repetitivas;

import java.util.Scanner;

public class sacanudw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,p;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("itroduce numero");
		n = teclado.nextInt();
		teclado.close();
		
		p = n - 1;
		
		while (p <= n && p >= 1) {
			System.out.println(p);
			p = p - 1;
		}
		
	}

}
