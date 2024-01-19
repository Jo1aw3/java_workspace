package libreria;

import java.util.Objects;
import java.util.Scanner;

public class Libro extends Publicacion{

	protected int numPaginas;
	
	Scanner tec = new Scanner(System.in);
	
	public Libro() {
		super();
	}
	
	public Libro(String codigo, String titulo, int año, int numPaginas) {
		super(codigo, titulo, año);
		this.numPaginas = numPaginas;
	}
	
	@Override
	public void leer(Scanner tec) {
		tec.nextLine();
		System.out.println("codigo del libro?");
		this.codigo = tec.nextLine();
		System.out.println("titulo del libro?");
		this.titulo = tec.nextLine();
		System.out.println("año del libro?");
		this.año = tec.nextInt();
		System.out.println("numero de paginas del libro?");
		this.numPaginas = tec.nextInt();
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(numPaginas);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return numPaginas == other.numPaginas;
	}

	@Override
	public String toString() {
		return "Libro [codigo=" + codigo + ", titulo=" + titulo + ", año=" + año + ", numero de pag=" + numPaginas + "]";
	}

	
	
}
