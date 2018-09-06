package Vista;

import javax.swing.JOptionPane;

public class Interfaz {

	public Interfaz() 
	{
		// TODO Auto-generated constructor stub
		
	}

	/* metodo de prueba que pide un dato por JOptionPane y retorna el String correspondiente
	 * Reemplazar por lo que se necesiten
	 */
	
	public String pedirLado() 
	{
		return (JOptionPane.showInputDialog(null,"Ingrese el Lado","Titulo del InputDialog",JOptionPane.INFORMATION_MESSAGE));
	}
	
	public String pedirRadio() 
	{
		return (JOptionPane.showInputDialog(null,"Ingrese Radio","Titulo del InputDialog",JOptionPane.INFORMATION_MESSAGE));
	}

	
	
	/* metodo de prueba que imprime un dato procesado por un método declarado en 
	 * Reemplazar por lo que se necesiten
	 */

	public void escribirResultado(String dato) 
	{
		JOptionPane.showMessageDialog(null, dato, "Título del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
	}
}
