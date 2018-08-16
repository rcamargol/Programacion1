package interfaz;

import javax.swing.JOptionPane;

import mundo.CuentaBancaria;

/**
 * InterfazBanco.java
 * @version 1.0
 * Universidad El Bosque (Bogotá - Colombia)
 * Facultad de Ingeniería de Sistemas
 * Ejercicio: Objetos-CuentaBancaria
 */


public class InterfazBanco {

	// -----------------------------------------------------------------
	// Atributos
	// -----------------------------------------------------------------

	/**
	 * Cuenta bancaria del banco
	 */
	CuentaBancaria cuenta;
	// -----------------------------------------------------------------
	// Constructor
	// -----------------------------------------------------------------

    /**
     * Constructor de interfaz principal de la aplicación.
     */
	public InterfazBanco() {
		
		cuenta = new CuentaBancaria(200, 1, 350000);
		
	}
	
	// -----------------------------------------------------------------
	// Métodos
	// -----------------------------------------------------------------

	/**
	 * Inicia el menu de la aplicación
	 */
	public void ejecutarMenu() {

		String seleccion = "";
		int opcionSeleccionada = 0;

		do {
			seleccion = JOptionPane.showInputDialog(
					"  Menu Opciones\n" + 
					"\n1. Consultar Saldo de Cuenta Bancaria" +
					"\n2. Salir\n\n");

			//Convierte la opción seleccionada por el cliente de String a entero
			opcionSeleccionada = Integer.parseInt(seleccion);
			switch (opcionSeleccionada) {
			case 1: 
				consultarSaldo();
				break;
			case 2: 
				salir();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion no valida!! Digite de nuevo la opción");
				break;
			} 
		} while (opcionSeleccionada != 2);

	}	

	// -----------------------------------------------------------------
	// Métodos que implementan los requerimientos funcionales
	// -----------------------------------------------------------------

	
	/**
	 * Consulta el saldo de la cuenta bancaria y lo muestra al usuario
	 */
	public void consultarSaldo() {

		double saldoCuenta;
		
		saldoCuenta = cuenta.getSaldo();
		JOptionPane.showMessageDialog(null, "El saldo de la cuenta es: " + saldoCuenta);
	}

	
	/**
	 * Termina la aplicación
	 */
	public void salir() {
		JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestros servicios!!");
		System.exit(0);
	}

}

