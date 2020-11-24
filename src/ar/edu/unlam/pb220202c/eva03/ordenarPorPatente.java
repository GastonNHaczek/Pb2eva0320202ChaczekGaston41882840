package ar.edu.unlam.pb220202c.eva03;

import java.util.Comparator;

public class ordenarPorPatente implements Comparator<Vehiculo> {



	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		// TODO Auto-generated method stub
		String patente1=o1.getPatente();
		String patente2=o2.getPatente();
		
		return patente1.compareTo(patente2);
	}

}
