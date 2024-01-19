package biblioteca;

public class Publicacion {

	//propiedades
	private String codigo;
	private String titulo;
	private int año;
	

	//constructor personalizado
	public Publicacion (String c, String t, int a) {
		this.codigo = c;
		this.titulo = t;
		this.año = a;
	}

	//getCodigo
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}

	//toString
	@Override
	public String toString() {
		return "Publicacion [codigo=" + codigo + ", titulo=" + titulo + ", año=" + año + "]";
	}
	
	
	
}
