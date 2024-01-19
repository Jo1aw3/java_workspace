package bodega;

import java.util.Objects;

public class Refresco extends Articulo {
	
	//propiedades
	private String sabor;
	private boolean zumo;
	private boolean gas;
	private int azucar;
	
	//constructor por defecto
	public Refresco () {
		super();
		this.sabor = "";
		this.zumo = false;
		this.gas = false;
		this.azucar = 0;
	}
	
	//constructor personalizado
	public Refresco (String code, String name, String mar, double pre, int stk, String sab, boolean zum, boolean ga, int azu) {
		super(code,name,mar,pre,stk);
		this.sabor = sab;
		this.zumo = zum;
		this.gas = ga;
		this.azucar = azu;
	}
	
	//constructor copia
	public Refresco (Refresco cc) {
		super(cc);
		this.sabor = cc.sabor;
		this.zumo = cc.zumo;
		this.gas = cc.gas;
		this.azucar = cc.azucar;
	}

	//set and get
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public boolean isZumo() {
		return zumo;
	}
	public void setZumo(boolean zumo) {
		this.zumo = zumo;
	}
	public boolean isGas() {
		return gas;
	}
	public void setGas(boolean gas) {
		this.gas = gas;
	}
	public int getAzucar() {
		return azucar;
	}
	public void setAzucar(int azucar) {
		this.azucar = azucar;
	}

	//hashCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(azucar, gas, sabor, zumo);
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
		Refresco other = (Refresco) obj;
		return azucar == other.azucar && gas == other.gas && Objects.equals(sabor, other.sabor) && zumo == other.zumo;
	}

	//toString
	@Override
	public String toString() {
		return "Refresco [sabor=" + sabor + ", zumo=" + zumo + ", gas=" + gas + ", azucar=" + azucar + "]";
	}

	//printCaracteristicas (muestra por pantalla todas las propiedades de este articulo)
	@Override
	public void printCaracteristicas() {
		System.out.println("Codigo: " + this.codigo);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Marca: " + this.marca);
		System.out.println("Precio: " + this.precio);
		System.out.println("Stock: " + this.stock);
		System.out.println("Sabor: " + this.sabor);
		System.out.println("Zumo: " + this.sabor);
		System.out.println("Gas: " + this.sabor);
		System.out.println("Azucar: " + this.sabor);
		
	}

	//Sano (da true cuando el refresco tiene menos de 25g de Azucar)
	@Override
	public boolean sano() {
		if (this.azucar < 25) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
