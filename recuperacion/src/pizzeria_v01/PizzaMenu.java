package pizzeria_v01;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class PizzaMenu {

	public static void main(String[] args) throws SQLException {
		Connection conexion = null;
		Scanner tec = new Scanner(System.in);
		int menuNum;
		
		try {
			conexion = ConexionBase.obtenerConexion();
			
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
					IncluirPizza.incluyendoPizzas(conexion, tec);
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
				
			} while(menuNum != 0);
			
		} catch (SQLException e) {
            e.printStackTrace();
            System.out.println("error al interactuar con la base de datos.");
        } finally {
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Error al cerrar la conexión.");
            }

            tec.close();
        }
    }
}