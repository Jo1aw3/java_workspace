package usuarios;

public class Usuario {

	private int id;
	private String nombre;
	private String apellido;
	private String password;
	private boolean activo;
	
	public Usuario() {
		this.id = 0;
		this.nombre = "";
		this.apellido = "";
		this.password = "";
		this.activo = false;
	}

	public Usuario(int id, String nombre, String apellido, String password, boolean activo) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.password = password;
		this.activo = activo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return id + ", " + nombre + " " + apellido + ", password: " + password + " activo: " + activo;
	}
	
}