package objetos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ComplejoMainSerializable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileOutputStream fos;
		ObjectOutputStream oos;
		Complejo c;
		
		try {
			fos = new FileOutputStream("complejos.dat");
			oos = new ObjectOutputStream(fos);
			
			c = new Complejo(5,7);
			
			oos.writeObject(c);
			oos.close();
			fos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FileInputStream fis;
		ObjectInputStream ois;
		try {
			fis = new FileInputStream("complejos.dat");
			ois = new ObjectInputStream(fis);
			c = (Complejo) ois.readObject();
			ois.close();
			fis.close();
			System.out.println("valor leido: " + c);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace(); 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}	

}
