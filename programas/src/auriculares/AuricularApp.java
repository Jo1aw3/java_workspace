package auriculares;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AuricularApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		Auricular test01 = new Auricular();
//		System.out.println(test01);
//		
//		Auricular test02 = new Auricular("C700N","Sony",89.99,100);
//		System.out.println(test02);
		
		
		// cargar desde el fichero la lista de audiculares
		
		
		// Definimos un ArrayList para guardar los objetos que instanciaremos para guardar cada una de las lineas leídas del texto
		List<Auricular> listaAuriculares = new ArrayList<>();
		
		// con FileReader tomo la ruta del txt que quiero leer y lo guardo en una variable
		FileReader fichero = new FileReader("C:\\fileReadJava\\auriculares.txt");
		// leeo el contenido del txt y lo cargo en el buffer guardandolo en otra variable
		@SuppressWarnings("resource")
		BufferedReader leertxt = new BufferedReader(fichero);
		
		// con el buffer ya cargado, guardare la primera linea del txt en un String con '.readLine'
		// es recomendado que leertxt se cierre con un try-catch, esto se puede ver en la V02
		String linea = leertxt.readLine();
		
		// con un bucle while recorrere todo el texto hasta que las lineas se terminen
		while (linea != null) {
			// con un array guardare cada palabra de la linea delimitados con el punto y coma 
			String[] parte = linea.split(";");
			
			// tenemos numeros dentro del archivo (el precio, y el stock) pero el txt es un editor de texto
			// es necesesario convertir el formato de texto a numeros reales
			double precio = Double.parseDouble(parte[2]);
			// es necesesario convertir el formato de texto en numeros enteros
	        int stock = Integer.parseInt(parte[3]);
	        
	        // instanciamos un nuevo obeto (auriculares) de nuestra clase Auricular, introduciendo en el las cosas que se guardaron en el array
			Auricular auriculares = new Auricular(parte[0], parte[1], precio, stock);
			
			// añadimos el objeto dentro del ArrayList anteriormente definida
			listaAuriculares.add(auriculares);
			
			// leemos la siguiente linea (¿en que momento baja la linea?)
			linea = leertxt.readLine();
		}
		
		// con ayuda de un for mostramos por pantalla el ArrayList que contiene cada una de los objetos que se generaron en el while, imprimiendolos con el metodo toString de nuestra clase Auricular
		for (Auricular auriculares : listaAuriculares) {
			System.out.println(auriculares.toString());
		}
		
	}

}
