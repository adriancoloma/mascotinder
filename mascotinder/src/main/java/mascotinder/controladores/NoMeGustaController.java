package mascotinder.controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mascotinder.modelo.dao.DAOFactory;
import mascotinder.modelo.entidades.Mascota;
import mascotinder.modelo.entidades.Match;

/**
 * Servlet implementation class NoMeGustaController
 */
public class NoMeGustaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public NoMeGustaController() {
        super();
    
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Se ingreso a doGet");
		
		System.out.println(request.getParameter("idMascota1"));
		//Obtener atributos
		int idMascota1 = Integer.parseInt(request.getParameter("idMascota1"));
		int idMascota2 = Integer.parseInt(request.getParameter("idMascota2"));
		
        // Llamar al modelo 
		Mascota Mascota1 = DAOFactory.getFactory().crearMascotaDAO().getById(idMascota1);
		Mascota Mascota2 = DAOFactory.getFactory().crearMascotaDAO().getById(idMascota2);
		
	    
		Match nuevoMatch = new Match(Mascota1, Mascota2, false);
	    
	    if(Mascota1 != Mascota2 ) { 
	    	DAOFactory.getFactory().crearMatchDAO().create(nuevoMatch);
	    	response.sendRedirect("VerCatalogoController?idMascota=" + idMascota1);
	    
	    }
					
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
