package mascotinder.modelo.jpadao;

import java.util.List;

import javax.persistence.Query;

import mascotinder.modelo.dao.GenericDAO;
import mascotinder.modelo.dao.MatchDAO;
import mascotinder.modelo.entidades.Mascota;
import mascotinder.modelo.entidades.Match;

public class JPAMatchDAO extends JPAGenericDAO<Match, Integer> implements MatchDAO{

	public JPAMatchDAO() {
		super(Match.class);
	}
	
	public List<Mascota> getMatchs(Mascota mascota){
		String sentenciaJPQL = "SELECT m.mascota2 FROM emparejamiento m WHERE m.mascota1 = :mascota AND "
				+ "m.meGusta = true AND "
				+ "m.mascota2 IN (SELECT m2.mascota1 FROM emparejamiento m2 WHERE m2.mascota2 = :mascota AND "
				+ "m2.meGusta = true)";
		
		Query query = em.createQuery(sentenciaJPQL);
		query.setParameter("mascota", mascota);
		return (List<Mascota>) query.getResultList();
	}
}
