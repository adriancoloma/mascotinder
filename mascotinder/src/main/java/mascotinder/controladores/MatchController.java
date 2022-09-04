package mascotinder.controladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mascotinder.modelo.dao.DAOFactory;
import mascotinder.modelo.entidades.Mascota;
import mascotinder.modelo.entidades.Persona;

/**
 * Servlet implementation class MatchController
 */
public class MatchController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MatchController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Persona personaIngresada = (Persona) request.getSession().getAttribute("UsuarioIngresado");
		if(personaIngresada == null) {
			response.sendRedirect("IngresarSistemaController");
			return;
		}
//		1. Obtener parametros
		int idMascota = Integer.parseInt(request.getParameter("idMascota"));
//		2. Llamar al modelo
		Mascota mascota = DAOFactory.getFactory().crearMascotaDAO().getById(idMascota);
		List<Mascota> mascotas = DAOFactory.getFactory().crearMatchDAO().getMatchs(mascota);
		request.setAttribute("mascotas", mascotas);
//		3. Enviar a la vista
		request.getRequestDispatcher("/jsp/match.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
