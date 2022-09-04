package mascotinder.controladores;

import java.io.IOException;
import java.net.http.HttpClient.Redirect;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mascotinder.modelo.dao.DAOFactory;
import mascotinder.modelo.entidades.Mascota;
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
		Persona personaDuenoEmisor = (Persona) request.getSession().getAttribute("UsuarioIngresado");
		System.out.println("Se ingreso a doGet");
		if(personaDuenoEmisor == null) {
			response.sendRedirect("IngresarSistemaController");
			return;
		}
		int duenoDestinatario = Integer.parseInt(request.getParameter("duenoMascota"));
		Persona personaDuenoDestinatario = DAOFactory.getFactory().crearPersonaDAO().getById(duenoDestinatario);
		List<Mensaje> mensajes = DAOFactory.getFactory().crearMensajeDAO().getMensajes(personaDuenoEmisor, personaDuenoDestinatario);
		request.setAttribute("mensajes", mensajes);
		request.getRequestDispatcher("/jsp/chat.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //1 Capturo los parametros
		String idDestinatario = request.getParameter("idDestinatario");
		System.out.println(idDestinatario);
		int duenoDestinatario = Integer.parseInt(idDestinatario);
		String contenido = request.getParameter("contenido");
	// 2 LLamo al Modelo 
		
	
		Persona personaDuenoEmisor = (Persona) request.getSession().getAttribute("UsuarioIngresado");
		Persona personaDuenoDestinatario = DAOFactory.getFactory().crearPersonaDAO().getById(duenoDestinatario);
		
		Mensaje enviarMensaje = new Mensaje(personaDuenoEmisor,personaDuenoDestinatario,contenido);
		
		DAOFactory.getFactory().crearMensajeDAO().create(enviarMensaje);
	

		
		
		// 3 Llamo a la vista
		
		response.sendRedirect("ChatController?duenoMascota=" + idDestinatario);
		
	}

}
