package alimentos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlimentoApp {

	public static void main(String[] args) {

		List<Alimento> listaAlimentos= new ArrayList<>();

        try (FileReader fichero = new FileReader("C:\\fileReadJava\\alimentos.txt");
             BufferedReader leertxt = new BufferedReader(fichero)) {

            String linea = leertxt.readLine();

            while (linea != null) {
                String[] parte = linea.split(";");
                double calorias = Double.parseDouble(parte[2]);
                double grasas = Double.parseDouble(parte[3]);
                double proteinas = Double.parseDouble(parte[4]);
                double carbohidratos = Double.parseDouble(parte[5]);
                
                Alimento alimento = new Alimento(parte[0], parte[1], calorias, grasas, proteinas, carbohidratos, parte[6]);
                    
                listaAlimentos.add(alimento);
                linea = leertxt.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
		
        Scanner tec = new Scanner(System.in);
        int menuNum = 0;
        
        do {
        	
        	System.out.println("1 mostrar la lista de alimentos");
        	System.out.println("2 indifinido");
        	System.out.println("3 indifinido");
        	
        	menuNum = tec.nextInt();
        	switch (menuNum) {
        		case 1:
        			for (Alimento alimento : listaAlimentos) {
        	            System.out.println(alimento.toString());
        	        }
        			break;
        		case 2:
        			
        			break;
        		default:
        			
        	}
        	
        } while (menuNum != 0);
        
        tec.close();
	}

}
