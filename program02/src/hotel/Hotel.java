package hotel;

import java.util.Objects;
import java.util.Scanner;

public class Hotel {

	// propiedades
	private int id;
	private String nombre;
	private String ciudad;
	private String dni_director;

	// constructor por defecto
	public Hotel() {
		this.id = 0;
		this.nombre = "";
		this.ciudad = "";
		this.dni_director = "";
	}

	// constructor personalizado
	public Hotel(int id, String nombre, String ciudad, String dni_director) {
		this.id = id;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.dni_director = dni_director;
	}

	// constructor copia
	public Hotel(Hotel cc) {
		this.id = cc.id;
		this.nombre = cc.nombre;
		this.ciudad = cc.ciudad;
		this.dni_director = cc.dni_director;
	}

	// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDni_director() {
		return dni_director;
	}

	public void setDni_director(String dni_director) {
		this.dni_director = dni_director;
	}

	// hashcode and equals
	@Override
	public int hashCode() {
		return Objects.hash(ciudad, dni_director, id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hotel other = (Hotel) obj;
		return Objects.equals(ciudad, other.ciudad) && Objects.equals(dni_director, other.dni_director)
				&& id == other.id && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", nombre=" + nombre + ", ciudad=" + ciudad + ", dni_director=" + dni_director + "]";
	}

	public void print() {
		System.out.println("Id: " + this.id);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Ciudad: " + this.ciudad);
		System.out.println("DNI del director: " + this.dni_director);
	}

	public void read(Scanner teclado) {
		System.out.println("Ingresa el Id del Hotel: ");
		this.id = teclado.nextInt();
		System.out.println("Ingresa el Nombre del Hotel: ");
		this.nombre = teclado.next();
		System.out.println("Ingresa la Ciudad: ");
		this.ciudad = teclado.next();
		System.out.println("Ingresa el DNI del director: ");
		this.dni_director = teclado.next();
	}

}
