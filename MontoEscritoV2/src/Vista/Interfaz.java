package Vista;

import javax.swing.JOptionPane;

import Modelo.BD;

public class Interfaz {

	public void solicitarNumero(BD bd)
	{
		int n=0;
		
		n = obtenerEntero("Ingrese un Valor");
		
		if (!validarNumero(n))
			mostrarAlerta("Número Fuera de Rango",bd.getNombreApp());
		else
			bd.setValor(n);
	}
	
	//metodo auxiliar que valida si el número ingresado está en el rango indicado 
	public boolean validarNumero(int n)
	{
		if (n >= 0 && n<= 99)
			return true;
		else
			return false;
	}
		
	/*
	 *Responsabilidad del metodo imprimirMonto(): 
	 *Imprime el monto escrito resultante por pantalla.
	*/	
	public void imprimirMonto(BD bd)
	{
		String mensaje = "El monto escrito de: "+bd.getValor()+" es:\n"+bd.getMonto();
		JOptionPane.showMessageDialog(null, mensaje, bd.getNombreApp(), JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	//metodo auxilar que muestra una alerta por pantalla
	public void mostrarAlerta(String mensaje, String aplicacion)
	{
		JOptionPane.showMessageDialog(null, mensaje, aplicacion, JOptionPane.ERROR_MESSAGE);
	}

	
	//metodo auxilar que pide por dialogo en pantalla un número entero
	public int obtenerEntero(String mensaje)
	{
		String cad = JOptionPane.showInputDialog(null, mensaje);
		if (cad != null)
			return Integer.parseInt(cad);
		else
			return -1;
	}
	

}
