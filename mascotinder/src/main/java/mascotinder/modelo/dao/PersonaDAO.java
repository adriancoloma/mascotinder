package mascotinder.modelo.dao;

import mascotinder.modelo.entidades.Persona;

public interface PersonaDAO extends GenericDAO<Persona, Integer> {
	public Persona autorizarPersona(String usuario, String password);

	@Override
	boolean create(Persona p);

	@Override
	boolean update(Persona p);

	@Override
	void delete(Persona p);

	@Override
	Persona getById(Integer id);

}
