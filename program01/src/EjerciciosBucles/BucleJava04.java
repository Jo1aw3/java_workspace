package EjerciciosBucles;

import java.util.Scanner;

public class BucleJava04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tec = new Scanner(System.in);
		int a,b=1;
		
		do {
			System.out.println("introduce un numero: ");
			a = tec.nextInt();
		}
		while (a<0);
			
		for (int i=0; a>i; a--) {
			b = b*a;
		}
		System.out.println(b);
		tec.close();
	}

}
