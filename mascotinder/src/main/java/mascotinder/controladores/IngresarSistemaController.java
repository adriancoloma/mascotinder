package mascotinder.controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mascotinder.modelo.dao.DAOFactory;
import mascotinder.modelo.entidades.Persona;

public class IngresarSistemaController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/jsp/login.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// 1.- Obtener Parametros
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		
		// 2. Modelo
		Persona persona = DAOFactory.getFactory().crearPersonaDAO().autorizarPersona(usuario, password);
		
		System.out.println(persona);
		
		if(persona != null) {
			HttpSession session = request.getSession();
			session.setAttribute("UsuarioIngresado", persona);
			response.sendRedirect("ListarMascotasController");
		}else {
			System.out.println("No se permite el ingreso");
			request.getRequestDispatcher("/jsp/login.jsp").forward(request, response);
		}
		
	}
}
