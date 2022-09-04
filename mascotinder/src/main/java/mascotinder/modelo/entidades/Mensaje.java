package mascotinder.modelo.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Mensaje {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@JoinColumn(name = "emisor_id")
	@ManyToOne
	private Persona emisor;
	@JoinColumn(name = "receptor_id")
	@ManyToOne
	private Persona receptor;
	@Column(name = "contenido")
	private String contenido;
	
	public Mensaje() {
		
	}
	public Mensaje(Persona emisor, Persona receptor, String contenido) {
		super();
		this.emisor = emisor;
		this.receptor = receptor;
		this.contenido = contenido;
	}
	
	
	public Persona getEmisor() {
		return emisor;
	}
	public Persona getReceptor() {
		return receptor;
	}
	public String getContenido() {
		return contenido;
	}
	
	
}
