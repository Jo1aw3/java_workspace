package figuras;

public class FiguraMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circulo c=new Circulo(0, 0, 5.5);
		System.out.println("Area del círculo " + c.area());
		System.err.println("Perimetro del círculo " + c.perimetro());
		
		Figura r = new Rectangulo(0, 0, 3.0, 2.0);
		System.out.println("Area del rectangulo "+ r.area()) ;
		System.out.println("Perimetro del rectangulo "+ r.perimetro()) ;
		
		Figura t = new Triangulo(0, 0, 4.0, 3.0);
		System.out.println("Area del triangulo "+ t.area()) ;
		System.out.println("Perimetro del triangulo "+ t.perimetro()) ;
		
		Figura cu = new Cuadrado(0, 0, 2.0); 
		System.out.println("Area del cuadrado "+ cu.area()) ;
		System.out.println("Perimetro del cuadrado "+ cu.perimetro()) ;
		
		//constructores de circulo
		Circulo c1 = new Circulo();
		System.out.println(c1);
		Circulo c2 = new Circulo(c1);
		System.out.println(c2);
		//constructores de rectangulo
		Rectangulo r1 = new Rectangulo();
		System.out.println(r1);
		Rectangulo r2 = new Rectangulo(r1);
		System.out.println(r2);
		//constructores de triangulo
		Triangulo t1 = new Triangulo();
		System.out.println(t1);
		Triangulo t2 = new Triangulo(t1);
		System.out.println(t2);
		//constructores de cuadrado
		Cuadrado cu1 = new Cuadrado();
		System.out.println(cu1);
		Cuadrado cu2 = new Cuadrado(cu1);
		System.out.println(cu2);
		
		//equals circulo
		Circulo c3 = new Circulo (0,0,3);
		Circulo c4 = new Circulo (0,0,2);
		if (c4.equals(c3)) {
			System.out.println("Son Iguales");
		}
		else {
			System.out.println("No son Iguales");
		}
		//equals rectangulo
		Rectangulo r3 = new Rectangulo (0,0,4,6);
		Rectangulo r4 = new Rectangulo (0,0,6,4);
		if (r4.equals(r3)) {
			System.out.println("Son Iguales");
		}
		else {
			System.out.println("No son Iguales");
		}
		//equals triangulo
		Triangulo t3 = new Triangulo (0,0,3,2);
		Triangulo t4 = new Triangulo (0,0,3,2);
		if (t4.equals(t3)) {
			System.out.println("Son Iguales");
		}
		else {
			System.out.println("No son Iguales");
		}
		//equals cuadrado
		Cuadrado cu3 = new Cuadrado (0,0,4);
		Cuadrado cu4 = new Cuadrado (0,0,4);
		if (cu4.equals(cu3)) {
			System.out.println("Son Iguales");
		}
		else {
			System.out.println("No son Iguales");
		}
		
		//compareTo Cuadrado
		if (c3.compareTo(c4) < 0) {
			System.out.println("es menor");
		}
		else if (c3.compareTo(c4) > 0) {
			System.out.println("es mayor");
		}
		else {
			System.out.println("son iguales");
		}
		//compareTo Rectangulo
		if (r3.compareTo(r4) < 0) {
			System.out.println("es menor");
		}
		else if (r3.compareTo(r4) > 0) {
			System.out.println("es mayor");
		}
		else {
			System.out.println("son iguales");
		}
		//compareTo Triangulo
		if (t3.compareTo(t4) < 0) {
			System.out.println("es menor");
		}
		else if (t3.compareTo(t4) > 0) {
			System.out.println("es mayor");
		}
		else {
			System.out.println("son iguales");
		}
		//compareTo Circulo
		if (c3.compareTo(c4) < 0) {
			System.out.println("es menor");
		}
		else if (c3.compareTo(c4) > 0) {
			System.out.println("es mayor");
		}
		else {
			System.out.println("son iguales");
		}
		
	}

}
