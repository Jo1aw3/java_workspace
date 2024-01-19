package examen2Final_joshuabotello;

import java.util.Objects;
import java.util.Scanner;

public class Participa {

	private int id;
	private String dni_ciclista;
	private int id_carrera;
	private int ganador;
	
	public Participa() {
		this.id = 0;
		this.dni_ciclista = "";
		this.id_carrera = 0;
		this.ganador = 0;
	}
	
	public Participa(int id, String dni_ciclista, int id_carrera, int ganador) {
		this.id = id;
		this.dni_ciclista = dni_ciclista;
		this.id_carrera = id_carrera;
		this.ganador = ganador;
	}
	
	public Participa(Participa cc) {
		this.id = cc.id;
		this.dni_ciclista = cc.dni_ciclista;
		this.id_carrera = cc.id_carrera;
		this.ganador = cc.ganador;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDni_ciclista() {
		return dni_ciclista;
	}

	public void setDni_ciclista(String dni_ciclista) {
		this.dni_ciclista = dni_ciclista;
	}

	public int getId_carrera() {
		return id_carrera;
	}

	public void setId_carrera(int id_carrera) {
		this.id_carrera = id_carrera;
	}

	public int getGanador() {
		return ganador;
	}

	public void setGanador(int ganador) {
		this.ganador = ganador;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni_ciclista, ganador, id, id_carrera);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Participa other = (Participa) obj;
		return Objects.equals(dni_ciclista, other.dni_ciclista) && ganador == other.ganador && id == other.id
				&& id_carrera == other.id_carrera;
	}
	
	public void print() {
		System.out.println("ID de Participación: " + this.id);
		System.out.println("DNI del Ciclista: " + this.dni_ciclista);
		System.out.println("ID de la Carrera: " + this.id_carrera);
		System.out.println("Ganador: " + this.ganador);
	}
	
	public void read(Scanner tec) {
		System.out.println("ID de la Participación?:");
		this.id = tec.nextInt();
		System.out.println("DNI del Ciclista?:");
		this.dni_ciclista = tec.next();
		System.out.println("ID de la Carrear?:");
		this.id_carrera = tec.nextInt();
		System.out.println("Ganador?:");
		this.ganador = tec.nextInt();
	}
	
}
