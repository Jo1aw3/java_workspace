package repetitivas;

import java.util.Scanner;

public class sumapadw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//117
		
		int n,p,s;
		s = 0;	
		
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
		
		System.out.println("ahora p es " + p);
		
		while (p <= n && p >= 0) {
			System.out.println(p);
			s = s + p;
			p = p - 2;	
		}
		
		System.out.println("la suma de los numero pares de " + n + " es " + s);
		
	}

}
