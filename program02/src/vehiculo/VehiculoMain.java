package vehiculo;

import java.util.ArrayList;

public class VehiculoMain {

	public static void main(String[] args) {

		ArrayList<Vehiculo> arlist = new ArrayList<Vehiculo>();
		
		Bici b1 = new Bici("Yamaha", 0, 70);
		arlist.add(b1);
		Moto m1 = new Moto("Zuzuki", 100, 225);
		arlist.add(m1);
		Coche c1 = new Coche("BMW M3", 150, 300);
		arlist.add(c1);
		
		for (int posicion = 0; posicion < arlist.size(); posicion++) {
			System.out.println(arlist.get(posicion));
			arlist.get(posicion).iniciarDesplazamiento();
			arlist.get(posicion).finalizarDesplazamiento();
		}
		
	}

}
