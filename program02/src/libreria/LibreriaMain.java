package libreria;

import java.util.Scanner;

public class LibreriaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tec = new Scanner(System.in);
		
		Socio s0 = new Socio();
		//Socio s1 = new Socio();
		
		Catalogo c0 = new Catalogo();	
		c0.fillData();
		
		int menu;
		String tipo;
		
		System.out.println("bienvenido a la libreria");
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _");
		System.out.println();
		s0.leer(tec);
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _");
		System.out.println();
		do {
			System.out.println("0 - salir");
			System.out.println("1 - mostrar catalogo");
			System.out.println("2 - alquilar algo");
			System.out.println("3 - mostrar todos los socios");
			System.out.println("4 - añadir una revista o un libro");
			System.out.println("5 - mostrar las publicaciones que tiene un socio alquiladas");
			System.out.println("¿Que quieres hacer?");
			
			menu = tec.nextInt();
			switch(menu) {
			
			case 0:
				System.exit(0);
				System.out.println("hasta pronto!");
				break;
			case 1: // mostrar el catalogo
				//for (int posicion = 0; posicion < c0.getLista().size(); posicion++) {
				//	c0.getLista().get(posicion).toString();
				//}
				break;
			case 2: //alquilar una publicacion
				System.out.println("introduce el codigo");
				
				break;	
			case 3: //mostrar todos los socios
				//for (int posicion = 0; posicion < c0.getLista().size(); posicion++) {
				
				//}
				break;
			case 4: //añadir una revista o un libro
				System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _");
				System.out.println("¿revista o libro?");
				tipo = tec.next();
				while (!tipo.equalsIgnoreCase("revista") && !tipo.equalsIgnoreCase("libro")) {
					System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _");
					System.out.println("¿revista o libro?");
					tipo = tec.next();
				}
				if (tipo.equalsIgnoreCase("revista")) {
					Revista r1 = new Revista();
					r1.leer(tec);
				}
				else {
					Libro l1 = new Libro();
					l1.leer(tec);
				}
				break;
			case 5: //mostrar las publicaciones que tiene un socio alquiladas
				
				
				break;	
			}
		} while (menu != 0);
		
	tec.close();	
	}
}
