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
		return (JOptionPane.showInputDialog(null,"Ingrese lado:","Interfaces",JOptionPane.INFORMATION_MESSAGE));
	}
	
	public String pedirRadio() 
	{
		return (JOptionPane.showInputDialog(null,"Ingrese Radio","Interfaces",JOptionPane.INFORMATION_MESSAGE));
	}
	
	/* metodo de prueba que imprime un dato procesado por un método declarado en 
	 * Reemplazar por lo que se necesiten
	 */

	public void imprimirResultado(String figura, double area,double perimetro) 
	{
		JOptionPane.showMessageDialog(null, area, "Area de "+ figura, JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, perimetro, "Perímetro de "+ figura, JOptionPane.INFORMATION_MESSAGE);
	}
}
