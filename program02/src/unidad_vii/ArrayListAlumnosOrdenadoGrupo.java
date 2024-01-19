package unidad_vii;

import java.util.ArrayList;

public class ArrayListAlumnosOrdenadoGrupo extends AlumnoU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<AlumnoU> arlist = new ArrayList<AlumnoU>();
		arlist.add(new AlumnoU());
		
		for (int posicion = 0; posicion < arlist.size(); posicion++) {
			System.out.println("alumno: " + arlist.get(posicion));
		}
		
	}

}
