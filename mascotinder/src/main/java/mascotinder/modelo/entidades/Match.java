package mascotinder.modelo.entidades;

public class Match {
	private int id;
	private Mascota mascota1;
	private Mascota mascota2;
	private boolean meGusta;
	
	public Match(Mascota mascota1, Mascota mascota2, boolean meGusta) {
		this.mascota1 = mascota1;
		this.mascota2 = mascota2;
		this.meGusta = meGusta;
	}
	
	
}
