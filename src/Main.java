
public class Main {

	public static void main(String[] args) {
		
		Ghon Gon=new Ghon("Gon", 1.57, "HunterXHunter", "Verde", 865978);
		System.out.println("El nombre del personaje es: "+Gon.getNombre());
		System.out.println("La altura de "+Gon.getNombre()+" es: "+Gon.getAltura()+"m.");
		System.out.println("El numero de su tajeta de cazador es: "+Gon.getNumerTarjetaDeCazador());
		Gon.poder();
		
		System.out.println(" ");
		
		Luffy Luffy1=new Luffy("Monkey D Luffy", 1.75, "One Piece", "Negro", "Gomu Gomu No Mi");
		System.out.println("El nombre del personaje es: "+Luffy1.getNombre());
		System.out.println("La altura de "+Luffy1.getNombre()+" es: "+Luffy1.getAltura()+"m.");
		System.out.println("Su fruta es: "+Luffy1.getNomFruta());
		Luffy1.poder();
		
		System.out.println(" ");
		
		Zenitsu Zenitsu1=new Zenitsu("Zenitsu", 1.71, "Kimetsu no Yaiba", "Amarillo", "Rayo");
		System.out.println("El nombre del personaje es: "+Zenitsu1.getNombre());
		System.out.println("La altura de "+Zenitsu1.getNombre()+" es: "+Zenitsu1.getAltura()+"m.");
		System.out.println("Su respiracion es: "+Zenitsu1.getTipoRespiracion());
		Zenitsu1.poder();

	}

}
