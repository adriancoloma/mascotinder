package mascotinder.controladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mascotinder.modelo.dao.DAOFactory;
import mascotinder.modelo.dao.MascotaDAO;
import mascotinder.modelo.entidades.Mascota;
import mascotinder.modelo.entidades.Persona;

/**
 * Servlet implementation class VerCatalogoController
 */
public class VerCatalogoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerCatalogoController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Persona personaIngresada = (Persona) request.getSession().getAttribute("UsuarioIngresado");
		if (personaIngresada == null) {
			response.sendRedirect("IngresarSistemaController");
			return;
		}
		System.out.println("Se ingreso a doGet de ver catalogo");
		// 1. Obtener parametros
		int idMascota = Integer.parseInt(request.getParameter("idMascota"));
//		2. Llamar al modelo

		Mascota mascota = DAOFactory.getFactory().crearMascotaDAO().getById(idMascota);
		List<Mascota> mascotas = DAOFactory.getFactory().crearMascotaDAO().getPosiblesParejas(mascota);

		for (Mascota m : mascotas) {
			System.out.println(m.getNombre());
			System.out.println(m.getDescripcion());
		}
		request.setAttribute("mascotas", mascotas);
		// 3. Enviar a la vista
		request.getRequestDispatcher("/jsp/verCatalogo.jsp").forward(request, response);
	}

	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Ingreso a post de ver catalogo");
		String accion = request.getParameter("accion");
		if(accion.equals("me_gusta")) {
			request.getRequestDispatcher("MeGustaController").forward(request, response);
		}else if(accion.equals("no_me_gusta")) {
			request.getRequestDispatcher("NoMeGustaController").forward(request, response);
		}


	}
	
}