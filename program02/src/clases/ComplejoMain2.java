package clases;

public class ComplejoMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Complejo2 c1 = new Complejo2 ();
		System.out.println(c1);
		Complejo2 c2 = new Complejo2 (1.0,2.0);
		System.out.println(c2);
		Complejo2 c3 = new Complejo2 (c2);
		System.out.println(c3);

	}

}