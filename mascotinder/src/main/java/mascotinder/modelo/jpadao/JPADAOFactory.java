package mascotinder.modelo.jpadao;

import mascotinder.modelo.dao.DAOFactory;
import mascotinder.modelo.dao.MascotaDAO;
import mascotinder.modelo.dao.MatchDAO;
import mascotinder.modelo.dao.MensajeDAO;
import mascotinder.modelo.dao.PersonaDAO;

public class JPADAOFactory extends DAOFactory{

	@Override
	public PersonaDAO crearPersonaDAO() {
		return new JPAPersonaDAO();
	}

	@Override
	public MascotaDAO crearMascotaDAO() {
		return new JPAMascotaDAO();
	}

	@Override
	public MensajeDAO crearMensajeDAO() {
		// TODO Auto-generated method stub
		return new JPAMensajeDAO();
	}

	@Override
	public MatchDAO crearMatchDAO() {
		return new JPAMatchDAO();
	}
	
}
