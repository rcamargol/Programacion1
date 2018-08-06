package Modelo;

public abstract class Vehiculo {

	protected String tipoVehiculo;
	protected String motor;
	protected int llantas;
	
	public Vehiculo() {
		// TODO Auto-generated constructor stub
		this.motor = "";
		this.tipoVehiculo = "";
		this.llantas = 0;
	}
	public abstract void configurarVehiculo();
	public abstract void imprimirDatosVehiculo();
}
