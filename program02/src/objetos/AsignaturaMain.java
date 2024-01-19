package objetos;

public class AsignaturaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Asignatura a1 = new Asignatura();
		System.out.println(a1);
		Asignatura a2 = new Asignatura("0119A","opinion constructiva", 5.0);
		System.out.println(a2);
		Asignatura a3 = new Asignatura(a2);
		System.out.println(a3);
		
		//equals
		if (a1.equals(a2)) {
			System.out.println(a1 + " y " + a2 + " son iguales ");
		}
		else {
			System.out.println(a1 + " y " + a2 + " no son iguales ");
		}
		//compareTo
		a2.setCodigo("ED"); //cambio el atributo de codigo en a2
		if (a2.compareTo(a3) > 0) {
			System.out.println(a2 + " es mayor que " + a3);
		}
		else if (a2.compareTo(a3) < 0) {
			System.out.println(a2 + " es menor que " + a3);
		}
		else {
			System.out.println(a2 + " es igual que " + a3);
		}
		
	}

}
