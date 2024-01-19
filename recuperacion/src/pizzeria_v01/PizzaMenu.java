package pizzeria_v01;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class PizzaMenu {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection conexion = ConexionBase.obtenerConexion();
		Scanner tec = new Scanner(System.in);
		int menuNum;
		
		do {
			System.out.println("¿que quieres hacer?");
			System.out.println("1 listar las pizza");
			System.out.println("2 listar los usuarios");
			System.out.println("3 listar los pedidos");
			System.out.println("4 incluir una nueva pizza");
			System.out.println("5 incluir un nuevo usuario");
			System.out.println("6 incluir un nuevo pedido");
			System.out.println("0 salir");
			menuNum = tec.nextInt();
			switch (menuNum) {
			case 1:
				System.out.println("listando las pizzaz..");
				ListarPizza.listandoPizzas(conexion);
				System.out.println();
				break;
			case 2:
				System.out.println("listando los usuarios..");
				ListarUsuario.listandoUsuarios(conexion);
				System.out.println();
				break;
			case 3:
				System.out.println("listando los pedidos..");
				ListarPedido.listandoPedidos(conexion);
				System.out.println();
				break;
			case 4:
				System.out.println("¿que pizza quieres añadir?");
				System.out.println();
				break;
			case 5:
				System.out.println("¿que usuario quieres añadir?");
				System.out.println();
				break;
			case 6:
				System.out.println("¿que pedidos quieres añadir?");
				System.out.println();
				break;
			case 0:
				System.out.println("hasta luego!");
				System.exit(0);
			}
		} while (menuNum != 0);

		tec.close();
        if (conexion != null) conexion.close();
	}

}