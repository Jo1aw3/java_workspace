package ejercicios01;

public class Bucles08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 31;
		int suma = 0;
		
		while (numero <= 50) {
			System.out.println(numero);
			suma = suma + numero;
			numero = numero + 2;
		}
		System.out.println("suma entre 30 - 50 con numeros impares= " + suma);
		
	}

}
