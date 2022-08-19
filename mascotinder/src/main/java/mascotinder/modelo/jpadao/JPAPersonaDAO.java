package mascotinder.modelo.jpadao;

import mascotinder.modelo.dao.PersonaDAO;

public class JPAPersonaDAO<Persona> implements PersonaDAO{

	@Override
	public boolean validarPassword(String usuario, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean create(mascotinder.modelo.Persona p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(mascotinder.modelo.Persona p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public mascotinder.modelo.Persona getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
