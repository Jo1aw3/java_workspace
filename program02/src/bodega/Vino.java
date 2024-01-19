package bodega;

import java.util.Objects;

public class Vino extends Articulo {
	
	//propiedades
	private String color;
	private String origen;
	private int año;
	private String uva;
	
	//constructor por defecto
	public Vino () {
		super();
		this.color = "";
		this.origen = "";
		this.año = 0;
		this.uva = "";
	}
	
	//constructor personalizado 
	public Vino (String code, String name, String mar, double pre, int stk, String col, String orig, int year, String grape) {
		super(code,name,mar,pre,stk);
		this.color = col;
		this.origen = orig;
		this.año = year;
		this.uva = grape;
	}
	
	//constructor copia
	public Vino (Vino cc) {
		super(cc);
		this.color = cc.color;
		this.origen = cc.origen;
		this.año = cc.año;
		this.uva = cc.uva;
	}

	//get and set
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public String getUva() {
		return uva;
	}
	public void setUva(String uva) {
		this.uva = uva;
	}

	//hashCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(año, color, origen, uva);
		return result;
	}

	//equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vino other = (Vino) obj;
		return año == other.año && Objects.equals(color, other.color) && Objects.equals(origen, other.origen)
				&& Objects.equals(uva, other.uva);
	}

	//toString
	@Override
	public String toString() {
		return "Vino [color=" + color + ", origen=" + origen + ", año=" + año + ", uva=" + uva + "]";
	}
	
	//printCaracteristicas (muestra por pantalla todas las propiedades de este articulo)
	@Override 
	public void printCaracteristicas() {
		System.out.println("Codigo: " + this.codigo);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Marca: " + this.marca);
		System.out.println("Precio: " + this.precio);
		System.out.println("Stock: " + this.stock);
		System.out.println("Color: " + this.color);
		System.out.println("Origen: " + this.origen);
		System.out.println("Año: " + this.año);
		System.out.println("Uva: " + this.uva);
	}
	
	//Sano (da true cuando el origen es riojano)
	@Override
	public boolean sano() {
		if (origen.equals("riojano")) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
