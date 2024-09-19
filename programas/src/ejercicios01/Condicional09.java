package ejercicios01;

import java.util.Scanner;

public class Condicional09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String user, pass;
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Usuario:");
		user = tec.next();
		System.out.println("Contraseña:");
		pass = tec.next();
		
		if (user.equals("ikaslea") && pass.equals("ik1920")) {
			System.out.println("sus datos son correctos");
		} else {
			System.out.println("sus datos no son correctos");
		}
		
		tec.close();
	}

}
