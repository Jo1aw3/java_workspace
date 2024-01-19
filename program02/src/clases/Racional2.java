package clases;

import java.util.Scanner;

// defino la clase racional
	public class Racional2 {
		
		//propiedades y atributos
		private int numerador = 0;
		private int denominador = 1;
	
	// constructor predeterminado o por defecto
	Racional2 () {
	}
	
	// constructor personalizado (solo para el numerador)
	Racional2 (int n) {
		this.numerador = n;
		this.denominador = 1;
	}
	// constructor personalizado con condicional (para el numerador u el denominador) 
	Racional2 (int n, int d) {
		this.numerador = n;
		if (d == 0) {
			System.out.println("el denominador no puede ser 0");
		}
		else {
			this.denominador = d;
		}
	}
	
	// constructor copia
	Racional2 (Racional2 cc) {
		this.numerador = cc.numerador;
		this.denominador = cc.denominador;
	}
	
	
	//set and get (source)
	public int getNumerador() {
		return numerador;
	}
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}
	public int getDenominador() {
		return denominador;
	}
	public void setDenominador(int denominador) {
		this.denominador = denominador;
		if (denominador == 0) {
			System.out.println("el denominador no puede ser 0");
		}
		else {
			this.denominador = denominador;
		}
	}
	
	
	//metodos de la clase Racional 2
	
	@Override
	
	//to String...
	public String toString() {
		return numerador + "/" + denominador;
	}
	
	//hashCode...
	
	//toEquals...
	
	//compareTo...
	public int compareTo(Complejo2 other) {
		int n1 = this.numerador * other.denominador;
		int n2 = this.denominador * other.numerador;
		 if(n1 == n2){
			 if (this.numerador > other.numerador) {
				 this.numerador = other.numerador;
				 this.denominador = other.denominador;
			 }
		 }
		 
	}
	
	//leer...
	public void leer(Scanner tec) {
		System.out.println("numerador:: ");
		this.numerador = tec.nextInt();
		System.out.println("denominador:: ");
		this.denominador = tec.nextInt();
		while (denominador == )
	}
	
	
	
}
