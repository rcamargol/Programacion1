package Modelo;

public class Mundo {

	private Carro car1;
	private Avion av1;

	
	public Mundo() {
		// TODO Auto-generated constructor stub
		car1 = new Carro();
		av1 = new Avion();
	}

	public Carro getCar1() {
		return car1;
	}


	public void setCar1(Carro car1) {
		this.car1 = car1;
	}


	public Avion getAv1() {
		return av1;
	}


	public void setAv1(Avion av1) {
		this.av1 = av1;
	}

	
}
