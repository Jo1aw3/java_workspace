package hotel;

import java.util.Objects;
import java.util.Scanner;

public class Cliente {

	// propiedades
	private String dni;
	private String nombre;

	// constructor por defecto
	public Cliente() {
		this.dni = "";
		this.nombre = "";
	}

	// constructor personalizado
	public Cliente(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}

	// costructor copia
	public Cliente(Cliente cc) {
		this.dni = cc.dni;
		this.nombre = cc.nombre;
	}

	// getters and setters
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

	// hashcode and equals
	@Override
	public int hashCode() {
		return Objects.hash(dni, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(dni, other.dni) && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + "]";
	}

	public void print() {
		System.out.println("Dni del Cliente: " + this.dni);
		System.out.println("Nombre del Cliente: " + this.nombre);
	}

	public void read(Scanner teclado) {
		System.out.println("Introduce el Dni del Cliente:");
		this.dni = teclado.next();
		System.out.println("Introduce el Nombre del Cliente:");
		this.nombre = teclado.next();

	}

}
