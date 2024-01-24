package ejercicios02;

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

	public static void CambioMoneda(double cantidad, char monedaIn, char monedaOut) {
		monedaIn = Character.toUpperCase(monedaIn);
		monedaOut = Character.toUpperCase(monedaOut);
		
		if (monedaIn == 'E' && monedaOut == 'D') {
			
		} else if (monedaIn == 'E' && monedaOut == 'B') {
			
		} else if (monedaIn == 'D' && monedaOut == 'E') {
			
		} else if (monedaIn == 'D' && monedaOut == 'B') {
			
		} else if (monedaIn == 'B' && monedaOut == 'E') {
			
		} else if (monedaIn == 'B' && monedaOut == 'D') {
			
		} else {
			System.out.println("caracteres desconocidos para el programa");
		}
	}
	
	public static void CambioMonedaV2(double cantidad, char monedaIn, char monedaOut) {
		monedaIn = Character.toUpperCase(monedaIn);
		monedaOut = Character.toUpperCase(monedaOut);
		
		switch (monedaIn) {
			case 'E':
				if (monedaOut == 'D') {
					
				} else if (monedaOut == 'B') {
					
				} else {
					System.out.println("caracter desconocido para el programa");
				}
				break;
			case 'D':
				if (monedaOut == 'E') {
					
				} else if (monedaOut == 'B') {
					
				} else {
					System.out.println("caracter desconocido para el programa");
				}
				break;
			case 'B':
				if (monedaOut == 'E') {
					
				} else if (monedaOut == 'D') {
					
				} else {
					System.out.println("caracter desconocido para el programa");
				}
				break;
			default:
				System.out.println("caracter desconocido para el programa");
		}
		
	}
	
	public static void main(String[] args) {

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
		
	}

}
