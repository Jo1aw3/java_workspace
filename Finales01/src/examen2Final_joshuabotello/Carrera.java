package examen2Final_joshuabotello;

import java.util.Objects;
import java.util.Scanner;

public class Carrera {

	private int id;
	private String nombre;
	private String ciudad;
	
	public Carrera() {
		this.id = 0;
		this.nombre = "";
		this.ciudad = "";
	}
	
	public Carrera(int id, String nombre, String ciudad) {
		this.id = id;
		this.nombre = nombre;
		this.ciudad = ciudad;
	}
	
	public Carrera(Carrera cc) {
		this.id = cc.id;
		this.nombre = cc.nombre;
		this.ciudad = cc.ciudad;
	}

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

	@Override
	public int hashCode() {
		return Objects.hash(ciudad, id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carrera other = (Carrera) obj;
		return Objects.equals(ciudad, other.ciudad) && id == other.id && Objects.equals(nombre, other.nombre);
	}
	
	public void print() {
		System.out.println("ID: " + this.id);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Ciudad: " + this.ciudad);
	}
	
	public void read(Scanner tec) {
		System.out.println("ID de la Carrera?");
		this.id = tec.nextInt();
		System.out.println("Nombre de la Carrera?");
		this.nombre = tec.next();
		System.out.println("Ciudad de la Carrera?");
		this.ciudad = tec.nextLine();
	}
	
}
