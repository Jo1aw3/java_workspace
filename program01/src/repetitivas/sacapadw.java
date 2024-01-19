package repetitivas;

import java.util.Scanner;

public class sacapadw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,p;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("itroduce numero");
		n = teclado.nextInt();
		teclado.close();
		
		if (n % 2 == 0) {
			p = n;
		}
		else {
			p = n - 1;
		}
		
		while (p <= n && p >= 0) {
			System.out.println(p);
			p = p - 2;
		}
		
	}

}
