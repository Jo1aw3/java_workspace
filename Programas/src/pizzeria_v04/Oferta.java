package pizzeria_v04;

import java.util.Objects;

public class Oferta {

	private int idoferta;
	private int idpizza;
	private String nombre;
	
	public Oferta(int idoferta, int idpizza, String nombre) {
		this.idoferta = idoferta;
		this.idpizza = idpizza;
		this.nombre = nombre;
	}

	public int getIdoferta() {
		return idoferta;
	}

	public void setIdoferta(int idoferta) {
		this.idoferta = idoferta;
	}

	public int getIdpizza() {
		return idpizza;
	}

	public void setIdpizza(int idpizza) {
		this.idpizza = idpizza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idoferta, idpizza, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Oferta other = (Oferta) obj;
		return idoferta == other.idoferta && idpizza == other.idpizza && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Oferta [idoferta=" + idoferta + ", idpizza=" + idpizza + ", nombre=" + nombre + "]";
	}
	
}