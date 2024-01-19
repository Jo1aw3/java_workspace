package bodega;

import java.util.ArrayList;
import java.util.Scanner;

public class Factura implements Facturacion {
	
	private int numero;
	private String nombre;
	private String apellido;
	ArrayList<LineaFactura> lineas = new ArrayList<LineaFactura>();
	private double total;
	
	Scanner tec = new Scanner(System.in);
	
	public Factura (int numero, String nombre, String apellido, double total, ArrayList<LineaFactura> lineas) {
		this.numero = numero;
		this.nombre = nombre;
		this.apellido = apellido;
		this.total = total;
		this.lineas = new ArrayList<LineaFactura>();
		}
	
	public void añadirLinea (String codigo, int cantidad, double total) {
		LineaFactura lf1 = new LineaFactura(codigo, cantidad, total);
		this.lineas.add(lf1);
	}
	
	public void print () {
		System.out.println("Codigo: " + this.numero);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellido: " + this.apellido);
		for (LineaFactura cadena : lineas) {
			System.out.println("Linea Factura: " + cadena);
		}
		System.out.println("Total: " + this.total);
	}

	@Override
	public double calcularTotal() {
		
		return 0.0;
	}
 
	
}

