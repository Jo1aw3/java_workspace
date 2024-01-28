package figuras;

public class Circulo extends Figura{

	private double radio;
	
	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}
	
	@Override
	public double perimetro() {
		return 2 * radio * Math.PI;
	}
	
}
