package arrays;

public class E4array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int celda, celda2;
		int max, min;
		
		int[] arn = new int[6];
		arn[0] = 18;
		arn[1] = 20;
		arn[2] = 26;
		arn[3] = 21;
		arn[4] = 17;
		arn[5] = 24;
		
		String[] ars = new String[6];
		ars[0] = "jon";
		ars[1] = "sara";
		ars[2] = "ander";
		ars[3] = "marta";
		ars[4] = "jone";
		ars[5] = "mikel";
		
		System.out.println("_ _ _ _ _ _ _ _");
		
		System.out.println("La edad del más Joven");
		
		min = arn[0];
		celda2 = 0;
		for (celda = 1; celda < arn.length; celda++) {
			if (arn[celda] < min) {
				min = arn[celda];
				celda2 = celda;
			}
		}
		System.out.println(ars[celda2] + " tiene " + arn[celda2] + " años");
		
		System.out.println("_ _ _ _ _ _ _ _");
		
		System.out.println("La edad del más Viejo");
		
		max = arn[0];
		celda2 = 0;
		for (celda = 0; celda < arn.length; celda++) {
			if (arn[celda] > max) {
				max = arn[celda];
				celda2 = celda;
			}
		}
		System.out.println(ars[celda2] + " tiene " + arn[celda2] + " años");
		
		System.out.println("_ _ _ _ _ _ _ _");
	}

}
