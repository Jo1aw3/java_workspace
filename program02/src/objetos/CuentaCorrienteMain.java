package objetos;

public class CuentaCorrienteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//menu ejecutable de CuentaCorriente
		int Random = (int)(Math.random()*5+0);
		CuentaCorriente c1 = new CuentaCorriente ("Noel", Random);
		CuentaCorriente c2 = new CuentaCorriente ();
		CuentaCorriente c3 = new CuentaCorriente (c1);
		
		System.out.println("--(saldo) constructor personalizado (+ 0.5)--");
		c1.IngresarDinero(0.5);
		System.out.println();
		System.out.println("--(saldo) constructor predeterminado o por defecto (+ 0.5)--");
		c2.IngresarDinero(0.5);
		System.out.println();
		System.out.println("--(saldo) constructor copia.. del personalizado (+ 5.0)--");
		c3.IngresarDinero(5.0);
		System.out.println();
		
	}

}
