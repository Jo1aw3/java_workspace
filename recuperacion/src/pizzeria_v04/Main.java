package pizzeria_v04;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		Connection conexion = null;
		int menu = 0;
		
		ArrayList<Pizza> pizzaList = new ArrayList<Pizza>();
		ArrayList<Usuario> usuarioList = new ArrayList<Usuario>();
		ArrayList<Pedido> pedidoList = new ArrayList<Pedido>();
	
		try {
			conexion = Conexion.obtenerConexion();
			Main.obtenerDatos(pizzaList, usuarioList, pedidoList, conexion);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
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
				System.out.println("listando las pizzas..");
				for (Pizza pizza : pizzaList) {
					System.out.println(pizza);
				}
				System.out.println();
				break;
			case 2:
				System.out.println("listando los usuarios..");
				for (Usuario usuario : usuarioList) {
					System.out.println(usuario);
				}
				System.out.println();
				break;
			case 3:
				System.out.println("listando los pedidos..");
				for (Pedido pedido : pedidoList) {
					System.out.println(pedido);
				}
				System.out.println();
				break;
			case 4:
				System.out.println("¿que pizza quieres añadir?");
				Pizza pizza = new Pizza();
				pizza.leerTec(tec);
				if (pizzaList.contains(pizza)) {
					System.out.println("la pizza ya existe");
				} else {
					pizzaList.add(pizza);
					System.out.println("pizza añadida!");
				}
				System.out.println();
				break;
			case 5:
				System.out.println("¿que usuario quieres añadir?");
				Usuario usuario = new Usuario();
				usuario.leerTec(tec);
				if (usuarioList.contains(usuario)) {
					System.out.println("el usuarui ya existe");
				} else {
					usuarioList.add(usuario);
					System.out.println("usuario añadido!");
				}
				System.out.println();
				break;
			case 6:
				System.out.println("¿que pedido quieres añadir?");

				System.out.println();
				break;
			case 7:
				System.out.println("¿que pizza quieres borrar?");

				System.out.println();
				break;
			case 8:
				System.out.println("¿que usuario quieres borrar?");

				System.out.println();
				break;
			case 9:
				System.out.println("¿que pedido quieres borrar?");

				System.out.println();
				break;
			case 0:
				System.out.println("hasta luego!");
				System.exit(0);
			}
			
		} while(menu != 0);
		
	}

	private static void obtenerDatos(ArrayList<Pizza> pizzaList, ArrayList<Usuario> usuarioList, ArrayList<Pedido> pedidoList, Connection conexion) throws SQLException {
			Statement sentencia = conexion.createStatement();
			ResultSet resultado = sentencia.executeQuery("SELECT * FROM pizza");
			while (resultado.next()) {
				pizzaList.add(new Pizza(resultado.getInt("id"), resultado.getString("nombre"), resultado.getString("ingredientes"), resultado.getDouble("precio")));
			}
			resultado = sentencia.executeQuery("SELECT * FROM usuario");
			while (resultado.next()) {
				usuarioList.add(new Usuario(resultado.getInt("id"), resultado.getString("nombre"), resultado.getString("apellido")));
			}
			resultado = sentencia.executeQuery("SELECT * FROM pedido");
			while (resultado.next()) {
				pedidoList.add(new Pedido(resultado.getInt("idpizza"), resultado.getInt("idusuario"), resultado.getInt("idpedido"), resultado.getInt("cantidad")));
			}
	}

}
