package EjerciciosBucles;

import java.util.Scanner;

public class BucleJava05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tec = new Scanner(System.in);
		int n,m = 0;
		
		System.out.println("introduce un numero: ");
		n = tec.nextInt();
		
 
		while (n > 0) {
			n = n / 10;
			m = m + 1;
		}
		System.out.println(m);
		tec.close();
	}

}
