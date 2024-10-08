package pizzeria_v04;

import java.util.ArrayList;
import java.util.Scanner;

public class IncluirDatos {
	
	public static void incluirPizza(ArrayList<Pizza> pizzaList, Scanner tec) {
		System.out.println("id:");
		int id = tec.nextInt();
		tec.nextLine();
		System.out.println("nombre:");
		String nombre = tec.nextLine();
		System.out.println("ingredientes:");
		String ingredientes = tec.nextLine();
		System.out.println("precio:");
		double precio = tec.nextDouble();
		
		Pizza pizza = new Pizza(id, nombre, ingredientes, precio);
		
		if (pizzaList.contains(pizza)) {
			System.out.println("la pizza ya existe");
		} else {
			pizzaList.add(pizza);
			System.out.println("pizza añadida!");
		}
		System.out.println();
	}
	
	public static void incluirUsuario(ArrayList<Usuario> usuarioList, Scanner tec) {
		System.out.println("id:");
		int id = tec.nextInt();
		System.out.println("nombre:");
		tec.nextLine();
		String nombre = tec.next();
		System.out.println("apellido:");
		String apellido = tec.next();
		
		Usuario usuario = new Usuario(id, nombre, apellido);
				
		if (usuarioList.contains(usuario)) {
			System.out.println("el usuario ya existe");
		} else {
			usuarioList.add(usuario);
			System.out.println("usuario añadido!");
		}
		System.out.println();		
		
	}
	
	public static void incluirPedido(ArrayList<Pedido> pedidoList, Scanner tec) {
		System.out.println("id pizza:");
		int idpizza = tec.nextInt();
		System.out.println("id usuario:");
		int idusuario = tec.nextInt();
		System.out.println("id pedido:");
		int idpedido = tec.nextInt();
		System.out.println("cantidad:");
		int cantidad = tec.nextInt();
		
		Pedido pedido = new Pedido(idpizza, idusuario, idpedido, cantidad);
				
		if (pedidoList.contains(pedido)) {
			System.out.println("el pedido ya existe");
		} else {
			pedidoList.add(pedido);
			System.out.println("pedido añadido!");
		}
		System.out.println();
	}
	
}
