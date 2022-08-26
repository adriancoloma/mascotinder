package mascotinder.modelo.jpadao;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import mascotinder.modelo.dao.PersonaDAO;
import mascotinder.modelo.entidades.Persona;

public class JPAPersonaDAO extends JPAGenericDAO<Persona, Integer> implements PersonaDAO{

	public JPAPersonaDAO() {
		super(Persona.class);
		
	}

	@Override
	public boolean validarPassword(String usuario, String password) {
		String sentenciaJPQL = "SELECT p FROM Persona p WHERE p.nombre = :p1 AND p.password = :p2";
		Query query = em.createQuery(sentenciaJPQL);
		query.setParameter("p1", usuario);
		query.setParameter("p2", password);
		
		try {
			query.getSingleResult();
			return true;
		}catch(NoResultException e) {
			return false;
		}
		
	}


}
