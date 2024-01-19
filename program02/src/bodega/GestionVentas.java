package bodega;

import java.util.Scanner;

public class GestionVentas extends Factura {

	public GestionVentas(int numero, String nombre, String apellido, double total) {
		super(numero, nombre, apellido, total);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tec = new Scanner(System.in);
		String nombre, apellido, codigo;
		int menu, nfactura, cantidad;
		
		
		
		do {
		System.out.println("1. realizar una venta (crear factura)");
		System.out.println("2. listar articulo");
		System.out.println("3. listar articulos sanos");
		System.out.println("4. pedir un codigo y mostrar los articulos que tienen el precio equivalente del articulo");
		System.out.println("5. listar los productos mas caros");
		System.out.println("6. listar los producot con stock bajo");
		System.out.println("7. pedir codigo de articulo y aumentar stock");
		System.out.println("0. salir");
		
		menu = tec.nextInt();
		
		//menu del programa de Gestion de Ventas
		switch (menu) {
		//Realizar una venta (Crear factura)
		case 1:
			System.out.println("numero factura: ");
			nfactura = tec.nextInt();
			System.out.println("nombre cliente");
			nombre = tec.next();
			System.out.println("apellido cliente");
			apellido = tec.next();
			System.out.println("codigo producto (end para acabar)");
			codigo = tec.next();
			System.out.println("cantidad de producto");
			cantidad = tec.nextInt();
			
			while (!codigo.equals("end")) {
				System.out.println("codigo producto (end para acabar)");
				codigo = tec.next();
				System.out.println("cantidad de producto");
				cantidad = tec.nextInt();
			}
			
			System.out.println("numero: " + menu);
			System.out.println("nombre: " + nombre);
			System.out.println("apellido: " + apellido);
			break;
		case 2:
			
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		case 6:
			
			break;
		case 7:
			
		}
		 
		} while (menu != 0);
	
	tec.close();
	}

	

}
