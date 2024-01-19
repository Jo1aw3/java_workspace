package figuras;

public abstract class Figura {
	protected int x;
	protected int y;

	//constructor personalizado
	public Figura(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//contructor predeterminado
	public Figura () {
		this.x = 0;
		this.y = 0;
	}
	
	//constructor copia
	public Figura (Figura f) {
		this.x = f.x;
	}
	
	@Override
	public String toString() {
		return "Figura [x=" + x + ", y=" + y + "]";
	}

	
	public abstract double area();
	public abstract double perimetro();
	
}
