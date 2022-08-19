package mascotinder.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Persona")
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "correo")
	private String correo;
	@Column(name = "password")
	private String password;
	

	public Persona(){

	}

	public List<Mascota> getMascotas(){
		return null;
	}
}
