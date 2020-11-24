package ar.edu.unlam.pb220202c.eva03;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.TreeSet;

import org.junit.Test;

public class TestAutoPista {
	
	@Test
	public void queSePuedaRegistrarTelepase () {
		Autopista sol =new Autopista("El sol");
		Automovil fitito=new Automovil("PTE123",0);
		Integer numeroTelpase=123;
		assertTrue(sol.registrarTelepase(numeroTelpase, fitito));
		
	}
	
	@Test(expected = VehiculoNotFounException.class)
	public void queAlSalirDelAutopistaNoestaEncirculacionLanceUnaExcepcion()throws VehiculoNotFounException {
		Autopista sol =new Autopista("El sol");
		Automovil fitito=new Automovil("PTE123",0);
		Integer numeroTelpase=123;
		sol.registrarTelepase(numeroTelpase, fitito);
		sol.salirAutpista(fitito);
	}
	@Test
	public void queVerifiqueQueSeObtengaUnaListaDeAutosInsfractoresOrdenadaPorPatente() throws VehiculoNotFounException{
		Autopista sol =new Autopista("El sol");
		Automovil fitito=new Automovil("PTE123",0);
		Automovil ford=new Automovil("APE123",0);
		Integer numeroTelpaseFitito=123;
		Integer numeroTelpaseFord=124;
		sol.registrarTelepase(numeroTelpaseFitito, fitito);
		sol.registrarTelepase(numeroTelpaseFord, ford);
		sol.ingresarAutopista(numeroTelpaseFord);
		sol.ingresarAutopista(numeroTelpaseFitito);
		
		fitito.setVelocidadActual(150);
		ford.setVelocidadActual(190);
	
		
		TreeSet <Vehiculo> vehiculosEnInfraccion= sol.obtenerVehiculosConExcesosDeVelocidadOrdenadosPorPatente();
		
		
		assertEquals(fitito,vehiculosEnInfraccion.last());
		assertEquals(ford,vehiculosEnInfraccion.first());
		
	}
	@Test(expected = VehiculoNotFounException.class)
	public void queElTelePaseNoEsteRegistrado() throws VehiculoNotFounException {
		Autopista sol =new Autopista("El sol");
		Automovil fitito=new Automovil("PTE123",0);
		Automovil ford=new Automovil("APE123",0);
		
		sol.ingresarAutopista(123);
		
	}
	@Test
	public void queSeAgreguenVehiculosEnCirculacion() throws VehiculoNotFounException {
		Autopista sol =new Autopista("El sol");
		Automovil fitito=new Automovil("PTE123",0);
		Automovil ford=new Automovil("APE123",0);
		Integer numeroTelpaseFitito=123;
		Integer numeroTelpaseFord=124;
		sol.registrarTelepase(numeroTelpaseFitito, fitito);
		sol.registrarTelepase(numeroTelpaseFord, ford);
		
		sol.ingresarAutopista(numeroTelpaseFord);
		sol.ingresarAutopista(numeroTelpaseFitito);
		
		assertEquals(2,sol.cantidadDeVehiculosENCirculacion(),0.0);
		
	}
	
}
