package unidad_vii;

import java.util.Objects;
import java.util.Scanner;

public class Empleado extends PersonaU {

	//propiedades
	private String departamento;
	private String puesto;
	private double salario;
	
	//constructors
	
	//constructor por defecto
	public Empleado() {
		this.departamento = "";
		this.puesto = "";
		this.salario = 0.0;
	}
	//constructor copia
	public Empleado (Empleado cc) {
		super(cc);
		this.departamento = cc.departamento;
		this.puesto = cc.puesto;
		this.salario = cc.salario;
	}
	//constructor personalizado empleado
	public Empleado (String dp, String pt, double sl) {
		this.departamento = dp;
		this.puesto = pt;
		this.salario = sl;
	}
	//constructor personalizado empleado y persona
	public Empleado (String d, String n, String a, FechaU f, String dp, String pt, double sl) {
		super (d,n,a,f);
		this.departamento = dp;
		this.puesto = pt;
		this.salario = sl;
	}
	
	//get and set
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//toString
	@Override
	public String toString() {
		return super.toString() + departamento + " " + puesto + " " + salario;
	}
	
	//hashCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(departamento, puesto, salario);
		return result;
	}
	
	//equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(departamento, other.departamento) && Objects.equals(puesto, other.puesto)
				&& Double.doubleToLongBits(salario) == Double.doubleToLongBits(other.salario);
	}
	
	//compareTo
	public int compareTo(Empleado other) {
		return super.compareTo(other);
	}
	
	//leer
	public void leer(Scanner tec) {
		super.leer(tec);
		System.out.println("departamento: ");
		this.departamento = tec.nextLine();
		System.out.println("puesto: ");
		this.puesto = tec.nextLine();
		System.out.println("salario: ");
		double sal = tec.nextDouble();
		while (sal < 0) {
			System.out.println("error, no puede ser negativo");
			System.out.println("salario: ");
			sal = tec.nextDouble();
		}
		this.salario = sal;
	}
}
