package mascotinder.controladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mascotinder.modelo.dao.DAOFactory;
import mascotinder.modelo.entidades.Mascota;
import mascotinder.modelo.entidades.Persona;

/**
 * Servlet implementation class listarPersonasController
 */
public class ListarMascotasController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListarMascotasController() {

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		procesarSolicitud(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		procesarSolicitud(request, response);
	}

	private void procesarSolicitud(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("Ingreso");
		Persona personaIngresada = (Persona) request.getSession().getAttribute("UsuarioIngresado");
		if(personaIngresada == null) {
			response.sendRedirect("IngresarSistemaController");
			return;
		}
		List<Mascota> mascotas = personaIngresada.getMascotas();
		for(Mascota mascota: mascotas) {
			System.out.println(mascota.getNombre());
		}
		request.setAttribute("mascotas", mascotas);
		request.getRequestDispatcher("/jsp/listarMascotas.jsp").forward(request, response);

	}

}
