package pizzeria_v01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class IncluirPizza {
	
	public static void incluyendoPizzas(Connection conexion) {
		Scanner tec = new Scanner(System.in);
		PreparedStatement sentencia = null;
		ResultSet resultado = null;
		
		try {
			System.out.println("ingrese el nombre de la pizza..");
            String nombre = tec.nextLine();
            System.out.println("ingrese los ingredientes..");
            String ingredientes = tec.nextLine();
            System.out.println("ingrese el precio..");
            double precio = tec.nextDouble();
			
            String consultaSQL = "INSERT INTO pizza (nombre, ingredientes, precio) VALUES (?, ?, ?)";
            
            sentencia = conexion.prepareStatement(consultaSQL, Statement.RETURN_GENERATED_KEYS);
            sentencia.setString(1, nombre);
            sentencia.setString(2, ingredientes);
            sentencia.setDouble(3, precio);
            
            int filasAfectadas = sentencia.executeUpdate();
			
            if (filasAfectadas > 0) {
                resultado = sentencia.getGeneratedKeys();
                if (resultado.next()) {
                    int idGenerado = resultado.getInt(1);
                    System.out.println("Pizza agregada con éxito. ID generado: " + idGenerado);
                }
            } else {
                System.out.println("Error al insertar la pizza.");
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
		tec.close();
    }
}