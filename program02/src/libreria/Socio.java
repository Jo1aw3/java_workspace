package libreria;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Socio {

	private String dni;
	private String nombre;
	private String apellido;
	private int edad;
	ArrayList<Publicacion> aPublicacion = new ArrayList<Publicacion>();
	
	Scanner tec = new Scanner(System.in);
	
	public Socio() {
		
	}
	
	public Socio (String dni, String nombre, String apellido, int edad, ArrayList<Publicacion> aPublicacion) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.aPublicacion = aPublicacion;
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public ArrayList<Publicacion> getaPublicacion() {
		return aPublicacion;
	}
	public void setaPublicacion(ArrayList<Publicacion> aPublicacion) {
		this.aPublicacion = aPublicacion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(aPublicacion, apellido, dni, edad, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Socio other = (Socio) obj;
		return Objects.equals(aPublicacion, other.aPublicacion) && Objects.equals(apellido, other.apellido)
				&& Objects.equals(dni, other.dni) && edad == other.edad && Objects.equals(nombre, other.nombre);
	}

	
	public void leer (Scanner tec) {
		System.out.println("tu numero de dni?");
		this.dni = tec.next();
 		System.out.println("nombre?");
 		this.nombre = tec.next();
		System.out.println("apellido?");
		this.apellido = tec.next();
		System.out.println("edad?");
		this.edad = tec.nextInt();
		while (this.edad < 0) {
			if (this.edad < 0) {
				System.out.println("3rror, edad incorrecta");
				System.out.println("introduce de nuevo tu edad");
				this.edad = tec.nextInt();
			}
		}
		System.out.println("los datos se han guardado");
	}
	
	public void añadirPublicacion(Publicacion p1) {
		
	}
		
	public void print () {
		System.out.println("Dni: " + this.dni);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellido: " + this.apellido);
		System.out.println("Edad: " + this.edad);
		System.out.println("aPublicacion: " + this.aPublicacion);
	}
	
	
}
