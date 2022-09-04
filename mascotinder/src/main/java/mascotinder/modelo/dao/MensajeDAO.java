package mascotinder.modelo.dao;

import mascotinder.modelo.entidades.Persona;

import java.util.List;

import mascotinder.modelo.entidades.Mensaje;

public interface MensajeDAO {
	public List<Mensaje> getMensajes(Persona emisor, Persona receptor);
}
