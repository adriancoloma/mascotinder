package mascotinder.modelo.entidades;

public class Mensaje {
	private Persona emisor;
	private Persona destinatario;
	private String contenido;
	
	
	public Mensaje(Persona emisor, Persona destinatario, String contenido) {
		super();
		this.emisor = emisor;
		this.destinatario = destinatario;
		this.contenido = contenido;
	}
	
	public Persona getEmisor() {
		return emisor;
	}
	public Persona getDestinatario() {
		return destinatario;
	}
	public String getContenido() {
		return contenido;
	}
	
	
}
