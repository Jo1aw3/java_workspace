package vehiculo;

public class Bici extends VehiculoTerrestre {
	
	public bici() {
		super(2);
		this.setNombreVehiculo("Bici");
	}
	
	public bici(String nombre, int pm, int pmax) {
		super(2);
		this.setNombreVehiculo(nombre);
		this.PotenciaMotor = pm;
		this.getVelocidadMaxima = pmax;
	}
	
	//inicio del desplazamiento
	@Override
	public void iniciarDesplazamiento() {
		System.out.println("Pedaleando...");
	}
	
	//final de desplazamiento
	@Override
	public void finalizarDesplazamiento() {
		System.out.println("Parado...");
	}
	
	//toString
	@Override
	public String toString() {
		return "Bici - " + super.toString();
	}
}
