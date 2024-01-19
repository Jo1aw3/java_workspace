package objetos_arrays;

import java.util.Objects;
import java.util.Scanner;

public class Fecha {

	//propiedades o atributos
	private int dia;
	private int mes;
	private int año;
	
	//constructor predeterminado
	public Fecha () {
		this.dia = 1;
		this.mes = 1;
		this.año = 2020;
	}
	//constructor personalizado
	public Fecha (int d, int m, int a) {
		if (d >= 1 && d <= 31) {
			this.dia = d;
		}
		else {
			System.out.println("valor invalido");
		}
		if (m >= 1 && m <= 12) {
			this.mes = m;
		}
		else {
			System.out.println("valor invalido");
		}
		if (a !=0) {
			this.año = a;
		}
		else {
			System.out.println("valor invalido");
		}
	}
	//constructor copia
	public Fecha (Fecha cc) {
		this.dia = cc.dia;
		this.mes = cc.mes;
		this.año = cc.año;
	}

	// set and get (sources)
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		if (dia >= 1 && dia <= 31) {
			this.dia = dia;
		}
		else {
			System.out.println("valor invalido");
		}
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		if (mes >= 1 && mes <= 12) {
			this.mes = mes;
		}
		else {
			System.out.println("valor invalido");
		}
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		if (año !=0) {
			this.año = año;
		}
		else {
			System.out.println("valor invalido");
		}
	}
	
	//creacion de metodos
	
	//metodo leer
	public void leer (Scanner teclado) {
		System.out.println("Dia: ");
		int d = teclado.nextInt();
		while (d < 1 || d > 31) {
			System.out.println("El valor del dia no es valido");
			System.out.println("Dia: ");
			d = teclado.nextInt();
		}
		this.dia = d;
		System.out.println("Mes: ");
		int m = teclado.nextInt();
		while (m < 1 || m > 12) {
			System.out.println("El valor del mes no es valido");
			System.out.println("Mes: ");
			m = teclado.nextInt();
		}
		this.mes = m;
		System.out.println("Año: ");
		int a = teclado.nextInt();
		while (a == 0) {
			System.out.println("El valor del año no es valido");
			System.out.println("Año: ");
			a = teclado.nextInt();
		}
		this.año = a;
	}
	
	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", año=" + año + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(año, dia, mes);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fecha other = (Fecha) obj;
		return año == other.año && dia == other.dia && mes == other.mes;
	}	
	
	public int compareTo(Fecha other) {
		if (this.año > other.año) {
			return (1);
		}
		else if (this.año < other.año) {
			return (-1);
		}
		else {
			if (this.mes > other.mes) {
				return (1);
			}
			else if (this.mes < other.mes) {
				return (-1);
			}
			else {
				if (this.dia > other.dia) {
					return (1);
				}
				else if (this.dia < other.dia) {
					return (-1);
				}
			}
		}
		//si las fechas son iguales
		return 0;
	}

	
}
