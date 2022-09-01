package mascotinder.controladores;


import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class EstablecerPreferenciasController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public EstablecerPreferenciasController() {
        super();
    }
  
    	@Override
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		request.getRequestDispatcher("/jsp/establecerPreferencias.jsp").forward(request, response);
    	}

    	@Override
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	
    	
    	
    	
    	}
}