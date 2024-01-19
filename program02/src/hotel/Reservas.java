package hotel;

import java.util.Objects;
import java.util.Scanner;

public class Reservas {
	
	// propiedades
	private int id;
	private int id_reserva;
	private int id_habitacion;
	private String dni_cliente;
	
	// constructor por defecto
	public Reservas() {
		
	}
	
	// constructor predeterminado
	public Reservas(int id, int id_reserva, int id_habitacion, String dni_cliente) {
		this.id = id;
		this.id_reserva = id_reserva;
		this.id_habitacion = id_habitacion;
		this.dni_cliente = dni_cliente;
	}
	
	// constructor copia
	public Reservas (Reservas cc) {
		this.id = cc.id;
		this.id_reserva = cc.id;
		this.id_habitacion = cc.id_habitacion;
		this.dni_cliente = cc.dni_cliente;
	}

	// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_reserva() {
		return id_reserva;
	}

	public void setId_reserva(int id_reserva) {
		this.id_reserva = id_reserva;
	}

	public int getId_habitacion() {
		return id_habitacion;
	}

	public void setId_habitacion(int id_habitacion) {
		this.id_habitacion = id_habitacion;
	}

	public String getDni_cliente() {
		return dni_cliente;
	}

	public void setDni_cliente(String dni_cliente) {
		this.dni_cliente = dni_cliente;
	}

	// hashcode and equals
	@Override
	public int hashCode() {
		return Objects.hash(dni_cliente, id, id_habitacion, id_reserva);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reservas other = (Reservas) obj;
		return Objects.equals(dni_cliente, other.dni_cliente) && id == other.id && id_habitacion == other.id_habitacion
				&& id_reserva == other.id_reserva;
	}

	@Override
	public String toString() {
		return "Reservas [id=" + id + ", id_reserva=" + id_reserva + ", id_habitacion=" + id_habitacion + ", dni_cliente=" + dni_cliente + "]";
	}
	
	public void print() {
		System.out.println("ID: " + this.id);
		System.out.println("ID Reserva: " + this.id_reserva);
		System.out.println("ID Habitación: " + this.id_habitacion);
		System.out.println("DNI Cliente: " + this.dni_cliente);
	}
	
	public void read(Scanner teclado) {
		System.out.println("ID?");
		this.id = teclado.nextInt();
		System.out.println("ID Reserva?");
		this.id_reserva = teclado.nextInt();
		System.out.println("ID Habitación?");
		this.id_habitacion = teclado.nextInt();
		System.out.println("DNI Cliente?");
		this.dni_cliente = teclado.next();
	}
	
}
