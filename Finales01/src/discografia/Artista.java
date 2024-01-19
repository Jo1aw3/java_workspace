package discografia;

import java.util.Objects;

public class Artista {

	private String dni;
	private String nombre;
	private int sueldo;
	
	public Artista() {
		this.dni = "";
		this.nombre = "";
		this.sueldo = 0;
	}
	
	public Artista(String dni, String nombre, int sueldo) {
		this.dni = dni;
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	
	public Artista(Artista cc) {
		this.dni = cc.dni;
		this.nombre = cc.nombre;
		this.sueldo = cc.sueldo;
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

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni, nombre, sueldo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artista other = (Artista) obj;
		return Objects.equals(dni, other.dni) && Objects.equals(nombre, other.nombre) && sueldo == other.sueldo;
	}
	
	
	
}
