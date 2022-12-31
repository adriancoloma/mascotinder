package mascotinder.modelo.dao;

import mascotinder.modelo.jpadao.JPADAOFactory;

public abstract class DAOFactory {
	private static DAOFactory factory = new JPADAOFactory();
	public static DAOFactory getFactory() {
		return factory;
	}
	
	public abstract PersonaDAO crearPersonaDAO();
	
	public abstract MascotaDAO crearMascotaDAO();
	
	public abstract MensajeDAO crearMensajeDAO();
	
	public abstract MatchDAO crearMatchDAO();
	
}
