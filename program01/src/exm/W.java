package exm;

import java.util.Scanner;

public class W {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Joshua Botello 
		
		Scanner teclado = new Scanner(System.in);
		
		String nombre,apellido;
		int edad,menu;
		
			System.out.println("introduce nombre");
			nombre = teclado.next();
			System.out.println("introduce apellido");
			apellido = teclado.next();
			System.out.println("introduce edad");
			edad = teclado.nextInt();
			
			if (edad < 12) {
			System.out.println("...Err0r...");
			System.out.println("no puedes introducirte en el sistema");
			}		
			else {
			System.out.println("hola " + nombre + " " + apellido + " ,bienvenido");
			System.out.println();
			System.out.println("¿que quieres hacer?");
			System.out.println("1 realizar una nueva compra");
			System.out.println("2 comprobrar si existe la fruta");
			System.out.println("3 introducir la fruta");
			System.out.println("4 salir ");
			
				menu = teclado.nextInt();
				switch (menu) {
		
				//realizar una compra
				case 1:
				double p1,p2,p3,p0;
				System.out.println("introduce el precio del primer producto");
				p1 = teclado.nextDouble();
				while (p1 < 0) {
					System.out.println("introducelo de nuevo");
					p1 = teclado.nextDouble();
				}
				System.out.println("introduce el precio del segundo producto");
				p2 = teclado.nextDouble();
				while (p2 < 0) {
					System.out.println("introducelo de nuevo");
					p2 = teclado.nextDouble();
				}
				System.out.println("introduce el precio del tercer producto");
				p3 = teclado.nextDouble();
				while (p3 < 0) {
					System.out.println("introducelo de nuevo");
					p3 = teclado.nextDouble();
				}
				p0 = p1+p2+p3;
				System.out.println("total: " + p0 + "$");
				
				break;
				//comprobar si exsite una fruta
				case 2:
				String fruta2;
				System.out.println("Introduce el nombre de la fruta");	
				fruta2 = teclado.next();
				fruta2 = fruta2.toLowerCase();
				if (fruta2.equals("manzana") == true) {
					System.out.println("si tenemos manzanas");
				}
				else {
					System.out.println("no tenemos esa fruta");
				}
 
				break;
				//introducir una fruta	
				case 3:
				String key, fruta3;
				System.out.println("introduce la fruta");	
				System.out.println("para hacer esta operacion necesitas ser administrador: ");
				System.out.println("introduce la contraseña");	
				key = teclado.next();
				while (key.equals("abc") == false) {
					System.out.println("para hacer esta operacion necesitas ser administrador: ");
					key = teclado.next();
				}
				System.out.println("eres administrador, bienvenido de nuevo");
				System.out.println("introduce el nombre de la fruta");
				fruta3 = teclado.next();
				System.out.println(fruta3 + " se ha guardado");
				System.out.println(fruta3 + " se ha guardado");
				System.out.println(fruta3 + " se ha guardado");
				System.out.println(fruta3 + " se ha guardado");
				
				break;
				//salir
				case 4:
				System.out.println();
				System.out.println("Gracias por utilizar este programa");
				System.out.println("Esperamos tu regreso");
				System.exit(0);
				
				}	
			}
			teclado.close();
	}
}
