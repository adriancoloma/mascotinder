package mascotinder.modelo.jpadao;

import java.util.List;

import mascotinder.modelo.Mascota;
import mascotinder.modelo.dao.MascotaDAO;

public class JPAMascotaDAO extends JPAGenericDAO<Mascota, Integer> implements MascotaDAO {

	public JPAMascotaDAO() {
		super(Mascota.class);
	}

	

}
