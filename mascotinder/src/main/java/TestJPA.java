import java.util.List;

import mascotinder.modelo.dao.DAOFactory;
import mascotinder.modelo.dao.MascotaDAO;
import mascotinder.modelo.dao.PersonaDAO;
import mascotinder.modelo.entidades.Mascota;
import mascotinder.modelo.entidades.Persona;

public class TestJPA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DAOFactory dao = DAOFactory.getFactory();
		
		PersonaDAO personaDAO = dao.crearPersonaDAO();
		Persona persona = new Persona();
		persona.setNombre("Adrian");
		persona.setPassword("adrian123");
		personaDAO.create(persona);
		
		MascotaDAO mascotaDAO = dao.crearMascotaDAO();
		Mascota mascota = new Mascota();
		mascota.setNombre("Rufus");
		mascota.setEdad(5);
		mascota.setDescripcion("Un perro muy lindo");
		mascota.setPathImagen1("husky-siberiano.jpg");
		mascota.setTipo("perro");
		mascota.setSexo('M');
		mascota.setPreferencias("Perro", 'M', 4, 7);
		
		mascota.setDueno(persona);
		mascotaDAO.create(mascota);
		Mascota mascota2 = new Mascota();
		mascota2.setNombre("Max");
		mascota2.setEdad(4);
		mascota2.setDescripcion("Un pastor aleman con buen pelo");
		mascota2.setPathImagen2("pastor-aleman.jpg");
		mascota2.setTipo("perro");
		mascota2.setDueno(persona);
		mascota2.setSexo('F');
		
		mascotaDAO.create(mascota2);
		
		System.out.println(DAOFactory.getFactory().crearPersonaDAO().autorizarPersona("Adrian", "adrian123"));
		List<Mascota> mascotas = mascotaDAO.getMascotas(persona);
		for(Mascota mascotaBucle: mascotas) {
			System.out.println(mascotaBucle.getNombre());
		}
		
		for(String pathImagen: mascota.getPathImagenes()) {
			System.out.println(pathImagen);
		}
		

	}

}
