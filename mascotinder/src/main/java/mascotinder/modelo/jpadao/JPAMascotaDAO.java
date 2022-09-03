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
	public List<Mascota> getPosiblesParejas(Mascota mascota) {
		String sentenciaJPQL = "SELECT mascota FROM Mascota mascota"
				+ " WHERE mascota.tipo = :tipo AND mascota.sexo = :sexo AND mascota.edad BETWEEN :edadMinima AND :edadMaxima "
				+ "AND NOT mascota IN (SELECT m.mascota2 FROM emparejamiento m WHERE m.mascota1 = :mascota)"
				+ "AND NOT mascota = :mascota "
				+ "AND NOT mascota.dueno = :dueno";
		Query query = em.createQuery(sentenciaJPQL);
		query.setParameter("tipo", mascota.getPreferenciaTipo());
		query.setParameter("sexo", mascota.getPreferenciaSexo());
		query.setParameter("edadMaxima", mascota.getPreferenciaMaximoEdad());
		query.setParameter("edadMinima", mascota.getPreferenciaMinimoEdad());
		query.setParameter("mascota", mascota);
		query.setParameter("dueno", mascota.getDueno());
		return (List<Mascota>) query.getResultList();
		
	}	
	
	

}
