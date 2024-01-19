package EjerciciosBucles;

import java.util.Scanner;

public class BucleJava06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		double n1,n2,n3;
		int c = 0, e= 0;
		
		do {System.out.println("Introduce primera nota: ");
		n1 = teclado.nextDouble();
		} while (n1< 0 || n1 > 10);
		
		do {System.out.println("Introduce segunda nota: ");
		n2 = teclado.nextDouble();
		} while (n2< 0 || n2 > 10);
		
		do {System.out.println("Introduce tercera nota: ");
		n3 = teclado.nextDouble();
		} while (n3< 0 || n3 > 10);
		
		if (n1>05)
			c++;
		else 
			e++;
		if (n2>05)
			c++;
		else 
			e++;
		if (n3>05)
			c++;
		else 
			e++;	
		
		teclado.close();
	}

}
