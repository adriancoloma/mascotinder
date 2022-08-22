package mascotinder.modelo.dao;

import mascotinder.modelo.Persona;

public interface PersonaDAO extends GenericDAO<Persona, Integer> {
	public boolean validarPassword(String usuario, String password);

	@Override
	boolean create(Persona p);

	@Override
	boolean update(Persona p);

	@Override
	void delete(Persona p);

	@Override
	Persona getById(Integer id);

}
