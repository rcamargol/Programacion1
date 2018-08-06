package Vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel
{
	
	private static final long serialVersionUID = 1L;
	private JLabel labResultado;
	private JTextField txtMonto;

	public PanelResultados() {
		// TODO Auto-generated constructor stub
		setLayout( new GridLayout(2,1) );
		TitledBorder border = BorderFactory.createTitledBorder("Resultados");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		labResultado = new JLabel("El Monto escrito es:");
		txtMonto = new JTextField("");
		txtMonto.setForeground(Color.WHITE);
		txtMonto.setBackground(Color.BLACK);
		
		add(labResultado);
		add(txtMonto);
	}
	
	public void settxtMonto(String texto)
	{
		txtMonto.setText(texto);
	}

}
