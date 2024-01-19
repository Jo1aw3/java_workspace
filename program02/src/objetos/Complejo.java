package objetos;

import java.io.Serializable;

public class Complejo implements Serializable {

	private double real;
	private double imaginario;
	
	//constructor predeterminado
	Complejo () {
		
	}
	
	//constructor personalizado
	Complejo (double a, double b) {
		this.real = a;
		this.imaginario = b;
	}
	
	//constructor copia
	Complejo (Complejo cc) {
		this.real = cc.real;
		this.imaginario = cc.imaginario;
	}
	
	public void escribir() {
		System.out.println(real + " + " + imaginario + " i");
	}
	
}
