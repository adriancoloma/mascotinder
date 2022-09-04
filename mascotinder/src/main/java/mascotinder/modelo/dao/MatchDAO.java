package mascotinder.modelo.dao;

import java.util.List;

import mascotinder.modelo.entidades.Mascota;
import mascotinder.modelo.entidades.Match;

public interface MatchDAO extends GenericDAO<Match, Integer>{
	public List<Mascota> getMatchs(Mascota mascota);
}
