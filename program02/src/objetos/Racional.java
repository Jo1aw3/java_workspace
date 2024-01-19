package objetos;

	// defino la clase racional
	public class Racional {
		
		//propiedades
		private int numerador;
		private int denominador;
	
	// constructor por defecto
	Racional () {
		
	}
	
	// constructor copia
	Racional (Racional r) {
		this.numerador = r.numerador;
		this.denominador = r.denominador;
	}
	
	// constructor personalizado
	Racional (int n) {
		this.numerador = n;
		this.denominador = 1;
	}
	// constructor personalizado con condicional
	Racional (int n, int d) {
		this.numerador = n;
		if (d == 0) {
			System.out.println("el dominador no puede ser 0");
		}
		else {
			this.denominador = d;
		}
	}
	
	public void escribir() {
		System.out.println(numerador + "/" + denominador);
	}
	
	
}
