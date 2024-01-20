package pizzeria_v01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class IncluirPedido {
	
	public static void incluyendoPedidos(Connection conexion) {
		Statement sentencia = null;
		ResultSet resultado = null;
		
		try {
			sentencia = conexion.createStatement();
			String consultaSQL = "";
			resultado = sentencia.executeQuery(consultaSQL);
			
			while (resultado.next()) {
			}
			
		} catch (SQLException e) {
            e.printStackTrace();
        } 
		finally {
            try {
                if (resultado != null) resultado.close();
                if (sentencia != null) sentencia.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}