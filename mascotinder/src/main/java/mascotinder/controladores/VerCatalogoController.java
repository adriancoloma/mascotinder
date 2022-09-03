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
	
	//	1. Obtener parametros
		int idMascota = Integer.parseInt(request.getParameter("idMascota"));
//		2. Llamar al modelo
		
		Mascota mascotas = new Mascota();
		mascotas = DAOFactory.getFactory().crearMascotaDAO().getById(idMascota);
		List<Mascota> mascota1 = DAOFactory.getFactory().crearMascotaDAO().getPosiblesParejas(mascotas);
	
		for(Mascota mascota: mascota1) {
			System.out.println(mascota.getNombre());
			System.out.println(mascota.getDescripcion());
		}
		request.setAttribute("mascotas", mascota1);

		
		//3. Enviar a la vista
		request.getRequestDispatcher("/jsp/verCatalogo.jsp").forward(request, response);
	}

	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	


	}
	
}