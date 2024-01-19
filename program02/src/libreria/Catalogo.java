package libreria;

import java.util.ArrayList;

public class Catalogo {

	ArrayList<Publicacion> lista = new ArrayList<Publicacion>();
	
	//Scanner tec = new Scanner(System.in);
	
	public void fillData() {
		Revista r1 = new Revista("pb1","geografia",2007,4);
		lista.add(r1);
		Revista r2 = new Revista("pb2","ciencias",2010,2);
		lista.add(r2);
		Revista r3 = new Revista("pb3","moda",2020,6);
		lista.add(r3);
		Revista r4 = new Revista("pb4","sistema",2019,8);
		lista.add(r4);
		Libro l1 = new Libro("pb5","principito",1990,200);
		lista.add(l1);
		Libro l2 = new Libro("pb6","azul",1997,150);
		lista.add(l2);
		Libro l3 = new Libro("pb7","hobbit",1945,300);
		lista.add(l3);
		Libro l4 = new Libro("pb8","dune",2016,500);
		lista.add(l4);
	}
	
	
	public ArrayList<Publicacion> getLista() {
		return lista;
	}
	public void setLista(ArrayList<Publicacion> lista) {
		this.lista = lista;
	}


	public int posicionPublicacion() {
		for (int posicion = 0; posicion < lista.size(); posicion++) {
			//falta algo
		}
		return 0;
			
	}
}
