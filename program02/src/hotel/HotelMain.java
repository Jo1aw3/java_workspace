package hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class HotelMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Usuario> arl_user = new ArrayList<Usuario>();
		Usuario u01 = new Usuario();

		ArrayList<Hotel> arl_hotel = new ArrayList<Hotel>();
		Hotel h01 = new Hotel();

		ArrayList<Habitaciones> arl_habit = new ArrayList<Habitaciones>();
		Habitaciones hab01 = new Habitaciones();

		ArrayList<Cliente> arl_cliente = new ArrayList<Cliente>();

		ArrayList<Reservas> arl_reserva = new ArrayList<Reservas>();
		Reservas r01 = new Reservas();

		int posicion;
		boolean mod_use = false;
		boolean mod_hotel = false;
		boolean mod_habit = false;
		boolean mod_cliente = false;
		boolean mod_reserva = false;

		try {
			ResultSet rs;
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/hoteles", "root", "");
			System.out.println("Conexión Correcta.");
			Statement st = conexion.createStatement();
			rs = st.executeQuery("SELECT * FROM hoteles.hotel");
			while (rs.next()) {
				int idHotel = rs.getInt("id");
				arl_hotel.add(new Hotel(rs.getInt("id"), rs.getString("nombre"), rs.getString("ciudad"),
						rs.getString("dni_director")));
			}
			rs = st.executeQuery("SELECT * FROM hoteles.habitaciones;");
			while (rs.next()) {
				arl_habit.add(new Habitaciones(rs.getInt("id"), rs.getString("nombre"), rs.getString("servicios"), rs.getInt("id_hotel"), rs.getBoolean("ocupado")));
			}
			rs = st.executeQuery("SELECT * FROM hoteles.cliente;");
			while (rs.next()) {
				arl_cliente.add(new Cliente(rs.getString("dni"), rs.getString("nombre")));
			}
			rs = st.executeQuery("SELECT * FROM hoteles.reservas;");
			while (rs.next()) {
				arl_cliente.add(new Reservas(rs.getInt("id_reserva"), rs.getInt("id_habitacion"), rs.getString("dni_cliente")));
			}

			rs.close();

			st.close();

		} catch (SQLException e) {

			System.out.println("Error de conexión");
		}

	}

}
