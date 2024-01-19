package clases;

import java.util.Scanner;

public class Complejo2 {
	
	//definimos atributos
	private double real;
	private double imaginario;
	
	//constructor predeterminado
	Complejo2 () {
		
	}
	//constructor personalizado
	Complejo2 (double a, double b) {
		this.real = a;
		this.imaginario = b;
	}
	//constructor copia
	Complejo2 (Complejo2 cc) {
		this.real = cc.real;
		this.imaginario = cc.imaginario;
	}
	
	//set and get (source)
		public double getReal() {
			return real;
		}

		public void setReal(double real) {
			this.real = real;
		}

		public double getImaginario() {
			return imaginario;
		}

		public void setImaginario(double imaginario) {
			this.imaginario = imaginario;
		}
	
	@Override
		public String toString() {
			return "Complejo2 [real=" + real + ", imaginario=" + imaginario + "]";
		}
	
		/*public void escribir() {
			System.out.println(real + " + " + imaginario + " i");
		}*/
		
	//hashCode...
	public int hashCode() {
			final int prime = 31;
			int result = 1;
			long temp;
			temp = Double.doubleToLongBits(imaginario);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(real);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			return result;
		}
	//equals..
	public boolean equals(Object obj) {
			if (this == obj)
				// si es el mismo objeto
				 return true;
			if (obj == null)
				// si el objeto es nulo (no está creado)
				 return false;
			if (getClass() != obj.getClass()) 
				// si los objetos no son de la misma clase
				 return false;
			// creo un objeto temporal de esta clase
			Complejo2 other = (Complejo2) obj;
			// comparo las propiedades de los objetos this y other
			if(this.real == other.real && this.imaginario == other.imaginario) {
				// si son iguales
				return true;
			}
				return false;
		}
	//compareTo...
	public int compareTo(Complejo2 other) {
		 if(this.real > other.real){
			 return 1;
		 }
		 else if (this.real < other.real){
			 return -1;
		 }
		 else {
			 if (this.imaginario > other.imaginario){
				 return 1;
			 }
			 else if (this.imaginario < other.imaginario){
				 return -1;
			 }
			 else {
				 return 0;
			 }
		 }
	}
	
	//leer...
	public void leer(Scanner tec) {
		System.out.println("real:: ");
		this.real = tec.nextDouble();
		System.out.println("imaginario:: ");
		this.imaginario = tec.nextDouble();
	}
	
}