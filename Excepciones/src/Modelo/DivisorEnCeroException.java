package Modelo;

public class DivisorEnCeroException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DivisorEnCeroException() {
		// TODO Auto-generated constructor stub
		super("El divisor no puede estar en cero!");
	}

}
