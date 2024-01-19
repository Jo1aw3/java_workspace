package study;

public class Rectangulo extends Figura{
	
	//propiedades o atributos de la clase derivdad
	protected double ancho;
	protected double alto;
	
	//constructor personalizado, donde estamos llamando a los atributos de la clase base y de la clase derivada
	public Rectangulo (int x, int y, double ancho, double alto) {
		super(x, y);
		this.ancho = ancho;
		this.alto = alto;
	}
	
	public double area() {
		//los metodos abstractos que son usados en las clases derivadas siempre tienen que devolver algo
		return ancho * alto;
	}
	
}
