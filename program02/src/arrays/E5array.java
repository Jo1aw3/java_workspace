package arrays;

public class E5array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int celda, celda2;
		int max, min;
		
		String[] ars = new String[5];
		ars[0] = "lunes";
		ars[1] = "martes";
		ars[2] = "miercoles";
		ars[3] = "jueves";
		ars[4] = "viernes";
		
		double[] arn = new double[5];
		arn[0] = 12;
		arn[1] = 10;
		arn[2] = 13;
		arn[3] = 16;
		arn[4] = 20;
		
		//la media de la semana en ºF
		
		
		
		//el día más caluroso y más frio
		
		max = arn[0];
		celda2 = 0;
		for (celda = 0; celda < arn.length; celda++) {
			if (arn[celda] > max) {
				max = arn[celda];
				celda2 = celda;
			}
		}
		System.out.println(ars[celda2] + " tiene el día mas caluroso  " + arn[celda2] + "º");
		
		min = arn[0];
		celda2 = 0;
		for (celda = 1; celda < arn.length; celda++) {
			if (arn[celda] < min) {
				min = arn[celda];
				celda2 = celda;
			}
		}
		System.out.println(ars[celda2] + " tiene el día mas frio  " + arn[celda2] + "º");
		
		//los días por encima de la media
		
		
		//los días por debajo de la media
		
		
	}
	
	

}
