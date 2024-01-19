package objetos;

public class Persona01 {
	
	//definimos atributos
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;
	
	//constructor predeterminado
	Persona01 () {
		
	}
	
	//constructor personalizado
	//algunos
	Persona01 (String n, int e, char s) {
		this.nombre = n; 
		this.edad = e;
		this.sexo = s;
	}
	//todos
	Persona01  (String n, int e, String d, char s, double p, double a) {
		this.nombre = n; 
		this.edad = e;
		this.dni = d;
		this.sexo = s;
		this.peso = p;
		this.altura = a;
	}
	
	//constructor copia
	Persona01 (Persona01 cc) {
		this.nombre = cc.nombre; 
		this.edad = cc.edad;
		this.dni = cc.dni;
		this.sexo = cc.sexo;
		this.peso = cc.peso;
		this.altura = cc.altura;
	}
	
	// set and get (sources)
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//creacion de metodos
	
	//sacar el calculo de la masa muscular
	public void imc() {
		double mm = peso / (altura * altura);
		if (mm < 20) {
			mm = -1;
			System.out.println();
		}
		else if (mm >= 20 && mm <= 25) {
			mm = 0;
		}
		else {
			mm = 1;
		}
		System.out.println("imc :" + mm);
	}
	
	//nc
	public boolean maxedad() {
		if (edad > 18) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	
	
	
}
