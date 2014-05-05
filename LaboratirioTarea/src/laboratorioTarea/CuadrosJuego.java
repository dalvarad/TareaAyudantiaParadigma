package laboratorioTarea;

public class CuadrosJuego extends Botones {
	 private String col;
	 
	 public CuadrosJuego(int ancho, int largo, int num){
		 super(ancho,largo,num);
		 col = "DESCONOCIDO";
	 }
	 
	 public void setCol(String col){
		 this.col = col;		 
	 }
	
	 public String getCol(){
		 return col;		 
	 }
	 
	 public void mostrarCuadroJuego(){
			System.out.println("Ancho: "+getAncho()+ "Largo: "+getLargo()+ "Numero: "+getNum()+ "Color: "+getCol() );
	}
}