package discografia;

import java.util.Objects;

public class Cancion {

	private int id;
	private String nombre;
	private String dni_productor;
	
	public Cancion() {
		this.id = 0;
		this.nombre = "";
		this.dni_productor = "";
	}
	
	public Cancion(int id, String nombre, String dni_productor) {
		this.id = id;
		this.nombre = nombre;
		this.dni_productor = dni_productor;
	}
	
	public Cancion(Cancion cc) {
		this.id = cc.id;
		this.nombre = cc.nombre;
		this.dni_productor = cc.dni_productor;
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

	public String getDni_productor() {
		return dni_productor;
	}

	public void setDni_productor(String dni_productor) {
		this.dni_productor = dni_productor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni_productor, id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cancion other = (Cancion) obj;
		return Objects.equals(dni_productor, other.dni_productor) && id == other.id
				&& Objects.equals(nombre, other.nombre);
	}
	
	
	
}
