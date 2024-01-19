package pizzeria_v01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class IncluirPizza {

    public static void incluyendoPizzas(Connection conexion, Scanner tec) {
        
        System.out.println("Ingrese los detalles de la nueva pizza:");
        System.out.println("id: ");
        int id = tec.nextInt();
        System.out.print("Nombre: ");
        tec.nextLine();
        String nombre = tec.nextLine();
        System.out.print("Ingredientes: ");
        String ingredientes = tec.nextLine();
        System.out.print("Precio: ");
        double precio = tec.nextDouble();

        // Limpiar el búfer del escáner
        tec.nextLine();

        try {
            // Preparar la consulta SQL para insertar una nueva pizza
            String consultaSQL = "INSERT INTO pizza (id, nombre, ingredientes, precio) VALUES (?, ?, ?, ?)";
            try (PreparedStatement statement = conexion.prepareStatement(consultaSQL)) {
                // Establecer los parámetros de la consulta
            	statement.setInt(1, id);
                statement.setString(2, nombre);
                statement.setString(3, ingredientes);
                statement.setDouble(4, precio);

                // Ejecutar la consulta
                int filasAfectadas = statement.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("Pizza agregada con éxito.");
                } else {
                    System.out.println("No se pudo agregar la pizza.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al incluir la pizza en la base de datos.");
        } finally {
        }
    }
}