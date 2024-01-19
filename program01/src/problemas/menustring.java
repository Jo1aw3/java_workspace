package problemas;

import java.util.Scanner;

public class menustring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		String n;
		System.out.println("¿Cual es tu Nombre?");
		n = teclado.next();
		System.out.println();
		System.out.println("OK! " + n + " ¿Que quieres hacer?");
		System.out.println();
		
		System.out.println("1 Dar la vuelta a una palabra");
		System.out.println("2 Comparar dos palabras");
		System.out.println("3 Número de letras");
		System.out.println("4 Repertir palabras");
		System.out.println("5 Repetir palabras (Mayúscula / Minúscula)");
		System.out.println("6 Salir del programa");
		
		int menu;
		menu = teclado.nextInt();
		switch (menu) {
		
		case 1:
			
		String word, drow = " : ";
		System.out.println("Escribe una palabra cualquiera!");
		word = teclado.next();
		//for (int x=Cadena.length()-1;x>=0;x--)
			  //CadenaInvertida = CadenaInvertida + Cadena.charAt(x);
		for (int x=word.length()-1;x>=0;x--)
			  drow = drow + word.charAt(x); 
		System.out.println(word + " al revés es" + drow);
		break;
		
		case 2:
		
		String w1, w2; 
		System.out.println("Escribe la primera palabra");
		w1 = teclado.next();
		System.out.println("Escribe la segunda palabra");
		w2 = teclado.next();
		// if (primera_palabra.equals(segunda_palabra) == true)
		if (w1.equals(w2) == true) {
			System.out.println("la palabra " + w1 + " y " + w2 + " son iguales");
		}
		else {
			System.out.println("la palabra " + w1 + " y " + w2 + " no son iguales");
		}
		break;
		
		case 3:

		int wn0;
		String wn;
		System.out.println("Escribe una palabra cualquiera!");
		wn = teclado.next();
		wn0 = wn.length();
		
		if (wn0 > 7) {
			System.out.println("La palabra " + wn +  " tiene " + wn0 + " letras. Tamaño de la letra: Grande");
		}
		else {
			System.out.println("La palabra " + wn +  " tiene " + wn0 + " letras. Tamaño de la letra: Pequeño");
		}
		break;
		
		case 4:
			
		String wr;
		System.out.println("Escribe una palabra cualquiera!");			
		wr = teclado.next();
		System.out.println("¿Cuantas veces quieres repetir esta palabra?");
		int wr0 = teclado.nextInt();
		for (int c = 1; c <= wr0; c ++) {
			System.out.println(wr.toUpperCase());
		}
		break;
		
		case 5:
		
		String m,wmr;
		System.out.println("Escribe una palabra cualquiera!");			
		wmr = teclado.next();
		System.out.println("¿Mayúscula(ma) o Minúscula(mi)?");
		m = teclado.next();
		switch (m) {
		
			case "ma":
			System.out.println("¿Cuantas veces quieres repetir esta palabra?");
			int wmr0 = teclado.nextInt();
			
			if (wmr0 > 6) {
					System.out.println("No puedes poner palabras mayor a 6 caracteres ::");
					System.exit(0);
				}
			else {
				for (int c2 = 1; c2 <= wmr0; c2 ++) {
					System.out.println(wmr.toUpperCase());
				}
			}
			break;
			
			case "mi":
			System.out.println("¿Cuantas veces quieres repetir esta palabra?");
			int wmr1 = teclado.nextInt();
			
			if (wmr1 > 6) {
					System.out.println("No puedes poner palabras mayor a 6 caracteres ::");
					System.exit(0);
			}
			else {
				for (int c2 = 1; c2 <= wmr1; c2 ++) {
					System.out.println(wmr.toUpperCase());
				}	
			}
		}
		break;

		case 6:
			
		System.out.println();
		System.out.println("Gracias por utilizar este programa");
		System.out.println("Esperamos tu regreso");
		System.exit(0);
			
		}
		teclado.close();
	}

}
