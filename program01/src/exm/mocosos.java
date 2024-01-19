package exm;

import java.util.Scanner;

public class mocosos {

	public static void main(String[] args) {
	
		String key, name;
		int edad;
		Scanner tec = new Scanner(System.in);
		
		System.out.println("nombre de usuario");
		name = tec.next();
		System.out.println("introduce la contraseña");	
		key = tec.next();
		while (key.equals("program") == false) {
			System.out.println("introduce otra vez la contraseña: ");
			key = tec.next();
		}
		System.out.println("Bienvenido " + name + "!");
	
		System.out.println("¿Que edad tienes?");
		edad = tec.nextInt();
		if (edad < 18) {
			System.out.println("No tienes acceso al sistema");
			}
		else {
			System.out.println("Hola " + name + " ,bienvenid@");
		
		System.out.println("1 sumar numeros");
		System.out.println("2 comprobrar si existe la letra A");
		System.out.println("3 salir ");
		int menu;
		menu = tec.nextInt();
		switch (menu) {
		
		case 1:
		//int n1,n2,n0;
		break;
		case 2:
			
		break;
		case 3:
		System.out.println("gracias por haber pasado por aqui " + name);
		tec.close();
		System.exit(0);
			
		}
		
		}
	}

}
