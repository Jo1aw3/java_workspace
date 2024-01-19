package biblioteca;

public class Revista extends Publicacion {

	private int numero;
	
	//Constructor
	public Revista(String c, String t, int a, int num) {
		super(c, t, a);
		this.numero = num;
	}

	//get and set
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	//toString
	@Override
	public String toString() {
		return "Revista [numero=" + numero + "]";
	}
	
	
	
}
