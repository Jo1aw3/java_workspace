package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMediaTemperaturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//06
		
		Scanner tec = new Scanner(System.in);
		
		ArrayList<Double> arlist = new ArrayList<Double>();
		double temp;
		
		System.out.println("introduce temperatura: ");
		temp = tec.nextDouble();
		while (temp > -999.0) {
			arlist.add(temp);
			System.out.println("introduce temperatura: ");
			temp = tec.nextDouble();
		}
		
		double suma = 0;
		for (int posicion = 0; posicion < arlist.size(); posicion++) {
			temp = arlist.get(posicion);
			suma = suma + temp;
		}
		
		double media;
		media = suma / arlist.size();
		// a comparacion del ejercicio 5, arlist y la suma ya son numeros reales, por lo cual no hace falta castearlos para sacar la media
		System.out.println("media: " + media);
		
		int mayores = 0, iguales = 0, menores = 0;
		// a continuacion lo que aremos sera sacar los numeros que son mayores, menores e iguales que la media
		// para eso usamos un for each para recorrer el arraylist 
		for (double posicion : arlist) {
			temp = posicion;
			// usamos una variable para sacar alguno de las tres opciones depende de cada uno de los numeros que hay dentro del arraylist
			if (temp > media) {
				mayores++;
			}
			else if (temp < media) {
				menores++;
			}
			else {
				iguales++;
			}
		}
		//ya para finalizar, mostraremos por pantalla la cantidad de elementos que son mayores, menores o iguales que la media
		System.out.println("Mayores: " + mayores + " Menores: " + menores + " Iguales: " + iguales);
		
		tec.close();
	}

}
