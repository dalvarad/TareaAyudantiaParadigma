package laboratorioTarea;

public class Cuadros extends Botones{
	private String dialogo;
	
	public Cuadros(int ancho, int largo, int num){
		super(ancho,largo,num);
		dialogo = "DESCONOCIDO";
	}
	
	public void setDial(String dialogo){
		this.dialogo = dialogo;
	}
	
	public String getDial(){
		return dialogo;
	}
	
	public void mostrarBoton(){
		System.out.println("Ancho: "+getAncho()+ "Largo: "+getLargo()+ "Numero: "+getNum()+ "Dialogo: "+getDial());
	}

}
