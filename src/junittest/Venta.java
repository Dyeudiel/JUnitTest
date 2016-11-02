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
<<<<<<< HEAD
    
	
	public float calcularprecio(float precio) throws Exception{
            
		return precio*peso;
            
    }        
        
=======
        
        private float precio;
	
	public float calcularprecio(float precio) throws Exception{
            
            return precio*peso;
            
        }        
        
        private float existencias;
	
	public float compararExistencias(float existecias) throws Exception{
           return existecias;
        }
>>>>>>> c91ce0b72aa4e2ca54ddca027ae5bcc6f52842a0
}
