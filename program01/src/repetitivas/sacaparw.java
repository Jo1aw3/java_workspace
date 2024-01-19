package repetitivas;

import java.util.Scanner;

public class sacaparw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,p;
		p = 0;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("itroduce numero");
		n = teclado.nextInt();
		teclado.close();
		
		while (p <= n) {
			System.out.println(p);
			p = p + 2;
		}
		
	}

}
