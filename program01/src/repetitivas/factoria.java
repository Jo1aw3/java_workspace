package repetitivas;

import java.util.Scanner;

public class factoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//119
		
		int n,p;
		double m;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("itroduce numero");
		n = teclado.nextInt();
		teclado.close();
		
		m = 1;
		p = 2;
		
		while (p <= n) {
			m = m * p;
			p = p + 1;
			System.out.println(p);
		}
		System.out.println(n + "! = " + m);
		
	}

}
