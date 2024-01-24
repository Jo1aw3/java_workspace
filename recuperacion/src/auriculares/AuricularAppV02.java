package auriculares;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AuricularAppV02 {

    public static void main(String[] args) {
        List<Auricular> listaAuriculares = new ArrayList<>();

        try (FileReader fichero = new FileReader("C:\\fileReadJava\\auriculares.txt");
             BufferedReader leertxt = new BufferedReader(fichero)) {

            String linea = leertxt.readLine();

            while (linea != null) {
                String[] parte = linea.split(";");
                if (parte.length == 4) { // Verificar que haya 4 partes en la línea
                    // Crear un objeto Auricular y agregarlo a la lista
                    Auricular auricular = new Auricular(parte[0], parte[1], Double.parseDouble(parte[2]), Integer.parseInt(parte[3]));
                    listaAuriculares.add(auricular);
                } else {
                    System.out.println("Formato incorrecto en la línea: " + linea);
                }

                linea = leertxt.readLine(); // Leer la siguiente línea
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Imprimir la lista de auriculares
        for (Auricular auricular : listaAuriculares) {
            System.out.println(auricular.toString());
        }
    }
}