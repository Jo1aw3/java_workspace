package repetitivas;

import java.util.Scanner;

public class sumanumf {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,p,s;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("itroduce numero");
		n = teclado.nextInt();
		teclado.close();
		
		s = 0;
		p = 1;
		
		for (p=1;p<=n;p=p+1) {
			s = s + p;
		}
		System.out.println("la suma " + n + " es " + s);
	}

}
