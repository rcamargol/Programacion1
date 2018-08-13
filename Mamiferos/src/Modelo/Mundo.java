package Modelo;

public class Mundo {
	
	private Canino can1;
	private Felino fel1;
	
	public Mundo() 
	{
		
	}
	
	public Canino getCanino(String raza, int numPatas) {
		can1 = new Canino();
		can1.numeroPatas = numPatas;
		can1.raza = raza;
		return can1;
	}

	public void setCanino(Canino can1) {
		this.can1 = can1;
	}

	public Felino getFelino(String raza, int numPatas) {
		fel1 = new Felino();
		fel1.numeroPatas = numPatas;
		fel1.raza = raza;
		return fel1;
	}

	public void setFelino(Felino fel1) {
		this.fel1 = fel1;
	}
	
}
