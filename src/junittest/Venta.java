package junittest;

public class Venta {
	private float peso;
	
	public void fijarPeso(float peso) throws Exception{
		if(peso == 0){
			throw new Exception("Ummm");
		}
		
		this.peso = peso;
	}
        
        private float precio;
	
	public float calcularprecio(float precio) throws Exception{
            
            return precio*peso;
            
        }        
        
}
