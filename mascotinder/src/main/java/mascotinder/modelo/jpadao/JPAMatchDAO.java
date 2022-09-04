package mascotinder.modelo.jpadao;

import mascotinder.modelo.dao.GenericDAO;
import mascotinder.modelo.dao.MatchDAO;
import mascotinder.modelo.entidades.Match;

public class JPAMatchDAO extends JPAGenericDAO<Match, Integer> implements MatchDAO{

	public JPAMatchDAO() {
		super(Match.class);
	}

}
