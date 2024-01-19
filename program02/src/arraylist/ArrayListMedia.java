package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//05
		
		Scanner tec = new Scanner(System.in);
		
		// definimos el arraylist
		ArrayList<Integer> arlist = new ArrayList<Integer>();
		int numero;
		
		System.out.println("introduce numero: ");
		//recogemos un numero entero por medio de Scanner
		numero = tec.nextInt();
		// mientras no sea un numero negativo el bucle no terminara
		while (numero > 0) {
			arlist.add(numero);
			System.out.println("introduce numero: ");
			numero = tec.nextInt();
		}
		
		int suma = 0;
		
		// usamos un for tradicional para recorrer el arraylist
		for (int posicion = 0; posicion < arlist.size(); posicion++) {
			//definimos a numero igual a la posicion optenida del arraylist
			numero = arlist.get(posicion);
			//en cada bucle se sumara cada unos de los numeros
			suma = suma + numero;
		}
		
		double media;
		//se calcula la media (sumando previamente el valor de los numeros introducidos, y despues dividivo por la cantidad de los numero itroducidos)
		media = (double)suma / (double)arlist.size();
		//como la media necesita ser un numero real, lo que hacemos en este caso es castearlo para que suma y arlist puedan ser calculados y dar un valor de numero real
		System.out.println("media: " + media);
		//y lo sacamos por pantalla
		tec.close();
	}

}
