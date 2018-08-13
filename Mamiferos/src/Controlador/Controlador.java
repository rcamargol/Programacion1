package Controlador;

import Modelo.Mundo;

public class Controlador {
	
	private static Mundo m;

	public Controlador() 
	{
		// TODO Auto-generated constructor stub
		m = new Mundo();
		m.getCanino("Cocker", 4);
		m.getFelino("Tigre", 4);
		/*m.getCanino().hacerSonido();
		m.getFelino().alimentar();
		m.getFelino().hacerSonido();*/
	}

}
