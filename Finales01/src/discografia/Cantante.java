package discografia;

import java.util.Objects;

public class Cantante extends Artista {

	private String tipo;
	
	public Cantante() {
		super();
		this.tipo = "";
	}
	
	public Cantante(String dni, String nombre, int sueldo, String tipo) {
		super(dni,nombre,sueldo);
		this.tipo = tipo;
	}
	
	public Cantante(Cantante cc) {
		super(cc);
		this.tipo = cc.tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(tipo);
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
		Cantante other = (Cantante) obj;
		return Objects.equals(tipo, other.tipo);
	}
	
	
}
