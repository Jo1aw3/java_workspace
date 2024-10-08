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
//                double calorias = Double.parseDouble(parte[2]);
//                double grasas = Double.parseDouble(parte[3]);
//                double proteinas = Double.parseDouble(parte[4]);
//                double carbohidratos = Double.parseDouble(parte[5]);
                double calorias = Double.parseDouble(parte[2].replace(",", "."));
                double grasas = Double.parseDouble(parte[3].replace(",", "."));
                double proteinas = Double.parseDouble(parte[4].replace(",", "."));
                double carbohidratos = Double.parseDouble(parte[5].replace(",", "."));
                
                Alimento alimento = new Alimento(parte[0], parte[1], calorias, grasas, proteinas, carbohidratos, parte[6]);
                    
                listaAlimentos.add(alimento);
                linea = leertxt.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
		
        Scanner tec = new Scanner(System.in);
        // genero variables para las distintas opciones del menu
        int menuNum = 0;
        String nombreAlimento;
        String estadoAlimento;
        double gramosAlimento;
        
        do {
        	
//        	for (Alimento alimento : listaAlimentos) {
//	            System.out.println(alimento.toString());
//	        }
        	
        	System.out.println("1 buscador de alimentos");
        	System.out.println("2 mostrar alimento por id");
        	System.out.println("3 calcular calorias");
        	System.out.println("0 salir");
        	
        	menuNum = tec.nextInt();
        	switch (menuNum) {
        		case 1:
        			boolean binAlimento = false;
        			System.out.println("que alimento buscas?");
        			tec.nextLine();
        			nombreAlimento = tec.nextLine();
        			
        			System.out.println("buscando.. " + nombreAlimento);
        			for (Alimento alimento : listaAlimentos) {
        				if (alimento.getNombre().equals(nombreAlimento)) {
        					binAlimento = true;
        					break;
        				}
        			}
        			
        			if (binAlimento) {
        				System.out.println("si existe: " + nombreAlimento);
        			} else {
        				System.out.println("no existe: " + nombreAlimento);
        			}
        			
        			break;
        		case 2:
        			int idAlimento;
        			System.err.println("numero de alimentos: " + (listaAlimentos.size() - 1));
        			System.out.println("id del alimento que quieres mostrar: ");
        			idAlimento = tec.nextInt();
        			
        			if (idAlimento >= listaAlimentos.size() || idAlimento <= 0) {
        				System.out.println("id inreconosible");
        			} else {
        				System.out.println(listaAlimentos.get(idAlimento));
        			}
        			
        			break;
        		case 3:
        			boolean binCalorias = false;
        			System.out.println("que alimento buscas?");
        			tec.nextLine();
        			nombreAlimento = tec.nextLine();
        			System.out.println("cual es su estado?");
        			estadoAlimento = tec.next();
        			System.out.println("cuantos gramos tiene?");
//        			¿me produce un error a la hora de guardar los gramos en la variable?
        			gramosAlimento = tec.nextDouble();
        			
        			System.out.println("calculando.. " + nombreAlimento +  ": " + estadoAlimento + ", " + gramosAlimento + "g");
        			for (Alimento alimento : listaAlimentos) {
        				if (alimento.getNombre().equals(nombreAlimento) && alimento.getEstado().equals(estadoAlimento) && alimento.getGrasas() == gramosAlimento) {
        					System.out.println("calorias: " + alimento.getCalorias());
        					binCalorias = true;
        					break;
        				}
        			}
        			
        			if (!binCalorias) {
        				System.out.println("no se ha encontrado el calculo");
        			}
        			
        			break;
        		case 0:
        			System.out.println("hasta luego!");
        			System.exit(0);
        		default:
        			System.out.println("no exixte la opcion " + menuNum);
        	}
        	
        } while (menuNum != 0);
        
        tec.close();
	}

}