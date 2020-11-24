package ar.edu.unlam.pb220202c.eva03;

public class Automovil extends Vehiculo {

	private static Integer limiteVelocidad=130;
	public Automovil(String patente, Integer VelocidadActual) {
		super(patente, VelocidadActual, limiteVelocidad);
		// TODO Auto-generated constructor stub
	}
	
	//Si es necesario Utilice herencia o implemente de Interfaces
//	Se debe crear contructeres getters y Setters y loos que crean convenientes
	
//el Limite de velociadad para autos es de 130km
//en caso que supere dicho limite el este sera multado

}
