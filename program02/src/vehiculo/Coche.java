package vehiculo;

public class Coche {
	public coche() {
		super(4);
		this.setNombreVehiculo("Coche");
		this.getPotenciaMotor(150);
	}
	
	public coche(String nombre, int pm, int pmax) {
		super(2);
		this.setNombreVehiculo(nombre);
		this.PotenciaMotor = pm;
		this.getVelocidadMaxima = pmax;
	}
	
	//inicio del desplazamiento
	@Override
	public void iniciarDesplazamiento() {
		System.out.println("Arrancando...");
	}
	
	//final de desplazamiento
	@Override
	public void finalizarDesplazamiento() {
		System.out.println("Parado...");
	}
	
	//toString
	@Override
	public String toString() {
		return "Coche - " + super.toString();
	}
}
