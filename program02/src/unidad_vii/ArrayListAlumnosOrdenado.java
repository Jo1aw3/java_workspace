package unidad_vii;

import java.util.ArrayList;

public class ArrayListAlumnosOrdenado extends AlumnoU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<AlumnoU> arlist = new ArrayList<AlumnoU>();
		arlist.add(new AlumnoU());
		arlist.add(new AlumnoU());
		arlist.add(new AlumnoU());
		arlist.add(new AlumnoU());
		
		/*
		Collections.sort(arlist, new Comparator<Alumno>() {
			@Override
			public int compare(Alumno p1, Alumno p2) {
				int comparacion;
				comparacion = g1.compareTo(g2);
				if (comparacion == 0) {
					comparacion = a1.compareTo(a2);
				}
				return (comparacion--);
			}
		});
		*/
		
		for (int posicion = 0; posicion < arlist.size(); posicion++) {
			System.out.println("alumno: " + arlist.get(posicion));
		}
		
	}

}
