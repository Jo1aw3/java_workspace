package bodega;

public class LineaFactura {

	//propiedades
	private String codigo;
	private int cantidad;
	private double totallinea;
	
	//constructor personalizado
	public LineaFactura (String codigo, int cantidad, double totallinea) {
		this.codigo = codigo;
		this.cantidad = cantidad;
		this.totallinea = totallinea;
		
		
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getTotallinea() {
		return totallinea;
	}

	public void setTotallinea(double totallinea) {
		this.totallinea = totallinea;
	}

	@Override
	public String toString() {
		return "LineaFactura [codigo=" + codigo + ", cantidad=" + cantidad + ", totallinea=" + totallinea + "]";
	}
	
}
