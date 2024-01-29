package pizzeria_v04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	public static Connection obtenerConexion() throws SQLException {
		String url = "jdbc:mysql://localhost/pizzeria";
		String usuario = "root";
		String contraseña = "";
		return DriverManager.getConnection(url, usuario, contraseña);
	}
	
}
