package mascotinder.modelo.jpadao;

import java.util.List;

import mascotinder.modelo.dao.GenericDAO;
import mascotinder.modelo.dao.MatchDAO;
import mascotinder.modelo.entidades.Mascota;
import mascotinder.modelo.entidades.Match;

public class JPAMatchDAO extends JPAGenericDAO<Match, Integer> implements MatchDAO{

	public JPAMatchDAO() {
		super(Match.class);
	}
	
	public List<Mascota> getMatchs(Mascota mascota){
		return null;
	}
}
