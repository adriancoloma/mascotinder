package mascotinder.modelo.jpadao;

import mascotinder.modelo.dao.MascotaDAO;
import mascotinder.modelo.entidades.Mascota;

public class JPAMascotaDAO extends JPAGenericDAO<Mascota, Integer> implements MascotaDAO {

	public JPAMascotaDAO() {
		super(Mascota.class);
	}
	
	

}
