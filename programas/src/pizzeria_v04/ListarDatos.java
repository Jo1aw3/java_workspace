package pizzeria_v04;

import java.util.ArrayList;

public class ListarDatos {

	public static void listandoPizzas(ArrayList<Pizza> pizzaList) {
		System.out.println("listando las pizzas..");
		for (Pizza pizza : pizzaList) {
			System.out.println(pizza);
		}
		System.out.println();
	}
	
	public static void listandoUsuarios(ArrayList<Usuario> usuarioList) {
		System.out.println("listando los usuarios..");
		for (Usuario usuario : usuarioList) {
			System.out.println(usuario);
		}
		System.out.println();
	}
	
	public static void listandoPedidos(ArrayList<Pedido> pedidoList) {
		System.out.println("listando los pedidos..");
		for (Pedido pedido : pedidoList) {
			System.out.println(pedido);
		}
		System.out.println();
	}
}
