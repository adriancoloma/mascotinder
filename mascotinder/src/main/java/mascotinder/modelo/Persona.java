package mascotinder.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Persona")
public class Persona implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "correo")
	private String correo;
	@Column(name = "password")
	private String password;
	
	public Persona() {
		
	}
	
	public Persona(String nombre, String correo, String password) {
		this(null, nombre, correo, password);
	}
	public Persona(Integer id, String nombre, String correo, String password) {
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
		this.password = password;
	}

	public List<Mascota> getMascotas(){
		return null;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	
	
	
	
}
