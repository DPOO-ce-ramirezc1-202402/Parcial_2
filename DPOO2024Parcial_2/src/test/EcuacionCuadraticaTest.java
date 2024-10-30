package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logica.Parcial;

class EcuacionCuadraticaTest {

	
	private Parcial ec;
	
	@BeforeEach
	public void setUp() {
		this.ec = new Parcial();
	}
	
	@Test
	public void coeficienteAIgualACero () {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> this.ec.calcularRaices(0,-2,-3));
		assertEquals("El valor de a no puede ser igual a 0.", exception.getMessage());
	}
	
	@Test
	public void discrimintanteIgualACero() {
		double [] esperado = {-0.5, -0.5};
		double [] resultado = ec.calcularRaices(4, 4, 1);
		
		assertArrayEquals(esperado, resultado);
	}
	
	@Test
	public void discriminanteNegativo() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> this.ec.calcularRaices(1,-4,5));
		assertEquals("La ecuacion tiene discriminante negativo, por tanto raices imaginarias", exception.getMessage());
	}
	
	@Test
	public void discriminantePostitivo() {
		double [] esperado = {2.0, 1.0};
		double [] resultado = ec.calcularRaices(1, -3, 2);
		
		assertArrayEquals(esperado, resultado);
	}

}
