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

/**
 * Servlet implementation class listarPersonasController
 */
@WebServlet("/ListarMascotasController")
public class ListarMascotasController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListarMascotasController() {
    	
    }
    
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println("Hola");
	}
    
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Ingreso");
	}
	private void procesarSolicitud(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Ingreso");
//		// LLamado al modelo
//		List<Mascota> listaMascotas = DAOFactory.getFactory().crearMascotaDAO().getAll();
//		request.setAttribute("mascotas", listaMascotas);
//		request.getRequestDispatcher("/jsp/listarMascotas.jsp").forward(request, response);
		
	}

}
