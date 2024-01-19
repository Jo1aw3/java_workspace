package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCadenasForeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//02
			
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
	
	for (String cadena : arlist) {
		System.out.println(cadena);
	}
	
	tec.close();
	}

}
