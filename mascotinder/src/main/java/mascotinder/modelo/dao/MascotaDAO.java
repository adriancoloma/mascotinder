package mascotinder.modelo.dao;

import java.util.List;

import mascotinder.modelo.entidades.Mascota;
import mascotinder.modelo.entidades.Persona;

public interface MascotaDAO extends GenericDAO<Mascota, Integer>{
	public List<Mascota> getMascotas(Persona dueno);
	public List<Mascota> getPosiblesParejas(Mascota mascota);
}
