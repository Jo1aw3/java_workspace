package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//01
		
	ArrayList<String> arlist = new ArrayList<String>();
	
	String palabra;
	Scanner tec = new Scanner(System.in);
	System.out.println("introduce palabra: ");
	palabra = tec.nextLine();
	while (!palabra.isEmpty()) {
		arlist.add(palabra);
		System.out.println("introduce palabra: ");
		palabra = tec.nextLine();
	}
	
	for (int posicion = 0; posicion < arlist.size(); posicion++) {
		System.out.println(arlist.get(posicion));
	}
	
	tec.close();
	}

}
