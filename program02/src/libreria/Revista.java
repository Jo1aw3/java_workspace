package libreria;

import java.util.Objects;
import java.util.Scanner;

public class Revista extends Publicacion{

	protected int numero;
	
	Scanner tec = new Scanner(System.in);
	
	public Revista () {
		super();
	}
	
	public Revista(String codigo, String titulo, int año, int numero) {
		super(codigo, titulo, año);
		this.numero = numero;
	}
	
	@Override
	public void leer(Scanner tec) {
		tec.nextLine();
		System.out.println("codigo de la revista?");
		this.codigo = tec.nextLine();
		System.out.println("titulo de la revista?");
		this.titulo = tec.nextLine();
		System.out.println("año de la revista?");
		this.año = tec.nextInt();
		System.out.println("numero de la revista?");
		this.numero = tec.nextInt();
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(numero);
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
		Revista other = (Revista) obj;
		return numero == other.numero;
	}

	@Override
	public String toString() {
		return "Revista [codigo=" + codigo + ", titulo=" + titulo + ", año=" + año + ", numero=" + numero + "]";
	}

	
}
