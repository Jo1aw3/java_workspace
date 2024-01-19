package hotel;

import java.util.Objects;
import java.util.Scanner;

public class Habitaciones {

	// propiedades
	private int id;
	private String nombre;
	private String servicios;
	private int id_hotel;
	private boolean ocupado;

	// constructor por defecto
	public Habitaciones() {
		this.id = 0;
		this.nombre = "";
		this.servicios = "";
		this.id_hotel = 0;
		this.ocupado = false;
	}

	// constructor personalizado
	public Habitaciones(int id, String nombre, String servicios, int id_hotel, boolean ocupado) {
		this.id = id;
		this.nombre = nombre;
		this.servicios = servicios;
		this.id_hotel = id_hotel;
		this.ocupado = ocupado;
	}

	// constructor copia
	public Habitaciones(Habitaciones cc) {
		this.id = cc.id;
		this.nombre = cc.nombre;
		this.servicios = cc.servicios;
		this.id_hotel = cc.id_hotel;
		this.ocupado = cc.ocupado;
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

	public String getServicios() {
		return servicios;
	}

	public void setServicios(String servicios) {
		this.servicios = servicios;
	}

	public int getId_hotel() {
		return id_hotel;
	}

	public void setId_hotel(int id_hotel) {
		this.id_hotel = id_hotel;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	// hashcode and equals
	@Override
	public int hashCode() {
		return Objects.hash(id, id_hotel, nombre, ocupado, servicios);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Habitaciones other = (Habitaciones) obj;
		return id == other.id && id_hotel == other.id_hotel && Objects.equals(nombre, other.nombre)
				&& ocupado == other.ocupado && Objects.equals(servicios, other.servicios);
	}

	@Override
	public String toString() {
		return "Habitaciones [id=" + id + ", nombre=" + nombre + ", servicios=" + servicios + ", id_hotel=" + id_hotel + ", ocupado=" + ocupado + "]";
	}

	// metodo print
	public void print() {
		System.out.println("Id de la Habitación: " + this.id);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Servicios: " + this.servicios);
		System.out.println("Id del Hotel: " + this.id_hotel);
		System.out.println("Ocupado: " + this.ocupado);
	}

	// metodo read
	public void read(Scanner teclado) {
		System.out.println("Ingresa el Id de la Habitación: ");
		this.id = teclado.nextInt();
		System.out.println("Ingresa el Nombre: ");
		this.nombre = teclado.next();
		System.out.println("Ingresa los Servicios: ");
		this.servicios = teclado.nextLine();
		System.out.println("Ingresa el Id del Hotel: ");
		this.id_hotel = teclado.nextInt();
	}

}
