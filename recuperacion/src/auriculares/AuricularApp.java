package auriculares;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AuricularApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<Auricular> listaAuriculares= new ArrayList<Auricular>();
		Auricular au01 = new Auricular();
		System.out.println(au01);
		
		Auricular au02 = new Auricular("C700N","Sony",89.99,100);
		System.out.println(au02);
		
		// cargar lista de auriculares desde un fichero
		FileReader fichero= new FileReader("auriculares.txt");
		BufferedReader lectxt= new BufferedReader(fichero);
		String linea=lectxt.readLine();
		while (linea!=null) {
			String[] parte= linea.split(";");
			
			double precio = Double.parseDouble(parte[2]);
	        int stock = Integer.parseInt(parte[3]);
	        
			Auricular au03 = new Auricular(parte[0],parte[1],precio,stock);
			
			linea=lectxt.readLine();
		}
		
		
	}

}
