package bodega;

import java.util.ArrayList;

public class ListaArticulo {

	ArrayList<Articulo> lista = new ArrayList<Articulo>(); 
	
	public void fillData () {
		// refrescos
		Refresco r1 = new Refresco("aa1","fanta","Coke",1,120,"naranja",true,true,15);
		lista.add(r1);
		Refresco r2 = new Refresco("aa1","sprite","Coke",1,150,"limon",true,true,15);
		lista.add(r2);
		Refresco r3 = new Refresco("aa1","coca-cola","Coke",2,400,"cola",false,true,15);
		lista.add(r3);
		Refresco r4 = new Refresco("aa1","pepsi","pepsico",2,500,"cola",false,true,15);
		lista.add(r4);
		// vinos
		Vino v1 = new Vino("bb1","marques","rioja",130,20,"violeta","riojano",2010,"merlot");
		lista.add(v1);
		Vino v2 = new Vino("bb1","brunello","lucere",90,25,"morado","frances",2015,"cabernet");
		lista.add(v2);
		Vino v3 = new Vino("bb1","barolo","massolino",53,40,"violeta","frances",2016,"graciano");
		lista.add(v3);
		Vino v4 = new Vino("bb1","aubert","sonoma",85,25,"morado","inglaterra",2018,"noir");
		lista.add(v4);
	}
	
	//metodo reponer, muestra los articulos cuyo stock es menor que 50
	public void reponer () {
		for (int posicion = 0; posicion < lista.size(); posicion++) {
			if (lista.get(posicion).getStock() < 50) {
				System.out.println(lista.get(posicion));
			}
		}
	}
	
	//metodo mascaro devuelve los articulos mas caros
	public void mascaro () {
		double caro = 0.0;
		for (int posicion = 0; posicion < lista.size(); posicion++) {
			if (lista.get(posicion).getPrecio() > caro) {
				lista.get(posicion).setPrecio(caro);
			}
		}
		for (int posicion = 0; posicion < lista.size(); posicion++) {
			if (lista.get(posicion).getPrecio() == caro) {
				System.out.println(lista.get(posicion));
			}
		}
	}
	
	//metodo equivalentes devuelve los articulos con el mismo precio
	public void equivalentes () {
		for (int posicion = 0; posicion < lista.size(); posicion++) {
			if (lista.get(posicion).getPrecio() == lista.get(posicion).getPrecio()) {
				System.out.println(lista.get(posicion));
			}
		}
	}
	
	//public double precio (String codigo) {
		//for (int posicion = 0; posicion < lista.size(); posicion++) {
			
		//}
	//}
}
