package pizzeria_v04;

import java.util.Objects;

public class Pedido {

	private int idpizza;
	private int idusuario;
	private int idpedido;
	private int cantidad;
	
	public Pedido(int idpizza, int idusuario, int idpedido, int cantidad) {
		this.idpizza = idpizza;
		this.idusuario = idusuario;
		this.idpedido = idpedido;
		this.cantidad = cantidad;
	}

	public int getIdpizza() {
		return idpizza;
	}

	public void setIdpizza(int idpizza) {
		this.idpizza = idpizza;
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public int getIdpedido() {
		return idpedido;
	}

	public void setIdpedido(int idpedido) {
		this.idpedido = idpedido;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cantidad, idpedido, idpizza, idusuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return cantidad == other.cantidad && idpedido == other.idpedido && idpizza == other.idpizza
				&& idusuario == other.idusuario;
	}

	@Override
	public String toString() {
		return "Pedido [idpizza=" + idpizza + ", idusuario=" + idusuario + ", idpedido=" + idpedido + ", cantidad="
				+ cantidad + "]";
	}
	
}