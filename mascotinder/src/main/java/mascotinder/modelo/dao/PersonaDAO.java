package mascotinder.modelo.dao;

import mascotinder.modelo.Persona;

public interface PersonaDAO extends GenericDAO<Persona> {
	public boolean validarPassword(String usuario, String password);

	@Override
	boolean create(Persona p);

	@Override
	boolean update(Persona p);

	@Override
	void delete(int id);

	@Override
	Persona getById(int id);

	
	
}
