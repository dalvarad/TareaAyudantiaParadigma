package laboratorioTarea;

public class Main {

	public static void main(String[] args) {
		CuadrosJuego cuadroJuego1 = new CuadrosJuego(4,6,20);
		Cuadros cuadro1 = new Cuadros(7,3,1);
		
		cuadroJuego1.setCol("AMARILLO");
		cuadro1.setDial("Bienvenido al Juego");
		
		cuadroJuego1.mostrarCuadroJuego();
		cuadro1.mostrarBoton();
		
		
	}

}
