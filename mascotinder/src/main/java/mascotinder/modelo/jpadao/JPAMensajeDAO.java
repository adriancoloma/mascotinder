package mascotinder.modelo.jpadao;

import java.util.List;

import javax.persistence.Query;

import mascotinder.modelo.dao.MensajeDAO;
import mascotinder.modelo.entidades.Mensaje;
import mascotinder.modelo.entidades.Persona;

public class JPAMensajeDAO extends JPAGenericDAO<Mensaje, Integer> implements MensajeDAO{

	public JPAMensajeDAO() {
		super(Mensaje.class);
	}

	@Override
	public List<Mensaje> getMensajes(Persona emisor, Persona receptor) {
		String queryJPQL = "SELECT mensaje FROM Mensaje mensaje WHERE mensaje.emisor = :emisor AND mensaje.receptor = :receptor OR mensaje.emisor = :receptor OR mensaje.receptor = :emisor";
		Query query = em.createQuery(queryJPQL);
		query.setParameter("emisor", emisor);
		query.setParameter("receptor", receptor);
		
		return (List<Mensaje>) query.getResultList();
	}

}
