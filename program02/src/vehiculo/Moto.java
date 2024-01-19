package vehiculo;

public class Moto {

	public moto() {
		super(2);
		this.setNombreVehiculo("Moto");
		this.getPotenciaMotor(100);
	}
	
	public moto(String nombre, int pm, int pmax) {
		super(2);
		this.setNombreVehiculo(nombre);
		this.PotenciaMotor = pm;
		this.getVelocidadMaxima = pmax;
	}
	
	//inicio del desplazamiento
	@Override
	public void iniciarDesplazamiento() {
		System.out.println("Dando gas...");
	}
	
	//final de desplazamiento
	@Override
	public void finalizarDesplazamiento() {
		System.out.println("Parado...");
	}
	
	//toString
	@Override
	public String toString() {
		return "Moto - " + super.toString();
	}
}
