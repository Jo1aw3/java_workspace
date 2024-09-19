package pizzeria_v04;

import java.util.ArrayList;
import java.util.Scanner;

public class BorrarDatos {

    public static void borrarPizza(ArrayList<Pizza> pizzaList, Scanner tec) {
        System.out.println("Ingrese el ID de la pizza que desea borrar:");
        int idPizza = tec.nextInt();

        Pizza pizzaABorrar = buscarPizzaPorId(pizzaList, idPizza);

        if (pizzaABorrar != null) {
            pizzaList.remove(pizzaABorrar);
            System.out.println("Pizza con ID " + idPizza + " borrada exitosamente.");
        } else {
            System.out.println("No se encontró ninguna pizza con el ID " + idPizza);
        }

        System.out.println();
    }

    public static void borrarUsuario(ArrayList<Usuario> usuarioList, Scanner tec) {
        System.out.println("Ingrese el ID del usuario que desea borrar:");
        int idUsuario = tec.nextInt();

        Usuario usuarioABorrar = buscarUsuarioPorId(usuarioList, idUsuario);

        if (usuarioABorrar != null) {
            usuarioList.remove(usuarioABorrar);
            System.out.println("Usuario con ID " + idUsuario + " borrado exitosamente.");
        } else {
            System.out.println("No se encontró ningún usuario con el ID " + idUsuario);
        }

        System.out.println();
    }

    public static void borrarPedido(ArrayList<Pedido> pedidoList, Scanner tec) {
        System.out.println("Ingrese el ID del pedido que desea borrar:");
        int idPedido = tec.nextInt();

        Pedido pedidoABorrar = buscarPedidoPorId(pedidoList, idPedido);

        if (pedidoABorrar != null) {
            pedidoList.remove(pedidoABorrar);
            System.out.println("Pedido con ID " + idPedido + " borrado exitosamente.");
        } else {
            System.out.println("No se encontró ningún pedido con el ID " + idPedido);
        }

        System.out.println();
    }

    // Métodos auxiliares para buscar elementos por ID
    private static Pizza buscarPizzaPorId(ArrayList<Pizza> pizzaList, int id) {
        for (Pizza pizza : pizzaList) {
            if (pizza.getId() == id) {
                return pizza;
            }
        }
        return null;
    }

    private static Usuario buscarUsuarioPorId(ArrayList<Usuario> usuarioList, int id) {
        for (Usuario usuario : usuarioList) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }

    private static Pedido buscarPedidoPorId(ArrayList<Pedido> pedidoList, int id) {
        for (Pedido pedido : pedidoList) {
            if (pedido.getIdpedido() == id) {
                return pedido;
            }
        }
        return null;
    }
}
