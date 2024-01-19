package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListCadenasOrdenado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//09
		
	// Definimos el arraylist de objeto String
	ArrayList<String> arlist = new ArrayList<String>();
	
	String palabra;
	Scanner tec = new Scanner(System.in);
	System.out.println("introduce palabra: ");
	palabra = tec.nextLine();
	
	while (!palabra.isEmpty()) {
		// mientras no este vacia la variable palabra que recoje por teclado, el bucle no se acaba
		arlist.add(palabra);
		System.out.println("introduce palabra: ");
		palabra = tec.nextLine();
	}
	
	Collections.sort(arlist);
	//organizamos el arraylist de manor a mayor
	
	for (int posicion = 0; posicion < arlist.size(); posicion++) {
		System.out.println(arlist.get(posicion));
		//recorremos el arraylist con un for tradicional y lo mostramos por pantalla el contenido de cada una de las posiciones de esta misma
	}
	
	tec.close();
	}

}