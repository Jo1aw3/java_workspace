package arrays;

import java.util.Scanner;

public class Mediatem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array407
		
		double grados;
		int contador = 0;
		int posicion = 0;
		double media = 0.0;
		double [] arraydouble = new double[5];
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce un valor");
		grados = teclado.nextDouble();
		
		while (grados >= -999 && contador < 5) {
			arraydouble[contador] = grados;
			contador = contador + 1;
			if (contador < 5) {
				System.out.println("introduce un valor");
				grados = teclado.nextDouble();
			}
		}
		
		while (posicion < contador) {
			media = media + arraydouble[posicion];
			posicion = posicion + 1;
		}	
		media = media / 4;
		System.out.println("la media es: " + media);
				
		int mayores = 0;
		int menores = 0;
		int iguales = 0;
		posicion = 0;
		while (posicion < contador) {
			if(arraydouble[posicion] > media) {
				mayores = mayores +1;
			}
			else if (arraydouble[posicion] == media){
				iguales = iguales +1;
			}
			else {
				menores = menores + 1;
			}
			posicion++; 
		}
		
		System.out.println("Hay " + menores + " temperaturas menores que la media");
		System.out.println("Hay " + iguales + " temperaturas iguales que la media");
		System.out.println("Hay " + mayores + " temperaturas mayores que la media");
	
		teclado.close();
	}

}
