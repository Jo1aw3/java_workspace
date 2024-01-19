package hotel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UsuarioSerializable {

	public static void main(String[] args) {

		ArrayList<Usuario> arl_user = new ArrayList<>();

		arl_user.add(new Usuario("12345678A", "Daniel", "passw", 0));
		arl_user.add(new Usuario("12345678B", "Samuel", "passw", 0));
		arl_user.add(new Usuario("12345678C", "Sanson", "passw", 0));
		arl_user.add(new Usuario("12345678D", "David", "passw", 0));

		try {
			FileOutputStream fos = new FileOutputStream("Users.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			for (Usuario i : arl_user) {
				oos.writeObject(i);
				System.out.println(i);
			}

			oos.close();
			fos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
