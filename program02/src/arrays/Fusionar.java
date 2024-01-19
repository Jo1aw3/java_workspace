package arrays;

public class Fusionar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int posicion1, posicion2, posicion3;
		String [] array1 = {"1","3","5","7"};
		String [] array2 = {"2","4","6","8"};
		String [] array3 = new String [10];
		int elemento1, elemento2, elemento3;
		
		elemento1 = array1.length;
		elemento2 = array2.length;
		elemento3 = 0;
		
		System.out.println("array: ");
		for (posicion1 = 0; posicion1 < elemento1; posicion1++) {
			System.out.println(array1[posicion1]);
		}
		
		System.out.println("array: ");
		for (posicion2 = 0; posicion2 < elemento2; posicion2++) {
			System.out.println(array2[posicion2]);
		}
		
	}

}
