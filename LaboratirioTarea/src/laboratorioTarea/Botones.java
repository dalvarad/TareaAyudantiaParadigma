package laboratorioTarea;

public class Botones {
	
	protected int ancho;
	protected int largo;
	protected int num;
	
	public Botones (int ancho, int largo, int num){
		this.ancho = ancho;
		this.largo = largo;
		this.num = num;
	}
	
	public int getAncho(){
		return ancho;
	}
	
	public int getLargo(){
		return largo;
	}
	
	public int getNum(){
		return num;
	}
	
	public void mostrarBoton(){
		System.out.println("Ancho: "+getAncho()+ "Largo: "+getLargo()+ "Numero: "+getNum());
	}
	
	

}
