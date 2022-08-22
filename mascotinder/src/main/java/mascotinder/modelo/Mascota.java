package mascotinder.modelo;

public class Mascota {
	private int id;
	private String nombre;
	private String especie;
	private String raza;
	private int edad;
	public Mascota() {
		
	}
	public Mascota(int id, String nombre, String especie, String raza, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.especie = especie;
		this.raza = raza;
		this.edad = edad;
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
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	

}
