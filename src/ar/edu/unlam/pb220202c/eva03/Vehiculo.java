package ar.edu.unlam.pb220202c.eva03;

public class Vehiculo implements Imultable{

	//Se debe crear contructeres getters y Setters y loos que crean convenientes
	
	private String Patente;
	private Integer VelocidadActual;
	public Integer getVelocidadActual() {
		return VelocidadActual;
	}

	public void setVelocidadActual(Integer velocidadActual) {
		VelocidadActual = velocidadActual;
	}

	private Integer limiteVelocidad;
	
	public Vehiculo (String patente,Integer VelocidadActual,Integer limiteVelocidad) {
		this.Patente=patente;
		this.VelocidadActual=VelocidadActual;
		this.limiteVelocidad=limiteVelocidad;
	}

	public Integer velocidadActual() {
		return this.VelocidadActual;
	}
	public void incrmentarVelocidad(Integer Velocidad) {
		this.VelocidadActual=Velocidad;
	}

	@Override
	public Boolean enInfraccion() {
		if(this.VelocidadActual>this.limiteVelocidad)
			return true;
		return false;
	}

	public String getPatente() {
		return Patente;
	}
}
