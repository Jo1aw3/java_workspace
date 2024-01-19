package objetos_menu;

import java.util.Objects;
import java.util.Scanner;

public class Asignatura implements Comparable<Asignatura> {


	//propiedades y atributos
	private String codigo;
	private String descripcion;	
	private double nota;
	
	//constructor predeterminado
	public Asignatura () {
		this.codigo = " nada ";
		this.descripcion = " nada ";
		this.nota = 0.0;
	}
	
	//constructor copia
	public Asignatura (Asignatura cc) {
		this.codigo = cc.codigo;
		this.descripcion = cc.descripcion;
		this.nota = cc.nota;
	}
	
	//constructor personalizado
	public Asignatura (String c, String d, double n){
		this.codigo = c;
		this.descripcion = d;
		this.nota = n;
	}

	//Metodos get and set
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}

	//Metodo toString
	@Override
	public String toString() {
		return (codigo + " : " + nota);
	}

	//Metodos HashCode and equals
	@Override
	public int hashCode() {
		return Objects.hash(codigo, descripcion, nota);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Asignatura other = (Asignatura) obj;
		if (this.codigo.equals(other.codigo) && this.nota == other.nota) {
			return true;
		}
		return false;
	}
	
	//Metodo compareTo
	@Override
	public int compareTo(Asignatura other) {
		if (this.codigo.compareTo(other.codigo) > 0 || (this.codigo.compareTo(other.codigo) < 0)) {
			return (this.codigo.compareTo(other.codigo));
		}
		else if (this.nota > other.nota) {
			return 1;
		}
		else if (this.nota < other.nota) {
			return -1;
		}
		return 0;
	}
	
	//Metodo leer
	public void leer(Scanner tec) {
		//leer por medio del teclado las propiedades
		//leer codigo
		System.out.println("codigo... ");
		this.codigo = tec.nextLine();
		//leer descripcion
		System.out.println("descripcion... ");
		this.descripcion = tec.nextLine();
		//leer nota
		System.out.println("nota... ");
		this.nota = tec.nextDouble();
		//limpio el buffer
		tec.nextLine();
	}
	
}
