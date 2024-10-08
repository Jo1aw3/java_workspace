package usuarios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class UsuarioCrud {

	public static void listandoUsuarios(List<Usuario> listaUsuarios) {

	    for (Usuario usuario : listaUsuarios) {
	    	System.out.println(usuario.toString());
	    }
	    
	}

    public static void borrarUsuario(List<Usuario> listaUsuarios, Scanner tec) {
        System.out.print("ingrese el id del usuario que desea borrar: ");
        int idUsuario = tec.nextInt();
        boolean usuarioEncontrado = false;

        for (Usuario usuario : listaUsuarios) {
            if (usuario.getId() == idUsuario) {
                listaUsuarios.remove(usuario);
                usuarioEncontrado = true;
                break;
            }
        }

        if (usuarioEncontrado) {
            System.out.println("Usuario eliminado correctamente.");
            escribirUsuariosEnArchivo(listaUsuarios);
        } else {
            System.out.println("No se encontró un usuario con ese ID.");
        }

    }

    public static void crearUsuario(List<Usuario> listaUsuarios, Scanner tec) {

        System.out.print("Ingrese el ID del nuevo usuario: ");
        int nuevoId = tec.nextInt();
        tec.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese el nombre del nuevo usuario: ");
        String nuevoNombre = tec.nextLine();

        System.out.print("Ingrese el apellido del nuevo usuario: ");
        String nuevoApellido = tec.nextLine();

        System.out.print("Ingrese la contraseña del nuevo usuario: ");
        String nuevaContraseña = tec.nextLine();

        System.out.print("¿El usuario estará activo? (true/false): ");
        boolean nuevoActivo = tec.nextBoolean();

        Usuario nuevoUsuario = new Usuario(nuevoId, nuevoNombre, nuevoApellido, nuevaContraseña, nuevoActivo);
        listaUsuarios.add(nuevoUsuario);

        System.out.println("Usuario creado correctamente.");
        escribirUsuariosEnArchivo(listaUsuarios);

    }

    public static void editarUsuario(List<Usuario> listaUsuarios, Scanner tec) {
        System.out.print("Ingrese el ID del usuario que desea editar: ");
        int idUsuario = tec.nextInt();

        boolean usuarioEncontrado = false;

        for (Usuario usuario : listaUsuarios) {
            if (usuario.getId() == idUsuario) {
                System.out.println("Usuario encontrado. Ingrese los nuevos datos:");

                System.out.print("Nuevo nombre: ");
                usuario.setNombre(tec.next());

                System.out.print("Nuevo apellido: ");
                usuario.setApellido(tec.next());

                System.out.print("Nueva contraseña: ");
                usuario.setPassword(tec.next());

                System.out.print("¿El usuario estará activo? (true/false): ");
                usuario.setActivo(tec.nextBoolean());

                usuarioEncontrado = true;
                break;
            }
        }

        if (usuarioEncontrado) {
            System.out.println("Usuario editado correctamente.");
            escribirUsuariosEnArchivo(listaUsuarios);
        } else {
            System.out.println("No se encontró un usuario con ese ID.");
        }

    }

    private static void escribirUsuariosEnArchivo(List<Usuario> listaUsuarios) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter("C:\\fileReadJava\\usuarios.txt"))) {
            for (Usuario usuario : listaUsuarios) {
                escritor.write(usuario.getId() + ":" + usuario.getNombre() + ":" + usuario.getApellido() + ":" + usuario.getPassword() + ":" + (usuario.isActivo() ? "1" : "0"));
                escritor.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}