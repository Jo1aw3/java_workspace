package biblioteca;

import java.util.ArrayList;

public class PublicacionMain {
	
	public static int cuentaPrestamos(Object[] lista) {
		int contador = 0;
		for (Object obj : lista) {
			if (obj instanceof Prestable && ((prestable) obj).prestado()) {
				contador++;
			}
		}
		return contador;
	}
	
	public static int publicacionesAnterioresA(Publicacion[] lista, int año) {
		int contador = 0;
		for (Publicacion p : lista) {
			if (p.getAño() < año) {
				contador++;
			}
		}
		return contador;
	}
	
	public static void main(String[] args) {
		
		Publicacion[] biblioteca = {
				new Libro("a11","libro1",1999, false),
				new Revista("a12","revista1",2016,321),
				new Libro("a13","libro1",2015, false),
				new Revista("a14","revista2",2020,321),
		};
		
		Libro libro01 = (Libro) biblioteca[0];
		
		1.prestar;
		
		for (Publiacion : biblioteca) {
			System.out.println(p);
		}
		System.out.println(publicacionesAnteriores(biblioteca, 1990));
		System.out.println(publicacionesAnteriores(biblioteca));
		
	}

}
