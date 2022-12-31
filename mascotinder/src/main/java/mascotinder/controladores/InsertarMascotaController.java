package mascotinder.controladores;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import mascotinder.modelo.dao.DAOFactory;
import mascotinder.modelo.entidades.Mascota;
import mascotinder.modelo.entidades.Persona;

public class InsertarMascotaController extends HttpServlet{

	private int maxMemSize = 1024 * 1000;
	private int maxFileSize = 1024 * 5000;
	private String filePath;
	
	public void init( ){
		filePath = getServletContext().getRealPath("/") + getServletContext().getInitParameter("file-upload"); 
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Persona personaIngresada = (Persona) request.getSession().getAttribute("UsuarioIngresado");
		if(personaIngresada == null) {
			response.sendRedirect("IngresarSistemaController");
			return;
		}
		request.getRequestDispatcher("/jsp/registrarMascota.jsp").forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		java.io.PrintWriter out = response.getWriter();

		if (!isMultipart) {
			out.println("Error: el formato de envio no es multipart");
			return;
		}

		DiskFileItemFactory factory = new DiskFileItemFactory();

		factory.setSizeThreshold(maxMemSize);
		factory.setRepository(new File("c:\\temp"));
		ServletFileUpload upload = new ServletFileUpload(factory);
		upload.setSizeMax(maxFileSize);
		
		Mascota nuevaMascota = new Mascota();
		Persona dueno = (Persona) request.getSession().getAttribute("UsuarioIngresado");
		nuevaMascota.setDueno(dueno);
		
		try {
			List fileItems = upload.parseRequest(request);
			Iterator i = fileItems.iterator();
					
			int archivoActual = 1;
			while (i.hasNext()) {
				FileItem fi = (FileItem) i.next();
				if (!fi.isFormField()) {
					if (fi.getSize() == 0) { // Si no inserto un archivo
						archivoActual++;
						continue;
					}
					String fileName = fi.getName();
					File file = new File(filePath + fileName);
					System.out.println(file.getPath());
					fi.write(file);
					
					switch(archivoActual) {
					case 1:
						nuevaMascota.setPathImagen1(fileName);
						break;
					case 2:
						nuevaMascota.setPathImagen2(fileName);
						break;
					case 3:
						nuevaMascota.setPathImagen3(fileName);
						break;
					}
					
					archivoActual++;
					
				} else { //El input es un parametro
					String nombreCampo = fi.getFieldName();
					String valorCampo = fi.getString();
					switch(nombreCampo) {
					case "nombreMascota":
						nuevaMascota.setNombre(valorCampo);
						break;
					case "descripcionMascota":
						nuevaMascota.setDescripcion(valorCampo);
						break;
					case "selectEdad":
						nuevaMascota.setEdad(Integer.parseInt(valorCampo));
						break;
					case "selectTipo":
						nuevaMascota.setTipo(valorCampo);
						break;
					case "selectSexo":
						nuevaMascota.setSexo(valorCampo.toCharArray()[0]);
						break;
					}

				}
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
		
		DAOFactory.getFactory().crearMascotaDAO().create(nuevaMascota);
		response.sendRedirect("ListarMascotasController");
	}
	
}
