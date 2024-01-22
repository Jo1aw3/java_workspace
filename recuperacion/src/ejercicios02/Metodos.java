package ejercicios02;

public class Metodos {

	public static double euroPeseta(double cantidadEuros) {
        double tasaCambio = 166.386;  // 1 Euro = 166.386 Pesetas
        // Realizar la conversión
        double cantidadPesetas = cantidadEuros * tasaCambio;
        return cantidadPesetas;
    }
	
	public static void euroDolar(double cantidadDinero, char monedaCambio) {
		double cambioEuro = 0.92; 
		double cambioDolar = 1.09;
		// monedaCambio.toLowerClass;
		
		if (monedaCambio == 'e') {
			System.out.println("la cantidad esta en dolar.. pasando a euro");
			double cantidadCambio = cantidadDinero * cambioEuro;
			return cantidadCambio;
		} else if (monedaCambio == 'd'){
			System.out.println("la cantidad esta en euro.. pasando a dolar");
			double cantidadCambio = cantidadDinero * cambioDolar;
			return cantidadCambio;
		} else {
			System.out.println("caracter desconocido");
		}
		
	}

	public static void main(String[] args) {

		// variables
		double euros = 70.0;
		double dolares = 50.0;
		
		// 1. euros a pesetas
		// double cantidadPesetas = Metodos.eurosPesetas(euros); si estuvieramos en otra clase
		double pesetas = euroPeseta(euros);
		
		System.out.println(euros + " Euros equivalen a " + pesetas + " Pesetas");
		
		// 2.1 euros a dolares
		double 
		
		
		// 2.2 dolares a euros
		
	}

}
