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


@WebServlet("/busqueda")
public class ServletBusqueda extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ServletBusqueda() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.getRequestDispatcher("/busqueda.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CatalogoElectrodomesticos ce = CatalogoElectrodomesticos.getCatalogoElectrodomesticos();
		ArrayList<Electrodomestico> electrodomesticos;
		
		boolean chkConsumo;
		boolean chkImporte;
		String consumo;
		double importeMinimo = 0;
		double importeMaximo = 0;
		String html;
			
		//get chkconsumo
		if(request.getParameter("chkConsumo") == null) {
			chkConsumo = false;
		}
		else {
			chkConsumo = true;
		}
		
		//get chkimporte
		if(request.getParameter("chkImporte") == null) {
			chkImporte = false;
		}
		else {
			chkImporte = true;
		}
		
		// get importe minimo y maximo
		try {
			importeMinimo = Double.parseDouble(request.getParameter("importeMinimo"));
			importeMaximo = Double.parseDouble(request.getParameter("importeMaximo"));			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		// get consumo
		consumo = request.getParameter("consumo");

		//no marco nada		
		if(!chkImporte && !chkConsumo) {
			response.sendRedirect("listado");
		}
		
		//marco los dos		
		if(chkConsumo && chkImporte) {
			electrodomesticos = ce.getElectrodomesticos(importeMinimo, importeMaximo, consumo);
		}
		
		//marco consumo
		else if(chkConsumo) {
			electrodomesticos = ce.getElectrodomesticos(consumo);
		}
		
		//marco importe
		else {
			electrodomesticos = ce.getElectrodomesticos(importeMinimo, importeMaximo);
		}
		
		html = "<html>"
				+ "<head>"
				+ "<title>Resultados</title>"
				+ "</head>"
				+ "<body>"
				+ "<ul>";
		
		for(Electrodomestico e : electrodomesticos) {
			html += "<li>";
			html += e.toString();
			html += "</li>";
		}
		
		html += "</ul>"
				+ "</body>"
				+ "</html>";
		
		PrintWriter out = response.getWriter();
		out.print(html);
		
		request.getRequestDispatcher("/resultados.jsp").include(request, response);		
	}

}
