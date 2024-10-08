package usuarios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsuarioApp {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		int numeroMenu = 0;
		
		List<Usuario> listaUsuarios = new ArrayList<>();
		
		try (FileReader fichero = new FileReader("C:\\fileReadJava\\usuarios.txt");
		     BufferedReader leertxt = new BufferedReader(fichero)) {

		        String linea = leertxt.readLine();

		        while (linea != null) {
		            String[] parte = linea.split(":");
		            
		            boolean isActive = "1".equals(parte[4].trim());
		            Usuario usuario = new Usuario(Integer.parseInt(parte[0]), parte[1], parte[2], parte[3], isActive);
		            listaUsuarios.add(usuario);

		            linea = leertxt.readLine(); 
		        }

			do {
				
			System.out.println("1 mostrar los usuarios");
			System.out.println("2 borrar un usuario");	
			System.out.println("3 crear un usuario");	
			System.out.println("4 editar un usuario");	
			System.out.println("0 salir");	
			numeroMenu = tec.nextInt();
			
			switch (numeroMenu) {
				case 1:
					UsuarioCrud.listandoUsuarios(listaUsuarios);
					break;
				case 2:
					UsuarioCrud.borrarUsuario(listaUsuarios, tec);
					break;
				case 3:
					UsuarioCrud.crearUsuario(listaUsuarios, tec);
					break;
				case 4:
					UsuarioCrud.editarUsuario(listaUsuarios, tec);
					break;
				case 0:
					System.out.println("hasta luego!");
					System.exit(0);
				default:
				System.out.println("no existe esa opcion");
			}
			
			} while (numeroMenu != 0);
		        
		} catch (IOException e) {
			e.printStackTrace();
			tec.close();
		}
		
	}
}