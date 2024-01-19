package problemas;

import java.util.Scanner;

public class gestionarnotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Programa para gestionar notas
		
		String usuario, nombre, apellido, key;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		do {
			System.out.println("Nombre de Usuario?");
			usuario = teclado.next();
			System.out.println("Contraseña?");
			key = teclado.next();
			key = key.toUpperCase();
			if (key.indexOf('E') > -1) {
				System.out.println("...Err0r, la letra 'e' es invialida para la contraseña...");
				System.out.println("Introdusca otra vez sus datos por fravor: ..");
			}
		}	
		while (key.indexOf('E') > -1);
		
		System.out.println("Welcome o/ " + usuario);
		System.out.println("Que harás??");
		System.out.println("1. Introducir notas");
		System.out.println("2. salir");
		
		int menu;
		menu = teclado.nextInt();
		switch (menu) {
		
		case 1: 
		
		double nota1, nota2, nota3, nota4, nota5;
		double notae, notaf, notaw, notat;
		
		System.out.println("Nombre del estudiante?");
		nombre = teclado.next();
		System.out.println("Apellido del estudiante?");
		apellido = teclado.next();
		
		System.out.println("Nota del primer examen?");
		nota1 = teclado.nextDouble();
		while (nota1 < 0 || nota1 > 10) {
			System.out.println("Esta nota no es aceptada");
			System.out.println("Introducela de nuevo: ");
			nota1 = teclado.nextDouble();
		}
		System.out.println("Nota del segundo examen?");
		nota2 = teclado.nextDouble();
		while (nota2 < 0 || nota2 > 10) {
			System.out.println("Esta nota no es aceptada");
			System.out.println("Introducela de nuevo: ");
			nota2 = teclado.nextDouble();
		}
		System.out.println("Nota del tercer examen?");
		nota3 = teclado.nextDouble();
		while (nota3 < 0 || nota3 > 10) {
			System.out.println("Esta nota no es aceptada");
			System.out.println("Introducela de nuevo: ");
			nota3 = teclado.nextDouble();
		}
		System.out.println("Nota del último examen?");
		nota4 = teclado.nextDouble();
		while (nota4 < 0 || nota4 > 10) {
			System.out.println("Esta nota no es aceptada");
			System.out.println("Introducela de nuevo: ");
			nota4 = teclado.nextDouble();
		}
		System.out.println("Nota del trabajo en clase?");
		nota5 = teclado.nextDouble();
		while (nota5 < 0 || nota5 > 10) {
			System.out.println("Esta nota no es aceptada");
			System.out.println("Introducela de nuevo: ");
			nota5 = teclado.nextDouble();
		}
		
		teclado.close();
		
		notae = (nota1 + nota2 + nota3) /3 * 0.55;
		notaf = nota4 * 0.3;
		notaw = nota5 * 0.15;
		notat = notae + notaf + notaw;
		System.out.println(notat);
		
		if (notat >= 0 && notat <= 4.9) {
			System.out.println("La nota final del alumno " + nombre + " es " + notat + " //suspenso");
		}
		else if (notat >= 5 && notat <= 5.9) {
			System.out.println("La nota final del alumno " + nombre + " es " + notat + " //suficiente");
		}
		else if (notat >= 6 && notat <= 6.9) {
			System.out.println("La nota final del alumno " + nombre + " es " + notat + " //bien");
		}
		else if (notat >= 7 && notat <= 8.9) {
			System.out.println("La nota final del alumno " + nombre + " es " + notat + " //notable");
		}
		else if (notat >= 9 && notat <= 10) {
			System.out.println("La nota final del alumno " + nombre + " es " + notat + " //sobresaliente");
		}
		else {
			System.out.println("Err0r");
		}
		break;
		case 2:
		System.out.println("Gracias por utilizar este gestionardos de notas");
		System.out.println("Esperamos su regreso a este programa");
		
		}
		
	}
		

}
