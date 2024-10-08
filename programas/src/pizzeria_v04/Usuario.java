package pizzeria_v04;

import java.util.Objects;

public class Usuario {

	private int id;
	private String nombre;
	private String apellido;
	
	public Usuario() {
		this.id = 0;
		this.nombre = "";
		this.apellido = "";
	}
	
	public Usuario(int id, String nombre, String apellido) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(apellido, other.apellido) && id == other.id && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
}