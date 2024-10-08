package pizzeria_v04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;

public class PonerDatos {

	public static void ponerPizzas(ArrayList<Pizza> pizzaList, Connection conexion) throws SQLException {
		String consulta = "INSERT INTO pizza (id, nombre, ingredientes, precio) VALUES (?, ?, ?, ?)";
		try (PreparedStatement preparar = conexion.prepareStatement(consulta)) {
			for (Pizza pizza : pizzaList) {
				if (!existePizza(pizza.getId(), conexion)) {
					preparar.setInt(1, pizza.getId());
	                preparar.setString(2, pizza.getNombre());
	                preparar.setString(3, pizza.getIngredientes());
	                preparar.setDouble(4, pizza.getPrecio());
	                preparar.executeUpdate();
				}
			}
		}
	}
	
	public static void ponerUsuarios(ArrayList<Usuario> usuarioList, Connection conexion) throws SQLException {
		String consulta = "INSERT INTO usuario (id, nombre, apellido) VALUES (?, ?, ?)";
		try (PreparedStatement preparar = conexion.prepareStatement(consulta)) {
			for (Usuario usuario : usuarioList) {
				if (!existeUsuario(usuario.getId(), conexion)) {
					preparar.setInt(1, usuario.getId());
					preparar.setString(2, usuario.getNombre());
					preparar.setString(3, usuario.getApellido());
					preparar.executeUpdate();
				}
			}
		}	
	}
	
	public static void ponerPedidos(ArrayList<Pedido> pedidoList, Connection conexion) throws SQLException {
		String consulta = "INSERT INTO pedido (idpizza, idusuario, idpedido, cantidad) VALUES (?, ?, ?, ?)";
		try (PreparedStatement preparar = conexion.prepareStatement(consulta)) {
			for (Pedido pedido : pedidoList) {
				if (!existePedido(pedido.getIdpedido(), conexion)) {
					preparar.setInt(1, pedido.getIdusuario());
					preparar.setInt(2, pedido.getIdpedido());
					preparar.setInt(3, pedido.getCantidad());
					preparar.executeUpdate();
				}
			}
		}	
	}
	
	public static boolean existePizza(int idPizza, Connection conexion) throws SQLException {
	    String consulta = "SELECT COUNT(*) AS cantidad FROM pizza WHERE id = ?";
	    try (PreparedStatement preparar = conexion.prepareStatement(consulta)) {
	        preparar.setInt(1, idPizza);
	        try (ResultSet resultado = preparar.executeQuery()) {
	            if (resultado.next()) {
	                int cantidad = resultado.getInt("cantidad");
	                return cantidad > 0; // Devuelve true si hay al menos una pizza con ese ID en la base de datos
	            }
	        }
	    }
	    return false; // Si hubo un problema durante la consulta, asumimos que la pizza no existe
	}
	
	public static boolean existeUsuario(int idUsuario, Connection conexion) throws SQLException {
		String consulta = "SELECT COUNT(*) AS cantidad FROM usuario WHERE id = ?";
		try (PreparedStatement preparar = conexion.prepareStatement(consulta)) {
			preparar.setInt(1, idUsuario);
			try (ResultSet resultado = preparar.executeQuery()) {
				if (resultado.next()) {
					int cantidad = resultado.getInt("cantidad");
					return cantidad > 0;
				}
			}
		}
		return false;
	}
	
	private static boolean existePedido(int idPedido, Connection conexion) throws SQLException {
		String consulta = "SELECT COUNT(*) AS cantidad FROM pedido WHERE idpedido = ?";
		try (PreparedStatement preparar = conexion.prepareStatement(consulta)) {
			preparar.setInt(1, idPedido);
			try (ResultSet resultado = preparar.executeQuery()) {
				if (resultado.next()) {
					int cantidad = resultado.getInt("cantidad");
					return cantidad > 0;
				}
			}
		}
		return false;
	}
	
}