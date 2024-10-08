package pizzeria_v04;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ObtenerDatos {
	
	public static void obtenerPizzas(ArrayList<Pizza> pizzaList, Connection conexion) throws SQLException {
		Statement sentencia = conexion.createStatement();
		ResultSet resultado = sentencia.executeQuery("SELECT * FROM pizza");
		while (resultado.next()) {
			pizzaList.add(new Pizza(resultado.getInt("id"), resultado.getString("nombre"), resultado.getString("ingredientes"), resultado.getDouble("precio")));
		}
	}
	public static void obtenerUsuarios(ArrayList<Usuario> usuarioList, Connection conexion) throws SQLException {
		Statement sentencia = conexion.createStatement();
		ResultSet resultado = sentencia.executeQuery("SELECT * FROM usuario");
		while (resultado.next()) {
			usuarioList.add(new Usuario(resultado.getInt("id"), resultado.getString("nombre"), resultado.getString("apellido")));
		}
	}
	public static void obtenerPedidos(ArrayList<Pedido> pedidoList, Connection conexion) throws SQLException {
		Statement sentencia = conexion.createStatement();
		ResultSet resultado = sentencia.executeQuery("SELECT * FROM pedido");
		while (resultado.next()) {
			pedidoList.add(new Pedido(resultado.getInt("idpizza"), resultado.getInt("idusuario"), resultado.getInt("idpedido"), resultado.getInt("cantidad")));
		}
	}
	
}
