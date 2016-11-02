/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittest;

/**
 *
 * @author Administrator
 */
public class Venta {
	private float peso;
	
	
	public void fijarPeso(float peso) throws Exception{
		if(peso == 0){
			throw new Exception("Ummm");
		}
		
		this.peso = peso;
	}
}
