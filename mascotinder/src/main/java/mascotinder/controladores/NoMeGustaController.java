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
		
		
		//Obtener atributos
				int idMascota1 = Integer.parseInt(request.getParameter("idMascota1"));
				int idMascota2 = Integer.parseInt(request.getParameter("idMascota2"));
				
				 Match nuevoMatch = new Match();

		        // Llamar al modelo 
				Mascota Mascota1 = DAOFactory.getFactory().crearMascotaDAO().getById(idMascota1);
				Mascota Mascota2 = DAOFactory.getFactory().crearMascotaDAO().getById(idMascota2);
				
				nuevoMatch.setMascota1(Mascota1);
				
				nuevoMatch.setMascota2(Mascota2);
			    
			
			    
			    if(Mascota1 != Mascota2 ) {
			    nuevoMatch.setMeGusta(true);
			    
			    
			    DAOFactory.getFactory().crearMatchDAO().create(nuevoMatch);
			    
			    }else{
			    	//Enviar a la vista 
				    
			    	response.sendRedirect("jsp/verCatalogo.jsp");

			    }
					
				
				
				
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
