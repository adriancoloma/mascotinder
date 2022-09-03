package mascotinder.modelo.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "emparejamiento")
public class Match {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@JoinColumn(name = "mascota1_id")
	@ManyToOne
	private Mascota mascota1;
	@JoinColumn(name = "mascota2_id")
	@ManyToOne
	private Mascota mascota2;
	@Column(name = "me_gusta")
	private boolean meGusta;
	
	public Match() {
		
	}
	public Match(Mascota mascota1, Mascota mascota2, boolean meGusta) {
		this.mascota1 = mascota1;
		this.mascota2 = mascota2;
		this.meGusta = meGusta;
	}
	
	public Mascota getMascota1() {
		return mascota1;
	}
	public void setMascota1(Mascota mascota1) {
		this.mascota1 = mascota1;
	}
	public Mascota getMascota2() {
		return mascota2;
	}
	public void setMascota2(Mascota mascota2) {
		this.mascota2 = mascota2;
	}
	public boolean isMeGusta() {
		return meGusta;
	}
	public void setMeGusta(boolean meGusta) {
		this.meGusta = meGusta;
	}
	
	
	
	
}
