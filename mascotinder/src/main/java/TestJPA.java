import java.util.List;

import mascotinder.modelo.dao.DAOFactory;
import mascotinder.modelo.dao.MascotaDAO;
import mascotinder.modelo.dao.MatchDAO;
import mascotinder.modelo.dao.MensajeDAO;
import mascotinder.modelo.dao.PersonaDAO;
import mascotinder.modelo.entidades.Mascota;
import mascotinder.modelo.entidades.Match;
import mascotinder.modelo.entidades.Mensaje;
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
		
		Persona persona2 = new Persona();
		persona2.setNombre("Juan");
		persona2.setPassword("juan123");
		personaDAO.create(persona2);
		
		MascotaDAO mascotaDAO = dao.crearMascotaDAO();
		Mascota mascota = new Mascota();
		mascota.setNombre("Rufus");
		mascota.setEdad(5);
		mascota.setDescripcion("Un perro muy lindo");
		mascota.setPathImagen1("husky-siberiano.jpg");
		mascota.setPathImagen2("husky-siberiano2.jpg");
		mascota.setTipo("perro");
		mascota.setSexo('M');
		mascota.setPreferencias("perro", 'F', 3, 7);
		
		
		mascota.setDueno(persona);
		mascotaDAO.create(mascota);
		
		
		Mascota mascota2 = new Mascota();
		mascota2.setNombre("Max");
		mascota2.setEdad(4);
		mascota2.setDescripcion("Un pastor aleman con buen pelo");
		mascota2.setPathImagen2("pastor-aleman.jpg");
		mascota2.setTipo("perro");
		mascota2.setDueno(persona2);
		mascota2.setSexo('F');
		mascota2.setPreferencias("perro", 'M', 4, 6);
		
		mascotaDAO.create(mascota2);
		
		Mascota mascota3 = new Mascota();
		mascota3.setNombre("Dulce");
		mascota3.setEdad(4);
		mascota3.setDescripcion("Un pastor aleman con buen pelo");
		mascota3.setPathImagen2("pastor-aleman.jpg");
		mascota3.setTipo("perro");
		mascota3.setDueno(persona2);
		mascota3.setSexo('F');
		mascota3.setPreferencias("perro", 'M', 4, 6);		
		
		mascotaDAO.create(mascota3);
		//Ver catalogo
		MatchDAO matchDAO = DAOFactory.getFactory().crearMatchDAO();
		Match match = new Match(mascota, mascota2, true); // A mascota le gusta mascota2
		matchDAO.create(match); 
		Match match2 = new Match(mascota2, mascota, true); //A mascota2 le gusta mascota
		matchDAO.create(match2);
		
		List<Mascota>mascotas = mascotaDAO.getPosiblesParejas(mascota);
		for(Mascota mascotaBucle: mascotas) {
			System.out.println(mascotaBucle.getNombre());
		}
		
		//Matchs
		System.out.println("-----Matchs----");
		System.out.println("Matchs de rufus");
		List<Mascota> mascotasMatch = matchDAO.getMatchs(mascota);
		for(Mascota mascotaBucle: mascotasMatch) {
			System.out.println(mascotaBucle.getNombre());
		}
		
		System.out.println("Matchs de max");
		
		mascotasMatch = matchDAO.getMatchs(mascota2);
		for(Mascota mascotaBucle: mascotasMatch) {
			System.out.println(mascotaBucle.getNombre());
		}
		
		//Mensajes
		Mensaje mensaje = new Mensaje(persona, persona2, "Hola, como estas?");
		MensajeDAO mensajeDAO = DAOFactory.getFactory().crearMensajeDAO();
		mensajeDAO.create(mensaje); // persona envia un mensaje a persona2;
		
		for(Mensaje mensajeBucle: mensajeDAO.getMensajes(persona, persona2)) {
			System.out.println(mensajeBucle.getContenido());
		}
		
		

	}

}
