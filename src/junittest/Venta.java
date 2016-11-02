package junittest;

public class Venta {
	private float peso;
	private float precio;
	
	
	public void fijarPeso(float peso) throws Exception{
		if(peso == 0){
			throw new Exception("Ummm");
		}
		
		this.peso = peso;
	}
    
	
	public float calcularprecio(float precio) throws Exception{
            
		return precio*peso;
            
    }        
        
}
