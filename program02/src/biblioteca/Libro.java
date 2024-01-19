package biblioteca;

public class Libro extends Publicacion implements Prestable{

	//propiedades
	private boolean prestado;
	
	//Constructor
	public Libro(String c, String t, int a, boolean pres) {
		super(c, t, a);
		this.prestado = false;
	}
	
	//Metodos de la interfaz de prestable
	@Override
	public void prestar() {
		prestado = true;
	}
	@Override
	public void devolver() {
		prestado = false;
	}
	@Override
	public boolean prestado() {
		return prestado;
	}
	
	//to String
	@Override
	public String toString() {
		return "Libro [prestado=" + prestado + "]";
	}
	
}
