package pizzeria_v04;

import java.util.Objects;

public class Pizza {

	// propiedades
	private int id;
	private String nombre;
	private String ingredientes;
	private double precio;
	
	public Pizza() {
		this.id = 0;
		this.nombre = "";
		this.ingredientes = "";
		this.precio = 0.0;
	}
	
	// constructor con parametros
	public Pizza(int id, String nombre, String ingredientes, double precio) {
		this.id = id;
		this.nombre = nombre;
		this.ingredientes = ingredientes;
		this.precio = precio;
	}

	// metodos para obtener y poner
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
	
	public String getIngredientes() {
		return ingredientes;
	}
	
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, ingredientes, nombre, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pizza other = (Pizza) obj;
		return id == other.id && Objects.equals(ingredientes, other.ingredientes)
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}

	@Override
	public String toString() {
		return "Pizza [id=" + id + ", nombre=" + nombre + ", ingredientes=" + ingredientes + ", precio=" + precio + "]";
	}
	
}