package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datos.CatalogoElectrodomesticos;
import entidades.Electrodomestico;

@WebServlet("/alta-lavarropas")
public class ServletAltaLavarropas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private CatalogoElectrodomesticos ce = CatalogoElectrodomesticos.getCatalogoElectrodomesticos();
    public ServletAltaLavarropas() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("alta-lavarropas.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double precioBase;
		double peso;
		String descripcion;
		String color;
		String consumo;
		double carga;
		
		descripcion = request.getParameter("descripcion");
		color = request.getParameter("color");
		consumo = request.getParameter("consumo");
				
		try {
			precioBase = Double.parseDouble(request.getParameter("precioBase"));
			peso = Double.parseDouble(request.getParameter("peso"));
			carga = Double.parseDouble(request.getParameter("carga"));
								
			Electrodomestico e = ce.crearElectrodomestico(precioBase, peso, descripcion, color, consumo, carga);
			ce.addElectrodomestico(e);			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		//hacer algo copado con los errores
		//tener en cuenta que el usuario es experto, asi que no hay errores
		}
		
		response.sendRedirect("alta.html");
				
	}

}
