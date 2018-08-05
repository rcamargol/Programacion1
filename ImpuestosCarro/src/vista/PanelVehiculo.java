package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelVehiculo extends JPanel implements ActionListener{
	/**
	 * 
	 */
	
	//Constantes	
	public static final String BUSCAR = "buscar";
	private static final long serialVersionUID = 1L;
	
	//atributos
	private JTextField txtMarca;
	private JTextField txtLinea;
	private JTextField txtModelo;
	private JTextField txtValor;
	private JLabel labMarca;
	private JLabel labLinea;
	private JLabel labModelo;
	private JLabel labValor;
	private JButton butBuscar;
	
	
	public PanelVehiculo() {
		//establecer el Layout del grid en matriz de 5 x 2, y cada espacio de 130 px.
		
		setLayout ( new GridLayout(5,2) );
		setPreferredSize( new Dimension(0,130)) ;
		
		//crear el borde con titulo y color
		
		TitledBorder border = BorderFactory.createTitledBorder("Datos del Vehículo");
		border.setTitleColor(Color.BLUE);
		setBorder(border);
		
		//Definir los labels
		
		labMarca = new JLabel("Marca");
		labLinea = new JLabel("Linea");
		labModelo = new JLabel("Modelo");
		labValor = new JLabel("Valor");
		
		
		//Definir los campos 
		txtMarca = new JTextField();
		txtLinea = new JTextField();
		txtModelo = new JTextField();
		txtValor = new JTextField("$ 0");		

		txtValor.setEditable(false);
		txtValor.setForeground(Color.BLUE);
		txtValor.setBackground(Color.WHITE);
		
		butBuscar = new JButton("Buscar");
		butBuscar.setActionCommand(BUSCAR);
		butBuscar.addActionListener(this);

		
		//agregar cada label y su campo correspondiente en el grid		
		add(labMarca);
		add(txtMarca);
		add(labLinea);
		add(txtLinea);	
		add(labModelo);
		add(txtModelo);
		add(labValor);
		add(txtValor);
		add (new JLabel(""));
		add(butBuscar);
	}

	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		String comando = evento.getActionCommand();
		
		if(comando.equals(BUSCAR)) {
			//acciones que se toman al comando buscar
			System.out.println("Accion BUSCAR");
		}
		
	}

	public void refrescarPrecio( double precio) {
		DecimalFormat df = (DecimalFormat) NumberFormat.getInstance();
		df.applyPattern("$ ###,###.##");
		txtValor.setText(df.format(precio));
	}
	
	//métodos de acceso a la información - getters
	
	public String darMarca() {
		return txtMarca.getText();
	}
	
	public String darLinea() {
		return txtLinea.getText();
	}
	
	public String darModelo() {
		return txtModelo.getText();
	}
	
}
