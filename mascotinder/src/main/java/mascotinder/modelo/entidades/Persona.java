package mascotinder.modelo.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import mascotinder.modelo.dao.DAOFactory;

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

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public List<Mascota> getMascotas(){
		return DAOFactory.getFactory().crearMascotaDAO().getMascotas(this);
	}

	public Integer getId() {
		return id;
	}
	
	
}
