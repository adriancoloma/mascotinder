package mascotinder.modelo.jpadao;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import mascotinder.modelo.Persona;
import mascotinder.modelo.dao.PersonaDAO;

public class JPAPersonaDAO extends JPAGenericDAO<Persona> implements PersonaDAO{

	public JPAPersonaDAO() {
		super(Persona.class);
		
	}

	@Override
	public boolean validarPassword(String usuario, String password) {
		String sentenciaJPQL = "SELECT p FROM Persona p WHERE p.correo = :p1 AND p.password = :p2";
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
