package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListCadenasIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//03

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
	
	Iterator<String> it = arlist.iterator();
	String valor = "";
	while(it.hasNext()) {
		valor = it.next();
		System.out.println(valor);
		
	}
	
	tec.close();
	}

}
