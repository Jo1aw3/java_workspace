package pizzeria_v01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ListarPedido {
	
	public static void listandoPedidos(Connection conexion) {
		Statement sentencia = null;
		ResultSet resultado = null;
		
		try {
			sentencia = conexion.createStatement();
			String consultaSQL = "SELECT pe.idpedido, us.nombre, us.apellido, pi.nombre, pi.precio, pe.cantidad FROM pedido pe JOIN pizza pi ON pe.idpizza = pi.id JOIN usuario us ON pe.idusuario = us.id";
			resultado = sentencia.executeQuery(consultaSQL);
			while (resultado.next()) {
				System.out.println();
				String col00 = resultado.getString("pe.idpedido");
				String col01 = resultado.getString("us.nombre");
				String col02 = resultado.getString("us.apellido");
				String col03 = resultado.getString("pi.nombre");
				String col04 = resultado.getString("pi.precio");
				String col05 = resultado.getString("pe.cantidad");
				System.out.println("numero id del pedido: " + col00);
				System.out.println("usuario: " + col01 + " " + col02);
				System.out.println("pizza: " + col03 + " $" + col04);
				int numPrecio = Integer.parseInt(col04);
				int numCantidad = Integer.parseInt(col05);
				int totalPrecio = numPrecio * numCantidad;
				System.out.println("cantidad: " + col05 + "| total: $" + totalPrecio);
			}
		} catch (SQLException e) {
            e.printStackTrace();
            System.out.println("error de consulta");
        } finally {
            try {
                if (resultado != null) resultado.close();
                if (sentencia != null) sentencia.close();
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("error al cerrar los recursos");
            }
        }
    }
}