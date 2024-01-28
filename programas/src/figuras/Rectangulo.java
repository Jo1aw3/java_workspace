package figuras;

public class Rectangulo extends Figura{

	private double alto;
	private double ancho;
	
	public Rectangulo(String color, double alto, double ancho) {
		super(color);
		this.alto = alto;
		this.ancho = ancho;
	}
	
	@Override
	public double perimetro() {
		return alto * ancho;
	}
	
}
