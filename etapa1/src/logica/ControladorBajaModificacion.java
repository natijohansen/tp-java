package logica;

import java.util.ArrayList;

import datos.CatalogoElectrodomesticos;

import entidades.Electrodomestico;

public class ControladorBajaModificacion {

	private CatalogoElectrodomesticos ce;
	
	public ControladorBajaModificacion() {
		this.ce = CatalogoElectrodomesticos.getCatalogoElectrodomesticos();
	}
		
	public ArrayList<Electrodomestico> getElectrodomesticos() {
		return ce.getElectrodomesticos();
	}

	public void borrarElectrodomestico(int index) {
		ce.borrarElectrodomestico(index);
	}
	
	public Electrodomestico getElectrodomestico(int index) {
		return ce.getElectrodomestico(index);
	}
	
	public void modificarElectrodomestico(Electrodomestico e, double precioBase, double peso, String descripcion, String color, String consumo, double carga) {
		ce.modificarElectrodomestico(e, precioBase, peso, descripcion, color, consumo, carga);
	}
	
	public void modificarElectrodomestico(Electrodomestico e, double precioBase, double peso, String descripcion, String color, String consumo, double resolucion, boolean tdt) {
		ce.modificarElectrodomestico(e, precioBase, peso, descripcion, color, consumo, resolucion, tdt);
	}
}
