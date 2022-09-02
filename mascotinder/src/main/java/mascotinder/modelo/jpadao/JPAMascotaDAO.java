package mascotinder.modelo.jpadao;

import java.util.List;

import javax.persistence.Query;

import mascotinder.modelo.dao.MascotaDAO;
import mascotinder.modelo.entidades.Mascota;
import mascotinder.modelo.entidades.Persona;

public class JPAMascotaDAO extends JPAGenericDAO<Mascota, Integer> implements MascotaDAO {

	public JPAMascotaDAO() {
		super(Mascota.class);
	}

	@Override
	public List<Mascota> getMascotas(Persona dueno) {
		String sentenciaJPQL = "SELECT m FROM Mascota m WHERE m.dueno = :p1";
		Query query = em.createQuery(sentenciaJPQL);
		query.setParameter("p1", dueno);
		return (List<Mascota>) query.getResultList();
		
	}

	@Override
	public Mascota getMascotaById(Integer id) {
		String sentenciaJPQL = "SELECT m FROM Mascota m WHERE m.id = :m1";
		Query query = em.createQuery(sentenciaJPQL);
		query.setParameter("m1", id);
		return (Mascota) query.getSingleResult();
	}
	
	

}
