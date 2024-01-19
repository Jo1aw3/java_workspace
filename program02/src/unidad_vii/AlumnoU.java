package unidad_vii;

import java.util.Objects;
import java.util.Scanner;

public class AlumnoU extends PersonaU {

	private String grupo;
	
	public AlumnoU() {
		super();
		this.grupo = "1dW3";
	}
	
	public AlumnoU(PersonaU a, String g) {
		super(a);
		this.grupo = g;
	}
	
	public AlumnoU(AlumnoU a) {
		super(a);
		this.grupo = a.grupo;
	}

	public AlumnoU(PersonaU p) {
		super(p);
		this.grupo = "1dw3";
		
	}
	
	public AlumnoU(String d, String n, String a, FechaU f, String g) {
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
		AlumnoU other = (AlumnoU) obj;
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
		return ( super.toString() + " " + grupo );
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
