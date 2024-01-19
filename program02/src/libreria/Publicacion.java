package libreria;

import java.util.Objects;
import java.util.Scanner;

public abstract class Publicacion {

	protected String codigo;
	protected String titulo;
	int año;
	
	Scanner tec = new Scanner(System.in);
	
	public Publicacion () {
		
	}
	
	public Publicacion (String codigo, String titulo, int año) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.año = año;
	}

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

	@Override
	public int hashCode() {
		return Objects.hash(año, codigo, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publicacion other = (Publicacion) obj;
		return año == other.año && Objects.equals(codigo, other.codigo) && Objects.equals(titulo, other.titulo);
	}

	@Override
	public String toString() {
		return "Publicacion [codigo=" + codigo + ", titulo=" + titulo + ", año=" + año + "]";
	}
	
	public abstract void leer(Scanner palabra);
	
}
