package hotel;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

public abstract class Persona implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Scanner teclado = new Scanner(System.in);

	// propiedades
	protected String dni;
	protected String nombre;
	protected String contraseña;

	// constructor predeterminado
	public Persona() {
		this.dni = "";
		this.nombre = "";
		this.contraseña = "";
	}

	// constructor personalizado
	public Persona(String dni, String nombre, String contraseña) {
		this.dni = dni;
		this.nombre = nombre;
		this.contraseña = contraseña;
	}

	// constructor copia
	public Persona(Persona cc) {
		this.dni = cc.dni;
		this.nombre = cc.nombre;
		this.contraseña = cc.contraseña;
	}

	// getters and Setters
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

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	@Override
	public int hashCode() {
		return Objects.hash(contraseña, dni, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(contraseña, other.contraseña) && Objects.equals(dni, other.dni)
				&& Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Persona [teclado=" + teclado + ", dni=" + dni + ", nombre=" + nombre + ", contraseña=" + contraseña
				+ "]";
	}

	// motodos abstractos
	public abstract void print();

	public abstract void read(Scanner teclado);

}
