package pizzeria_v01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ListarUsuario {
	
	public static void listandoUsuarios(Connection conexion) {
		Statement sentencia = null;
		ResultSet resultado = null;
		
		try {
			sentencia = conexion.createStatement();
			String consultaSQL = "SELECT * FROM usuario";
			resultado = sentencia.executeQuery(consultaSQL);
			
			while (resultado.next()) {
				String col01 = resultado.getString("nombre");
				String col02 = resultado.getString("apellido");
				System.out.println(col01 + " " + col02);
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