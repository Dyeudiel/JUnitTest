/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junittest.Venta;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class TestVenta {
	private Venta venta;
	
	public TestVenta(){
		venta = new Venta();
	}
	
	// TODO add test methods here.
	// The methods must be annotated with annotation @Test. For example:
	//
	// @Test
	// public void hello() {}
	
	@Test
	public void pruebaCalculo() throws Exception{
		venta.fijarPeso((float) 5.2);
		float precioTotal = venta.calcularprecio(250);
		
		assertTrue(precioTotal>0);
	}
	
	@Test
	public void pruebaPeso0() {
		
		try {
			venta.fijarPeso((float) 0);
			fail("No se lanzó la excepción");
		} catch (Exception ex) {
			assertEquals(Venta.errorCalculoPeso, ex.getMessage());
		}
	}
	
	@Test
	public void validarExistencias(){
		float existencias = venta.obtenerExistencias();
		float peso = 25;
		
		assertTrue(peso < existencias);
	}
	
	@Test
	public void validarExistencias0(){
		float existencias = venta.obtenerExistencias();
		float peso = 3501;
		
		assertTrue(peso >= existencias);
	}
}
