package vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Interfaz extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PanelVehiculo panelVehiculo;
	private PanelDescuentos panelDescuentos;
	private PanelResultados panelResultados;
	
	public Interfaz() {
		setTitle("Calculo Impuestos");
		setSize( 300, 300 );
		setResizable( false );
		setDefaultCloseOperation( EXIT_ON_CLOSE );

		setLayout( new BorderLayout() );
		
		//agregar cada panel componente del border layout en la zona NORTE, CENTRO y SUR.
		
		panelVehiculo = new PanelVehiculo();
		add(panelVehiculo, BorderLayout.NORTH);
		
		panelDescuentos = new PanelDescuentos();
		add(panelDescuentos, BorderLayout.CENTER);
		
		panelResultados = new PanelResultados();
		add(panelResultados, BorderLayout.SOUTH);
		setLocationRelativeTo(null);
	}
	
}
