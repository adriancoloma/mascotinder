package mascotinder.modelo.jpadao;

import mascotinder.modelo.dao.DAOFactory;
import mascotinder.modelo.dao.MascotaDAO;
import mascotinder.modelo.dao.MensajeDAO;
import mascotinder.modelo.dao.PersonaDAO;

public class JPADAOFactory extends DAOFactory{

	@Override
	public PersonaDAO crearPersonaDAO() {
		return new JPAPersonaDAO();
	}

	@Override
	public MascotaDAO crearMascotaDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MensajeDAO crearMensajeDAO() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
