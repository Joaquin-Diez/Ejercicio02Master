
public class Zenitsu extends Personaje{
	
	private String tipoRespiracion;

	public Zenitsu(String nombre, double altura, String serieALaQuePertenece, String colorPelo,String tipoRespiracion) {
		super(nombre, altura, serieALaQuePertenece, colorPelo);
		this.tipoRespiracion=tipoRespiracion;
	}

	public String getTipoRespiracion() {
		return tipoRespiracion;
	}

	public void setTipoRespiracion(String tipoRespiracion) {
		this.tipoRespiracion = tipoRespiracion;
	}
	
	@Override
	public void poder() {
		System.out.println("Su poder es la repiracion del rayo.");
	}
	
	@Override
	public void defensa() {
		System.out.println("No tiene mucha defensa.");
	}
	
	@Override
	public void ataque() {
		System.out.println("Su ataque es la primera postura del rayo.");
	}
	
}
