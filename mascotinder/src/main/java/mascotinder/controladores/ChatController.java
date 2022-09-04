package mascotinder.controladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mascotinder.modelo.dao.DAOFactory;
import mascotinder.modelo.entidades.Mensaje;
import mascotinder.modelo.entidades.Persona;

/**
 * Servlet implementation class ChatController
 */
public class ChatController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ChatController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int duenoDestinatario = Integer.parseInt(request.getParameter("duenoMascota"));
		Persona personaDuenoDestinatario = DAOFactory.getFactory().crearPersonaDAO().getById(duenoDestinatario);
		Persona personaDuenoEmisor = (Persona) request.getSession().getAttribute("UsuarioIngresado");
		List<Mensaje> mensajes = DAOFactory.getFactory().crearMensajeDAO().getMensajes(personaDuenoEmisor, personaDuenoDestinatario);
		request.setAttribute("mensajes", mensajes);
		request.getRequestDispatcher("/jsp/chat.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
