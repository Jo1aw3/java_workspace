package hotel;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

public class Usuario extends Persona implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int tipo;

	// constructor por defecto
	public Usuario() {
		super();
		this.tipo = 0;
	}

	// constructor personalizado
	public Usuario(String dni, String nombre, String contraseña, int tipo) {
		super(dni, nombre, contraseña);
		this.tipo = tipo;
	}

	// constructor copia
	public Usuario(Usuario cc) {
		super(cc);
		this.tipo = cc.tipo;
	}

	// getters and setters
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	// hashcode and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(tipo);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return tipo == other.tipo;
	}

	@Override
	public String toString() {
		return "Usuario [tipo=" + tipo + "]";
	}

	// metodo de print
	@Override
	public void print() {
		System.out.println("DNI: " + this.dni);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Contraseña: " + this.contraseña);
		System.out.println("Tipo de Usuario: " + this.tipo);
	}

	// metodo de read
	@Override
	public void read(Scanner teclado) {
		System.out.println("Introduce el DNI");
		this.dni = teclado.next();
		System.out.println("Introduce el Nombre");
		this.nombre = teclado.next();
		System.out.println("Introduce la Contraseña");
		this.contraseña = teclado.next();
		System.out.println("Introduce el tipo de Usuario");
		this.tipo = teclado.nextInt();
	}

}
