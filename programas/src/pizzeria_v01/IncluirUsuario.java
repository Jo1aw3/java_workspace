package pizzeria_v01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class IncluirUsuario {

    public static void incluyendoUsuario(Connection conexion, Scanner tec) {
        System.out.println("id: ");
        int id = tec.nextInt();
        tec.nextLine();        
        System.out.print("nombre: ");
        String nombre = tec.nextLine();
        System.out.println("apellido: ");
        String apellido = tec.nextLine();

        try {
            String consultaSQL = "INSERT INTO usuario (id, nombre, apellido) VALUES (?, ?, ?)";
            try (PreparedStatement statement = conexion.prepareStatement(consultaSQL)) {
            	statement.setInt(1, id);
                statement.setString(2, nombre);
                statement.setString(3, apellido);

                int filasAfectadas = statement.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("usuario agregado con éxito");
                } else {
                    System.out.println("no se pudo agregar el usuario");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al incluir el usuario en la base de datos.");
        } finally {
        }
    }
}