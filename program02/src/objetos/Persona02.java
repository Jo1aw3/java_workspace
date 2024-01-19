package objetos;

public class Persona02 {
	
	//propiedades o atributos
	private String dni;
	private String nombre;
	private String apellido;
	private Fecha fechanacimiento;
	
	//constructores
	//constructor prefeterminado
	public Persona02 () {
		this.dni = "";
		this.nombre = "";
		this.apellido = "";
		this.dni = "";
		this.fechanacimiento = new Fecha();
	}
	//constructor copia
	public Persona02(Persona02 cc) {
		this.dni = cc.dni;
		this.nombre = cc.nombre;
		this.apellido = cc.apellido;
		this.fechanacimiento = new Fecha(fechanacimiento);
	}
	//constructor personalizado
	public Persona02(String d, String n, String a) {
		this.dni = d;
		this.nombre = n;
		this.apellido = a;
		this.fechanacimiento = new Fecha();
	}
	public Persona02(String d, String n, String a, Fecha f) {
		this.dni = d;
		this.nombre = n;
		this.apellido = a;
		this.fechanacimiento = new Fecha(f);
		
	//get and set
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Fecha getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(Fecha fechanacimiento) {
		this.fechanacimiento = new Fecha(fechanacimiento);
	}
	
	//toString
	@Override
	public String toString() {
		return "Persona01 [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", fechanacimiento="
				+ fechanacimiento + "]";
	}
	
	
	
	
	
}
