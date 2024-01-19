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
			String consultaSQL = "SELECT pe.idpedido, us.nombre, us.apellido, pi.nombre, pi.precio FROM pedido pe JOIN pizza pi ON pe.idpizza = pi.id JOIN usuario us ON pe.idusuario = us.id";
			resultado = sentencia.executeQuery(consultaSQL);
			while (resultado.next()) {
				String col01 = resultado.getString("pe.idpedido");
				String col02 = resultado.getString("us.nombre");
				String col03 = resultado.getString("us.apellido");
				String col04 = resultado.getString("pi.nombre");
				String col05 = resultado.getString("pi.precio");
				System.out.println(col01 + " " + col02 + " " + col03 + " " + col04 + " " + col05);
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