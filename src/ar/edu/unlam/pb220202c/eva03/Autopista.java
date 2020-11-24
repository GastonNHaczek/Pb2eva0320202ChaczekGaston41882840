package ar.edu.unlam.pb220202c.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Autopista {
	//Si es necesario Utilice herencia o implemente de Interfaces
	//Se debe crear contructeres getters y Setters y los atributos o metodos que crean convenientes
	private HashMap <Integer,Vehiculo> telapase;
	private HashSet <Vehiculo> vehiculosEnCirculacion;
	private String nombre;
	public Autopista(String nombre) {
		this.nombre=nombre;
		telapase=new HashMap<Integer,Vehiculo>();
		vehiculosEnCirculacion=new HashSet<Vehiculo>();
	}
	
	public Boolean registrarTelepase (Integer numeroTelpase, Vehiculo vehiculo) {
		telapase.put(numeroTelpase, vehiculo);
		if(telapase.containsKey(numeroTelpase)) {
			
			return true;
		}
		return false;
	}
	public Boolean ingresarAutopista (Integer numeroTelepase) throws VehiculoNotFounException{
		//si el telepase no esta registrado lanza una Exceptios del tipo VehiculoNotFounException
		if(telapase.containsKey(numeroTelepase)) {
			vehiculosEnCirculacion.add(telapase.get(numeroTelepase));
			return true;
		}else {
			throw new VehiculoNotFounException("el telepase no esta registrado");
		}
	   // y no permite ingresar al autopista	
	}
	
	public void salirAutpista (Vehiculo vehiculo) throws VehiculoNotFounException{
		//lanza Una exception VehiculoNotFounException si no esta en circulacion
		if(!vehiculosEnCirculacion.contains(vehiculo))
			throw new VehiculoNotFounException("el vehiculo no esta en circulacion");
	}
	
	public TreeSet<Vehiculo> obtenerVehiculosConExcesosDeVelocidadOrdenadosPorPatente(){
		TreeSet<Vehiculo> vehiculosEnInfracion = new TreeSet<Vehiculo>(new ordenarPorPatente());
		for (Vehiculo vehiculo : vehiculosEnCirculacion) {
			if(vehiculo.enInfraccion()) {
				vehiculosEnInfracion.add(vehiculo);
			}
				
		}
	
		return vehiculosEnInfracion;
    }

	public Integer cantidadDeVehiculosENCirculacion() {
	
		return vehiculosEnCirculacion.size();
	}
}
