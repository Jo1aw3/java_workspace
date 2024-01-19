package study;

public class Triangulo extends Figura{

	//propiedades de al subclase Triangulo
	protected double altura;
	protected double base;
	
	//constructor personalizado
	public Triangulo(int x, int y, double altura, double base) {
		super(x, y);
		this.altura = altura;
		this.base = base;
	}

	//metodo area
	@Override
	public double area() {
		return (base*altura)/2;
	}

}
