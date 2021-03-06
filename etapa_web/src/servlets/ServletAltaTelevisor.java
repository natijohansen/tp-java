package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datos.CatalogoElectrodomesticos;
import entidades.Electrodomestico;

@WebServlet("/alta-televisor")
public class ServletAltaTelevisor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private CatalogoElectrodomesticos ce = CatalogoElectrodomesticos.getCatalogoElectrodomesticos();
    public ServletAltaTelevisor() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/alta-televisor.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double precioBase;
		double peso;
		String descripcion;
		String color;
		String consumo;
		double resolucion;
		boolean tdt;
		
		descripcion = request.getParameter("descripcion");
		color = request.getParameter("color");
		consumo = request.getParameter("consumo");
		
		if(request.getParameter("tdt") == null) {
			tdt = false;
		}
		else {
			tdt = true;
		}
		
		try {
			precioBase = Double.parseDouble(request.getParameter("precioBase"));
			peso = Double.parseDouble(request.getParameter("peso"));
			resolucion = Double.parseDouble(request.getParameter("resolucion"));
								
			Electrodomestico e = ce.crearElectrodomestico(precioBase, peso, descripcion, color, consumo, resolucion, tdt);
			ce.addElectrodomestico(e);			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		//hacer algo copado con los errores
		//tener en cuenta que el usuario es experto, asi que no hay errores
		}
		
		//PrintWriter out = response.getWriter();
		//out.print(request.getParameter("tdt"));
		
		response.sendRedirect("alta.html");
	}

}
