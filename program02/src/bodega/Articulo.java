package bodega;

import java.util.Objects;

public abstract class Articulo {

	//propiedades
	protected String codigo;
	protected String nombre;
	protected String marca;
	protected double precio;
	protected int stock;
	
	//constructor por defecto
	public Articulo () {
		this.codigo = "";
		this.nombre = "";
		this.marca = "";
		this.precio = 0.0;
		this.stock = 0;
	}
	
	//constructor personalizado
	public Articulo (String code, String name, String mar, double pre, int stk) {
		this.codigo = code;
		this.nombre = name;
		this.marca = mar;
		this.precio = pre;
		this.stock = stk;
	}
	
	//constructor copia
	public Articulo (Articulo cc) {
		this.codigo = cc.codigo;
		this.nombre = cc.nombre;
		this.marca = cc.marca;
		this.precio = cc.precio;
		this.stock = cc.stock;
	}

	//get and set 
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}

	//hashCode
	@Override
	public int hashCode() {
		return Objects.hash(codigo, marca, nombre, precio, stock);
	}

	//equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Articulo other = (Articulo) obj;
		return Objects.equals(codigo, other.codigo) && Objects.equals(marca, other.marca)
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio) && stock == other.stock;
	}

	//toString
	@Override
	public String toString() {
		return "Articulo [codigo=" + codigo + ", nombre=" + nombre + ", marca=" + marca + ", precio=" + precio
				+ ", stock=" + stock + "]";
	}
	
	//metodo SumarStock
	public void SumarStock(int s) {
		this.stock = this.stock + s;
	}

	//metodo QuitarStock
	public void QuitarStock(int s) {
		this.stock = this.stock - s;
	}

	//metodos abstractos
	
	public abstract void printCaracteristicas();
	
	public abstract boolean sano ();
	
}
