package pizzeria_v02;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class PizzaMenu {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Scanner tec = new Scanner(System.in);
		int menuNum;
		
		Connection conexion = ConexionBase.obtenerConexion();
		
		do {
			System.out.println("¿que quieres hacer?");
			System.out.println("1 listar las pizza");
			System.out.println("2 listar los usuarios");
			System.out.println("3 listar los pedidos");
			System.out.println("4 añadir una nueva pizza");
			System.out.println("5 añadir un nuevo usuario");
			System.out.println("6 añadir un nuevo pedido");
			System.out.println("0 salir");
			menuNum = tec.nextInt();
			switch (menuNum) {
			case 1:
				System.out.println("listando las pizzaz..");
				ListarDatos.listandoDatos(conexion);
				System.out.println();
				break;
			case 2:
				System.out.println("listando los usuarios..");
				ListarDatos.listandoDatos(conexion);
				System.out.println();
				break;
			case 3:
				System.out.println("listando los pedidos..");
				ListarDatos.listandoDatos(conexion);
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