package arrays;

import java.util.Scanner;

public class E3array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// por hacer...
		
		double mayor = 0;
		
		String[] ars = new String[5];
		double[] ard = new double[5];
		
			ars[1] = "enero";
			ars[2] = "febrero";
			ars[3] = "marzo";
			ars[4] = "abril";
			ars[5] = "mayo";						
			
			ard[0] = 123;
			ard[1] = 333;
			ard[2] = 180;
			ard[3] = 211;
			ard[4] = 90;
		
		
		System.out.println("PRECIPITACIONES");
		for (int celda = 0;celda<ars.length;celda++) {
			System.out.println(ars[celda] + " " + ard[celda] + " litros");
		}
		
		System.out.println("MES CON MAS LLUVIA");
		for (int celda = 0;celda<ars.length;celda++) {
			if ard[celda] > mayor {
				mayor = ard[celda];
			}
		}
			
	}

}
