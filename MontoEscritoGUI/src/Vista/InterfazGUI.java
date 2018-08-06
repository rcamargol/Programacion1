package Vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import Controlador.Controlador;

public class InterfazGUI extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PanelEntrada panelEntrada;
	private PanelResultados panelResultados;
	
	public InterfazGUI(Controlador control)
	{
		setTitle("Conversor a Monto Escrito");
		setSize(400,300);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout( new BorderLayout() );
		setLocationRelativeTo(null);
		
		panelEntrada = new PanelEntrada(control);
		add(panelEntrada,BorderLayout.NORTH);
		
		panelResultados = new PanelResultados();
		add(panelResultados,BorderLayout.CENTER);
	}
	
	public PanelEntrada getPanelEntrada()
	{
		return panelEntrada;
	}
	
	public PanelResultados getPanelResultados()
	{
		return panelResultados;
	}

}
