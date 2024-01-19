package exm;

import java.util.Arrays;

public class tiendaLibros {

	public static void main(String[] args) {
		
		int[] arraynumeros = {4,7,5,9,7,5,3};
		int[] newArray = null;
		
		int elementEliminar = 5;
		
		for (int i = 0; i < arraynumeros.length;i++) {
			
			if (arraynumeros[i] == elementEliminar) {
				
				newArray = new int [arraynumeros.length-1];
				
				for (int j = 0; j < i; j++) {
					newArray[j] = arraynumeros[j];
					
				}
				
				for (int k = i; k < arraynumeros.length -1; k++) {
					newArray[k] = arraynumeros[k+1];
				}
				
			}
			
		}
		
		System.out.println(Arrays.toString(newArray));

	}

}



