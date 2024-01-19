package arrays;

import java.util.Scanner;

public class Contrase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// array409
		
		int contador = 3;
		String user, pass;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("bienvenido");
		System.out.println("introduce el nombre de usuario");
		user = teclado.next();
		System.out.println("introduce la contraseña");
		pass = teclado.next();
		
		while (!(user.equals("usuario") && !pass.equals("contraseña") == false) && contador >= 1 ) {
			contador = contador - 1;
			System.out.println("tienes " + contador + " intentos");
			System.out.println("intentalo de nuevo");
			System.out.println("introduce el nombre de usuario");
			user = teclado.next();
			System.out.println("introduce la contraseña");
			pass = teclado.next();
		}
		
		if (contador <= 1) {
			System.out.println("acceso denegado");
			System.exit(0);
		}
		else {
			System.out.println("bienvenido");
		}
		
		teclado.close();
	}

}
