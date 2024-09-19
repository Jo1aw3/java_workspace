package ejercicios01;

public class Bucles09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 0;
		int suma = 0;
		
		while (numero <= 100) {
			System.out.println(numero);
			suma = suma + numero;
			numero = numero + 2;
		}
		System.out.println("suma entre 0 - 100 con numeros pares = " + suma);
		
	}

}
