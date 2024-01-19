package figuras;

public class Cuadrado extends Rectangulo {
	
	public Cuadrado() {
		super();
	}
	
	public Cuadrado(Cuadrado c) {
		super(c);
	}
	
	public Cuadrado(int x, int y, double lado) {
		super(x, y, lado, lado);
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + alto + ", x=" + x + ", y=" + y + "]";
	}
	
	
	
}
