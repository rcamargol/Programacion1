package Vista;

import javax.swing.JOptionPane;

public class Interfaz {

		
	/*
	 *Responsabilidad del metodo imprimirMonto(): 
	 *Imprime el monto escrito resultante por pantalla.
	*/	
	public void imprimirMonto(String valor, String resultado)
	{
		String mensaje = "El monto escrito de: "+valor+" es:\n"+resultado;
		JOptionPane.showMessageDialog(null, mensaje, "Monto Escrito", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	//metodo auxilar que muestra una alerta por pantalla
	public void mostrarAlerta(String mensaje, String aplicacion)
	{
		JOptionPane.showMessageDialog(null, mensaje, aplicacion, JOptionPane.ERROR_MESSAGE);
	}

	
	//metodo auxilar que pide por dialogo en pantalla un número entero
	public String obtenerNumero()
	{
		return JOptionPane.showInputDialog(null, "Digite Número");
	}
	

}
