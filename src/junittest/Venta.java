package junittest;

public class Venta {
	private float peso;
	private float precio;
	
	public static String errorCalculoPeso = "El peso indicado debe ser superior a 0";
	
	public void fijarPeso(float peso) throws Exception{
		if(peso == 0){
			throw new Exception(Venta.errorCalculoPeso);
		}
		
		this.peso = peso;
	}
	
	public float calcularprecio(float precio) throws Exception{
		return precio*peso;    
    }        
        
    private float existencias = 3500;
	
	public float obtenerExistencias(){
		return existencias;
    }

}
