package Modelo;

public class Avion extends Vehiculo {
	
	private double altitudMaxima;
	private int envergadura;

	public Avion() {
		// TODO Auto-generated constructor stub
		this.configurarVehiculo();
	}

	@Override
	public void imprimirDatosVehiculo() {
		// TODO Auto-generated method stub
		System.out.println("\n** Este es un "+super.tipoVehiculo);
		System.out.println("   tiene "+super.llantas+" llantas");
		System.out.println("   tipo de motor "+super.motor);
		System.out.println("   Altitud Maxima: "+this.altitudMaxima+" pies");
		System.out.println("   Envergadura: "+this.envergadura+" Metros");
	}

	@Override
	public void configurarVehiculo() {
		// TODO Auto-generated method stub
		super.tipoVehiculo= "Avión";
		super.motor="turbinas";
		super.llantas = 18;
		this.altitudMaxima = 36000;
		this.envergadura = 80;
	}

}
