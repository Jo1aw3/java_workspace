package pizzeria_v02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ListarDatos {
	
	public static void listandoDatos(Connection conexion) {
		Statement sentencia = null;
		ResultSet resultado = null;
		
		try {
			sentencia = conexion.createStatement();
			String consultaSQL = "SELECT nombre, ingredientes, precio FROM pizza";
			resultado = sentencia.executeQuery(consultaSQL);
			
			while (resultado.next()) {
				String col01 = resultado.getString("nombre");
				String col02 = resultado.getString("ingredientes");
				String col03 = resultado.getString("precio");
				System.out.println(col01 + ": " + col02 + " $" + col03);
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