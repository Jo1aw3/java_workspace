package clases;

public class Recuento {

	//(static)
	private static int recuento = 0;
	
	//constructor predeterminado
	Recuento(){
		recuento++;
		}

	public void finalize(){
		recuento--;
		}
	
	public static int getRecuento() {
		return recuento;
	}

	public static void setRecuento(int recuento) {
		Recuento.recuento = recuento;
	}

	public void escribirRecuento(){
		System.out.println("Hay "+recuento+" objetos de la clase.");
		}

	
}
