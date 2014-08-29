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
}
