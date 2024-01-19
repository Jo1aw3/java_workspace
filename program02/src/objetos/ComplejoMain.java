package objetos;

public class ComplejoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Complejo c1 = new Complejo (4.5,3.7);
		c1.escribir();
		Complejo c2 = new Complejo (c1);
		c2.escribir();
		Complejo c3 = new Complejo ();
		c3.escribir();
		
	}

}
