
public class Ghon extends Personaje{
	
	private int numerTarjetaDeCazador;

	public Ghon(String nombre, double altura, String serieALaQuePertenece, String colorPelo,int numerTarjetaDeCazador) {
		super(nombre, altura, serieALaQuePertenece, colorPelo);
		this.numerTarjetaDeCazador=numerTarjetaDeCazador;
	}

	public int getNumerTarjetaDeCazador() {
		return numerTarjetaDeCazador;
	}

	public void setNumerTarjetaDeCazador(int numerTarjetaDeCazador) {
		this.numerTarjetaDeCazador = numerTarjetaDeCazador;
	}
	
	@Override
	public void poder() {
		System.out.println("Su poder es Nen.");
	}
	
	@Override
	public void defensa() {
		System.out.println("Su defensa usa Nen.");
	}
	
	@Override
	public void ataque() {
		System.out.println("Su ataque mas comun es Jajanken.");
	}

}
