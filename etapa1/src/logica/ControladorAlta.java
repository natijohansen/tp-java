package logica;

import datos.CatalogoElectrodomesticos;
import entidades.Electrodomestico;

public class ControladorAlta {
	
	CatalogoElectrodomesticos ce = CatalogoElectrodomesticos.getCatalogoElectrodomesticos();
	
	public void altaElectrodomestico(double precioBase, double peso, String descripcion, String color, String consumo, double carga) {
		
		Electrodomestico e = ce.crearElectrodomestico(precioBase, peso, descripcion, color, consumo, carga);
		ce.addElectrodomestico(e);
	}
	
	public void altaElectrodomestico(double precioBase, double peso, String descripcion, String color, String consumo, double resolucion, boolean tdt) {
	
		Electrodomestico e = ce.crearElectrodomestico(precioBase, peso, descripcion, color, consumo, resolucion, tdt);
		ce.addElectrodomestico(e);	
	}

}
