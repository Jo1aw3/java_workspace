package pizzeria_v01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class IncluirPedido {

    public static void incluyendoPedido(Connection conexion, Scanner tec) {
        System.out.println("idpizza: ");
        int idpizza = tec.nextInt();
        tec.nextLine();
        System.out.println("idusuario: ");
        int idusuario = tec.nextInt();
        tec.nextLine();
        System.out.println("idpedido: ");
        int idpedido = tec.nextInt();
        tec.nextLine();
        System.out.println("cantidad: ");
        int cantidad = tec.nextInt();
        tec.nextLine();

        try {
            String consultaSQL = "INSERT INTO pedido (idpizza, idusuario, idpedido, cantidad) VALUES (?, ?, ?, ?)";
            try (PreparedStatement statement = conexion.prepareStatement(consultaSQL)) {
            	statement.setInt(1, idpizza);
            	statement.setInt(2, idusuario);
            	statement.setInt(3, idpedido);
            	statement.setInt(4, cantidad);

                int filasAfectadas = statement.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("pedido agregado con éxito.");
                } else {
                    System.out.println("no se pudo agregar el pedido");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al incluir el pedido en la base de datos.");
        } finally {
        }
    }
}