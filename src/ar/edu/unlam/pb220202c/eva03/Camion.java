package ar.edu.unlam.pb220202c.eva03;

public class Camion extends Vehiculo {
	private static Integer limiteVelocidad=80;
	
	public Camion(String patente, Integer VelocidadActual, Integer cantidadDeEjes) {
		super(patente, VelocidadActual, limiteVelocidad);
		// TODO Auto-generated constructor stub
		this.cantidadDeEjes=cantidadDeEjes;
	}

	public Integer getCantidadDeEjes() {
		return cantidadDeEjes;
	}

	//Si es necesario Utilice herencia o implemente de Interfaces
	//Se debe crear contructeres getters y Setters y los que crean conveniente
	private Integer cantidadDeEjes;
	//el Limite de velociadad para autos es de 80km
	//en caso que supere dicho limite el este sera multado

	
	
}
