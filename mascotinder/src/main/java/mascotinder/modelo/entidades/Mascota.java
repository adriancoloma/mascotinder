package mascotinder.modelo.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Mascota implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "edad")
	private int edad;
	@Column(name = "sexo")
	private char sexo;
	@Column(name = "tipo")
	private String tipo;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "imagen1")
	private String pathImagen1;
	@Column(name = "imagen2")
	private String pathImagen2;
	@Column(name = "imagen3")
	private String pathImagen3;
	@Column(name = "preferencia_tipo")
	private String preferenciaTipo;
	@Column(name = "preferencia_sexo")
	private char preferenciaSexo;
	@Column(name = "preferencia_maximo_edad")
	private int preferenciaMaximoEdad;
	@Column(name = "preferencia_minimo_edad")
	private int preferenciaMinimoEdad;
	
	@JoinColumn(name = "dueno_id")
	@ManyToOne
	private Persona dueno;
	
	public Mascota() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Persona getDueno() {
		return dueno;
	}
	public void setDueno(Persona dueno) {
		this.dueno = dueno;
	}
	
	
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getPathImagen1() {
		return pathImagen1;
	}
	public void setPathImagen1(String pathImagen1) {
		this.pathImagen1 = pathImagen1;
	}
	public String getPathImagen2() {
		return pathImagen2;
	}
	public void setPathImagen2(String pathImagen2) {
		this.pathImagen2 = pathImagen2;
	}
	public String getPathImagen3() {
		return pathImagen3;
	}
	public void setPathImagen3(String pathImagen3) {
		this.pathImagen3 = pathImagen3;
	}
	public List<String> getPathImagenes(){
		List<String> pathImagenes = new ArrayList<>();
		if(pathImagen1 != null) {
			pathImagenes.add(pathImagen1);
		}
		
		if(pathImagen2 != null) {
			pathImagenes.add(pathImagen2);
		}
		
		if(pathImagen3 != null) {
			pathImagenes.add(pathImagen1);
		}
		
		return pathImagenes;
	}
	public String getPreferenciaTipo() {
		return preferenciaTipo;
	}
	public char getPreferenciaSexo() {
		return preferenciaSexo;
	}
	public int getPreferenciaMaximoEdad() {
		return preferenciaMaximoEdad;
	}
	public int getPreferenciaMinimoEdad() {
		return preferenciaMinimoEdad;
	}
	
	public void setPreferencias(String tipo, char sexo, int edadMinima, int edadMaxima) {
		this.preferenciaTipo = tipo;
		this.preferenciaSexo = sexo;
		this.preferenciaMinimoEdad = edadMinima;
		this.preferenciaMaximoEdad = edadMaxima;
	}
	@Override
	public String toString() {
		return "Mascota [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", tipo=" + tipo
				+ ", descripcion=" + descripcion + ", pathImagen1=" + pathImagen1 + ", pathImagen2=" + pathImagen2
				+ ", pathImagen3=" + pathImagen3 + ", preferenciaTipo=" + preferenciaTipo + ", preferenciaSexo="
				+ preferenciaSexo + ", preferenciaMaximoEdad=" + preferenciaMaximoEdad + ", preferenciaMinimoEdad="
				+ preferenciaMinimoEdad + ", dueno=" + dueno + "]";
	}
	
	
	
	
	
	
	
}
