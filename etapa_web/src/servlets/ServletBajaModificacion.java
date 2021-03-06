package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datos.CatalogoElectrodomesticos;
import entidades.Electrodomestico;
import entidades.Lavarropas;
import entidades.Television;

@WebServlet("/baja-modificacion")
public class ServletBajaModificacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public ServletBajaModificacion() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CatalogoElectrodomesticos ce = CatalogoElectrodomesticos.getCatalogoElectrodomesticos();
		ArrayList<Electrodomestico> electrodomesticos = ce.getElectrodomesticos();
	    
		String html = "<html>"
    			+ "<head>"
    			+ "<style>"
    			+ "label { display: block}"
    			+ "#chkEliminar {display: none}"
    			+ "</style>"
    			+ "</head>"
    			+ "<body>"
    			+ "<a href='index.html'>Volver</a>"
    			+ "<form action='baja-modificacion' method='post' onsubmit='return comprobar()' id='form'>";
    	
    	for(Electrodomestico e : electrodomesticos) {
    		html += "<label><input type='radio' name='rdbElectrodomestico' id='rdbElectrodomestico' value='";
    		html += e.getIdBD();
    		html += "' />";
    		html += e.toString();
    		html += "</label>";
    	}
    	
    	html += "<div>"
    			+ "<input type='checkbox' name='chkEliminar' id='chkEliminar' />"
    			+ "<input type='button' value='Eliminar' onclick='eliminar()' />"
    			+ "<input type='button' value='Modificar' onclick='modificar()' />"
    			+ "</div>";
    	
    	html += "</form>"
    			+ "<script type='text/javascript' src='baja-modificacion.js'></script>"
    			+ "</body>"
    			+ "</html>";
    	
    	PrintWriter out = response.getWriter();
    	out.print(html);
    	
    	request.getRequestDispatcher("/baja-modificacion.jsp").include(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean eliminar;
		int idBD = -1;
		CatalogoElectrodomesticos ce = CatalogoElectrodomesticos.getCatalogoElectrodomesticos();
		String html;
		Electrodomestico e;
		
		try {
			idBD = Integer.parseInt((request.getParameter("rdbElectrodomestico")));
		} catch (NumberFormatException ex) {
			ex.printStackTrace();
		}
	
		if(request.getParameter("chkEliminar") == null) {
			eliminar = false;
		}
		else {
			eliminar = true;
		}
	
		if(eliminar) {
			ce.borrarElectrodomestico(ce.getElectrodomesticoPorIdBD(idBD));
			response.sendRedirect("/baja-modificacion");
		}
		else {
			e = ce.getElectrodomesticoPorIdBD(idBD);
			html = "<html>"
					+ "<head>"
					+ "</head>"
					+ "<body>"
					+ "<form>"
					+ "<label>Precio Base: <input type='text' name='precioBase' value='"
					+ e.getPrecioBase()
					+ "'/></label>"
					+ "<label>Peso: <input type='text' name='peso' value='"
					+ e.getPeso()
					+ "'/></label>"
					+ "<label>Color:"
					+ "<select name='color' id='color'>"
					+ "<option value='blanco'>Blanco</option>"
					+ "<option value='negro'>Negro</option>"
					+ "<option value='rojo'>Rojo</option>"
					+ "<option value='azul'>Azul</option>"
					+ "<option value='gris'>Gris</option>"
					+ "</select></label>"
					+ "<label>Consumo: <select name='consumo' id='consumo'>"
					+ "<option value='A'>A</option>"
					+ "<option value='A'>B</option>"
					+ "<option value='A'>C</option>"
					+ "<option value='A'>D</option>"
					+ "<option value='A'>E</option>"
					+ "<option value='A'>F</option>"
					+ "</select></label>"
					+ "<label>Descripcion: <textarea name='descripcion'>"
					+ e.getDescripcion()
					+ "</textarea></label>";

			if(e instanceof Lavarropas) {
				html += "<label>Carga: <input type='text' name='carga' value='"
					  + ((Lavarropas) e).getCarga()
					  + "'></label>";
			}
			else {
				html += "<label>Resolucion: <input type='text' name='resolucion' value='"
						  + ((Television) e).getResolucion()
						  + "'></label>"
						  + "<label>TDT: <input type='checkbox' name='tdt' ";
				if(((Television) e).getTdt()) {
					html += "checked";
				}
				html += "></label>";
			}
			
			html += "<input type='submit' value='Guardar'>"
					+ "</form>"
					+ "<script type='text/javascript' src='modificar.js'></script>"
					+ "</body>"
					+ "</html>";
			
			PrintWriter out = response.getWriter();
			out.print(html);
			
			request.getRequestDispatcher("/modificar.jsp").include(request, response);
		}
	
	}

}
