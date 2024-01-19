package discografia;

import java.util.Objects;

public class Realiza {

	private int id;
	private int id_cancion;
	private int id_cantante;
	
	public Realiza() {
		this.id = 0;
		this.id_cancion = 0;
		this.id_cantante = 0;
	}
	
	public Realiza(int id, int id_cancion, int id_cantante) {
		this.id = id;
		this.id_cancion = id_cancion;
		this.id_cantante = id_cantante;
	}
	
	public Realiza (Realiza cc) {
		this.id = cc.id;
		this.id_cancion = cc.id_cancion;
		this.id_cantante = cc.id_cantante;
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_cancion() {
		return id_cancion;
	}

	public void setId_cancion(int id_cancion) {
		this.id_cancion = id_cancion;
	}

	public int getId_cantante() {
		return id_cantante;
	}

	public void setId_cantante(int id_cantante) {
		this.id_cantante = id_cantante;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, id_cancion, id_cantante);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Realiza other = (Realiza) obj;
		return id == other.id && id_cancion == other.id_cancion && id_cantante == other.id_cantante;
	}
	
	
	
}
