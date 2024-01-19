package examen2Final_joshuabotello;

public class Trabajador extends User{

	private String puesto;
	
	public Trabajador() {
		super();
		this.puesto = "";
	}
	
	public Trabajador(String user, String password, int tipo, String puesto) {
		super(user, password, tipo);
		this.puesto = puesto;
	}
	
	public Trabajador(Trabajador cc) {
		super(cc);
		this.puesto = cc.puesto;
	}
	
	@Override
	void print() {
		System.out.println("Usuario: " + this.user);
		System.out.println("Contraseña: " + this.password);
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Puesto: " + this.puesto);
	}
	
}
