package figuras;

public class FiguraMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangulo rec = new Rectangulo("naranja", 10, 7);
		Circulo cir = new Circulo("azul", 15);
		
		System.out.println(rec.perimetro());
		System.out.println(cir.perimetro());
		
		// otra forma de hacerlo
//		double periCir = cir.perimetro();
//		System.out.println(periCir);
		
		
	}

}
