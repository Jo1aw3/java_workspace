package pizzeria_v01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ListarPizza {
	
	public static void listandoPizzas(Connection conexion) {
		Statement sentencia = null;
		ResultSet resultado = null;
		
		try {
			sentencia = conexion.createStatement();
			String consultaSQL = "SELECT * FROM pizza";
			resultado = sentencia.executeQuery(consultaSQL);
			
			while (resultado.next()) {
				String col00 = resultado.getString("id");
				String col01 = resultado.getString("nombre");
				String col02 = resultado.getString("ingredientes");
				String col03 = resultado.getString("precio");
				System.out.println("id: " + col00 + "| " + col01 + ": " + col02 + " $" + col03);
			}
		} catch (SQLException e) {
            e.printStackTrace();
            System.out.println("error de consulta");
        } 
		finally {
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