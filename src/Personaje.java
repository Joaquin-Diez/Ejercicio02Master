
public abstract class Personaje {
	
	private String nombre;
	private double altura;
	private String serieALaQuePertenece;
	private String colorPelo;
	
	public Personaje(String nombre, double altura, String serieALaQuePertenece, String colorPelo) {
		this.nombre = nombre;
		this.altura = altura;
		this.serieALaQuePertenece = serieALaQuePertenece;
		this.colorPelo = colorPelo;
	}
	
	public void poder() {
		
	}
	
	public void defensa() {
		
	}
	
	public void ataque() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getSerieALaQuePertenece() {
		return serieALaQuePertenece;
	}

	public void setSerieALaQuePertenece(String serieALaQuePertenece) {
		this.serieALaQuePertenece = serieALaQuePertenece;
	}

	public String getColorPelo() {
		return colorPelo;
	}

	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}
	
	


}
