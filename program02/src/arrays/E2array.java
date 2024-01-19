package arrays;

import java.util.Scanner;

public class E2array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//complete
		
		
		int menu = 0;
		int Nnombre = 0;
		String nombre;
		Scanner tec = new Scanner(System.in);
		
		String[] arn = new String[5];
		arn[0] = "popeye";
		arn[1] = "alex";
		arn[2] = "angie";
		arn[3] = "lucas";
		arn[4] = "alex";
		
		do {
			System.out.println("_ _ _ _ _ _ _ _ _ _");
			System.out.println("1 salir");
			System.out.println("2 mostrar lista de nombres");
			System.out.println("3 pedir nombre y contar las veces que aparece");
			System.out.println("4 pedir nombre y decir si existe");
			System.out.println("5 eliminar nombre de la lista");
		
			menu = tec.nextInt();
			
			switch (menu) {
				//salir
				case 1:
					System.exit(0);
					break;
					
				//lista de nombre
				case 2:
					for (int celda = 0;celda<arn.length;celda++) {
						if (arn[celda] != null) {
							System.out.println(arn[celda]);
						}
					}
					break;
					
				//contar veces
				case 3:
					System.out.println("introduce el nombre que quieres buscar");
					nombre = tec.next();
					
					for (int celda = 0; celda<arn.length;celda++) {
						if (arn[celda].equals(nombre)) {
							Nnombre = Nnombre + 1;
						}
					}
					System.out.println("el nombre " + nombre + " aparece " + Nnombre + " veces");
					break;
					
				//decir si existe
				case 4:
					System.out.println("introduce el nombre que quieres buscar");
					nombre = tec.next();
					
					for (int celda = 0; celda<arn.length;celda++) {
						if (arn[celda].equals(nombre)) {
							Nnombre = 1;
						}
					}
					if (Nnombre == 1) {
						System.out.println("el nombre " + nombre + " si existe");
					}
					else {
						System.out.println("el nombre " + nombre + " no existe");
					}
					break;
					
				//eliminiar nombre
				case 5:
					System.out.println("introduce el nombre que quieres eliminar");
					nombre = tec.next();
					
					for (int celda = 0; celda<arn.length;celda++) {
						if (arn[celda].equals(nombre)) {
							arn[celda] = null;
						}
					}
					break;
			}
		} while (menu !=1);
		tec.close();
	}

}
