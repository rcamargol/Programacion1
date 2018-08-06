package Vista;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import Controlador.Controlador;

public class PanelEntrada extends JPanel
{

	private static final long serialVersionUID = 1L;
	private JLabel labEntrada;
	private JTextField txtNumero;
	private JButton butConvertir;
	public static final String CONVERTIR = "Convertir";
	
	public PanelEntrada(Controlador control) 
	{
		setLayout( new GridLayout(2,2) );
		TitledBorder border = BorderFactory.createTitledBorder("Datos de Entrada");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		labEntrada = new JLabel("Digite un Número");
		txtNumero = new JTextField("");
		txtNumero.setForeground(Color.BLACK);
		txtNumero.setBackground(Color.WHITE);
		butConvertir = new JButton("Convertir");
		butConvertir.setActionCommand(CONVERTIR);
		
		//se asigna el procesador de eventos al objeto Controlador
		butConvertir.addActionListener(control);
		
		add(labEntrada);
		add(txtNumero);
		add(new JLabel(""));
		add(butConvertir);
	}

	public JButton getBoton()
	{
		return butConvertir;
	}
	
	public JTextField getCampoNumero()
	{
		return txtNumero;
	}
	
}
