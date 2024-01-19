package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListNumveces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//04
		
		// definimos el arraylist con el objeto Integer que recibe numeros enteros
		ArrayList<Integer> arlist = new ArrayList<Integer>();
		
		// definimos algunas variables 
		int numero, valor;
		
		// abrimos el Scanner para poder escribir por medio del teclado
		Scanner tec = new Scanner(System.in);
		
		// como un arraylist es dinamico, establecemos las posiciones para despues contar las veces que se suma el numero que contiene cada no, por ahora las 5 posiciones se inicializan a 0 
		for(int posicion = 0; posicion < 5; posicion++) {
			arlist.add(0);
		}
		
		System.out.println("introduce numero: ");
		numero = tec.nextInt();
		// mientra el numero sea mayor que 0 y menor o igual que 5
		while (numero > 0 && numero <= 5) {
			//el valor sera igual a la posicion menos uno
			valor = arlist.get(numero - 1);
			//el valor se le sumara uno
			valor = valor + 1;
			//y se añadira el valor en la posicion que señala
			arlist.set(numero - 1, valor);
			//y regresa a preguntar para meter otro valor y asi ir sumando
			System.out.println("introduce numero: ");
			//y regresa al bucle asta que no sea menor que 0 o sea mayor o igual que 5
			numero = tec.nextInt();
		}
		
		//y aqui mostramos en pantalla los datos que a calculado el anterior while, recorriendo el arraylist con un for tradicional
		for (int posicion = 0; posicion < arlist.size(); posicion++) {
			// se muestra por pantalla en numero de posiciones que tiene el arraylist +1 (ya que iniciliza a 0 un arraylist, y mostramos lo que hay dentro de la posicion con get)
			System.out.println((posicion + 1) + " : "  + arlist.get(posicion));
		}
	
		tec.close();
	}

}
