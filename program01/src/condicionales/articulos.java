package condicionales;

import java.util.Scanner;

public class articulos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String i;
	    int cantidad;
	    double precio;
	    
	    Scanner teclado;
	    teclado = new Scanner(System.in);
	    
	    System.out.println("Introduce el item");
	    i = teclado.next();
	    System.out.println("Introduce la cantidad");
	    cantidad = teclado.nextInt();
	    System.out.println("Introduce el precio");
	    precio = teclado.nextDouble();
	    teclado.close();
	    
	    if (cantidad < 10) {
	    	System.out.println("no hay descuento");
	    	System.out.println(precio);
	    }
	    else if (cantidad < 25) {
	    	System.out.println("Tiene un descuento de 10%");
	    	precio = (precio * 0.10);
	    	System.out.println("por lo cual queda en: " + precio);
	    }
	    else if (cantidad < 100) {
	    	System.out.println("Tiene un descuento de 25%");
	    	precio = (precio * 0.25);
	    	System.out.println("por lo cual queda en: " + precio);
	    }
	    else {
	    	System.out.println("Tiene un descuento de 40%");
	    	precio = (precio * 0.40);
	    	System.out.println("por lo cual queda en: " + precio);
		}
	}

}
