/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Inicio.java, v 1.0
 * Universidad El Bosque (Bogotá - Colombia)
 * Facultad de Ingeniería de Sistemas
 * Ejercicio: Objetos-CuentaBancaria
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package interfaz;

public class Inicio {

    // -----------------------------------------------------------------
    // Main
    // -----------------------------------------------------------------

    /**
     * Main de la aplicación
     * @param args Lista de argumentos con los que inicia la aplicación.
     */
	
	public static void main(String[] args) {
		
		InterfazBanco aplicacionBanco = new InterfazBanco();
		aplicacionBanco.ejecutarMenu();
		
	}
}
