package examen2Final_joshuabotello;

import java.util.Objects;
import java.util.Scanner;

public class Ciclista {

	private String dni;
	private String nombre;
	private int edad;
	
	public Ciclista() {
		this.dni = "";
		this.nombre = "";
		this.edad = 0;
	}
	
	public Ciclista(String dni, String nombre, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Ciclista(Ciclista cc) {
		this.dni = cc.dni;
		this.nombre = cc.nombre;
		this.edad = cc.edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni, edad, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ciclista other = (Ciclista) obj;
		return Objects.equals(dni, other.dni) && edad == other.edad && Objects.equals(nombre, other.nombre);
	}
	
	public void print() {
		System.out.println("DNI: " + this.dni);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Edad: " + this.edad);
	}
	
	public void read(Scanner tec) {
		System.out.println("DNI del Ciclista?");
		this.dni = tec.next();
		System.out.println("Nombre del Ciclista?");
		this.nombre = tec.next();
		System.out.println("Edad del Ciclista?");
		this.edad = tec.nextInt();
	}
}
