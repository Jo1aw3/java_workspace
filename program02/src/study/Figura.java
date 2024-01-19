package study;

public abstract class Figura {

	//propiedades o atributos de la clase
	//cuando la clase es abstracta, los atributos siempre tienen que ser protected
	protected int x;
	protected int y;
	
	//constructor personalizado
	public Figura(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//metodo abstracto area
	//una clase es abstracta siempre y cuando tenga un metodo abstracto
	public abstract double area();
	
}
