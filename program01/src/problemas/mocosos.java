package problemas;

import java.util.Scanner;

public class mocosos {

	public static void main(String[] args) {
	
		String key, name,r;
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
			do {
			System.out.println("Hola " + name + " ,bienvenid@");
		
			System.out.println("1 sumar numeros");
			System.out.println("2 comprobrar si existe la letra A");
			System.out.println("3 salir ");
			int menu;
			menu = tec.nextInt();
			switch (menu) {
		
				case 1:
				int n1,n2,n0;
				do {
					System.out.println("introduce un numero");
					n1 = tec.nextInt();
					System.out.println("introduce otro numero");
					n2 = tec.nextInt();
					n0 = n1 + n2;
					if (n0 < 0) {System.out.println("como resultado es un numero negativo, repite la operación");}
					else {System.out.println("como resultado tenermos " + n0);}
				}
				while (n0 < 0);
				
				break;
				case 2:
				String a;
				System.out.println("Introduce una palabra");	
				a = tec.next();
				a = a.toLowerCase();
				if (a.contains("a")) {
					System.out.println("si! contiene la palabra A");
					for (int c=0;c<5;c++) {
						System.out.print(" | " + a);
					}
						
					}
				else {
					System.out.println("No contiene la palabra A");
				}			
					
				break;
				case 3:
				System.out.println("gracias por haber pasado por aqui " + name);
				System.exit(0);
			
			}
			System.out.println();
			System.out.println("quieres salir del programa si/no");
			r = tec.next();
			} while (r.equals("no") == true);
			tec.close();
		}
	}
}
