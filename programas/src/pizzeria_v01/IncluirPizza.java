package pizzeria_v01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class IncluirPizza {

    public static void incluyendoPizza(Connection conexion, Scanner tec) {
        System.out.println("id: ");
        int id = tec.nextInt();
        tec.nextLine();
        System.out.print("Nombre: ");
        String nombre = tec.nextLine();
        System.out.print("Ingredientes: ");
        String ingredientes = tec.nextLine();
        System.out.print("Precio: ");
        double precio = tec.nextDouble();
        tec.nextLine();

        try {
            String consultaSQL = "INSERT INTO pizza (id, nombre, ingredientes, precio) VALUES (?, ?, ?, ?)";
            try (PreparedStatement statement = conexion.prepareStatement(consultaSQL)) {
            	statement.setInt(1, id);
                statement.setString(2, nombre);
                statement.setString(3, ingredientes);
                statement.setDouble(4, precio);

                int filasAfectadas = statement.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("pizza agregada con éxito.");
                } else {
                    System.out.println("no se pudo agregar la pizza");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al incluir la pizza en la base de datos.");
        } finally {
        }
    }
}