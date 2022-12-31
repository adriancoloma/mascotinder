package mascotinder.controladores;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import mascotinder.modelo.dao.DAOFactory;
import mascotinder.modelo.entidades.Mascota;
import mascotinder.modelo.entidades.Persona;

public class EstablecerPreferenciasController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Persona personaIngresada = (Persona) request.getSession().getAttribute("UsuarioIngresado");
		if(personaIngresada == null) {
			response.sendRedirect("IngresarSistemaController");
			return;
		}		
		
//		1. Obtener parametros
		int idMascota = Integer.parseInt(request.getParameter("idMascota"));
//		2. Modelo
		Mascota m = new Mascota();
		m = DAOFactory.getFactory().crearMascotaDAO().getById(idMascota);
		System.out.println(m.getDescripcion());
		request.setAttribute("mascota", m);
		request.getRequestDispatcher("/jsp/establecerPreferencias.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		1. Parametros
		
		int id = Integer.parseInt(request.getParameter("txtIdMascota"));
		String preferenciaTipo = request.getParameter("selectTipo");
		
		char preferenciaSexo = request.getParameter("selectSexo").toCharArray()[0];
		
		int edadMinima = Integer.parseInt(request.getParameter("selectEdad1"));
		int edadMaxima = Integer.parseInt(request.getParameter("selectEdad2"));
//		Modelo
		Mascota m = DAOFactory.getFactory().crearMascotaDAO().getById(id);
		
		m.setPreferencias(preferenciaTipo, preferenciaSexo, edadMinima, edadMaxima);
		DAOFactory.getFactory().crearMascotaDAO().update(m);
		response.sendRedirect("ListarMascotasController");
		
		
		
	}
}