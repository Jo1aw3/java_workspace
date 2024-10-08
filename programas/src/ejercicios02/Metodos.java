package ejercicios02;

import java.util.Scanner;

public class Metodos {

	public static double euroPeseta(double cantidadEuros) {
        double tasaCambio = 166.386;  // 1 Euro = 166.386 Pesetas
        // Realizar la conversión
        double cantidadPesetas = cantidadEuros * tasaCambio;
        return cantidadPesetas;
    }
	
	public static double euroDolar(double cantidadDinero, char monedaCambio) {
		double cambioEuro = 0.92; 
		double cambioDolar = 1.09;
		double cantidadCambio = 0;
		
		monedaCambio=Character.toLowerCase(monedaCambio);
		if (monedaCambio == 'e') {
			System.out.println("la cantidad esta en dolar.. pasando a euro");
			cantidadCambio = cantidadDinero * cambioEuro;
		} else if (monedaCambio == 'd'){
			System.out.println("la cantidad esta en euro.. pasando a dolar");
			cantidadCambio = cantidadDinero * cambioDolar;
		} else {
			System.out.println("caracter desconocido");
		}
		return cantidadCambio;
	}

	public static void CambioMonedaV01(double cantidad, char monedaIn, char monedaOut) {
		monedaIn = Character.toUpperCase(monedaIn);
		monedaOut = Character.toUpperCase(monedaOut);
		double cantidadCambio = 0;
		
		if (monedaIn == 'E' && monedaOut == 'D') {
			cantidadCambio = cantidad * 1.08;
			System.out.println("cantidad en dolares: " + cantidadCambio);
		} else if (monedaIn == 'E' && monedaOut == 'B') {
			cantidadCambio = cantidad * 0.0002;
			System.out.println("cantidad en bitcoins: " + cantidadCambio);
		} else if (monedaIn == 'D' && monedaOut == 'E') {
			cantidadCambio = cantidad * 0.9;
			System.out.println("cantidad en euros: " + cantidadCambio);
		} else if (monedaIn == 'D' && monedaOut == 'B') {
			cantidadCambio = cantidad * 0.00002;
			System.out.println("cantidad en bitcoins: " + cantidadCambio);
		} else if (monedaIn == 'B' && monedaOut == 'E') {
			cantidadCambio = cantidad * 36;
			System.out.println("cantidad en euros: " + cantidadCambio);
		} else if (monedaIn == 'B' && monedaOut == 'D') {
			cantidadCambio = cantidad * 40;
			System.out.println("cantidad en dolares: " + cantidadCambio);
		} else {
			System.out.println("caracteres desconocidos para el programa");
		}
	}
	
	public static void CambioMonedaV02(double cantidad, char monedaIn, char monedaOut) {
		monedaIn = Character.toUpperCase(monedaIn);
		monedaOut = Character.toUpperCase(monedaOut);
		double cantidadCambio = 0;
		
		switch (monedaIn) {
			case 'E':
				if (monedaOut == 'D') {
					cantidadCambio = cantidad * 1.08;
					System.out.println("cantidad en dolares: " + cantidadCambio);
				} else if (monedaOut == 'B') {
					cantidadCambio = cantidad * 0.0002;
					System.out.println("cantidad en bitcoins: " + cantidadCambio);
				} else {
					System.out.println("caracter desconocido para el programa");
				}
				break;
			case 'D':
				if (monedaOut == 'E') {
					cantidadCambio = cantidad * 0.9;
					System.out.println("cantidad en euros: " + cantidadCambio);
				} else if (monedaOut == 'B') {
					cantidadCambio = cantidad * 0.00002;
					System.out.println("cantidad en bitcoins: " + cantidadCambio);
				} else {
					System.out.println("caracter desconocido para el programa");
				}
				break;
			case 'B':
				if (monedaOut == 'E') {
					cantidadCambio = cantidad * 36;
					System.out.println("cantidad en euros: " + cantidadCambio);
				} else if (monedaOut == 'D') {
					cantidadCambio = cantidad * 40;
					System.out.println("cantidad en dolares: " + cantidadCambio);
				} else {
					System.out.println("caracter desconocido para el programa");
				}
				break;
			default:
				System.out.println("caracter desconocido para el programa");
		}
		
	}
	
	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		
		// variables
		double euros = 70.0;
		
		// 1. euros a pesetas
		// double cantidadPesetas = Metodos.eurosPesetas(euros); si estuvieramos en otra clase
		double pesetas = euroPeseta(euros);
		
		System.out.println(euros + " Euros equivalen a " + pesetas + " Pesetas");
		
		// 2.1 euros a dolares
		// primera forma de imprimir el valor
		System.out.println(euroDolar(40,'d'));
		// segunda forma de imprimir el valor
		double cambioDolar = euroDolar(40,'d');
		System.out.println(cambioDolar);
		
		// 2.2 dolares a euros
		// primera forma de imprimir el valor
		System.out.println(euroDolar(40,'e'));
		// segunda forma de imprimir el valor
		double cambioEuro = euroDolar(40,'e');
		System.out.println(cambioEuro);
		
		// 3 cambio de monedas euros, dolares, bitcoins
		double cantidadDinero;
		char monedaEntrada, monedaSalida;
		System.out.println("introduce una cantidad de dinero");
		cantidadDinero = tec.nextDouble();
		System.out.println("introduce la moneda actual");
		monedaEntrada = tec.next().charAt(0);
		System.out.println("introduce la moneda a la cual quieres convertir");
		monedaSalida = tec.next().charAt(0);
		
		// primera versión del procedimiento
		System.out.println("CambioMonedaV01");
		CambioMonedaV01(cantidadDinero, monedaEntrada, monedaSalida);
		
		// segunda version del procedimiento
		System.out.println("CambioMonedaV02");
		CambioMonedaV02(cantidadDinero, monedaEntrada, monedaSalida);
		
		tec.close();
	}

}
