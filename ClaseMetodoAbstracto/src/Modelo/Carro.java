package Modelo;

public class Carro extends Vehiculo {
	
	private float velocidad0a100;
	private String tipoDireccion; 

	public Carro() {
		// TODO Auto-generated constructor stub
		this.configurarVehiculo();
	}

	@Override
	public void imprimirDatosVehiculo() {
		// TODO Auto-generated method stub
		System.out.println("\n\nDatos del Carro");
		System.out.println("** Este es un "+super.tipoVehiculo);
		System.out.println("   tiene "+super.llantas+" llantas");
		System.out.println("   y además un motor de "+super.motor);
		System.out.println("-------------------------------------");
		System.out.println("   Hace de 0 a 100 en: "+this.velocidad0a100+ " segundos");
		System.out.println("   El tipo de Dirección es: "+this.tipoDireccion);
	}

	@Override
	public void configurarVehiculo() {
		// TODO Auto-generated method stub
		super.tipoVehiculo="Carro";
		super.llantas = 5;
		super.motor = "5 velocidades gasolina regular";
		this.velocidad0a100 = (float) 3.6;
		this.tipoDireccion = "hidráulica";
	}

}
