package pizzeria_v04;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class PizzaMenu {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		Connection conexion = null;
		int menu = 0;
		
		ArrayList<Pizza> pizzaList = new ArrayList<Pizza>();
		ArrayList<Usuario> usuarioList = new ArrayList<Usuario>();
		ArrayList<Pedido> pedidoList = new ArrayList<Pedido>();
	
		try {
			conexion = ConexionBase.obtenerConexion();
			ObtenerDatos.obtenerPizzas(pizzaList, conexion);
			ObtenerDatos.obtenerUsuarios(usuarioList, conexion);
			ObtenerDatos.obtenerPedidos(pedidoList, conexion);
			
			do {
			
			System.out.println("¿que quieres hacer?");
			System.out.println("1 listar las pizzas");
			System.out.println("2 listar los usuarios");
			System.out.println("3 listar los pedidos");
			System.out.println("4 incluir una nueva pizza");
			System.out.println("5 incluir un nuevo usuario");
			System.out.println("6 incluir un nuevo pedido");
			System.out.println("7 borrar una pizza");
			System.out.println("8 borrar un usuario");
			System.out.println("9 borrar un pedido");
			System.out.println("0 salir");
			menu = tec.nextInt();
			
			switch (menu) {
			case 1:
				ListarDatos.listandoPizzas(pizzaList);
				break;
			case 2:
				ListarDatos.listandoUsuarios(usuarioList);
				break;
			case 3:
				ListarDatos.listandoPedidos(pedidoList);
				break;
			case 4:
				IncluirDatos.incluirPizza(pizzaList, tec);
				break;
			case 5:
				IncluirDatos.incluirUsuario(usuarioList, tec);
				break;
			case 6:
				IncluirDatos.incluirPedido(pedidoList, tec);
				break;
			case 7:
				BorrarDatos.borrarPizza(pizzaList, tec);
				break;
			case 8:
				BorrarDatos.borrarUsuario(usuarioList, tec);
				break;
			case 9:
				BorrarDatos.borrarPedido(pedidoList, tec);
				break;
			case 0:
				System.out.println("hasta luego!");
				PonerDatos.ponerPizzas(pizzaList, conexion);
				PonerDatos.ponerUsuarios(usuarioList, conexion);
				PonerDatos.ponerPedidos(pedidoList, conexion);
			}
			
		} while(menu != 0);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
            try {
                if (conexion != null) {
                    conexion.close();
                   
                }
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Error al cerrar la conexión.");
            }
            try {
                if (tec != null) {
                    tec.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Error al cerrar el scanner.");
            }
		}
	
	}
	
}