package subclases;

import java.util.Objects;
import java.util.Scanner;
import objetos_learn.FechaT5;

public class Alumno extends PersonaT5 {

	private String grupo;
	
	public Alumno() {
	super();
	this.grupo = "1dW3";
	}
	
	
	public Alumno(Alumno a) {
	super(a);
	this.grupo = a.grupo;	
	}
	
	public Alumno(PersonaT5 p) {
	super(p);
	this.grupo = "1dw3";	
	}
	
	public Alumno(String d, String n, String a, FechaT5 f, String g) {
	super(d,n,a,f);	
	this.grupo = g;
	
	}
	
	@Override
	
	public int hashCode() {	
	return Objects.hash(grupo);	
	}
	
	@Override	
	public boolean equals(Object obj) {	
		if (this == obj)	
			return true;
		if (obj == null)	
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Alumno other = (Alumno) obj;
		return Objects.equals(grupo, other.grupo);
	
	}
	
	public String getGrupo() {
	return grupo;
	}
	
	public void setGrupo(String grupo) {
	this.grupo = grupo;
	}
	
	@Override
	
	public String toString() {
	return ( grupo + " " + super.toString() );
	
	}
	
	public void leer(Scanner teclado) {
	super.leer(teclado);
	teclado.nextLine();
	System.out.println("Grupo: ");
	String d = teclado.nextLine();
	
	while(d.isEmpty()) {
	System.out.println("El valor no puede ser vacio");
	System.out.println("Grupo: ");
	d = teclado.nextLine();
	
	}
	
	this.grupo = d;
	
	}

}