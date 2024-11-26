
public class Luffy extends Personaje{
	
	private String nomFruta;

	public Luffy(String nombre, double altura, String serieALaQuePertenece, String colorPelo,String nomFruta) {
		super(nombre, altura, serieALaQuePertenece, colorPelo);
		this.nomFruta=nomFruta;
	}

	public String getNomFruta() {
		return nomFruta;
	}

	public void setNomFruta(String nomFruta) {
		this.nomFruta = nomFruta;
	}
	
	@Override
	public void poder() {
		System.out.println("Su poder es el Haki.");
	}
	
	@Override
	public void defensa() {
		System.out.println("Su defensa usa Haki y su fruta.");
	}
	
	@Override
	public void ataque() {
		System.out.println("Su ataque mas comun es gomu gomu no pistolu.");
	}

}
