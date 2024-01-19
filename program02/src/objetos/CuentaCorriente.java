package objetos;

public class CuentaCorriente {

	//definimos atributos	
	private String titulo;
	private double saldo;
	
	//generamos constructores
	//constructor predeterminado o por defecto
	CuentaCorriente () {
		
	}
	
	//constructor personalizado
	CuentaCorriente (String t, double s) {
		this.titulo = t;
		this.saldo = s;
	}
	
	//constructor copia
	CuentaCorriente (CuentaCorriente cc) {
		this.titulo = cc.titulo;
		this.saldo = cc.saldo;
	}

	// set and get (sources)
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//creacion de metodos
	public void IngresarDinero(double cantidad) {
		if (saldo <= 0.0) {
			System.out.println("la operacion no es valida, tienes " + saldo+"$");
		}
		else {
			saldo = saldo + cantidad;
			System.out.println("su saldo actual es:: " + saldo+"$");
		}
	}
	
	
}
