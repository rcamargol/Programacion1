package Modelo;

public class Felino extends Mamifero
{

	public Felino(String raza, int numPatas)
	{
		super.raza = raza;
		super.numeroPatas = numPatas;
	}
	
	
	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("como carne, yummy, yummy");
	}

	@Override
	public void hacerSonido() {
		// TODO Auto-generated method stub
		System.out.println("miau, miau -- o depende!!");
	}
	
}
