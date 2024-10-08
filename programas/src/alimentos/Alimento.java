package alimentos;

public class Alimento {

	// propiedades de la clase
	private String nombre;
	private String estado;
	private double calorias;
	private double grasas;
	private double proteinas;
	private double carbohidratos;
	private String tipo;
	
	// constructor sin parametros
	public Alimento() {
		this.nombre = "";
		this.estado = "";
		this.calorias = 0.0;
		this.grasas = 0.0;
		this.proteinas = 0.0;
		this.carbohidratos = 0.0;
		this.tipo = "";
	}
	
	// constructor con parametros
	public Alimento(String nombre, String estado, double calorias, double grasas, double proteinas, double carbohidratos, String tipo) {
		this.nombre = nombre;
		this.estado = estado;
		this.calorias = calorias;
		this.grasas = grasas;
		this.proteinas = proteinas;
		this.carbohidratos = carbohidratos;
		this.tipo = tipo;
	}

	// geters y seters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public double getCalorias() {
		return calorias;
	}
	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}
	public double getGrasas() {
		return grasas;
	}
	public void setGrasas(double grasas) {
		this.grasas = grasas;
	}
	public double getProteinas() {
		return proteinas;
	}
	public void setProteinas(double proteinas) {
		this.proteinas = proteinas;
	}
	public double getCarbohidratos() {
		return carbohidratos;
	}
	public void setCarbohidratos(double carbohidratos) {
		this.carbohidratos = carbohidratos;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	// metodo toString
	@Override
	public String toString() {
		return "Alimento [nombre=" + nombre + ", estado=" + estado + ", calorias=" + calorias + ", grasas=" + grasas
				+ ", proteinas=" + proteinas + ", carbohidratos=" + carbohidratos + ", tipo=" + tipo + "]";
	}	
}